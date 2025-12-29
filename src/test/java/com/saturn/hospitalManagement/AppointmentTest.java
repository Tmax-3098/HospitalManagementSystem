package com.saturn.hospitalManagement;

import com.saturn.hospitalManagement.entity.Appointment;
import com.saturn.hospitalManagement.repository.AppointmentRepository;
import com.saturn.hospitalManagement.service.AppointmentService;
import com.saturn.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class AppointmentTest {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private PatientService patientService;

    @Test
    public void testAppoiService1(){
        Appointment appointment = Appointment.builder().reason("broken leg").status("not attended").appointmentTime(LocalDateTime.now()).build();
        System.out.println(appointmentService.createNewAppointment(appointment, 2L, 5L));
        patientService.deletePatient(2L);

    }
}
