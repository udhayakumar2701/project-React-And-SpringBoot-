package com.example.react.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.react.Dto.loginDto;
import com.example.react.Dto.registerDto;

/**
 * @author udhayakumar
 */

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/login")
public class loginController {


    @PostMapping("/save")
    public ResponseEntity<?> loginData(@RequestBody loginDto obj) {
        System.out.println(obj.toString());
      if(!obj.getEmail().equals("") && !obj.getPassword().equals("")){
          List<loginDto> object=new ArrayList<>();
          object.add(obj);
        // Simulate a successful response with HTTP 200 OK
        // In a real-world scenario, you might perform authentication and return appropriate status codes.
        return ResponseEntity.ok(obj);}
      else{
          return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Password Is Worng");
      }

    }

    @PostMapping("/register")
    public ResponseEntity<?> registerData(@RequestBody registerDto obj) {
        System.out.println(obj.toString());
        if(obj.getPassword().equals(obj.getConfirmPassword())){
            return ResponseEntity.ok(obj);}
        else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Password doesn't match");
        }
    }


}
