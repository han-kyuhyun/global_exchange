package com.globalexchange.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/question/*")
public class QuestionController {

    // 메인 페이지
    @GetMapping("/question")
    public void question(){

    }
}