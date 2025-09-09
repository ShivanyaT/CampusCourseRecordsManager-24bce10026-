package edu.ccrm.util;

import edu.ccrm.domain.Course;
import java.util.Comparator;

public class Comparators {
    public static Comparator<Course> byTitle = Comparator.comparing(Course::toString);
}

