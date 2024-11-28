package org.example.umcspringworkbook4.service.ReviewService;

import org.example.umcspringworkbook4.converter.ReviewConverter;
import org.example.umcspringworkbook4.domain.Review;
import org.example.umcspringworkbook4.repository.MemberRepository;
import org.example.umcspringworkbook4.repository.ReviewRepository;
import org.example.umcspringworkbook4.repository.StoreRepository.StoreRepository;
import org.example.umcspringworkbook4.web.dto.ReviewRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReviewCommandServiceImpl implements ReviewCommandService{
	private final ReviewRepository reviewRepository;
	private StoreRepository storeRepository;
	private MemberRepository memberRepository;

	@Override
	@Transactional
	public Review createReview (ReviewRequestDTO.writeReviewDTO request){
		return  ReviewConverter.toReview(request, storeRepository, memberRepository);
	}
}
