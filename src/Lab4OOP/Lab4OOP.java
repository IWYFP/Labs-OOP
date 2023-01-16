package Lab4OOP;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Task: C11 = 1 (school)
 * name - the name of school; type - the type of school; location - the location of school
 * students - the number of students that are studying at school; staff - the number of staff that are working at school
 */

public class Lab4OOP {
    private static class School {
        private final String name;
        private final String type;
        private final String location;
        private final int students;
        private final int staff;
        School(String name, String type, String location, int students, int staff) {
            this.name = name;
            this.type = type;
            this.location = location;
            this.students = students;
            this.staff = staff;
        }
        public String getName() { return name; }
        public int getStudents() { return students; }
        public String toString() { return name + " is a " + type + " that is located in " + location + ", and has " + students + " students and " + staff + " staff."; }
    }
    public static void main(String[] args) {
        School[] schools = {new School("University of Oxford", "public research university", "Oxford, England", 24515, 7000),
                new School("Tsinghua University", "public university", "Beijing, China", 50390, 7666),
                new School("Dartmouth College", "private research university", "New Hampshire, US", 6608, 4128),
                new School("National Technical University of Ukraine \"Igor Sikorsky Kyiv Polytechnic Institute\"", "national university", "Kyiv, Ukraine", 36000, 2500),
                new School("Roxborough High School", "public high school", "Philadelphia, Pennsylvania", 800, 51)};
        System.out.println("\nSchools:");
        for (School school: schools) System.out.println(school);
        System.out.println("\nSchools, sorted by name:");
        Arrays.sort(schools, Comparator.comparing(School::getName));
        for (School school: schools) System.out.println(school);
        System.out.println("\nSchools, reverse sorted by number of students:");
        Arrays.sort(schools, Comparator.comparing(School::getStudents).reversed());
        for (School school: schools) System.out.println(school);
    }
}
