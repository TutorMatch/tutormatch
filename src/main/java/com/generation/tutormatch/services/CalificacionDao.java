package com.generation.tutormatch.services;

import com.generation.tutormatch.entities.Calificacion;
import com.generation.tutormatch.repositories.ICalidicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalificacionDao  {

    @Autowired
    ICalidicacionRepository iCalidicacionRepository;

    public void postCalificacion(Calificacion calificacion){
        iCalidicacionRepository.save(calificacion);
    }
}
