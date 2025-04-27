package com.documentManager.model.tmf667;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * An attachment by value or by reference. An attachment complements the description of an element, for example through a document, a video, a picture.
 */
@Data
@NoArgsConstructor
public class AttachmentRefOrValue {
    private String id = null;

    @JsonProperty("href")
    private String href = null;

    @JsonProperty("attachmentType")
    private String attachmentType = null;

    @JsonProperty("content")
    private String content = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("mimeType")
    private String mimeType = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("url")
    private String url = null;

    @JsonProperty("size")
    private Quantity size = null;

    @JsonProperty("validFor")
    private TimePeriod validFor = null;

    @JsonProperty("@baseType")
    private String baseType = null;

    @JsonProperty("@schemaLocation")
    private String schemaLocation = null;

    @JsonProperty("@type")
    private String type = null;

    @JsonProperty("@referredType")
    private String referredType = null;

}

