package com.nvz.model;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Patients implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    @ManyToMany
    @JoinTable (
            name = "patients_doctors",
            joinColumns = @JoinColumn (name = "patients_Id"),
            inverseJoinColumns = @JoinColumn (name = "doctor_Id")
    )
    private Set<Doctors> doctors = new HashSet<>();

    // Constructors
    public Patients(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Patients(String name, String address, Set<Doctors> doctors) {
        this.name = name;
        this.address = address;
        this.doctors = doctors;
    }

    public Patients() {}

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Doctors> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctors> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", doctors=" + doctors +
                '}';
    }
}
