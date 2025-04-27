package com.documentManager.model.tmf667;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Describes a given characteristic of an object or entity through a name/value pair.
 */
@Data
@NoArgsConstructor
public class Characteristic {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("valueType")
    private String valueType = null;

    @JsonProperty("characteristicRelationship")
    private List<CharacteristicRelationship> characteristicRelationship = null;

    @JsonProperty("value")
    private Any value = null;

    @JsonProperty("@baseType")
    private String baseType = null;

    @JsonProperty("@schemaLocation")
    private String schemaLocation = null;

    @JsonProperty("@type")
    private String type = null;
}

