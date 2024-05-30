package com.nvz.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table (name = "cohort")
public class Cohort implements Serializable {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private int cohortId;
    private String cohortName;
    private String duration;

    // Constructors
    public Cohort () {}

    public Cohort(String cohortName, String duration) {
        this.cohortName = cohortName;
        this.duration = duration;
    }

    // Getters and Setters
    public int getCohortId() {
        return cohortId;
    }

    public void setCohortId(int cohortId) {
        this.cohortId = cohortId;
    }

    public String getCohortName() {
        return cohortName;
    }

    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
