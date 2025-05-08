package com.trabajoaw.trabajoarquitecturaweb.Security.Services;

import com.trabajoaw.trabajoarquitecturaweb.Security.Entities.User;
import com.trabajoaw.trabajoarquitecturaweb.Security.Repositories.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceUser {
    @Autowired
    private RepositoryUser userRepository;

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

    public Integer insertUserRol(Long user_id, Long rol_id) {
        Integer result = 0;
        userRepository.insertUserRol(user_id, rol_id);
        return 1;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

}
