package com.documentManager.model.tmf667;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A document specification reference
 */
@Data
@NoArgsConstructor
public class DocumentSpecification {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("href")
    private String href = null;

    @JsonProperty("URL")
    private String URL = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("version")
    private String version = null;

}

