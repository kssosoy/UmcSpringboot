package org.example.umcspringworkbook4.service.MissionService;

import org.example.umcspringworkbook4.domain.Mission;
import org.example.umcspringworkbook4.domain.mapping.MemberMission;
import org.example.umcspringworkbook4.web.dto.MissionRequestDTO;
import org.example.umcspringworkbook4.web.dto.MissionResponseDTO;

public interface MissionCommandService {
	Mission createMission(MissionRequestDTO.writeMissionDTO request);

	MemberMission addChallenge(MissionRequestDTO.challengeDTO request);
}
