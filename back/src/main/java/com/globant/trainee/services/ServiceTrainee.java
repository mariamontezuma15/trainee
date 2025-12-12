package com.globant.trainee.services;

import com.globant.trainee.models.Trainee;
import com.globant.trainee.repositories.ITrainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTrainee {
    @Autowired
    private ITrainee repository;

    public List <Trainee> listTrainee(){
        return this.repository.findAll().stream().map(t -> new Trainee(t.getFullName(), t.getLocation(), t.getTraineeRol())).toList();
    }

}
