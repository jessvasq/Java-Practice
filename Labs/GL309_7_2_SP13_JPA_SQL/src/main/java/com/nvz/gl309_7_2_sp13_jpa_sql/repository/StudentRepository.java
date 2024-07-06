package com.nvz.gl309_7_2_sp13_jpa_sql.repository;
import com.nvz.gl309_7_2_sp13_jpa_sql.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    //custom methods
    Student findByAccountNo(Long accountNo);
    List<Student> findByNameContaining(String name);
}
