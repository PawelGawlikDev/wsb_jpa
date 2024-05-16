package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.PatientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Set;

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
        System.out.println(patient);
        // then
        assertThat(patient.getVisites().size()).isEqualTo(3);
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

    @Test
    public void testFindAllPatientVisitsById() {
        // give
        // when
        Set<VisitEntity> patientOneVisits =  patientService.findAllPatientVisites(1L);
        Set<VisitEntity> patientTwoVisits =  patientService.findAllPatientVisites(2L);
        // then
        assertThat(patientOneVisits.size()).isEqualTo(3);
        assertThat(patientTwoVisits.size()).isEqualTo(1);
    }
}