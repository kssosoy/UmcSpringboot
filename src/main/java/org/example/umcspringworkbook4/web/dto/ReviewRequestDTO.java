package org.example.umcspringworkbook4.web.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public class ReviewRequestDTO {
	@Getter
	public static class writeReviewDTO{
		@NotNull
		String body;
		@NotNull
		Float score;
		@NotNull
		Long storeId;

		@NotNull
		Long memberId;


	}
}
