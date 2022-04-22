package com.jpcaulfi.homebase.config;

import org.springframework.beans.factory.annotation.Value;

public class HomeBaseProperties {

    @Value("${YOUTUBE_API_KEY}")
    public String youTubeApiKey;

}
