package com.generation.tutormatch.services;

import com.generation.tutormatch.entities.Tutor;
import com.generation.tutormatch.repositories.ITutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorDao {
    @Autowired
    ITutorRepository iTutorRepository;

    public void postTutor(Tutor tutor) {
        iTutorRepository.save(tutor);
    }


}
