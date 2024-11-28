package org.example.umcspringworkbook4.repository;

import org.example.umcspringworkbook4.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
