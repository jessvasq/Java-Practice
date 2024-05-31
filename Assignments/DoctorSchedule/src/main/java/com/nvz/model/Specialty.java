package com.nvz.model;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Specialty implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany (targetEntity = Doctors.class, cascade = CascadeType.ALL)
    private List<Doctors> doctors;

    // Constructors
    public Specialty() {}

    public Specialty(String name) {
        this.name = name;
    }

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

    public List<Doctors> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctors> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doctors=" + doctors +
                '}';
    }
}
