package com.berk.service;

import com.berk.repository.SolrRepository;
import com.berk.repository.entity.Solr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolrService {

    @Autowired
    private SolrRepository solrRepository;

    public List<Solr> getUpdatedDocuments() throws Exception {
        return solrRepository.findDocumentsAfterJanuary2020();
    }
}