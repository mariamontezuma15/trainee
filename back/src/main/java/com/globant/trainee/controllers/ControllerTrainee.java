package com.globant.trainee.controllers;

import com.globant.trainee.models.Trainee;
import com.globant.trainee.services.ServiceTrainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/traineeapi/v1/")
public class ControllerTrainee {
    @Autowired
    ServiceTrainee serviceTrainee;

    // POST
    @PostMapping
    public ResponseEntity<Trainee> createTrainee(@RequestBody Trainee data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceTrainee.createTrainee(data));
    }

    // GET
    @GetMapping
    public ResponseEntity<List<Trainee>> getTrainee() {
        return ResponseEntity.ok(serviceTrainee.getAllTrainees());
    }

    // GET (By Id)

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Trainee>> getTraineeById(@PathVariable Long id) {
        Optional<Optional<Trainee>> result = Optional.ofNullable(serviceTrainee.getTraineeById(id));
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // PUT
    @PutMapping("/{id}")
    public ResponseEntity<Trainee> updateTrainee(@PathVariable Long id, @RequestBody Trainee data) {
        Trainee updated = serviceTrainee.updateTrainee(id, data);
        return (updated != null) ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    // DELETE

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrainee(@PathVariable Long id) {
        return serviceTrainee.deleteTrainee(id)
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }

    // List Trainees
    @GetMapping("/listtrainee")
    public ResponseEntity<List<Trainee>> listTrainee() {
        List<Trainee> responseApi = this.serviceTrainee.listTrainee();
        return ResponseEntity.ok().body(responseApi);
    }
}
