package com.example.Pratham.HealthManage.repository;

import com.example.Pratham.HealthManage.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}