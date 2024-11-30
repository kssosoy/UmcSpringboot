package org.example.umcspringworkbook4.converter;

import org.example.umcspringworkbook4.apiPayload.code.status.ErrorStatus;
import org.example.umcspringworkbook4.apiPayload.exception.handler.MemberHandler;
import org.example.umcspringworkbook4.apiPayload.exception.handler.MissionHandler;
import org.example.umcspringworkbook4.apiPayload.exception.handler.StoreHandler;
import org.example.umcspringworkbook4.domain.Member;
import org.example.umcspringworkbook4.domain.Mission;
import org.example.umcspringworkbook4.domain.Review;
import org.example.umcspringworkbook4.domain.Store;
import org.example.umcspringworkbook4.domain.enums.MissionStatus;
import org.example.umcspringworkbook4.domain.mapping.MemberMission;
import org.example.umcspringworkbook4.repository.MemberRepository;
import org.example.umcspringworkbook4.repository.MissionRepository;
import org.example.umcspringworkbook4.repository.StoreRepository.StoreRepository;
import org.example.umcspringworkbook4.web.dto.MissionRequestDTO;
import org.example.umcspringworkbook4.web.dto.MissionResponseDTO;
import org.example.umcspringworkbook4.web.dto.ReviewResponseDTO;

public class MissionConverter {
	public static Mission toMission (MissionRequestDTO.writeMissionDTO request, Store store){
		return Mission.builder()
			.mission_spec(request.getMissionSpec())
			.store(store)
			.memberMissionList(null)
			.reward(request.getReward())
			.deadline(request.getDeadline())
			.build();
	}
	public static MissionResponseDTO.writeMissionDTO toaddMissionResult(Mission mission){
		return MissionResponseDTO.writeMissionDTO.builder()
			.mission_spec(mission.getMission_spec())
			.StoreId(mission.getStore().getId())
			.build();
	}

	public static MemberMission toMemberMission (MissionRequestDTO.challengeDTO request, MemberRepository memberRepository, MissionRepository missionRepository){
		Member member = memberRepository.findById(request.getMemberId())
			.orElseThrow(()-> new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND));
		Mission mission = missionRepository.findById(request.getMissionId())
			.orElseThrow(()-> new MissionHandler(ErrorStatus.MISSION_NOT_FOUND));
		return MemberMission.builder()
			.status(MissionStatus.CHALLENGING)
			.member(member)
			.mission(mission)
			.build();
	}

	public static MissionResponseDTO.challengeDTO toaddChallenge(MemberMission memberMission){
		return MissionResponseDTO.challengeDTO.builder()
			.memberId(memberMission.getMember().getId())
			.missionId(memberMission.getMission().getId())
			.mission_spec(memberMission.getMission().getMission_spec())
			.status(memberMission.getStatus())
			.deadline(memberMission.getMission().getDeadline())
			.reward(memberMission.getMission().getReward())
			.build();
	}
}
