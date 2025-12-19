//Student Report Card Management System in Java:  Build a Java console application that allows teachers or administrators to manage student report cards. The system supports adding student records, entering subject-wise scores, calculating averages and grades, and displaying report cards. It includes search functionality by name or ID, data persistence using file I/O, and robust error handling. 

import java.util.*;
import java.io.*;

class Student {
    private String id;
    private String name;
    private int age;
    private Map<String, Integer> subjects;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subjects = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Map<String, Integer> getSubjects() {
        return new HashMap<>(subjects); // Return a copy to prevent external modification
    }

    public void addSubject(String subject, int marks) {
        subjects.put(subject, marks);
    }

    public double getAverage() {
        if (subjects.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int mark : subjects.values()) {
            sum += mark;
        }
        return (double) sum / subjects.size();
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }

    public String toDetailedString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Age: ").append(age).append("\n");
        sb.append("Subjects and Marks:\n");
        for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
            sb.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        sb.append("Average: ").append(String.format("%.2f", getAverage())).append("\n");
        sb.append("Grade: ").append(getGrade()).append("\n");
        return sb.toString();
    }
}

public class Main {
    private static final String DATA_FILE = "students.txt";
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadData();
        
        while (true) {
            try {
                displayMenu();
                
                // Read menu choice
                String input = scanner.nextLine().trim();
                
                if (input.isEmpty()) {
                    System.out.println("Please enter a choice (1-7).");
                    continue;
                }
                
                int choice;
                try {
                    choice = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 7.");
                    continue;
                }
                
                if (choice < 1 || choice > 7) {
                    System.out.println("Please enter a number between 1 and 7.");
                    continue;
                }
                
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        addMarks();
                        break;
                    case 3:
                        viewAllStudents();
                        break;
                    case 4:
                        viewReportCard();
                        break;
                    case 5:
                        searchStudent();
                        break;
                    case 6:
                        saveData();
                        break;
                    case 7:
                        System.out.println("Saving data and exiting...");
                        saveData();
                        System.out.println("Goodbye!");
                        scanner.close();
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error occurred: " + e.getMessage());
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("  STUDENT REPORT CARD MANAGEMENT SYSTEM");
        System.out.println("========================================");
        System.out.println("1. Add New Student");
        System.out.println("2. Enter Marks for Student");
        System.out.println("3. View All Students");
        System.out.println("4. View Report Card");
        System.out.println("5. Search Student");
        System.out.println("6. Save Data");
        System.out.println("7. Exit");
        System.out.println("========================================");
        System.out.print("Enter your choice (1-7): ");
    }

    private static void addStudent() {
        System.out.println("\n--- ADD NEW STUDENT ---");
        
        String id;
        while (true) {
            System.out.print("Enter Student ID: ");
            id = scanner.nextLine().trim();
            
            if (id.isEmpty()) {
                System.out.println("ID cannot be empty. Try again.");
                continue;
            }
            
            if (findStudentById(id) != null) {
                System.out.println("Student with this ID already exists. Try again.");
                continue;
            }
            break;
        }
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine().trim();
        while (name.isEmpty()) {
            System.out.println("Name cannot be empty. Try again.");
            System.out.print("Enter Student Name: ");
            name = scanner.nextLine().trim();
        }
        
        System.out.print("Enter Student Age: ");
        int age = readInt(5, 25); // Assuming age range for students
        
        Student student = new Student(id, name, age);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    private static void addMarks() {
        System.out.println("\n--- ENTER MARKS ---");
        
        if (students.isEmpty()) {
            System.out.println("No students available. Please add students first.");
            return;
        }
        
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine().trim();
        
        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        
        System.out.println("Adding marks for: " + student.getName());
        
        while (true) {
            System.out.print("Enter Subject Name (or 'done' to finish): ");
            String subject = scanner.nextLine().trim();
            
            if (subject.equalsIgnoreCase("done")) {
                break;
            }
            
            if (subject.isEmpty()) {
                System.out.println("Subject name cannot be empty.");
                continue;
            }
            
            System.out.print("Enter Marks (0-100): ");
            int marks = readInt(0, 100);
            
            student.addSubject(subject, marks);
            System.out.println("Marks added for " + subject + ": " + marks);
        }
        
        System.out.println("All marks entered successfully!");
    }

    private static void viewAllStudents() {
        System.out.println("\n--- ALL STUDENTS ---");
        
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        
        System.out.println("Total Students: " + students.size());
        System.out.println("--------------------------------");
        for (Student student : students) {
            System.out.println(student);
            if (!student.getSubjects().isEmpty()) {
                System.out.println("  Subjects: " + student.getSubjects().size() + 
                                 ", Average: " + String.format("%.2f", student.getAverage()) +
                                 ", Grade: " + student.getGrade());
            }
            System.out.println("--------------------------------");
        }
    }

    private static void viewReportCard() {
        System.out.println("\n--- VIEW REPORT CARD ---");
        
        System.out.print("Enter Student ID or Name: ");
        String searchTerm = scanner.nextLine().trim();
        
        Student student = findStudentById(searchTerm);
        if (student == null) {
            student = findStudentByName(searchTerm);
        }
        
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        
        if (student.getSubjects().isEmpty()) {
            System.out.println("No marks entered for this student yet.");
            return;
        }
        
        System.out.println(student.toDetailedString());
    }

    private static void searchStudent() {
        System.out.println("\n--- SEARCH STUDENT ---");
        
        System.out.println("Search by:");
        System.out.println("1. ID");
        System.out.println("2. Name");
        System.out.print("Enter choice (1-2): ");
        
        int choice = readInt(1, 2);
        
        System.out.print("Enter search term: ");
        String searchTerm = scanner.nextLine().trim();
        
        List<Student> results = new ArrayList<>();
        
        if (choice == 1) {
            Student student = findStudentById(searchTerm);
            if (student != null) {
                results.add(student);
            }
        } else {
            results = findStudentsByName(searchTerm);
        }
        
        if (results.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\nFound " + results.size() + " student(s):");
            System.out.println("--------------------------------");
            for (Student student : results) {
                System.out.println(student);
                if (!student.getSubjects().isEmpty()) {
                    System.out.println("  Average: " + String.format("%.2f", student.getAverage()) +
                                     ", Grade: " + student.getGrade());
                }
                System.out.println("--------------------------------");
            }
        }
    }

    private static void saveData() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(DATA_FILE))) {
            for (Student student : students) {
                // Save student info
                writer.println("STUDENT:" + student.getId() + "," + 
                             student.getName() + "," + student.getAge());
                
                // Save subjects and marks
                for (Map.Entry<String, Integer> entry : student.getSubjects().entrySet()) {
                    writer.println("MARK:" + student.getId() + "," + 
                                 entry.getKey() + "," + entry.getValue());
                }
            }
            System.out.println("Data saved successfully to " + DATA_FILE);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    private static void loadData() {
        File file = new File(DATA_FILE);
        if (!file.exists()) {
            System.out.println("No existing data file found. Starting fresh.");
            return;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))) {
            String line;
            Student currentStudent = null;
            Map<String, Student> studentMap = new HashMap<>();
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length < 2) continue;
                
