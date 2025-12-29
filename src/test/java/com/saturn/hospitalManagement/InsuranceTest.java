package com.saturn.hospitalManagement;

import com.saturn.hospitalManagement.entity.Insurance;
import com.saturn.hospitalManagement.service.InsuranceService;
import com.saturn.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class InsuranceTest {

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private PatientService patientService;

    @Test
    public void testInsuranceService1(){
        Insurance insurance = Insurance.builder().policyNumber("12awsrt").validUntil(LocalDate.of(2027,12,12)).provider("lic").build();
        var updatedInsurance = insuranceService.assignInsurance(insurance, 1L);
        System.out.println(updatedInsurance);

    }

    @Test
    public void testInsuranceService2(){
        patientService.deletePatient(2L);
    }
}
