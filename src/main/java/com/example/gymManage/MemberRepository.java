package com.example.gymManage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // Additional query methods can be added if needed
}