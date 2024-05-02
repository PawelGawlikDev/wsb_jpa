package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao
{
    @Override
    public List<PatientEntity> findBySurname(String pSurname) {
        return entityManager.createQuery("select patient from PatientEntity patient where patient.lastName like :surname").setParameter("surname", pSurname).getResultList();
    }

    @Override
    public List<PatientEntity> findByVisitsCount(int visits) {
        return  entityManager.createQuery("select patient from PatientEntity patient " +
                " join patient.visites visit " +
                " where visit.size > :visits").setParameter("visits", visits).getResultList();
    }

    @Override
    public List<PatientEntity> findByPesel(int pesel) {
        return entityManager.createQuery("select patient from PatientEntity patient where patient.pesel like :pesel").setParameter("pesel", pesel).getResultList();
    }
}
