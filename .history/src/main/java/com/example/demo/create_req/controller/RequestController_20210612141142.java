package com.example.demo.create_req.controller;

import com.example.demo.create_req.model.Request;
import com.example.demo.create_req.model.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// @Controller
// @RequestMapping(path = "/request")
// public class RequestController {
//     @Autowired
//     private RequestRepository requestRepository;

//     @PostMapping(path = "/add")
//     public @ResponseBody String addNewRequest(@RequestParam String req_name, @RequestParam String scope,
//             @RequestParam String type, @RequestParam String price, @RequestParam String location,
//             @RequestParam String description) {
//         Request r = new Request();
//         r.setReq_name(req_name);
//         r.setScope(scope);
//         r.setType(type);
//         r.setPrice(price);
//         r.setLocation(location);
//         r.setDescription(description);
//         r.setStats("OPEN");
//         r.setId(requestRepository.count() + 1);
//         requestRepository.save(r);
//         return "SAVED";
//     }

//     @GetMapping(path = "/getAll")
//     public @ResponseBody Iterable<Request> getAllRequests() {
//         return requestRepository.findAll();
//     }

// }

@Controller
@RequestMapping(path = "/request")
public class RequestController {
    @Autowired
    private RequestRepository requestRepository;

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("request", new Request());
        return "greeting";
    }

    @PostMapping(path = "/greeting")
    public @ResponseBody String addNewRequest(@RequestParam String req_name, @RequestParam String scope,
            @RequestParam String type, @RequestParam String price, @RequestParam String location,
            @RequestParam String description) {
        Request r = new Request();
        r.setReq_name(req_name);
        r.setScope(scope);
        r.setType(type);
        r.setPrice(price);
        r.setLocation(location);
        r.setDescription(description);
        r.setStats("OPEN");
        r.setId(requestRepository.count() + 1);
        requestRepository.save(r);
        return "result";
    }


 

    @GetMapping(path = "/all")
    public String getMessage(Model model){
        Iterable <Request> requests = requestRepository.findAll();

    model.addAttribute("requests", requests);
    return "all";

    }

}