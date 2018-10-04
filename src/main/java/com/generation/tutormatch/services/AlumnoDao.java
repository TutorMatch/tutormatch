package com.generation.tutormatch.services;

import com.generation.tutormatch.entities.Alumno;
import com.generation.tutormatch.repositories.IAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoDao {
    @Autowired
    IAlumnoRepository iAlumnoRepository;

    public void postAlumno(Alumno alumno){
        iAlumnoRepository.save(alumno);
    }
}
