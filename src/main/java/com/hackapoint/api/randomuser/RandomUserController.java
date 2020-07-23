package com.hackapoint.api.randomuser;

import com.hackapoint.api.member.Member;
import com.hackapoint.api.member.MemberRepository;
import com.hackapoint.api.member.MemberService;
import com.hackapoint.api.team.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/randomusers")
public class RandomUserController {
    @Autowired
    RandomUserService service;
    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository repository;
    @Autowired RandomToMember toMember;
    @Autowired
    TeamRepository teamRepository;
    @GetMapping("/{id}")
    public Member randomMember(@PathVariable Long id){
    Member m = new Member();
    m = toMember.createRandomMember(service.getRandomUser());
        m.setTeam(teamRepository.getOne(id));
        repository.save(m);
        return m;
    }

}
