package pl.mg.heroku.herokustart.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sample")
public class SampleController {

    @GetMapping(path = "/get")
    public String sampleResponder() {
        return "OK";
    }

}
