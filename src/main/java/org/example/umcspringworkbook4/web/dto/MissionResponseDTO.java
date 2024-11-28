package org.example.umcspringworkbook4.web.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class MissionResponseDTO {
	@Builder
	@Getter
	@NoArgsConstructor
	@AllArgsConstructor
	public static class writeMissionDTO{
		@NotNull
		String mission_spec;
		@NotNull
		Long StoreId;
	}

}
