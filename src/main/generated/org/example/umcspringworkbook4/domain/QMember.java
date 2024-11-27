package org.example.umcspringworkbook4.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -1249216410L;

    public static final QMember member = new QMember("member1");

    public final org.example.umcspringworkbook4.domain.common.QBaseEntity _super = new org.example.umcspringworkbook4.domain.common.QBaseEntity(this);

    public final StringPath address = createString("address");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final EnumPath<org.example.umcspringworkbook4.domain.enums.Gender> gender = createEnum("gender", org.example.umcspringworkbook4.domain.enums.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DatePath<java.time.LocalDate> inactiveDate = createDate("inactiveDate", java.time.LocalDate.class);

    public final ListPath<org.example.umcspringworkbook4.domain.mapping.MemberAgree, org.example.umcspringworkbook4.domain.mapping.QMemberAgree> memberAgreeList = this.<org.example.umcspringworkbook4.domain.mapping.MemberAgree, org.example.umcspringworkbook4.domain.mapping.QMemberAgree>createList("memberAgreeList", org.example.umcspringworkbook4.domain.mapping.MemberAgree.class, org.example.umcspringworkbook4.domain.mapping.QMemberAgree.class, PathInits.DIRECT2);

    public final ListPath<org.example.umcspringworkbook4.domain.mapping.MemberMission, org.example.umcspringworkbook4.domain.mapping.QMemberMission> memberMissionList = this.<org.example.umcspringworkbook4.domain.mapping.MemberMission, org.example.umcspringworkbook4.domain.mapping.QMemberMission>createList("memberMissionList", org.example.umcspringworkbook4.domain.mapping.MemberMission.class, org.example.umcspringworkbook4.domain.mapping.QMemberMission.class, PathInits.DIRECT2);

    public final ListPath<org.example.umcspringworkbook4.domain.mapping.MemberPrefer, org.example.umcspringworkbook4.domain.mapping.QMemberPrefer> memberPreferList = this.<org.example.umcspringworkbook4.domain.mapping.MemberPrefer, org.example.umcspringworkbook4.domain.mapping.QMemberPrefer>createList("memberPreferList", org.example.umcspringworkbook4.domain.mapping.MemberPrefer.class, org.example.umcspringworkbook4.domain.mapping.QMemberPrefer.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final ListPath<Review, QReview> reviewList = this.<Review, QReview>createList("reviewList", Review.class, QReview.class, PathInits.DIRECT2);

    public final EnumPath<org.example.umcspringworkbook4.domain.enums.SocialType> socialType = createEnum("socialType", org.example.umcspringworkbook4.domain.enums.SocialType.class);

    public final StringPath specAddress = createString("specAddress");

    public final EnumPath<org.example.umcspringworkbook4.domain.enums.MemberStatus> status = createEnum("status", org.example.umcspringworkbook4.domain.enums.MemberStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

