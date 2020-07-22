package com.hackapoint.api.hackathon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HackathonService {

    @Autowired HackathonRepository repository;

    public List<Hackathon> getAll(){ return repository.findAll();}

    public Optional<Hackathon> getHackathonById(Long id){ return repository.findById(id);}

    public Hackathon newHack(Hackathon h){ return repository.save(h);}

    public void deleteHack(Long id){ repository.deleteById(id);}

}
