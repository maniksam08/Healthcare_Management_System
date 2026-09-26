package com.example.Pratham.HealthManage.controller;

import com.example.Pratham.HealthManage.dto.AppointmentResponseDto;
import com.example.Pratham.HealthManage.dto.CreateAppointmentRequestDto;
import com.example.Pratham.HealthManage.dto.PatientResponseDto;
import com.example.Pratham.HealthManage.service.AppointmentService;
import com.example.Pratham.HealthManage.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;
    private final AppointmentService appointmentService;

    @PostMapping("/appointments")
    public ResponseEntity<AppointmentResponseDto> createNewAppointment(@RequestBody CreateAppointmentRequestDto createAppointmentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.createNewAppointment(createAppointmentRequestDto));
    }

    @GetMapping("/profile")
    private ResponseEntity<PatientResponseDto> getPatientProfile() {
        Long patientId = 4L;
        return ResponseEntity.ok(patientService.getPatientById(patientId));
    }
}
