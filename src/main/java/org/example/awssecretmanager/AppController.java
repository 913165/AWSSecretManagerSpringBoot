package org.example.awssecretmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${keyaws}")
    private String mysql001val;

    @GetMapping("/keyaws")
    public String getMysql001() {
        return mysql001val;
    }

}
