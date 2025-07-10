package com.service;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import jakarta.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

@RestController
@RequestMapping("/gift-card-data")
public class GiftCardDataService {

    private static final Logger logger = LoggerFactory.getLogger(GiftCardDataService.class);

    @PostMapping
    public Map<String, Object> getGiftCardData(@RequestBody Map<String, Object> requestDetails, HttpServletRequest request) {
        // Extracting the "account-id" from the request body
        String accountId = (String) requestDetails.get("account-id");
        // You can now use the accountId variable for further processing

        // In a real application, you would process the requestDetails here
        // and retrieve the actual gift card data.
        // For this example, we'll return a predefined response.

        Map<String, Object> response = new HashMap<>();
        response.put("response-code", "0");
        response.put("response-message", "Operation Success");
        response.put("response-status", "SUCCESS");
        response.put("datetime", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        List<Map<String, Object>> cards = new ArrayList<>();

        // Add sample gift card data
        Map<String, Object> card1 = new HashMap<>();
        card1.put("id", "1");
        card1.put("value", 1000);
        card1.put("valueText", "ONE THOUSAND BAHT");
        card1.put("thaiText", "\u0e21\u0e39\u0e25\u0e04\u0e48\u0e32\u0e2b\u0e19\u0e36\u0e48\u0e07\u0e1e\u0e31\u0e19\u0e1a\u0e32\u0e17");
        card1.put("imageUrl", "https://pos.promptnow.com:13443/pos_pn/elephant/mcard/img/1000.png");
        card1.put("dataAiHint", "flower bouquet");
        card1.put("isPrimary", true);
        card1.put("cardNumber", "319000000");
        card1.put("importDate", "27 \u0e1e\u0e24\u0e29\u0e20\u0e32\u0e04\u0e21 2025");
        card1.put("expiryDate", "27 \u0e1e\u0e24\u0e29\u0e20\u0e32\u0e04\u0e21 2026");
        cards.add(card1);

        Map<String, Object> card2 = new HashMap<>();
        card2.put("id", "2");
        card2.put("value", 300);
        card2.put("valueText", "THREE HUNDRED BAHT");
        card2.put("thaiText", "\u0e21\u0e39\u0e25\u0e04\u0e48\u0e32\u0e2a\u0e32\u0e21\u0e23\u0e49\u0e2d\u0e22\u0e1a\u0e32\u0e17");
        card2.put("imageUrl", "https://pos.promptnow.com:13443/pos_pn/elephant/mcard/img/300.png");
        card2.put("dataAiHint", "pink lotus");
        card2.put("isPrimary", false);
        card2.put("cardNumber", "319000001");
        card2.put("importDate", "28 \u0e1e\u0e24\u0e29\u0e20\u0e32\u0e04\u0e21 2025");
        card2.put("expiryDate", "28 \u0e1e\u0e24\u0e29\u0e20\u0e32\u0e04\u0e21 2026");
        cards.add(card2);

        Map<String, Object> card3 = new HashMap<>();
        card3.put("id", "3");
        card3.put("value", 100);
        card3.put("valueText", "ONE HUNDRED BAHT");
        card3.put("thaiText", "\u0e21\u0e39\u0e25\u0e04\u0e48\u0e32\u0e2b\u0e19\u0e36\u0e48\u0e07\u0e23\u0e49\u0e2d\u0e22\u0e1a\u0e32\u0e17");
        card3.put("imageUrl", "https://pos.promptnow.com:13443/pos_pn/elephant/mcard/img/100.png");
        card3.put("dataAiHint", "purple bellflower");
        card3.put("isPrimary", false);
        card3.put("cardNumber", "319000002");
        card3.put("importDate", "29 \u0e1e\u0e24\u0e29\u0e20\u0e32\u0e04\u0e21 2025");
        card3.put("expiryDate", "29 \u0e1e\u0e24\u0e29\u0e20\u0e32\u0e04\u0e21 2026");
        cards.add(card3);

        Map<String, Object> card4 = new HashMap<>();
        card4.put("id", "4");
        card4.put("value", 50);
        card4.put("valueText", "FIFTY BAHT");
        card4.put("thaiText", "\u0e21\u0e39\u0e25\u0e04\u0e48\u0e32\u0e2b\u0e19\u0e36\u0e48\u0e07\u0e23\u0e49\u0e2d\u0e22\u0e1a\u0e32\u0e17");
        card4.put("imageUrl", "https://pos.promptnow.com:13443/pos_pn/elephant/mcard/img/50.png");
        card4.put("dataAiHint", "purple bellflower");
        card4.put("isPrimary", false);
        card4.put("cardNumber", "319000003");
        card4.put("importDate", "30 \u0e1e\u0e24\u0e29\u0e20\u0e32\u0e04\u0e21 2025");
        card4.put("expiryDate", "30 \u0e1e\u0e24\u0e29\u0e32\u0e04\u0e21 2026");
        cards.add(card4);


        response.put("cards", cards);

        // Log request and response
        String clientIp = request.getRemoteAddr();
        logger.info("Client IP: {}", clientIp);
        logger.info("Request Data: {}", requestDetails);
        logger.info("Response Data: {}", response);

        return response;
    }
}
