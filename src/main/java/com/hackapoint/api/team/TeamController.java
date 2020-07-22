package com.hackapoint.api.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/members")
public class TeamController {
    @Autowired TeamService service;

    @GetMapping("/all")
    public List<Team> getAll()
    {return service.getAll();}

    @GetMapping("/{id}")
    public Optional<Team> getById(@PathVariable Long id)
    {return service.getById(id);}

    @PostMapping()
    public Team newTeam(@RequestBody Team t)
    {return service.newTeam(t);}

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id)
    { service.deleteTeam(id);}
}
