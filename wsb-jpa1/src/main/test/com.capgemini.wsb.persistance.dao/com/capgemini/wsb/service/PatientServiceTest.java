package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Test
    public void testShouldFindPatientById() {
        // give
        // when
        PatientTO patient = patientService.findById(1L);
        // then
        assertThat(patient.getVisites().size()).isEqualTo(1);
    }
    @Test
    public void testDeletePatient(){
        // give
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setPatientNumber("1");
        patientEntity.setEmail("patien@test.com");
        patientEntity.setDateOfBirth(LocalDate.parse("1990-01-01"));

        // when
        patientService.deleteById(1L);
        // then
        PatientTO deletedPatient = patientService.findById(1L);
        assertThat(deletedPatient).isNull();
    }
}