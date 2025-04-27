package com.documentManager.model.tmf667;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;


/**
 * A period of time, either as a deadline (endDateTime only) a startDateTime only, or both
 */
@Data
@NoArgsConstructor
public class TimePeriod {
    @JsonProperty("endDateTime")
    private OffsetDateTime endDateTime = null;

    @JsonProperty("startDateTime")
    private OffsetDateTime startDateTime = null;
}

