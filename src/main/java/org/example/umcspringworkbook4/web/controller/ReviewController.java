package org.example.umcspringworkbook4.web.controller;

import org.example.umcspringworkbook4.apiPayload.ApiResponse;
import org.example.umcspringworkbook4.converter.ReviewConverter;
import org.example.umcspringworkbook4.domain.Review;
import org.example.umcspringworkbook4.service.ReviewService.ReviewCommandService;
import org.example.umcspringworkbook4.web.dto.ReviewRequestDTO;
import org.example.umcspringworkbook4.web.dto.ReviewResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewController {
	private ReviewCommandService reviewCommandService;

	//가게에 리뷰 추가하기 API
 	@PostMapping("/add")
	@Operation(summary="가게에 리뷰 추가하기 API")
	public ApiResponse<ReviewResponseDTO.writeReviewDTO> addReview (@Valid @RequestBody ReviewRequestDTO.writeReviewDTO request){
		Review review= reviewCommandService.createReview(request);
		return ApiResponse.onSuccess(ReviewConverter.toaddReviewResult(review));
	}
}
