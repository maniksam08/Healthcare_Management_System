package com.example.Pratham.HealthManage;

import com.example.Pratham.HealthManage.entity.Appointment;
import com.example.Pratham.HealthManage.entity.Insurance;
import com.example.Pratham.HealthManage.entity.Patient;
import com.example.Pratham.HealthManage.service.AppointmentService;
import com.example.Pratham.HealthManage.service.InsuranceService;
import lombok.Builder;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.DiscoveryIssue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
@Builder
public class InsuranceTests {

    private static final Logger log = LoggerFactory.getLogger(InsuranceTests.class);
    @Autowired
    private InsuranceService insuranceService;
    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void testInsurance(){
        Insurance insurance= Insurance.builder().policyNumber("HDFC_1234")
                .provider("HDFC")
                .build();

        Patient patient= insuranceService.insuranceToPatient(insurance,  1L);

    }

    @Test
    public void testCreateAppointment(){
        Appointment appointment= Appointment.builder().appointmentTime(LocalDateTime.of(2025,11,1,14,00,00)).reason("cancer").build();
        appointmentService.createNewAppointment(appointment, 1L, 2L);

    }


}
