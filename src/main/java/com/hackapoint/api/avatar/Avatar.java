package com.hackapoint.api.avatar;

import org.springframework.stereotype.Service;

@Service
public class Avatar {

    public String setAvatar(String name){
        String ext = ".svg?w=400";
        String url = "https://avatars.dicebear.com/api/identicon/";
        return url+name+ext;
    }
}
