package com.berk.config;


import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SolrConfig {


    @Bean
    public SolrClient solrClient() {
        String solrHost = "http://localhost:8983/solr/enocadb";
        return new HttpSolrClient.Builder(solrHost).build();
    }
}