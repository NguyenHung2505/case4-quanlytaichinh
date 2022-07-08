package com.example.keymodum4.repository;

import com.example.keymodum4.model.MoneyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMoneyTypeRepository extends JpaRepository<MoneyType, Long> {
}
