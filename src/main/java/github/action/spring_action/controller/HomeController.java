package github.action.spring_action.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home/")
public class HomeController{

    @GetMapping("test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("This is a test message");
    }

}
