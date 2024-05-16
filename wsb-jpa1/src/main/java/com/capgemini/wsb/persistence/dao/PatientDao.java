package com.capgemini.wsb.persistence.dao;
import java.util.List;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

public interface PatientDao extends Dao<PatientEntity, Long>
{
    List<PatientEntity> findBySurname(String pSurname);

    List<PatientEntity> findByVisitsCount(int visits);

    List<PatientEntity> findByPesel(int pesel);

}
