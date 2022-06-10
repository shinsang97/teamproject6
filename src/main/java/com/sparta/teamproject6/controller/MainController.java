package com.sparta.teamproject6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {
    // 게시글 누를시 상세페이지 이동
    @GetMapping("/api/post/{id}")
    public String post() {
        return "post";
    }
}
