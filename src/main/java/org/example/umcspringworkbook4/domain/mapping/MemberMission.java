package org.example.umcspringworkbook4.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import org.example.umcspringworkbook4.domain.Member;
import org.example.umcspringworkbook4.domain.Mission;
import org.example.umcspringworkbook4.domain.common.BaseEntity;
import org.example.umcspringworkbook4.domain.enums.MissionStatus;

@Entity
@Getter
@Builder
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(20) DEFAULT 'CHALLENGING'")
    private MissionStatus status;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="mission_id")
    private Mission mission;
}
