package com.saturn.hospitalManagement.service;

import com.saturn.hospitalManagement.entity.Appointment;
import com.saturn.hospitalManagement.entity.Doctor;
import com.saturn.hospitalManagement.entity.Patient;
import com.saturn.hospitalManagement.repository.AppointmentRepository;
import com.saturn.hospitalManagement.repository.DoctorRepository;
import com.saturn.hospitalManagement.repository.PatientRepo;
import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepo patientRepo;

    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long pId, Long dId){
        Patient patient = patientRepo.findById(pId).orElseThrow();
        Doctor doctor = doctorRepository.findById(dId).orElseThrow();
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        appointmentRepository.save(appointment);
        patient.setAppointments(Set.of(appointment));
        return appointment;

    }


}
