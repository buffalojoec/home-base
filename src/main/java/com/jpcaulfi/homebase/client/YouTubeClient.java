package com.jpcaulfi.homebase.client;

import com.jpcaulfi.homebase.config.HomeBaseProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class YouTubeClient {

    private final String BASE_URL = "https://www.googleapis.com/youtube/v3";

    private final RestTemplate restTemplate;
    private final String youtubeApiKey;

    public YouTubeClient(HomeBaseProperties homeBaseProperties, RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.youtubeApiKey = homeBaseProperties.youTubeApiKey;
        System.out.println(youtubeApiKey);
    }

    private String appendKey(String urlEndpoint) {
        return urlEndpoint + "?key=" + this.youtubeApiKey;
    }

    public void testYouTubeApi() {
        ResponseEntity<String> response = restTemplate.getForEntity(appendKey(BASE_URL + "/search"), String.class);
        System.out.println("Request throttled. Status Code: " + response.getStatusCode());
        System.out.println("Body:");
        System.out.println(response.getBody());
    }
}
