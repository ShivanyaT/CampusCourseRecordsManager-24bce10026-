package edu.ccrm.domain;

import java.time.LocalDate;

public abstract class Person {
    private String id;
    private String fullName;
    private String email;
    private LocalDate createdAt;

    public Person(String id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.createdAt = LocalDate.now();
    }

    public abstract void printProfile();

    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getId() { return id; }

    @Override
    public String toString() {
        return fullName + " (" + email + ")";
    }
}
