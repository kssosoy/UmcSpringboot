package org.example.umcspringworkbook4.web.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ReviewResponseDTO {
	@Builder
	@Getter
	@NoArgsConstructor
	@AllArgsConstructor
	public static class writeReviewDTO{
		Long id;
		String body;
		LocalDateTime createdAt;
	}
}
