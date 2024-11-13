package org.example.umcspringworkbook4.repository;

import java.util.List;

import org.example.umcspringworkbook4.domain.Member;
import org.example.umcspringworkbook4.domain.enums.MemberStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends JpaRepository<Member, Long> {

	//List<Member> findByNameAndStatus(String name, MemberStatus status);
	// 자동으로 jpa 내부적으로 쿼리문 생성해서 실행해줌

	//@Query 어노테이션 사용하는 방법, @Param 으로 파라미터 지정
	@Query("SELECT m FROM Member m WHERE m.name = :name AND m.status = :status")
	List<Member> findByNameAndStatus(@Param("name") String name,@Param("status") MemberStatus status );


}
