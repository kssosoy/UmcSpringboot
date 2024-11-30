package org.example.umcspringworkbook4.service.MissionService;

import org.example.umcspringworkbook4.apiPayload.code.status.ErrorStatus;
import org.example.umcspringworkbook4.apiPayload.exception.handler.StoreHandler;
import org.example.umcspringworkbook4.converter.MissionConverter;
import org.example.umcspringworkbook4.converter.ReviewConverter;
import org.example.umcspringworkbook4.domain.Mission;
import org.example.umcspringworkbook4.domain.Review;
import org.example.umcspringworkbook4.domain.Store;
import org.example.umcspringworkbook4.domain.mapping.MemberMission;
import org.example.umcspringworkbook4.repository.MemberMissionRepository;
import org.example.umcspringworkbook4.repository.MemberRepository;
import org.example.umcspringworkbook4.repository.MissionRepository;
import org.example.umcspringworkbook4.repository.StoreRepository.StoreRepository;
import org.example.umcspringworkbook4.web.dto.MissionRequestDTO;
import org.example.umcspringworkbook4.web.dto.ReviewRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MissionCommandServiceImpl implements MissionCommandService{
	private final StoreRepository storeRepository;
	private final MemberRepository memberRepository;
	private final MissionRepository missionRepository;
	private final MemberMissionRepository memberMissionRepository;
	@Override
	@Transactional
	public Mission createMission(MissionRequestDTO.writeMissionDTO request){
		Store store = storeRepository.findById(request.getStoreId())
			.orElseThrow(() -> new StoreHandler(ErrorStatus.STORE_NOT_FOUND));
		Mission mission= MissionConverter.toMission(request,store);
		missionRepository.save(mission);
		return mission;

	}

	@Override
	@Transactional
	public MemberMission addChallenge(MissionRequestDTO.challengeDTO request){
		MemberMission memberMission= MissionConverter.toMemberMission(request, memberRepository,missionRepository);
		memberMissionRepository.save(memberMission);
		return memberMission;
	}
}
