package com.example.mongoreactive.service;


import com.example.mongoreactive.domain.QuoteHistory;
import com.example.mongoreactive.model.Quote;
import reactor.core.publisher.Mono;

public interface QuoteHistoryService {
    Mono<QuoteHistory> saveQuoteToMongo(Quote quote);
}
