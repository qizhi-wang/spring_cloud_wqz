package eurekaribbon.eurekaribbontest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/hi")
    private String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
