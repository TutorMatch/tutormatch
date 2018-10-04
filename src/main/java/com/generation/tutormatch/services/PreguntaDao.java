package com.generation.tutormatch.services;


import com.generation.tutormatch.entities.Pregunta;
import com.generation.tutormatch.repositories.IPreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreguntaDao {
    @Autowired
    IPreguntaRepository iPreguntaRepository;

    public void  postPregunta(Pregunta pregunta){
        iPreguntaRepository.save(pregunta);
    }
}
