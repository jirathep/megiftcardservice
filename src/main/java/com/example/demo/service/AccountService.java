package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.HttpEntity;

import jakarta.servlet.http.HttpServletRequest;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountService {

 private static final Logger logger = LoggerFactory.getLogger(AccountService.class);
 private final RestTemplate restTemplate;

 public AccountService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @PostMapping

 public Map<String, Object> createAccount(@RequestBody Map<String, Object> accountDetails, HttpServletRequest request) {
 String clientIp = request.getRemoteAddr();
 Map<String, Object> response = new LinkedHashMap<>();
 logger.info("Request from IP: {}", clientIp);
 logger.info("Request body for AccountService: {}", accountDetails);

 String authenApiUrl = "http://43.208.9.31:8080/authen";

        // Create the request body for the external API
        Map<String, Object> authenRequestBody = new LinkedHashMap<>();
        authenRequestBody.put("clientIp", clientIp);
        // Add other data from accountDetails if needed for the authen API
        if (accountDetails.containsKey("username")) {
            authenRequestBody.put("username", accountDetails.get("username"));
        }
         if (accountDetails.containsKey("password")) {
            authenRequestBody.put("password", accountDetails.get("password"));
        }


        
        response.put("response-code", "0");
        response.put("response-message", "Operation Success");
        response.put("response-status", "SUCCESS");
        response.put("account-id", "12345 12345 12346");
        response.put("datetime", java.time.LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        response.put("balance", 17879.5);

 logger.info("Response for AccountService: {}", response);

        return response;
    }
}