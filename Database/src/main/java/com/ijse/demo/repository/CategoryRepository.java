package com.ijse.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.demo.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
