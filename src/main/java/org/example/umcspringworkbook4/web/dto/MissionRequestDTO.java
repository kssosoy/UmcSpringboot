package org.example.umcspringworkbook4.web.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public class MissionRequestDTO {
	@Getter
	public static class writeMissionDTO{
		@NotNull
		Integer reward;
		@NotNull
		LocalDateTime deadline;
		@NotNull
		String mission_spec;
		@NotNull
		Long StoreId;

	}
}
