package com.example.mongoreactive.service;

import com.example.mongoreactive.model.Quote;
import reactor.core.publisher.Flux;
import java.time.Duration;

public interface QuoteGeneratorService {

    Flux<Quote> fetchQuoteStream(Duration period);
}
