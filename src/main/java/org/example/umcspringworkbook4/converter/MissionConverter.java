package org.example.umcspringworkbook4.converter;

import org.example.umcspringworkbook4.apiPayload.code.status.ErrorStatus;
import org.example.umcspringworkbook4.apiPayload.exception.handler.StoreHandler;
import org.example.umcspringworkbook4.domain.Mission;
import org.example.umcspringworkbook4.domain.Review;
import org.example.umcspringworkbook4.domain.Store;
import org.example.umcspringworkbook4.repository.StoreRepository.StoreRepository;
import org.example.umcspringworkbook4.web.dto.MissionRequestDTO;
import org.example.umcspringworkbook4.web.dto.MissionResponseDTO;
import org.example.umcspringworkbook4.web.dto.ReviewResponseDTO;

public class MissionConverter {
	public static Mission toMission (MissionRequestDTO.writeMissionDTO request, StoreRepository storeRepository){
		Store store = storeRepository.findById(request.getStoreId())
			.orElseThrow(() -> new StoreHandler(ErrorStatus.STORE_NOT_FOUND));
		return Mission.builder()
			.mission_spec(request.getMission_spec())
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
}
