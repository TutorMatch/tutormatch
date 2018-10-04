package com.generation.tutormatch.services;

import com.generation.tutormatch.repositories.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaDao {
    @Autowired
    ITemaRepository iTemaRepository;

    public void postTema(TemaDao temaDao){
        iTemaRepository.save(temaDao);
    }
}
