package com.generation.tutormatch.repositories;

import com.generation.tutormatch.services.StatusDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStatusRepository extends JpaRepository<StatusDao, Integer> {
}
