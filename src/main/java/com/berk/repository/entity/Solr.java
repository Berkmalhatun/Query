package com.berk.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SolrDocument(collection = "enocadb")
public class Solr {
    @Id
    private String id;
    private String title;
    private long updatedAt;
}
