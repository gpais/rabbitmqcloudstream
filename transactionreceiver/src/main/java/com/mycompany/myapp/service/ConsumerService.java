package com.mycompany.myapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.channels.ConsumerChannel;
import com.mycompany.myapp.domain.Transaction;
import com.mycompany.myapp.repository.TransactionRepository;

@Service
public class ConsumerService {
    private static final Logger log = LoggerFactory.getLogger(ConsumerService.class);

    @Autowired
    private TransactionRepository repo;
    
    @StreamListener(ConsumerChannel.CHANNEL)
    public void consume(Transaction transaction) {
        log.info("Transaction received message: {}.",transaction.getUuid());
        repo.save(transaction);
    }
}
