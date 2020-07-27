package com.hackapoint.api.avatar;

import org.springframework.stereotype.Service;

@Service
public class Avatar {

    public String setTeamAvatar(String name){
        String ext = ".svg?w=400";
        String url = "https://avatars.dicebear.com/api/jdenticon/";
        return url+name+ext;
    }

    public String setHackathonAvatar(String name){
        String ext = ".svg?w=400";
        String url = "https://avatars.dicebear.com/api/identicon/";
        return url+name+ext;
    }
    public String setAvatar(String name){
        String ext = ".svg?w=400";
        String url = "https://avatars.dicebear.com/api/gridy/";
        return url+name+ext;
    }
}
