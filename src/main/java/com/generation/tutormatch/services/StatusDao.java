package com.generation.tutormatch.services;

import com.generation.tutormatch.repositories.IStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusDao {

    @Autowired
    IStatusRepository iStatusRepository;

    public void postStatus(StatusDao statusDao){
        iStatusRepository.save(statusDao);
    }

}
