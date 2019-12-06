package com.github.marciecoder.spellbook.notes.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.validation.constraints.NotNull;

@Table
@Data
@NoArgsConstructor
public class Notes {

    @NotNull(message = "Id can not be null")
    @PrimaryKey
    @JsonProperty("id")
    private String id;

    @JsonProperty("body")
    private String body;

    @JsonProperty("title")
    private String title;
}
