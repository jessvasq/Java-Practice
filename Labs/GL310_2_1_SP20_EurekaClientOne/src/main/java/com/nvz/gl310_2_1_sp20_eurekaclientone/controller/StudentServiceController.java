package com.nvz.gl310_2_1_sp20_eurekaclientone.controller;

import com.nvz.gl310_2_1_sp20_eurekaclientone.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentServiceController {

    @GetMapping("/liststudents/{className}")
    public List<Student> getStudents(@PathVariable String className) {
        String classNames=className;

        //create database used for testing purposes only
        ArrayList<Student> schoolDB=new ArrayList<Student>();
        List<Student> studentList = new ArrayList<Student>();
        Student std1 = new Student("Adam", classNames);
        Student std2 = new Student("Tom", classNames);
        Student std3 = new Student("Fink", classNames);
        Student std4 = new Student("James", classNames);

        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);
        studentList.add(std4);

        return studentList;
    }

}
