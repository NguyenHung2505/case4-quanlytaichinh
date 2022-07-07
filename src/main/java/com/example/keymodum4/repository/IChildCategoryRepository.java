package com.example.keymodum4.repository;

import com.example.keymodum4.model.ChildCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChildCategoryRepository extends JpaRepository<ChildCategory, Long> {
}
