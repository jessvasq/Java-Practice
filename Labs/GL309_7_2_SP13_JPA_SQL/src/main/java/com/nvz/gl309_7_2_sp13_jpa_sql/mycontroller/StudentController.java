package com.nvz.gl309_7_2_sp13_jpa_sql.mycontroller;

import com.nvz.gl309_7_2_sp13_jpa_sql.model.Student;
import com.nvz.gl309_7_2_sp13_jpa_sql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    // Get all students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }


    // Get or Create a student by account number
    @GetMapping("/students/{accountNo}")
    public Student findStudentByAccountNo(@PathVariable Long accountNo) {
        return studentRepository.findByAccountNo(accountNo);
    }

    // Add a student in the database
    @PostMapping("/AddStudent")
    public long saveBook(@RequestBody Student st){
        studentRepository.save(st);
        return st.getId();
    }

    // Delete student by id
    @DeleteMapping("/deletebyid/{id}")
    public void deleteStudentById(@PathVariable("id") long id){
        studentRepository.deleteById(id);
    }

    // Delete all students
    @DeleteMapping("/deleteAll")
    public void deleteAllStudents(){
        studentRepository.deleteAll();
    }

    @PutMapping("/updateStudentById/{id}")
    private void updateStudentById(@PathVariable("id") long stuid, @RequestBody Student st){
        Optional<Student> stuData = studentRepository.findById(stuid);

        if (stuData.isPresent()){
            Student s = stuData.get();
            s.setName(st.getName());
            s.setAccountNo(st.getAccountNo());
            s.setId(st.getId());
            s.setMarks(st.getMarks());
            studentRepository.save(s);
        }
    }
}
