package com.hackapoint.api.randomuser;

import com.hackapoint.api.randomuser.models.Activity;
import com.hackapoint.api.randomuser.models.RandomUser;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RandomUserService {

    public RandomUser getRandomUser(){
        RandomUser random = new RandomUser();
        String url = "https://randomuser.me/api/";
        WebClient webClient = WebClient.create(url);
        Mono<RandomUser> call = webClient.get().retrieve().bodyToMono(RandomUser.class);
        return random = call.block();
    }
    public String getKanyeQuote(){
        String url = "https://api.kanye.rest/?format=text/activity";
        String quote = "";
        WebClient webClient = WebClient.create(url);
        return quote = webClient.get().retrieve().toString();
    }
    public String getRandomActivity(){
        String url = "https://www.boredapi.com/api/activity";
        String actv = "";
        WebClient webClient = WebClient.create(url);
        Mono<Activity> call = webClient.get().retrieve().bodyToMono(Activity.class);
        Activity a = call.block();
        return actv = a.getActivity();
    }
}
