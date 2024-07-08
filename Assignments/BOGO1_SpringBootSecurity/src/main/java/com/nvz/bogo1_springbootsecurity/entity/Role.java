package com.nvz.bogo1_springbootsecurity.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private List<ArtCollector> artCollectors;

    public Role() {}

    public Role(Long id, String name, List<ArtCollector> artCollectors) {
        this.id = id;
        this.name = name;
        this.artCollectors = artCollectors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ArtCollector> getArtCollectors() {
        return artCollectors;
    }

    public void setArtCollectors(List<ArtCollector> artCollectors) {
        this.artCollectors = artCollectors;
    }
}
