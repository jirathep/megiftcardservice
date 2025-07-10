package com.service;

import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.servlet.http.HttpServletRequest;



@RestController
@RequestMapping("/transaction-history")
public class TransactionHistoryService {

 private static final Logger logger = LoggerFactory.getLogger(TransactionHistoryService.class);

    @PostMapping
    public Map<String, Object> getTransactionHistory(@RequestBody Map<String, Object> requestDetails, HttpServletRequest request) {
        // In a real application, you would process the requestDetails here
        String clientIpAddress = request.getRemoteAddr();
        // To access the parameters, you can use:

        String accountId = (String) requestDetails.get("account-id");
        Integer days = (Integer) requestDetails.get("days");

        // and retrieve the actual transaction history data.
        // For this example, we'll return a predefined response.

        Map<String, Object> response = new HashMap<>();
        response.put("response-code", "0");
        response.put("response-message", "Operation Success");
        response.put("response-status", "SUCCESS");
        response.put("datetime", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        List<Map<String, Object>> transactions = new ArrayList<>();

        // Add sample transaction data
        Map<String, Object> transaction1 = new HashMap<>();
        transaction1.put("id", "1");
        transaction1.put("logo", "https://placehold.co/40x40.png");
        transaction1.put("dataAiHint", "gourmet market");
        transaction1.put("description", "Gourmet Market");
        transaction1.put("date", "12:59");
        transaction1.put("amount", -1000);
        transaction1.put("type", "Payment");
        transactions.add(transaction1);

        Map<String, Object> transaction2 = new HashMap<>();
        transaction2.put("id", "2");
        transaction2.put("logo", "https://placehold.co/40x40.png");
        transaction2.put("dataAiHint", "power mall");
        transaction2.put("description", "Power Mall");
        transaction2.put("date", "11:59");
        transaction2.put("amount", -12990);
        transaction2.put("type", "Payment");
        transactions.add(transaction2);

        Map<String, Object> transaction3 = new HashMap<>();
        transaction3.put("id", "3");
        transaction3.put("logo", "");
        transaction3.put("dataAiHint", "");
        transaction3.put("description", "Top-up");
        transaction3.put("date", "10:59");
        transaction3.put("amount", 35000);
        transaction3.put("type", "via Counter Service");
        transactions.add(transaction3);
        
        Map<String, Object> transaction4 = new HashMap<>();
        transaction4.put("id", "4");
        transaction4.put("logo", "");
        transaction4.put("dataAiHint", "");
        transaction4.put("description", "Top-up");
        transaction4.put("date", "10:59");
        transaction4.put("amount", 35000);
        transaction4.put("type", "via Counter Service");
        transactions.add(transaction4);

        Map<String, Object> transaction5 = new HashMap<>();
        transaction5.put("id", "5");
        transaction5.put("logo", "");
        transaction5.put("dataAiHint", "");
        transaction5.put("description", "Top-up");
        transaction5.put("date", "10:59");
        transaction5.put("amount", 35000);
        transaction5.put("type", "via Counter Service");
        transactions.add(transaction5);

        Map<String, Object> transaction6 = new HashMap<>();
        transaction6.put("id", "6");
        transaction6.put("logo", "");
        transaction6.put("dataAiHint", "");
        transaction6.put("description", "Top-up");
        transaction6.put("date", "10:59");
        transaction6.put("amount", 35000);
        transaction6.put("type", "via Counter Service");
        transactions.add(transaction6);

        Map<String, Object> transaction7 = new HashMap<>();
        transaction7.put("id", "7");
        transaction7.put("logo", "");
        transaction7.put("dataAiHint", "");
        transaction7.put("description", "Top-up");
        transaction7.put("date", "10:59");
        transaction7.put("amount", 35000);
        transaction7.put("type", "via Counter Service");
        transactions.add(transaction7);

        Map<String, Object> transaction8 = new HashMap<>();
        transaction8.put("id", "8");
        transaction8.put("logo", "");
        transaction8.put("dataAiHint", "");
        transaction8.put("description", "Top-up");
        transaction8.put("date", "10:59");
        transaction8.put("amount", 35000);
        transaction8.put("type", "via Counter Service");
        transactions.add(transaction8);

        Map<String, Object> transaction9 = new HashMap<>();
        transaction9.put("id", "9");
        transaction9.put("logo", "");
        transaction9.put("dataAiHint", "");
        transaction9.put("description", "Top-up");
        transaction9.put("date", "10:59");
        transaction9.put("amount", 35000);
        transaction9.put("type", "via Counter Service");
        transactions.add(transaction9);

        Map<String, Object> transaction10 = new HashMap<>();
        transaction10.put("id", "10");
        transaction10.put("logo", "");
        transaction10.put("dataAiHint", "");
        transaction10.put("description", "Top-up");
        transaction10.put("date", "10:59");
        transaction10.put("amount", 35000);
        transaction10.put("type", "via Counter Service");
        transactions.add(transaction10);

        Map<String, Object> transaction11 = new HashMap<>();
        transaction11.put("id", "11");
        transaction11.put("logo", "");
        transaction11.put("dataAiHint", "");
        transaction11.put("description", "Top-up");
        transaction11.put("date", "10:59");
        transaction11.put("amount", 35000);
        transaction11.put("type", "via Counter Service");
        transactions.add(transaction11);

        Map<String, Object> transaction12 = new HashMap<>();
        transaction12.put("id", "12");
        transaction12.put("logo", "");
        transaction12.put("dataAiHint", "");
        transaction12.put("description", "Top-up");
        transaction12.put("date", "10:59");
        transaction12.put("amount", 35000);
        transaction12.put("type", "via Counter Service");
        transactions.add(transaction12);

        Map<String, Object> transaction13 = new HashMap<>();
        transaction13.put("id", "13");
        transaction13.put("logo", "");
        transaction13.put("dataAiHint", "");
        transaction13.put("description", "Top-up");
        transaction13.put("date", "10:59");
        transaction13.put("amount", 35000);
        transaction13.put("type", "via Counter Service");
        transactions.add(transaction13);

        Map<String, Object> transaction14 = new HashMap<>();
        transaction14.put("id", "14");
        transaction14.put("logo", "");
        transaction14.put("dataAiHint", "");
        transaction14.put("description", "Top-up");
        transaction14.put("date", "10:59");
        transaction14.put("amount", 35000);
        transaction14.put("type", "via Counter Service");
        transactions.add(transaction14);

        Map<String, Object> transaction15 = new HashMap<>();
        transaction15.put("id", "15");
        transaction15.put("logo", "");
        transaction15.put("dataAiHint", "");
        transaction15.put("description", "Top-up");
        transaction15.put("date", "10:59");
        transaction15.put("amount", 35000);
        transaction15.put("type", "via Counter Service");
        transactions.add(transaction15);


        response.put("transactions", transactions);

        // Log request data, response data, and IP address
        logger.info("Client IP: {}", clientIpAddress);
        logger.info("Request Data: {}", requestDetails);
        logger.info("Response Data: {}", response);
        return response;
    }
}