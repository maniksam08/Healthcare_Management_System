package com.example.Pratham.HealthManage;

import com.example.Pratham.HealthManage.entity.Patient;
import com.example.Pratham.HealthManage.repository.PatientRepository;
import com.example.Pratham.HealthManage.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTest {

//    @Autowired
//    private PatientService patientService;
//
    @Autowired
    private PatientRepository patientRepository;
//    @Test
//    public void testPatientRepository(){
//        List<Patient> patientList= patientRepository.findAll();
//        System.out.print(patientList);
//    }

    @Test
    public void testTransactionMethods(){
        List<Patient> patient= patientRepository.findByName("zxcb");
        for (Patient p : patient) {
            System.out.println(p);
        }
    }
}
