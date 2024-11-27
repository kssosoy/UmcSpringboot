package org.example.umcspringworkbook4.repository;

import org.example.umcspringworkbook4.domain.FoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Long> {
}