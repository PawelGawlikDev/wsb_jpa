package com.capgemini.wsb.persistance.dao;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest
{
    @Autowired
    private PatientDao patientDao;

    @Test
    public void findBySurnameTest() {
        //given
        final String pSurname = "Jeden";
        //when
        final List<PatientEntity> patients = patientDao.findBySurname(pSurname);
        //then
        assertThat(patients).isNotNull();
    }

    @Test
    public void findByVisitsCountTest() {
        //given
        final int visites = 2;
        //when
        final List<PatientEntity> patientVisits = patientDao.findByVisitsCount(visites);
        //then
        assertThat(patientVisits).isNotNull();
        assertThat(patientVisits.size()).isEqualTo(3);
    }

    @Test
    public void findByPeselTest() {
        //given
        final int pesel = 123456789;
        //when
        final List<PatientEntity> patients = patientDao.findByPesel(pesel);
        //then
        assertThat(patients).isNotNull();
        assertThat(patients.size()).isEqualTo(1);
    }
}
