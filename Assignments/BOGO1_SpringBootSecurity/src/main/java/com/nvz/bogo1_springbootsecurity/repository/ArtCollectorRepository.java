package com.nvz.bogo1_springbootsecurity.repository;

import com.nvz.bogo1_springbootsecurity.entity.ArtCollector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtCollectorRepository extends JpaRepository<ArtCollector, Long> {
    ArtCollector findByEmail(String name);
}
