package com.documentManager.model.tmf667;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Document is a tangible output from an activity Skipped properties: id,href
 */
@Data
@NoArgsConstructor
public class DocumentCreate {
    @JsonProperty("creationDate")
    private OffsetDateTime creationDate = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("documentType")
    private String documentType = null;

    @JsonProperty("lastUpdate")
    private OffsetDateTime lastUpdate = null;

    @JsonProperty("lifecycleState")
    private String lifecycleState = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("binaryAttachment")
    private List<AttachmentRefOrValue> binaryAttachment = null;

    @JsonProperty("category")
    private List<CategoryRef> category = null;

    @JsonProperty("characteristic")
    private List<Characteristic> characteristic = null;

    @JsonProperty("documentRelationship")
    private List<DocumentRef> documentRelationship = null;

    @JsonProperty("documentSpecification")
    private DocumentSpecification documentSpecification = null;

    @JsonProperty("relatedEntity")
    private RelatedEntity relatedEntity = null;

    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = null;

}

