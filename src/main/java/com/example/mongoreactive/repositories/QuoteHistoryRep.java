package com.example.mongoreactive.repositories;

import com.example.mongoreactive.domain.QuoteHistory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface QuoteHistoryRep extends ReactiveMongoRepository<QuoteHistory, String> {

}
