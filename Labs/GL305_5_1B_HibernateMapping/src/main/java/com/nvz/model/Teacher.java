package com.nvz.model;
import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;
//
//@Entity
//@Table
//public class Teacher implements Serializable {
//    @Serial
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue( strategy = GenerationType.IDENTITY)
//    private int teacherId;
//    private String salary;
//    private String teacherName;
//
//    // In one-to-many relationship, each row of one entity is referenced by many child records in another entity
//    // children's records cannot have multiple parents
//
//    @ManyToOne //this annotation tells Hibernate how to map it to the database
//    @JoinColumn(name = "fk_dep")
//    private Department department;
//
//    public Teacher( String salary, String teacherName) {
//        super();
//        this.salary = salary;
//        this.teacherName = teacherName;
//    }
//
//    public Teacher(String salary, String teacherName, Department department) {
//        this.salary = salary;
//        this.teacherName = teacherName;
//        this.department = department;
//    }
//
//    public Teacher() {}
//
//    public int getTeacherId() {
//        return teacherId;
//    }
//
//    public void setTeacherId(int teacherId) {
//        this.teacherId = teacherId;
//    }
//
//    public String getSalary() {
//        return salary;
//    }
//
//    public void setSalary(String salary) {
//        this.salary = salary;
//    }
//
//    public String getTeacherName() {
//        return teacherName;
//    }
//
//    public void setTeacherName(String teacherName) {
//        this.teacherName = teacherName;
//    }
//
//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
//}


// ---------------- ONE TO MANY RELATIONSHIP ---------------- \\
@Entity
@Table
public class Teacher implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    private int teacherId;
    private String salary;
    private String teacherName;

    // Implement One-to-One relationship
    // @OneToOne(cascade = CascadeType.ALL)
    // private Address address;

    // Implement Many-to-Many relationship
    // This association is undirectional, Teacher is on the owner's side and thw Cohort is on the other side
    // The intermediate (join) table contains two foreign keys, one of them refers to the Teacher’s primary key and the other refers to the Cohort’s primary Key.
    @ManyToMany(targetEntity = Cohort.class)
    private Set<Cohort> cohort;

    // Constructors
    public Teacher( String salary, String teacherName) {
        super();
        this.salary = salary;
        this.teacherName = teacherName;
    }

    public Teacher() {}

    public Teacher(String salary, String teacherName, Department department) {
        this.salary = salary;
        this.teacherName = teacherName;
    }

    public Teacher(String salary, String teacherName, Set<Cohort> cohort) {
        this.salary = salary;
        this.teacherName = teacherName;
        this.cohort = cohort;
    }

    public int getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;    }

//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }


    public Set<Cohort> getCohort() {
        return cohort;
    }

    public void setCohort(Set<Cohort> cohort) {
        this.cohort = cohort;
    }

}
