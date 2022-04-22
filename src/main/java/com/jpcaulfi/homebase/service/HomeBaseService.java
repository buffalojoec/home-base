package com.jpcaulfi.homebase.service;

import com.jpcaulfi.homebase.client.YouTubeClient;
import com.jpcaulfi.homebase.model.HomeBaseCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class HomeBaseService implements CommandLineRunner {

    @Autowired
    private YouTubeClient youTubeClient;

    private HomeBaseCategory CATEGORY = HomeBaseCategory.POLITICS;

    /*
    This will run on application load.
     */
    @Override
    public void run(String... args) throws InterruptedException {
        renderContent();
    }

    /*
    Here's where we'll launch media from the default category.
     */
    public void renderContent() throws InterruptedException {
//        youTubeClient.testYouTubeApi();
        System.out.println("Displaying media for category: " +
                homeBaseCategoryEnumToString());
        TimeUnit.SECONDS.sleep(5);
    }

    /*
    Here's where we can switch the current category and re-shuffle
     */
    public void switchCategory(String newCategoryString) throws InterruptedException {
        switch (newCategoryString.toLowerCase()) {
            case "books":
                CATEGORY = HomeBaseCategory.BOOKS;
                break;
            case "career":
                CATEGORY = HomeBaseCategory.CAREER;
                break;
            case "crypto":
                CATEGORY = HomeBaseCategory.CRYPTO;
                break;
            case "finance":
                CATEGORY = HomeBaseCategory.FINANCE;
                break;
            case "fitness":
                CATEGORY = HomeBaseCategory.FITNESS;
                break;
            case "health":
                CATEGORY = HomeBaseCategory.HEALTH;
                break;
            case "movies":
                CATEGORY = HomeBaseCategory.MOVIES;
                break;
            case "politics":
                CATEGORY = HomeBaseCategory.POLITICS;
                break;
            case "socialSkills":
                CATEGORY = HomeBaseCategory.SOCIAL_SKILLS;
                break;
            case "software":
                CATEGORY = HomeBaseCategory.SOFTWARE;
                break;
        }
        renderContent();
    }

    public String homeBaseCategoryEnumToString() {
        switch (CATEGORY) {
            case BOOKS: return "books";
            case CAREER: return "career";
            case CRYPTO: return "crypto";
            case FINANCE: return "finance";
            case FITNESS: return "fitness";
            case HEALTH: return "health";
            case MOVIES: return "movies";
            case POLITICS: return "politics";
            case SOCIAL_SKILLS: return "social skills";
            case SOFTWARE: return "software";
            default: return "no category found!";
        }
    }
}
