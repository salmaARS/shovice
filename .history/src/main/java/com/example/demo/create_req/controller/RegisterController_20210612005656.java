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
    private RegisterRepository RegisterRepository;

    @PostMapping(path = "/success")
    public @ResponseBody String register(@RequestParam String name, @RequestParam String matric,
            @RequestParam String phone, @RequestParam String email, @RequestParam String gender,
            @RequestParam String address, @RequestParam String faculty, @RequestParam String password) {
        User user = new User();
        r.setName(S);
        r.setScope(scope);
        r.setType(type);
        r.setPrice(price);
        r.setLocation(location);
        r.setDescription(description);
        r.setStats("OPEN");
        r.setId(requestRepository.count() + 1);
        requestRepository.save(r);
        return "SAVED";
    }

    @GetMapping(path = "/getAll")
    public @ResponseBody Iterable<Request> getAllRequests() {
        return requestRepository.findAll();
    }

}