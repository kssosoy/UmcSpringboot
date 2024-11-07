package org.example.umcspringworkbook4.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.umcspringworkbook4.domain.common.BaseEntity;
import org.example.umcspringworkbook4.domain.mapping.MemberMission;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@AllArgsConstructor
public class Mission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer reward;

    private LocalDateTime deadline;

    @Column(nullable = false, length = 40)
    private String mission_spec;

    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL)
    private List<MemberMission> memberMissionList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="store_id")
    private Store store;
}
