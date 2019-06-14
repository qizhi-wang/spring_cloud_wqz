package eurekaclint.eurekaclinttest01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaServer
@RestController
@SpringBootApplication
public class EurekaClintTest01Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClintTest01Application.class, args);
	}

	@Value("${server.port}")
    String port;

	@RequestMapping("/hi")
    public String SayHi(@RequestParam String name){
        return "hi,"+name+",i am from port:"+port;
    }


}
