package com.hackapoint.api.randomuser;

import com.hackapoint.api.avatar.Avatar;
import com.hackapoint.api.member.Member;
import com.hackapoint.api.randomuser.models.RandomUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomToMember {
    @Autowired
    Avatar avatar;

    @Autowired RandomUserService service;

    public Member createRandomMember(RandomUser r){
        Member m = new Member();
        m.setName(r.getResults().get(0).getLogin().getUsername());
        m.setAvatar(avatar.setAvatar(m.getName()));
        m.setQuote(service.getKanyeQuote());
        m.setActivity(service.getRandomActivity());
        return m;
    }
}
