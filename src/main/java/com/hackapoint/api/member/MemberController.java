package com.hackapoint.api.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired MemberService service;

    @GetMapping("/all")
    public List<Member> getAll(){ return service.getAll();}

    @GetMapping("/{id}")
    public Optional<Member> getOne(@PathVariable Long id)
    { return service.getById(id);}

    @PostMapping()
    public Member newMember(@RequestBody Member m)
    { return service.newMember(m);}

    @PutMapping("/{id}")
    public Member editMember(@RequestBody Member m, @PathVariable Long id)
    { return service.editMember(m, id);}


    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable(value = "id") Long id) {
        service.delete(id);
    }
}
