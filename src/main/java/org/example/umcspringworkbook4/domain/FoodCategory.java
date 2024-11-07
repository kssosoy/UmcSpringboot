package org.example.umcspringworkbook4.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.umcspringworkbook4.domain.common.BaseEntity;
import org.example.umcspringworkbook4.domain.mapping.MemberAgree;
import org.example.umcspringworkbook4.domain.mapping.MemberPrefer;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@AllArgsConstructor
public class FoodCategory extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @OneToMany(mappedBy = "foodCategory", cascade = CascadeType.ALL)
    private List<MemberPrefer> memberPreferList = new ArrayList<>();
}
