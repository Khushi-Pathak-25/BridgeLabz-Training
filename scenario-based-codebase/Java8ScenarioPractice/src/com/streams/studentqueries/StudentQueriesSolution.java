package com.streams.studentqueries;

import java.util.*;
import java.util.stream.Collectors;

public class StudentQueriesSolution {
    // Student class
    static class Student {
        private int id;
        private String firstName;
        private int age;
        private String gender;
        private String city;
        private int rank;
        private String department;
        private List<String> contacts;

        public Student(int id, String firstName, int age, String gender,
                       String city, int rank, String department, List<String> contacts) {
            this.id = id;
            this.firstName = firstName;
            this.age = age;
            this.gender = gender;
            this.city = city;
            this.rank = rank;
            this.department = department;
            this.contacts = contacts != null ? contacts : new ArrayList<>();
        }

        // Getters
        public int getId() { return id; }
        public String getFirstName() { return firstName; }
        public int getAge() { return age; }
        public String getGender() { return gender; }
        public String getCity() { return city; }
        public int getRank() { return rank; }
        public String getDepartment() { return department; }
        public List<String> getContacts() { return contacts; }

        @Override
        public String toString() {
            return String.format("Student{id=%d, name='%s', age=%d, gender='%s', city='%s', rank=%d, dept='%s'}",
                    id, firstName, age, gender, city, rank, department);
        }
    }

