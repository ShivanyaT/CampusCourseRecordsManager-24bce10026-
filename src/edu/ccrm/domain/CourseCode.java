package edu.ccrm.domain;

public final class CourseCode {
    private final String value;
    public CourseCode(String value) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException("Invalid course code");
        this.value = value;
    }
    public String getValue() { return value; }
}

