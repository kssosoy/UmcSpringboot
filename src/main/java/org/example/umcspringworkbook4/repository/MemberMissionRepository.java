package org.example.umcspringworkbook4.repository;

import org.example.umcspringworkbook4.domain.enums.MissionStatus;
import org.example.umcspringworkbook4.domain.mapping.MemberMission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberMissionRepository extends JpaRepository<MemberMission, Long> {
	boolean existsByMemberIdAndMissionIdAndStatus(Long memberId, Long missionId, MissionStatus status);
}
