package com.example.demo.create_req.controller;

import com.example.demo.create_req.model.User;
import com.example.demo.create_req.model.RegisterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/register")
public class RegisterController {
    @Autowired
    private RegisterRepository registerRepository;

    @PostMapping(path = "/success")
    public @ResponseBody String register(@RequestParam String name, @RequestParam String matric,
            @RequestParam String phone, @RequestParam String email, @RequestParam String gender,
            @RequestParam String address, @RequestParam String faculty, @RequestParam String password) {
        User user = new User();
        user.setName(name);;
        user.setMatric(matric);;
        user.setPhone(phone);
        user.setEmail(email);
        user.setGender(gender);
        user.setAddress(address);
        user.setFaculty(faculty);
        user.setId(registerRepository.count() + 1);
        registerRepository.save(user);
        return "register successful";
    }

    @GetMapping(path = "/getNewUser")
    public @ResponseBody Iterable<User> getAllRequests() {
        return registerRepository.findAll();
    }

}