    public static void main(String[] args) {
        // Sample Data
        List<Student> students = Arrays.asList(
                new Student(101, "Sachin", 22, "Male", "Mumbai", 12, "Computer", Arrays.asList("9876543210", "9123456789")),
                new Student(102, "Priya", 24, "Female", "Pune", 45, "Mechanical", Arrays.asList("9988776655")),
                new Student(103, "Rahul", 27, "Male", "Bangalore", 8, "Computer", Arrays.asList("7894561230")),
                new Student(104, "Neha", 21, "Female", "Mumbai", 132, "Electronics", Arrays.asList("9012345678", "8123456790")),
                new Student(105, "Vikram", 29, "Male", "Delhi", 3, "Mechanical", Arrays.asList("7778889990")),
                new Student(106, "Anjali", 23, "Female", "Pune", 67, "Computer", Arrays.asList("6665554443")),
                new Student(107, "Karan", 26, "Male", "Bangalore", 19, "Electronics", Arrays.asList("5554443332", "9871234567")),
                new Student(108, "Shreya", 20, "Female", "Hyderabad", 91, "Mechanical", Arrays.asList("9998887776")),
                new Student(109, "Amit", 25, "Male", "Mumbai", 54, "Computer", Arrays.asList("8887776665")),
                new Student(110, "Riya", 22, "Female", "Chennai", 28, "Electronics", Arrays.asList("7776665554"))
        );

        //  Basic Filtering & Mapping
        System.out.println("======= Basic Filtering & Mapping =======");
        System.out.println("1. Rank < 50:");
        students.stream()
                .filter(s -> s.getRank() < 50)
                .forEach(System.out::println);

        System.out.println("\n2. Age > 25:");
        students.stream()
                .filter(s -> s.getAge() > 25)
                .forEach(System.out::println);

        System.out.println("\n3. Only names:");
        students.stream()
                .map(Student::getFirstName)
                .forEach(System.out::println);

        System.out.println("\n4. Mechanical Engineering students:");
        students.stream()
                .filter(s -> "Mechanical".equals(s.getDepartment()))
                .forEach(System.out::println);

        System.out.println("\n5. Not from Mumbai:");
        students.stream()
                .filter(s -> !"Mumbai".equals(s.getCity()))
                .forEach(System.out::println);

        //  Sorting & Limiting
        System.out.println("\n======= Sorting & Limiting =======");
        System.out.println("1. Sorted by rank (ascending):");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .forEach(System.out::println);

        System.out.println("\n2. Sorted by age (descending):");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getAge).reversed())
                .forEach(System.out::println);

        System.out.println("\n3. Top 5 students by rank:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .limit(5)
                .forEach(System.out::println);

        System.out.println("\n4. Last 3 students by rank:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\n5. Sorted by name then rank:");
        students.stream()
                .sorted(Comparator.comparing(Student::getFirstName)
                        .thenComparingInt(Student::getRank))
                .forEach(System.out::println);

        //  Grouping & Aggregation
        System.out.println("\n======= Grouping & Aggregation =======");
        System.out.println("1. Count by department:");
        Map<String, Long> countByDept = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
        System.out.println(countByDept);

        System.out.println("\n2. Count by city:");
        Map<String, Long> countByCity = students.stream()
                .collect(Collectors.groupingBy(Student::getCity, Collectors.counting()));
        System.out.println(countByCity);

        System.out.println("\n3. Average age by department:");
        Map<String, Double> avgAgeByDept = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.averagingInt(Student::getAge)
                ));
        System.out.println(avgAgeByDept);

        System.out.println("\n4. Average rank by gender:");
        Map<String, Double> avgRankByGender = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.averagingInt(Student::getRank)
                ));
        System.out.println(avgRankByGender);
        System.out.println("\n5. Total students: " + students.size());

        System.out.println("\n6. Department with highest average rank:");
        students.stream()
            .collect(Collectors.groupingBy(
                    Student::getDepartment,
                    Collectors.averagingInt(Student::getRank)
            ))
            .entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .ifPresent(e -> System.out.println(e.getKey() + " => " + String.format("%.2f", e.getValue())));
        
        //  Min / Max / Ranking Problems
        System.out.println("\n======= Min / Max / Ranking =======");
        System.out.println("1. Best rank (lowest):");
        students.stream().min(Comparator.comparingInt(Student::getRank)).ifPresent(System.out::println);

        System.out.println("\n2. Worst rank (highest):");
        students.stream().max(Comparator.comparingInt(Student::getRank)).ifPresent(System.out::println);

        System.out.println("\n3. Second best rank:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("\n4. Third best rank:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRank))
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("\n5. Youngest student:");
        students.stream().min(Comparator.comparingInt(Student::getAge)).ifPresent(System.out::println);

        System.out.println("\n6. Oldest student:");
        students.stream().max(Comparator.comparingInt(Student::getAge)).ifPresent(System.out::println);

        //  FlatMap & Collections
        System.out.println("\n======= FlatMap & Contacts =======");
        System.out.println("1. All contact numbers:");
        students.stream()
                .flatMap(s -> s.getContacts().stream())
                .forEach(System.out::println);

        System.out.println("\n2. Total contact numbers: " +
                students.stream().flatMap(s -> s.getContacts().stream()).count());

        System.out.println("\n3. Students with > 1 contact:");
        students.stream()
                .filter(s -> s.getContacts().size() > 1)
                .forEach(System.out::println);

        System.out.println("\n4. Unique contact numbers:");
        students.stream()
                .flatMap(s -> s.getContacts().stream())
                .distinct()
                .forEach(System.out::println);

        //  Conditional & Matching
        System.out.println("\n======= Conditional & Matching =======");
        System.out.println("1. Any Biotech student? " +
                students.stream().anyMatch(s -> "Biotech".equals(s.getDepartment())));

        System.out.println("2. All students > 20 years? " +
                students.stream().allMatch(s -> s.getAge() > 20));

        System.out.println("3. No Civil Engineering student? " +
                students.stream().noneMatch(s -> "Civil".equals(s.getDepartment())));

        //  Gender-Based Analysis
        System.out.println("\n======= Gender-Based Analysis =======");
        Map<String, Long> genderCount = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println("1. Gender count: " + genderCount);

        System.out.println("2. Avg age - Male: " +
                students.stream().filter(s -> "Male".equals(s.getGender()))
                        .mapToInt(Student::getAge).average().orElse(0));

        System.out.println("3. Avg age - Female: " +
                students.stream().filter(s -> "Female".equals(s.getGender()))
                        .mapToInt(Student::getAge).average().orElse(0));

        System.out.println("4. Highest ranked Male:");
        students.stream()
                .filter(s -> "Male".equals(s.getGender()))
                .min(Comparator.comparingInt(Student::getRank))
                .ifPresent(System.out::println);

        System.out.println("5. Highest ranked Female:");
        students.stream()
                .filter(s -> "Female".equals(s.getGender()))
                .min(Comparator.comparingInt(Student::getRank))
                .ifPresent(System.out::println);

        //  Department-Specific Queries
        System.out.println("\n======= Department-Specific =======");
        System.out.println("1. Names by department:");
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.mapping(Student::getFirstName, Collectors.toList())
                ))
                .forEach((dept, names) -> System.out.println(dept + " → " + names));

        System.out.println("\n2. Youngest in Computer Engineering:");
        students.stream()
                .filter(s -> "Computer".equals(s.getDepartment()))
                .min(Comparator.comparingInt(Student::getAge))
                .ifPresent(System.out::println);

        System.out.println("\n3. Top ranked in Mechanical:");
        students.stream()
                .filter(s -> "Mechanical".equals(s.getDepartment()))
                .min(Comparator.comparingInt(Student::getRank))
                .ifPresent(System.out::println);

        System.out.println("\n4. Electronics students from Karnataka:");
        long count = students.stream()
                .filter(s -> "Electronics".equals(s.getDepartment()))
                .filter(s -> "Karnataka".equals(s.getCity()) || "Bangalore".equals(s.getCity()))
                .count();
        System.out.println("Count: " + count);

        //  Advanced Level
        System.out.println("\n======= Advanced Level =======");
        System.out.println("1. Map<ID, Name>:");
        Map<Integer, String> idToName = students.stream()
                .collect(Collectors.toMap(Student::getId, Student::getFirstName));
        System.out.println(idToName);

        System.out.println("\n2. Map<Department, List<Student>>:");
        Map<String, List<Student>> byDept = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));

        System.out.println("Departments: " + byDept.keySet());

        System.out.println("\n3. Names starting with 'S':");
        students.stream()
                .filter(s -> s.getFirstName().startsWith("S"))
                .map(Student::getFirstName)
                .forEach(System.out::println);

        System.out.println("\n4. Name length > 5:");
        students.stream()
                .filter(s -> s.getFirstName().length() > 5)
                .map(Student::getFirstName)
                .forEach(System.out::println);

        System.out.println("\n5. Even rank:");
        students.stream()
                .filter(s -> s.getRank() % 2 == 0)
                .map(Student::getFirstName)
                .forEach(System.out::println);

        System.out.println("\n6. Odd rank:");
        students.stream()
                .filter(s -> s.getRank() % 2 == 1)
                .map(Student::getFirstName)
                .forEach(System.out::println);

        //  Bonus Challenges
        System.out.println("\n======= Bonus Challenges =======");
        System.out.println("1. Top 3 youngest:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\n2. Top 3 oldest:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getAge).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\n3. Partition by age > 25:");
        Map<Boolean, List<Student>> agePartition = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getAge() > 25));
        System.out.println("Age > 25: " + agePartition.get(true).size());
        System.out.println("Age ≤ 25: " + agePartition.get(false).size());

        System.out.println("\n4. Partition by rank < 100:");
        Map<Boolean, List<Student>> rankPartition = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getRank() < 100));
        System.out.println("Rank < 100: " + rankPartition.get(true).size());
        System.out.println("Rank ≥ 100: " + rankPartition.get(false).size());

        System.out.println("\n5. City with maximum students:");
        countByCity.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println(e.getKey() + " - " + e.getValue()));

        System.out.println("\n6. Department with minimum students:");
        countByDept.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}