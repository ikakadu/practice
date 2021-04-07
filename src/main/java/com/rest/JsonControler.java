package com.rest;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class JsonControler {

    @PostMapping(path = "/demo")
    public String fun(@RequestBody String json){
        Gson gson = new Gson();
        OneDto oneDto = gson.fromJson(json, OneDto.class);
        return oneDto.toString();
    }

}
