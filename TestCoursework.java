//Test coursework

public class TestCoursework {

   //MAIN METHOD
   public static void main(String[] args) {
   
   Coursework coursework = new Coursework();
   System.out.println(coursework.toString());
   Homework[] homeworkarray = {new Homework(340, "1 through 9"), new Homework(325, "2 through 11"), new Homework(402, "10 through 15")};
   System.out.println(homeworkarray[0].toString());
   System.out.println(homeworkarray[1].toString());
   System.out.println(homeworkarray[2].toString());
   System.out.println("There are " + homeworkarray.length + " homeworks.");
   
   Quiz[] quizarray = {new Quiz(1, " The 1600s "), new Quiz(2, " The 1700s "), new Quiz(3, " The 1800s ")};
   System.out.println(quizarray[0].toString());
   System.out.println(quizarray[1].toString());
   System.out.println(quizarray[2].toString());
   System.out.println("There are " + quizarray.length + " quizzes.");
   
   }
}