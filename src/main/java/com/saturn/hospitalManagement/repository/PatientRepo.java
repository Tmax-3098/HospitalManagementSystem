package com.saturn.hospitalManagement.repository;

import com.saturn.hospitalManagement.dto.CPatientInfo;
import com.saturn.hospitalManagement.dto.IPatientInfo;
import com.saturn.hospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {

    @Query("select p.id as id, p.name as name, p.email as email from Patient p")
    List<IPatientInfo> getPatientInfo();

    @Query("select new com.saturn.hospitalManagement.dto.CPatientInfo( p.id , p.name) from Patient p")
    List<CPatientInfo> getAllPatients();
}
