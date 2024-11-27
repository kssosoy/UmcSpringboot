package org.example.umcspringworkbook4.service.MemberService;

import org.example.umcspringworkbook4.domain.Member;
import org.example.umcspringworkbook4.web.dto.MemberDTO.MemberRequestDTO;

public interface MemberCommandService {
    Member joinMember(MemberRequestDTO.JoinDto request);
}
