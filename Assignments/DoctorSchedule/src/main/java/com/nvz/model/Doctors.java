package com.nvz.model;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Doctors implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorId;
    private String doctorName;

    @ManyToOne
    @JoinColumn(name="hospital_Id")
    private Hospital hospital;


    @OneToOne
    @JoinColumn ( name = "doctor_schedule_Id")
    private DoctorSchedule doctorSchedule;


    // Constructors
    public Doctors(String doctorName) {
        this.doctorName = doctorName;
    }

    public Doctors() {}

    public Doctors(String doctorName, Hospital hospital) {
        this.doctorName = doctorName;
        this.hospital = hospital;
    }

    public Doctors(String doctorName, Hospital hospital, DoctorSchedule doctorSchedule) {
        this.doctorName = doctorName;
        this.hospital = hospital;
        this.doctorSchedule = doctorSchedule;
    }

    // Getters and Setters
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public DoctorSchedule getDoctorSchedule() {
        return doctorSchedule;
    }

    public void setDoctorSchedule(DoctorSchedule doctorSchedule) {
        this.doctorSchedule = doctorSchedule;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", hospital=" + hospital +
                ", doctorSchedule=" + doctorSchedule +
                '}';
    }
}
