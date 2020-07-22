package com.hackapoint.api.hackathon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/hackathons")
public class HackathonController {
    @Autowired HackathonService service;

    @GetMapping("/all")
    public List<Hackathon> getAll(){ return service.getAll();}

    @GetMapping("/{id}")
    public Optional<Hackathon> getOne(@PathVariable Long id)
    { return service.getHackathonById(id);}

    @PostMapping()
    public Hackathon newHackathon(@RequestBody Hackathon h)
    { return service.newHack(h);}

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable Long id)
    { service.deleteHack(id);}

}
