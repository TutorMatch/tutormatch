package com.generation.tutormatch.services;

import com.generation.tutormatch.repositories.IPromedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromedioDao {
    @Autowired
    IPromedioRepository iPromedioRepository;

    public void postPromedio(PromedioDao promedioDao){
        iPromedioRepository.save(promedioDao);
    }
}
