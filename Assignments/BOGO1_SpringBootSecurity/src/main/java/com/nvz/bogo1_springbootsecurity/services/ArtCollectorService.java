package com.nvz.bogo1_springbootsecurity.services;
import com.nvz.bogo1_springbootsecurity.entity.ArtCollector;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface ArtCollectorService {
    void saveArtCollector(ArtCollector artCollector);
    ArtCollector findArtCollectorByEmail(String email);
    List<ArtCollector> findAllArtCollectors();

    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;
}
