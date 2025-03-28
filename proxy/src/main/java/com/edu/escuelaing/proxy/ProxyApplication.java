package com.edu.escuelaing.proxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class ProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyApplication.class, args);
    }
}

@RestController
class ProxyController {

    @Value("${service.instances}")
    private List<String> serviceInstances;

    private AtomicInteger counter = new AtomicInteger(0);

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/linealSearch")
    public int calcularLineal(@RequestParam int value, @RequestParam List<Integer> lista) {
        String serviceUrl = getNextServiceInstance() + "/linealSearch?value=" + value + "&lista=" + lista;
        return restTemplate.getForObject(serviceUrl, Integer.class);
    }

    @GetMapping("/binarySearch")
    public int calcularBinario(@RequestParam int value, @RequestParam List<Integer> lista) {
        String serviceUrl = getNextServiceInstance() + "/binarySearch?value=" + value + "&lista=" + lista;
        return restTemplate.getForObject(serviceUrl, Integer.class);
    }

    private String getNextServiceInstance() {
        int index = counter.getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
