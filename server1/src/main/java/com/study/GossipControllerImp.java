package com.study;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/")
public class GossipControllerImp  {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String getGossip(){
        return "Start of Gossip";
    }

}
