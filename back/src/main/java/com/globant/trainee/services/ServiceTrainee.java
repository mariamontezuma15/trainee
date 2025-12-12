package com.globant.trainee.services;

import com.globant.trainee.models.Trainee;
import com.globant.trainee.repositories.ITrainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTrainee {
    @Autowired
    private ITrainee repository;

    // Create Trainee
    public Trainee createTrainee(Trainee trainee) {
        return repository.save(trainee);
    }

    // Get All Trainees
    public List<Trainee> getAllTrainees() {
        return repository.findAll();
    }

    // Get Trainee By Id
    public Optional<Trainee> getTraineeById(Long id) {
        return repository.findById(id);
    }

    // Update Trainee Info

    public Trainee updateTrainee(Long id, Trainee updatedTrainee) {
        Optional<Trainee> optionalTrainee = repository.findById(id);

        if (optionalTrainee.isPresent()) {
            Trainee existing = optionalTrainee.get();
            existing.setFullName(updatedTrainee.getFullName());
            existing.setJobExperience(updatedTrainee.getJobExperience());
            existing.setLocation(updatedTrainee.getLocation());
            existing.setPhone(updatedTrainee.getPhone());
            existing.setSkills(updatedTrainee.getSkills());
            existing.setLanguages(updatedTrainee.getLanguages());
            existing.setTraineeRol(updatedTrainee.getTraineeRol());
            existing.setAboutMe(updatedTrainee.getAboutMe());
            existing.setEducation((updatedTrainee.getEducation()));
            existing.setEmail(updatedTrainee.getEmail());
            return repository.save(existing);
        }

        return null;
    }

    // Eliminate Trainee
    public boolean deleteTrainee(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Trainee> listTrainee() {
        return this.repository.findAll().stream().map(t -> new Trainee(t.getFullName(), t.getLocation(), t.getTraineeRol())).toList();
    }

}
