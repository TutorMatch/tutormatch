package com.generation.tutormatch.repositories;

import com.generation.tutormatch.services.PromedioDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPromedioRepository extends JpaRepository<PromedioDao, Integer> {
}
