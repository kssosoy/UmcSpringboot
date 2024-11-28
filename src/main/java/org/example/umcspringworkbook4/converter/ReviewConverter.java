package org.example.umcspringworkbook4.converter;

import org.example.umcspringworkbook4.apiPayload.code.status.ErrorStatus;
import org.example.umcspringworkbook4.apiPayload.exception.handler.FoodCategoryHandler;
import org.example.umcspringworkbook4.apiPayload.exception.handler.MemberHandler;
import org.example.umcspringworkbook4.apiPayload.exception.handler.StoreHandler;
import org.example.umcspringworkbook4.domain.Member;
import org.example.umcspringworkbook4.domain.Review;
import org.example.umcspringworkbook4.domain.Store;
import org.example.umcspringworkbook4.repository.MemberRepository.MemberRepository;
import org.example.umcspringworkbook4.repository.StoreRepository.StoreRepository;
import org.example.umcspringworkbook4.web.dto.ReviewRequestDTO;
import org.example.umcspringworkbook4.web.dto.ReviewResponseDTO;
import org.springframework.http.HttpStatus;

public class ReviewConverter {



	public static ReviewResponseDTO.writeReviewDTO toaddReviewResult(Review review){
		return ReviewResponseDTO.writeReviewDTO.builder()
			.id(review.getId())
			.body(review.getBody())
			.createdAt(review.getCreatedAt())
			.build();
	}

	public static Review toReview(ReviewRequestDTO.writeReviewDTO request, StoreRepository storeRepository, MemberRepository memberRepository){
		Store store = storeRepository.findById(request.getStoreId())
			.orElseThrow(() -> new StoreHandler(ErrorStatus.STORE_NOT_FOUND));
		Member member = memberRepository.findById(request.getMemberId())
			.orElseThrow(() -> new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND));
		return Review. builder()
			.body(request.getBody())
			.score(request.getScore())
			.store(store)
			.member(member)
			.build();
	}
}
