package com.berk.repository;

import com.berk.repository.entity.Solr;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SolrRepository{
    @Autowired
    private SolrClient solrClient;

    public List<Solr> findDocumentsAfterJanuary2020() throws Exception {
        SolrQuery query = new SolrQuery("*:*");
         query.set("collection", "enocadb");
        query.setFilterQueries("updatedAt:[1577836800000 TO *]");
        query.setRows(10);
        QueryResponse response = solrClient.query(query);
        return response.getBeans(Solr.class);
    }
}
