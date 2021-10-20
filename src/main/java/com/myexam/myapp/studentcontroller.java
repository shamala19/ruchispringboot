package com.myexam.myapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class studentcontroller {
@RequestMapping
    public student getdata(){

       return new student("ruchitha","prabhakar");



    }
@GetMapping("{fname}/{lname}")
    public student getdata1(@PathVariable("fname")String fname, @PathVariable("lname")String lname){
    return new student("sanjay","prabhakar");
    }
@GetMapping("student/rollno")
    public student getdata2(@RequestParam(name= "fname")String fname, @RequestParam(name= "lname")String lname){
    return new student(fname,lname);


    }
}






