package com.mansaathi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private User patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorProfile doctor;

    private String status; // PENDING, ACCEPTED, CONFIRMED, COMPLETED, CANCELLED

    private String scheduledSlot; // जैसे "Today 6:00 PM"

    private Double amount; // डॉक्टर की फीस (INR)

    private String paymentStatus; // PENDING, PAID, REFUNDED

    private String razorpayOrderId;

    private String razorpayPaymentId;

    private String videoRoomId; // WebRTC Video Call Room ID

    private Integer durationMinutes; // कॉल का समय (जैसे 20 मिनट)

    private LocalDateTime createdAt;

    // Default Constructor
    public Appointment() {
        this.status = "PENDING";
        this.paymentStatus = "PENDING";
        this.durationMinutes = 20;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }

    public DoctorProfile getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorProfile doctor) {
        this.doctor = doctor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScheduledSlot() {
        return scheduledSlot;
    }

    public void setScheduledSlot(String scheduledSlot) {
        this.scheduledSlot = scheduledSlot;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getRazorpayOrderId() {
        return razorpayOrderId;
    }

    public void setRazorpayOrderId(String razorpayOrderId) {
        this.razorpayOrderId = razorpayOrderId;
    }

    public String getRazorpayPaymentId() {
        return razorpayPaymentId;
    }

    public void setRazorpayPaymentId(String razorpayPaymentId) {
        this.razorpayPaymentId = razorpayPaymentId;
    }

    public String getVideoRoomId() {
        return videoRoomId;
    }

    public void setVideoRoomId(String videoRoomId) {
        this.videoRoomId = videoRoomId;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}