package com.berk.controller;

import com.berk.repository.entity.Solr;
import com.berk.service.SolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/solr")
public class SolrController {
    @Autowired
    private SolrService solrService;

    @GetMapping("/documents")
    public List<Solr> getDocuments() throws Exception {
        return solrService.getUpdatedDocuments();
    }
}
