package com.cavcav.ai.services;


import com.cavcav.exception.ProductException;
import com.cavcav.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt, Long productId, Long userId) throws ProductException;
}
