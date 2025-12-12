package com.globant.trainee.controllers;

import com.globant.trainee.models.Trainee;
import com.globant.trainee.services.ServiceTrainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/traineeapi/v1/listtrainee")
public class ControllerTrainee {
    @Autowired
    ServiceTrainee serviceTrainee;

    @GetMapping
    public ResponseEntity<List<Trainee>> listTrainee() {
        List<Trainee> responseApi = this.serviceTrainee.listTrainee();
        return ResponseEntity.ok().body(responseApi);
    }
}
