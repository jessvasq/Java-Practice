package com.nvz.model;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class DoctorSchedule implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double time;
    private String type;

    @OneToOne(mappedBy = "doctorSchedule")
    private Doctors doctors;

    // Constructors
    public DoctorSchedule() {}

    public DoctorSchedule(double time, String type) {
        this.time = time;
        this.type = type;
    }

    public DoctorSchedule(double time, String type, Doctors doctors) {
        this.time = time;
        this.type = type;
        this.doctors = doctors;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "DoctorSchedule{" +
                "id=" + id +
                ", time=" + time +
                ", type='" + type + '\'' +
                ", doctors=" + doctors +
                '}';
    }
}