                String type = parts[0];
                String data = parts[1];
                
                if (type.equals("STUDENT")) {
                    String[] studentData = data.split(",");
                    if (studentData.length >= 3) {
                        String id = studentData[0];
                        String name = studentData[1];
                        int age = Integer.parseInt(studentData[2]);
                        
                        currentStudent = new Student(id, name, age);
                        students.add(currentStudent);
                        studentMap.put(id, currentStudent);
                    }
                } else if (type.equals("MARK")) {
                    String[] markData = data.split(",");
                    if (markData.length >= 3 && studentMap.containsKey(markData[0])) {
                        Student student = studentMap.get(markData[0]);
                        String subject = markData[1];
                        int marks = Integer.parseInt(markData[2]);
                        student.addSubject(subject, marks);
                    }
                }
            }
            System.out.println("Data loaded successfully. " + students.size() + " student(s) found.");
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing data file. Starting with empty database.");
            students.clear();
        }
    }

    private static Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }

    private static Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    private static List<Student> findStudentsByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(student);
            }
        }
        return result;
    }

    // Helper method for reading integer input with validation
    private static int readInt(int min, int max){
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                
                if (input.isEmpty()) {
                    System.out.print("Input cannot be empty. Please enter a number: ");
                    continue;
                }
                
                int value = Integer.parseInt(input);
                
                if (value < min || value > max) {
                    System.out.printf("Please enter a number between %d and %d: ", min, max);
                    continue;
                }
                return value;
            } 
            catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
}
//Done 💨