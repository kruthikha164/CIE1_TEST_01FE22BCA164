public class Student_Course {
    public static void main(String[] args) {
      
}
       public String[] course = { "ML", "ST","C#","DevOps" };
       public int[] marks = { 80, 85, 90, 95};
  
      public void displayStudentCourse() {
          System.out.println("Course\tMarks");
          for (int i = 0; i < course.length; i++) 
                  System.out.println(course[i] + "\t" + marks[i]);
      }

}