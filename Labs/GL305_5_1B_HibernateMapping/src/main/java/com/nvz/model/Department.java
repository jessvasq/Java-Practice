package com.nvz.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Department implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int deptId;
    private String deptName;

    public Department() {}

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public Department(int deptId, String deptName) {
        super();
        this.deptId = deptId;
        this.deptName = deptName;
    }

    //targetEntity: Specify the entity class that is the target of the association.
    @OneToMany (targetEntity = Teacher.class, cascade = {CascadeType.ALL}) //Any change that happens to the teacher must cascade to the department as well.
    private List<Teacher> teacherList;

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
