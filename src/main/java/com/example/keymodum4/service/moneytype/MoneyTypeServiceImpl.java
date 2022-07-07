package com.example.keymodum4.service.moneytype;

import com.example.keymodum4.model.MoneyType;
import com.example.keymodum4.repository.IMoneyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MoneyTypeServiceImpl implements MoneyTypeService {
    @Autowired
    IMoneyTypeRepository moneyTypeRepository;

    @Override
    public Iterable<MoneyType> findAll() {
        return moneyTypeRepository.findAll();
    }

    @Override
    public Optional<MoneyType> findById(Long id) {
        return moneyTypeRepository.findById(id);
    }

    @Override
    public MoneyType save(MoneyType moneyType) {
        return moneyTypeRepository.save(moneyType);
    }

    @Override
    public void remove(Long id) {
        moneyTypeRepository.deleteById(id);
    }
}
