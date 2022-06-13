package ua.mike.inventory.failover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsInventoryFailoverServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsInventoryFailoverServiceApplication.class, args);
    }

}
