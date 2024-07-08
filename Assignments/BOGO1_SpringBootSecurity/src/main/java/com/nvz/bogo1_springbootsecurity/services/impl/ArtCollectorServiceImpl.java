package com.nvz.bogo1_springbootsecurity.services.impl;

import com.nvz.bogo1_springbootsecurity.dto.ArtCollectorDto;
import com.nvz.bogo1_springbootsecurity.entity.ArtCollector;
import com.nvz.bogo1_springbootsecurity.entity.Role;
import com.nvz.bogo1_springbootsecurity.repository.ArtCollectorRepository;
import com.nvz.bogo1_springbootsecurity.repository.RoleRepository;
import com.nvz.bogo1_springbootsecurity.services.ArtCollectorService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtCollectorServiceImpl implements ArtCollectorService {

    private ArtCollectorRepository artCollectorRepository;

    private RoleRepository roleRepository;

    private PasswordEncoder passwordEncoder;

    public ArtCollectorServiceImpl(ArtCollectorRepository artCollectorRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.artCollectorRepository = artCollectorRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveArtCollector(ArtCollector artCollector) {
        ArtCollectorDto artCollectorDto = new ArtCollectorDto();
        artCollector.setUsername(artCollectorDto.getFirstName() + " " + artCollectorDto.getLastName());
        artCollector.setEmail(artCollectorDto.getEmail());

        artCollector.setPassword(passwordEncoder.encode(artCollectorDto.getPassword()));

        String roleName;
        if(artCollectorDto.isAdminRegistration()){
            roleName = "ROLE_ADMIN";
        } else {
            roleName = "ROLE_USER";
        }

        //Check if role already exists in database, otherwise create it
        Role role = roleRepository.findByName("ROLE_USER");
        if(role == null){
            role = new Role();
            role.setName((roleName));
            roleRepository.save(role);
        }

        artCollector.setRoles(Collections.singletonList(role));
        artCollectorRepository.save(artCollector);
    }

    @Override
    public ArtCollector findArtCollectorByEmail(String name) {
        return artCollectorRepository.findByEmail(name);
    }

    @Override
    public List<ArtCollector> findAllArtCollectors() {
        return List.of();
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return null;
    }


//    @Override
//    public List<ArtCollector> findAllArtCollectors(){
//        List<ArtCollector> artCollectors = artCollectorRepository.findAll();
//        return artCollectors.stream().map((artCollector) -> convertEntityToDto(artCollector)).collect(Collectors.toList());
//        //return artCollectorRepository.findAll();
//    }
//
//    private ArtCollectorDto convertEntityToDto(ArtCollector artCollector){
//        ArtCollectorDto artCollectorDto = new ArtCollectorDto();
//        String[] name = artCollector.getUsername().split(" ");
//        artCollectorDto.setFirstName(name[0]);
//        artCollectorDto.setLastName(name[1]);
//        artCollectorDto.setEmail(artCollector.getEmail());
//        return artCollectorDto;
//    }

}

