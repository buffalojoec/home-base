package com.jpcaulfi.homebase.service;

import com.jpcaulfi.homebase.model.HomeBaseCategory;
import org.springframework.boot.CommandLineRunner;

public class HomeBaseService implements CommandLineRunner {

    private HomeBaseCategory CATEGORY = HomeBaseCategory.POLITICS;

    // Here's where we'll launch media from the default category.
    // This will run on application load.
    @Override
    public void run(String... args) throws Exception {

    }

    // Here's where we can switch the current category and re-shuffle
    public void switchCategory(String newCategoryString) {
        switch (newCategoryString.toLowerCase()) {
            case "books": this.CATEGORY = HomeBaseCategory.BOOKS;
            case "career": this.CATEGORY = HomeBaseCategory.CAREER;
            case "crypto": this.CATEGORY = HomeBaseCategory.CRYPTO;
            case "finance": this.CATEGORY = HomeBaseCategory.FINANCE;
            case "fitness": this.CATEGORY = HomeBaseCategory.FITNESS;
            case "health": this.CATEGORY = HomeBaseCategory.HEALTH;
            case "movies": this.CATEGORY = HomeBaseCategory.MOVIES;
            case "politics": this.CATEGORY = HomeBaseCategory.POLITICS;
            case "socialSkills": this.CATEGORY = HomeBaseCategory.SOCIAL_SKILLS;
            case "software": this.CATEGORY = HomeBaseCategory.SOFTWARE;
        };
    }
}
