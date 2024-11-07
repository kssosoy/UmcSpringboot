package org.example.umcspringworkbook4.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import org.example.umcspringworkbook4.domain.FoodCategory;
import org.example.umcspringworkbook4.domain.Member;
import org.example.umcspringworkbook4.domain.common.BaseEntity;
@Entity
@Getter
@Builder
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberPrefer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private FoodCategory foodCategory;
}
