package org.example.umcspringworkbook4.web.dto;

import java.time.LocalDateTime;

import org.example.umcspringworkbook4.validation.annotation.ExistStore;

import com.fasterxml.jackson.annotation.JsonProperty;

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
		@JsonProperty("mission_spec")
		private String missionSpec;

		@NotNull
		@ExistStore
		Long storeId;

	}

	@Getter
	public static class challengeDTO{
		@NotNull
		Long memberId;
		@NotNull
		Long missionId;
	}
}
