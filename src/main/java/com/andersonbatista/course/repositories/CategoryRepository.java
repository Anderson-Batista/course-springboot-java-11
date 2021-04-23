package com.andersonbatista.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersonbatista.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
