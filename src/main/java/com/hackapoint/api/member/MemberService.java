package com.hackapoint.api.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired MemberRepository repository;

    public List<Member> getAll(){ return repository.findAll();}

    public Optional<Member> getById(Long id){ return repository.findById(id);}
    public Member newMember(Member m){ return repository.save(m);}
    public Member editMember(Member m, Long id)
    {
        Member updated = m;
        Member toUpdate = repository.getOne(id);
        toUpdate.setActivity(updated.getActivity());
        toUpdate.setAvatar(updated.getAvatar());
        toUpdate.setName(updated.getName());
        toUpdate.setQuote(updated.getQuote());
        toUpdate.setTeam(updated.getTeam());

        return repository.save(toUpdate);
    }
    public void delete(Long id){ repository.deleteById(id);}


}
