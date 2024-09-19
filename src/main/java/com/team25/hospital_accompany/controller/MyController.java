package com.team25.hospital_accompany.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MyController {
    @GetMapping("/my")
    @ResponseBody
    public String myAPI(){
        return "my route";
    }
}
