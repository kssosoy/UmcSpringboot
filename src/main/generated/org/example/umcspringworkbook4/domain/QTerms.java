package org.example.umcspringworkbook4.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTerms is a Querydsl query type for Terms
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTerms extends EntityPathBase<Terms> {

    private static final long serialVersionUID = -865111493L;

    public static final QTerms terms = new QTerms("terms");

    public final StringPath body = createString("body");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<org.example.umcspringworkbook4.domain.mapping.MemberAgree, org.example.umcspringworkbook4.domain.mapping.QMemberAgree> memberAgreeList = this.<org.example.umcspringworkbook4.domain.mapping.MemberAgree, org.example.umcspringworkbook4.domain.mapping.QMemberAgree>createList("memberAgreeList", org.example.umcspringworkbook4.domain.mapping.MemberAgree.class, org.example.umcspringworkbook4.domain.mapping.QMemberAgree.class, PathInits.DIRECT2);

    public final BooleanPath optional = createBoolean("optional");

    public final StringPath title = createString("title");

    public QTerms(String variable) {
        super(Terms.class, forVariable(variable));
    }

    public QTerms(Path<? extends Terms> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTerms(PathMetadata metadata) {
        super(Terms.class, metadata);
    }

}

