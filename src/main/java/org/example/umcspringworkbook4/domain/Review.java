package org.example.umcspringworkbook4.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.umcspringworkbook4.domain.common.BaseEntity;

@Entity
@Getter
@Builder
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@AllArgsConstructor
public class Review extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 40)
    private String body;

    @Column(nullable = false)
    private Float score;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="store_id")
    private Store store;


}
