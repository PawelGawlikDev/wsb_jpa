package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PatientTO implements Serializable
{
    private Long id;

    private String firstName;

    private String lastName;

    private String telephoneNumber;

    private String email;

    private String patientNumber;

    private LocalDate dateOfBirth;

    private int pesel;

    private Set<VisitEntity> visites = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int getPesel() {
        return pesel;
    }
    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public Set<VisitEntity> getVisites() {
        return visites;
    }

    public void setVisites(Set<VisitEntity> visites) {
        this.visites = visites;
    }
}
