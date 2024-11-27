package org.example.umcspringworkbook4.service.MemberService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.umcspringworkbook4.apiPayload.code.status.ErrorStatus;
import org.example.umcspringworkbook4.apiPayload.exception.handler.FoodCategoryHandler;
import org.example.umcspringworkbook4.converter.MemberConverter;
import org.example.umcspringworkbook4.converter.MemberPreferConverter;
import org.example.umcspringworkbook4.domain.FoodCategory;
import org.example.umcspringworkbook4.domain.Member;
import org.example.umcspringworkbook4.domain.mapping.MemberPrefer;
import org.example.umcspringworkbook4.repository.FoodCategoryRepository;
import org.example.umcspringworkbook4.repository.MemberRepository.MemberRepository;
import org.example.umcspringworkbook4.web.dto.MemberDTO.MemberRequestDTO;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService{

    private final MemberRepository memberRepository;
    private final FoodCategoryRepository foodCategoryRepository;

    @Override
    @Transactional
    public Member joinMember(MemberRequestDTO.JoinDto request) {
        Member newMember = MemberConverter.toMember(request);
        List<FoodCategory> foodCategoryList = request.getPreferCategory().stream()
                .map(category -> {
                    return foodCategoryRepository.findById(category).orElseThrow(() -> new FoodCategoryHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());

        List<MemberPrefer> memberPreferList = MemberPreferConverter.toMemberPreferList(foodCategoryList);

        memberPreferList.forEach(memberPrefer -> {memberPrefer.setMember(newMember);});

        return memberRepository.save(newMember);

    }
}