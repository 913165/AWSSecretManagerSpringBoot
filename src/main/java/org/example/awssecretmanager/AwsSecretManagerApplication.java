package org.example.awssecretmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwsSecretManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsSecretManagerApplication.class, args);
    }


}
