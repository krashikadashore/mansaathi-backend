package com.mansaathi.repository;

import com.mansaathi.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    // किसी मरीज (Patient) के सारे अपॉइंटमेंट्स ढूँढने के लिए
    List<Appointment> findByPatientId(Long patientId);

    // किसी डॉक्टर (Doctor) के पास आए सारे अपॉइंटमेंट्स ढूँढने के लिए
    List<Appointment> findByDoctorId(Long doctorId);
}