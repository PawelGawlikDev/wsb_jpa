package com.capgemini.wsb.persistence.dao;
import java.util.List;
import com.capgemini.wsb.persistence.entity.PatientEntity;

public interface PatientDao extends Dao<PatientEntity, Long>
{
    List<PatientEntity> findBySurname(String pSurname);

    List<PatientEntity> findByVisitsCount(int visits);

    List<PatientEntity> findByPesel(int pesel);
}
