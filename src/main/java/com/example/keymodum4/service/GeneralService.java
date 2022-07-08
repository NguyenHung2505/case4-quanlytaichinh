package com.example.keymodum4.service;

import java.util.List;
import java.util.Optional;

public interface GeneralService<A>{
    Iterable<A> findAll();

    Optional<A> findById(Long id);

    A save(A a);

    void remove(Long id);
}
