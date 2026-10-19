package com.mansaathi.repository;

import com.mansaathi.model.DoctorProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorProfileRepository extends JpaRepository<DoctorProfile, Long> {

    // सिर्फ उपलब्ध (Active/Available) डॉक्टरों की लिस्ट निकालने के लिए
    List<DoctorProfile> findByIsAvailableTrue();

    // User ID के ज़रिए डॉक्टर की प्रोफ़ाइल ढूँढने के लिए
    Optional<DoctorProfile> findByUserId(Long userId);
}