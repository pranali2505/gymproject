package com.example.gymManage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member getMemberById(Long memberId) {
        return memberRepository.findById(memberId).orElse(null);
    }

    @Override
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member updateMember(Long memberId, Member member) {
        if (memberRepository.existsById(memberId)) {
            member.setId(memberId);
            return memberRepository.save(member);
        }
        return null;
    }

    @Override
    public void deleteMember(Long memberId) {
        memberRepository.deleteById(memberId);
    }
}