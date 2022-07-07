package com.example.keymodum4.service.category;

import com.example.keymodum4.model.ChildCategory;
import com.example.keymodum4.repository.IChildCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ChildCategoryServiceImpl implements IChildCategoryService {

    @Autowired
    IChildCategoryRepository childCategoryRepository;

    @Override
    public Iterable<ChildCategory> findAll() {
        return childCategoryRepository.findAll();
    }

    @Override
    public Optional<ChildCategory> findById(Long id) {
        return childCategoryRepository.findById(id);
    }

    @Override
    public ChildCategory save(ChildCategory childCategory) {
        return childCategoryRepository.save(childCategory);
    }

    @Override
    public void remove(Long id) {
        childCategoryRepository.deleteById(id);
    }
}
