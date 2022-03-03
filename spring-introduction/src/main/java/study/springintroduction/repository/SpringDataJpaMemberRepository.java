package study.springintroduction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.springintroduction.domain.Member;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{

    Optional<Member> findByName(String name);
}
