package com.documentManager.model.tmf667;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An amount in a given unit
 */
@Data
@NoArgsConstructor
public class Quantity {
    @JsonProperty("amount")
    private Float amount = 1.0f;

    @JsonProperty("units")
    private String units = null;

}

