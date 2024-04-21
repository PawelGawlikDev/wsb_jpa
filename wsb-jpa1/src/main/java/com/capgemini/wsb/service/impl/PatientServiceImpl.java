package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.mapper.PatientMapper;
import com.capgemini.wsb.persistence.dao.AddressDao;
import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class PatientServiceImpl implements PatientService
{
    private final PatientDao PatientDao;
    private final AddressDao AddressDao;

    @Autowired
    public PatientServiceImpl(PatientDao patientDao, AddressDao addressDao)
    {
        PatientDao = patientDao;
        AddressDao = addressDao;
    }

    @Override
    public PatientTO findById(Long id) {
        final PatientEntity entity = PatientDao.findOne(id);
        return PatientMapper.mapToTO(entity);
    }
    public void save(PatientTO patient) {

    }


    public void deleteById(Long id) {
        AddressDao.delete(id);
        PatientDao.delete(id);
    }
}
