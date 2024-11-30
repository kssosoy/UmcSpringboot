package org.example.umcspringworkbook4.web.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.example.umcspringworkbook4.domain.enums.MissionStatus;

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

		String mission_spec;

		Long StoreId;
	}

	@Builder
	@Getter
	@NoArgsConstructor
	@AllArgsConstructor
	public static class challengeDTO{
		Long memberId;
		Long missionId;
		String mission_spec;
		MissionStatus status;
		LocalDateTime deadline;
		Integer reward;

	}

}
