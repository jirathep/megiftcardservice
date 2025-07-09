package com.service;

import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountService {

    @PostMapping
    public Map<String, Object> createAccount(@RequestBody Map<String, Object> accountDetails) {
        Map<String, Object> response = new HashMap<>();
        response.put("response-code", "0");
        response.put("response-message", "Operation Success");
        response.put("response-status", "SUCCESS");
        response.put("account-id", "12345 12345 12346");
        response.put("datetime", LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        response.put("balance", 17639.5);

        return response;
    }
}