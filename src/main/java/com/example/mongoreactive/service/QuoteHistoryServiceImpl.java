package com.example.mongoreactive.service;

import com.example.mongoreactive.domain.QuoteHistory;
import com.example.mongoreactive.model.Quote;
import com.example.mongoreactive.repositories.QuoteHistoryRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
@RequiredArgsConstructor
public class QuoteHistoryServiceImpl implements QuoteHistoryService {

    private final QuoteHistoryRep repository;

    @Override
    public Mono<QuoteHistory> saveQuoteToMongo(Quote quote) {
        return repository.save(QuoteHistory.builder()
                .ticker(quote.getTicker())
                .price(quote.getPrice())
                .instant(quote.getInstant())
                .build());
    }
}
