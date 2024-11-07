package org.example.umcspringworkbook4.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.umcspringworkbook4.domain.mapping.MemberAgree;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@AllArgsConstructor
public class Terms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length =20)
    private String title;

    @Column(nullable = false, length =50)
    private String body;

    @Column(nullable = false)
    private Boolean optional;

    @OneToMany(mappedBy="terms", cascade = CascadeType.ALL)
    private List<MemberAgree> memberAgreeList = new ArrayList<>();
}
