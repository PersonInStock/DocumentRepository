package com.documentManager.model.tmf667;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used when an API throws an Error, typically with a HTTP error response-code (3xx, 4xx, 5xx)
 */
@Data
@NoArgsConstructor
public class Error {
    @JsonProperty("code")
    private String code = null;

    @JsonProperty("reason")
    private String reason = null;

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("referenceError")
    private String referenceError = null;

    @JsonProperty("@baseType")
    private String baseType = null;

    @JsonProperty("@schemaLocation")
    private String schemaLocation = null;

    @JsonProperty("@type")
    private String type = null;

}

