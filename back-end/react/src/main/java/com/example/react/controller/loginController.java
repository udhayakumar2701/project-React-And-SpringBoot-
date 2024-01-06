package com.example.react.controller;

import com.example.react.Dto.loginDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/login")
public class loginController {


    @PostMapping("/save")
    public ResponseEntity<loginDto> loginData(@RequestBody loginDto obj) {
        System.out.println(obj.toString());
      List<loginDto> object=new ArrayList<>();
      object.add(new loginDto());
        // Simulate a successful response with HTTP 200 OK
        // In a real-world scenario, you might perform authentication and return appropriate status codes.
        return ResponseEntity.ok(obj);
    }

}
