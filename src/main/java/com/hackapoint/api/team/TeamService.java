package com.hackapoint.api.team;

import com.hackapoint.api.avatar.Avatar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TeamService {
    @Autowired TeamRepository repository;
    @Autowired
    Avatar avatar;
    public List<Team> getAll(){ return repository.findAll();}

    public Optional<Team> getById(Long id){ return repository.findById(id);}
    public Team newTeam(Team t){
        t.setAvatar(avatar.setTeamAvatar(t.getName()));
        return repository.save(t);}
    public void deleteTeam(Long id){ repository.deleteById(id);}

}
