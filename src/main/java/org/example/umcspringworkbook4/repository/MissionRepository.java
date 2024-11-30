package org.example.umcspringworkbook4.repository;

import org.example.umcspringworkbook4.domain.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long> {
}
