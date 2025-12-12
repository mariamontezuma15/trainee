package com.globant.trainee.repositories;

import com.globant.trainee.models.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrainee extends JpaRepository<Trainee, Long> {
}
