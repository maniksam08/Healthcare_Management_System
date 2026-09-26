package com.example.Pratham.HealthManage.repository;

import com.example.Pratham.HealthManage.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}