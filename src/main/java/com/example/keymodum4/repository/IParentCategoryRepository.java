package com.example.keymodum4.repository;

import com.example.keymodum4.model.ParentCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IParentCategoryRepository extends JpaRepository<ParentCategory,Long> {
}
