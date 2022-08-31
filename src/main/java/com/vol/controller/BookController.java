package com.vol.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/id={id}")
    public String getBook(@PathVariable int id){
        System.out.println("今天又摸鱼了，真好");
        return "{'什么时候':'能毕业'}";
    }
}
