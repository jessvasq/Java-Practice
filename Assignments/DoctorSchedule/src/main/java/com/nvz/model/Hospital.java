package com.nvz.model;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Hospital implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hospitalId;
    private String hospitalName;
    private String hospitalAddress;

    // Constructors
    public Hospital(String hospitalName, String hospitalAddress) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
    }

    public Hospital() {}

    // Getters and Setters
    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalAddress='" + hospitalAddress + '\'' +
                '}';
    }
}
