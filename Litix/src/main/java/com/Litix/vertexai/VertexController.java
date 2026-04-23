package com.Litix.vertexai;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VertexController {
    private final VertexService vertexService;

    public VertexController(VertexService vertexService) {
        this.vertexService = vertexService;
    }

    @PostMapping("/ai/generate")
    public String generate(@RequestParam List<String> chatRequest) {
        String userMessage = String.join("\n", chatRequest);
        return vertexService.getAiResponse(userMessage);
    }

}
