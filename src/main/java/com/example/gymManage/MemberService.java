package com.example.gymManage;

import java.util.List;

public interface MemberService {
    List<Member> getAllMembers();

    Member getMemberById(Long memberId);

    Member createMember(Member member);

    Member updateMember(Long memberId, Member member);

    void deleteMember(Long memberId);
}