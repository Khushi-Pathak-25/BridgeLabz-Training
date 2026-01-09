package com.dayseven.skillforge;

public abstract class Course implements ICertifiable {

    private String title;
    private Instructor instructor;
    private double rating;          // encapsulated rating
    private String[] modules;
    private String[] reviews;       // read-only internal reviews

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[] { "Introduction", "Basics", "Final Project" };
        this.reviews = new String[] { "Great course!", "Very helpful" };
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new String[] { "Well structured", "Easy to understand" };
    }

    // Encapsulation: rating logic protected
    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            this.rating = (this.rating + newRating) / 2;
        }
    }

    public double getRating() {
        return rating;
    }

    // Read-only access to internal reviews
    public String[] getReviews() {
        return reviews.clone();
    }

    public int getTotalModules() {
        return modules.length;
    }

    public String getTitle() {
        return title;
    }
}
