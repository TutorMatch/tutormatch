package com.generation.tutormatch.repositories;

import com.generation.tutormatch.entities.Pregunta;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPreguntaRepository extends JpaRepository<Pregunta, Integer > {
}
