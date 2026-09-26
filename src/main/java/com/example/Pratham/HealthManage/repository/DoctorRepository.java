package com.example.Pratham.HealthManage.repository;

import com.example.Pratham.HealthManage.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}