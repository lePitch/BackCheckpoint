package com.hackapoint.api.team;

import com.hackapoint.api.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    @Autowired TeamRepository repository;

    public List<Team> getAll(){ return repository.findAll();}

    public Optional<Team> getById(Long id){ return repository.findById(id);}
    public Team newTeam(Team t){ return repository.save(t);}
    public void deleteTeam(Long id){ repository.deleteById(id);}

}
