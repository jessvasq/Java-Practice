package com.nvz.gl309_7_1_sp12_jpa_crud_api.repository;

import com.nvz.gl309_7_1_sp12_jpa_crud_api.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


//We are using JpaRepository’s methods: save(), findOne(), findById(), findAll(), count(), delete(), deleteById()
@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    // custom method
    List<Tutorial> findByPublished(boolean published);
}
