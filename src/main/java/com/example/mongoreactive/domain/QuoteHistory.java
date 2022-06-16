package com.example.mongoreactive.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.time.Instant;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class QuoteHistory {

    @MongoId
    private String id;
    private String ticker;
    private BigDecimal price;
    private Instant instant;


}
