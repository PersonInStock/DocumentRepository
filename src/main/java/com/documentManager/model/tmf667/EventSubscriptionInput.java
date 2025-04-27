package com.documentManager.model.tmf667;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Sets the communication endpoint address the service instance must use to deliver notification information
 */
@Data
@NoArgsConstructor

public class EventSubscriptionInput {
  @JsonProperty("callback")
  private String callback = null;

  @JsonProperty("query")
  private String query = null;

}

