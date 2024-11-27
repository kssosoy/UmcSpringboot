package org.example.umcspringworkbook4.repository.MemberRepository;

import org.example.umcspringworkbook4.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}