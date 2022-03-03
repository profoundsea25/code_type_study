package study.springintroduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.springintroduction.repository.JpaMemberRepository;
import study.springintroduction.repository.MemberRepository;
import study.springintroduction.repository.MemoryMemberRepository;
import study.springintroduction.service.MemberService;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

//    private final EntityManager em;

//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository() {
//        return new JpaMemberRepository(em);
//    }
}
