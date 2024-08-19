package com.RalyPe.JhonatanasPost.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NombreConteroller {

    @GetMapping("/nombre")
    public String getnombre2(){
        return "Jhonatan alias Jothcv";
    }

}
