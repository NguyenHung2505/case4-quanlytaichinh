package com.example.keymodum4.service;


import com.example.keymodum4.model.user.Role;

public interface RoleService {
    Iterable<Role> findAll();



    void save(Role role);

    Role findByName(String name);
}