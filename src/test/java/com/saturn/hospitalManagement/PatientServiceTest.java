package com.saturn.hospitalManagement;

import com.saturn.hospitalManagement.dto.BloodGroupStats;
import com.saturn.hospitalManagement.dto.CPatientInfo;
import com.saturn.hospitalManagement.dto.IPatientInfo;
import com.saturn.hospitalManagement.entity.Patient;
import com.saturn.hospitalManagement.repository.PatientRepo;
import com.saturn.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    PatientRepo patientRepo;

    @Autowired
    PatientService patientService;

    @Test
    public void testPatient(){
        List<Patient> patients = patientRepo.findAll();
        for(Patient p : patients){
            System.out.println(p);
        }

    }

    @Test
    public void testPatient2(){
        List<IPatientInfo> patientInfos = patientRepo.getPatientInfo();
        for(IPatientInfo p: patientInfos){
            System.out.println(p);
        }
    }

    @Test
    public void testPatient3(){
        List<CPatientInfo> patientInfos = patientRepo.getAllPatients();
        for(CPatientInfo p: patientInfos){
            System.out.println(p);
        }
    }

    @Test
    public void testPatient4(){
        List<BloodGroupStats> bloodInfo = patientRepo.getBloodGroupStats();
        for(BloodGroupStats stat: bloodInfo){
            System.out.println(stat);
        }
    }

    @Test
    public void testPatient5(){
        int rowsModified = patientRepo.updatePatientById("max verstappen", 1L);
        System.out.println(rowsModified);
    }

    @Test
    public void testPatientService1(){
        patientService.testPatientTransaction();
    }



}
