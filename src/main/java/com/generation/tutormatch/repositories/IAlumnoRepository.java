package com.generation.tutormatch.repositories;

import com.generation.tutormatch.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlumnoRepository extends JpaRepository<Alumno, Integer> {
}
