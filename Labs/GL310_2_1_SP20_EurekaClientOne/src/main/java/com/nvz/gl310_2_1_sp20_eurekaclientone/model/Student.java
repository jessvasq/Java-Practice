package com.nvz.gl310_2_1_sp20_eurekaclientone.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private String className;

    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }
}
