package TestSecurity.demo.service;

import TestSecurity.demo.dto.CustomUserDetailsDTO;
import TestSecurity.demo.entity.UserEntity;
import TestSecurity.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userData = userRepository.findByUserName(username);
        if (userData != null) {
            return new CustomUserDetailsDTO(userData);
        }
        return null;
    }
}
