package org.example.umcspringworkbook4.service.MemberService;

import java.util.List;

import org.example.umcspringworkbook4.domain.Member;
import org.example.umcspringworkbook4.domain.enums.MemberStatus;
import org.example.umcspringworkbook4.repository.MemberRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService{
	private final MemberRepository memberRepository;

	List<Member> member = memberRepository.findByNameAndStatus("베뉴", MemberStatus.ACTIVE);
}
