package com.example.keymodum4.service.category;

import com.example.keymodum4.model.ParentCategory;
import com.example.keymodum4.repository.IParentCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParentCategoryServiceImpl implements IParentCategoryService {

    @Autowired
    IParentCategoryRepository parentCategoryRepository;

    @Override
    public Iterable<ParentCategory> findAll() {
        return parentCategoryRepository.findAll();
    }

    @Override
    public Optional<ParentCategory> findById(Long id) {
        return parentCategoryRepository.findById(id);
    }

    @Override
    public ParentCategory save(ParentCategory parentCategory) {
        return parentCategoryRepository.save(parentCategory);
    }


    @Override
    public void remove(Long id) {
        parentCategoryRepository.deleteById(id);
    }
}
