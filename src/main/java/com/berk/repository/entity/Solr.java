package com.berk.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SolrDocument(collection = "enocadb")
public class Solr {
    @Id
    @Field("id")
    private String id;
    @Field("title")
    private List<String> title;  // Dizi olarak güncellenmiş
    @Field("updatedAt")
    private List<Long> updatedAt; // Dizi olarak güncellenmiş
}
