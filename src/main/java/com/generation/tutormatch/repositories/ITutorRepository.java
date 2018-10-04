package com.generation.tutormatch.repositories;

import com.generation.tutormatch.entities.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITutorRepository extends JpaRepository<Tutor, Integer> {
}
