package org.example.umcspringworkbook4.web.controller;

import org.example.umcspringworkbook4.apiPayload.ApiResponse;
import org.example.umcspringworkbook4.converter.MissionConverter;
import org.example.umcspringworkbook4.converter.ReviewConverter;
import org.example.umcspringworkbook4.domain.Mission;
import org.example.umcspringworkbook4.domain.Review;
import org.example.umcspringworkbook4.domain.mapping.MemberMission;
import org.example.umcspringworkbook4.service.MissionService.MissionCommandService;
import org.example.umcspringworkbook4.service.ReviewService.ReviewCommandService;
import org.example.umcspringworkbook4.validation.annotation.CheckStatus;
import org.example.umcspringworkbook4.web.dto.MissionRequestDTO;
import org.example.umcspringworkbook4.web.dto.MissionResponseDTO;
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
@RequestMapping("/mission")
public class MissionController {
	private final MissionCommandService missionCommandService;

	@PostMapping("/add")
	@Operation(summary="가게에 미션 추가하기 API")
	public ApiResponse<MissionResponseDTO.writeMissionDTO> addReview (@Valid @RequestBody MissionRequestDTO.writeMissionDTO request){
		Mission mission= missionCommandService.createMission(request);
		return ApiResponse.onSuccess(MissionConverter.toaddMissionResult(mission));
	}

	@PostMapping("/challenge")
	@Operation(summary="가게의 미션을 도전 중인 미션에 추가 API")
	public ApiResponse<MissionResponseDTO.challengeDTO> addChallenge (@Valid @RequestBody @CheckStatus MissionRequestDTO.challengeDTO request){
		MemberMission memberMission = missionCommandService.addChallenge(request);
		return ApiResponse.onSuccess(MissionConverter.toaddChallenge(memberMission));
	}
}
