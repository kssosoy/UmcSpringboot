package org.example.umcspringworkbook4.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.umcspringworkbook4.apiPayload.ApiResponse;
import org.example.umcspringworkbook4.converter.MemberConverter;
import org.example.umcspringworkbook4.domain.Member;
import org.example.umcspringworkbook4.service.MemberService.MemberCommandService;
import org.example.umcspringworkbook4.web.dto.MemberDTO.MemberRequestDTO;
import org.example.umcspringworkbook4.web.dto.MemberDTO.MemberResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {

    private final MemberCommandService memberCommandService;

    @PostMapping("/")
    public ApiResponse<MemberResponseDTO.JoinResultDTO> join(@RequestBody @Valid MemberRequestDTO.JoinDto request){
        Member member = memberCommandService.joinMember(request);
        return ApiResponse.onSuccess(MemberConverter.toJoinResultDTO(member));
    }
}