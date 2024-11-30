package org.example.umcspringworkbook4.validation.validator;

import org.example.umcspringworkbook4.apiPayload.code.status.ErrorStatus;
import org.example.umcspringworkbook4.domain.enums.MissionStatus;
import org.example.umcspringworkbook4.repository.MemberMissionRepository;
import org.example.umcspringworkbook4.validation.annotation.CheckStatus;
import org.example.umcspringworkbook4.validation.annotation.ExistStore;
import org.example.umcspringworkbook4.web.dto.MissionRequestDTO;
import org.springframework.stereotype.Component;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CheckStatusValidator implements ConstraintValidator<CheckStatus, MissionRequestDTO.challengeDTO> {
	private final MemberMissionRepository memberMissionRepository;
	@Override
	public void initialize(CheckStatus constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
	}

	@Override
	public boolean isValid(MissionRequestDTO.challengeDTO request ,ConstraintValidatorContext context) {
		boolean isValid = memberMissionRepository.existsByMemberIdAndMissionIdAndStatus(request.getMemberId(),
			request.getMissionId(), MissionStatus.CHALLENGING);

		if (!isValid) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(ErrorStatus.MISSION_NOT_CHALLENGING.toString()).addConstraintViolation();
		}

		return isValid;
	}
}
