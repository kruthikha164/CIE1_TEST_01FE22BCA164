 import java.time.LocalDate;
 import java.time.Period;
 import java.time.format.DateTimeFormatter;
 public class Student extends Student_Course {
     String name;
     String dob;
     public void displayName() {
         System.out.println("Student Name: " + name);
     }
     public void displayAge(String dob) {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         LocalDate birthDate = LocalDate.parse(dob, formatter);
         LocalDate currentDate = LocalDate.now();
         Period period = Period.between(birthDate, currentDate);
         int age = period.getYears();
         System.out.println("Age of student: " + age);
     }
     public static void main(String[] args) {
         Student s = new Student();
         s.name = "KRUTHIKHA";
         s.displayName();
         s.displayAge("26-02-2005");
         Student_Course  sc = new Student_Course();
         sc.displayStudentCourse();
     }
 }