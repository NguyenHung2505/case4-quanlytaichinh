package com.example.keymodum4.service;

import java.util.List;
import java.util.Optional;

public interface GeneraService<A>{
    List<A> findAll();

    Optional<A> findById(Long id);

    void save(A a);

    void remove(Long id);
}
