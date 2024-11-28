package org.example.umcspringworkbook4.service.MissionService;

import org.example.umcspringworkbook4.converter.MissionConverter;
import org.example.umcspringworkbook4.converter.ReviewConverter;
import org.example.umcspringworkbook4.domain.Mission;
import org.example.umcspringworkbook4.domain.Review;
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
	@Override
	@Transactional
	public Mission createMission(MissionRequestDTO.writeMissionDTO request){
		return  MissionConverter.toMission(request, storeRepository);

	}
}
