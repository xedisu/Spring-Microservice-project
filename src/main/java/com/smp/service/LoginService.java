package com.smp.service;

import com.smp.dto.UserDTO;
import com.smp.entity.Users;
import com.smp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    UserRepository userRepository;

    public void createUser ( UserDTO user){
        Users users1 = Users.builder()
                .userName(user == null ? null : user.getUserName())
                .password(user.getPassword())
                .build();
        userRepository.save(users1);
    }
}
