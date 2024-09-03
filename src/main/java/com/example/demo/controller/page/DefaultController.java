package com.example.demo.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("")
@Controller
public class DefaultController {
    @GetMapping({"/index"}) // 주소값 // 이 안에 이는 주소값은 꼭 유니크해야함(클랙스 안에서만 )!
//    @GetMapping("/index") // 주소값
    public String index() {
        return "index";
    }
}



