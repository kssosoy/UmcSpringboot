package org.example.umcspringworkbook4.service.ReviewService;

import org.example.umcspringworkbook4.domain.Review;
import org.example.umcspringworkbook4.web.dto.ReviewRequestDTO;

public interface ReviewCommandService {
	Review createReview (ReviewRequestDTO.writeReviewDTO request);
}
