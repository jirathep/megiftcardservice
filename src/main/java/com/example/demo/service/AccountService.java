package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;


@RestController
@RequestMapping("/account")
public class AccountService {

 private static final Logger logger = LoggerFactory.getLogger(AccountService.class);
    @PostMapping

 public Map<String, Object> createAccount(@RequestBody Map<String, Object> accountDetails, HttpServletRequest request) {
 String clientIp = request.getRemoteAddr();
 logger.info("Request from IP: {}", clientIp);
 logger.info("Request body for AccountService: {}", accountDetails);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("response-code", "0");
        response.put("response-message", "Operation Success");
        response.put("response-status", "SUCCESS");
        response.put("account-id", "12345 12345 12346");
        response.put("datetime", java.time.LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        response.put("balance", 17639.5);

 logger.info("Response for AccountService: {}", response);

        return response;
    }
}