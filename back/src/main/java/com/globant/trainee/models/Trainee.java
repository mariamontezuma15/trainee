package com.globant.trainee.models;

import jakarta.persistence.*;

@Entity
public class Trainee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String aboutMe;
    @Column(nullable = false)
    private String skills;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String traineeRol;
    private String education;
    private String jobExperience;

    public Trainee() {
    }

    public Trainee(String fullName, String email, String phone, String aboutMe, String skills, String location, String traineeRol, String education, String jobExperience) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.aboutMe = aboutMe;
        this.skills = skills;
        this.location = location;
        this.traineeRol = traineeRol;
        this.education = education;
        this.jobExperience = jobExperience;
    }

    public Trainee(String fullName, String location, String traineeRol) {
        this.fullName = fullName;
        this.location = location;
        this.traineeRol = traineeRol;
    }

    public Long getId() {
        return id;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobExperience() {
        return jobExperience;
    }

    public void setJobExperience(String jobExperience) {
        this.jobExperience = jobExperience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getTraineeRol() {
        return traineeRol;
    }

    public void setTraineeRol(String traineeRol) {
        this.traineeRol = traineeRol;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", aboutMe='" + aboutMe + '\'' +
                ", skills='" + skills + '\'' +
                ", location='" + location + '\'' +
                ", traineeRol='" + traineeRol + '\'' +
                ", education='" + education + '\'' +
                ", jobExperience='" + jobExperience + '\'' +
                '}';
    }
}
