package com.mansaathi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor_profiles")
public class DoctorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private String specialization;

    private Integer experienceYears;

    private Double consultationFees; // INR में फीस (जैसे ₹500)

    private String city;

    private String clinicAddress;

    private Double rating;

    @Column(length = 1000)
    private String bio;

    private Boolean isAvailable;

    // Default Constructor
    public DoctorProfile() {
        this.rating = 4.8;
        this.isAvailable = true;
    }

    // Parameterized Constructor
    public DoctorProfile(User user, String specialization, Integer experienceYears, Double consultationFees, String city) {
        this.user = user;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.consultationFees = consultationFees;
        this.city = city;
        this.rating = 4.8;
        this.isAvailable = true;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Integer getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(Integer experienceYears) {
        this.experienceYears = experienceYears;
    }

    public Double getConsultationFees() {
        return consultationFees;
    }

    public void setConsultationFees(Double consultationFees) {
        this.consultationFees = consultationFees;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}