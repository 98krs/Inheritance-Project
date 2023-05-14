//Quiz subclass 

public class Quiz extends Coursework {

   //Create the variables 
   private int chapter; //Each quiz is on a single chapter. 
   private String subject; 
   
   //Default constructor 
   public Quiz() {
   }
   
   //Call superclass's default constructor to initialize variables
   public Quiz(int chapter, String subject) {
      super(); //The superclass's constructor will be called 
      this.chapter = chapter; //Set the chapter 
      this.subject = subject; 
   }
   
   //Create another constructor 
   public Quiz(int chapter, String subject, String format, double timeAllotted) {
      super(format, timeAllotted); //This will call Coursework(format, timeAllotted) 
      this.chapter = chapter; 
      this.subject = subject; 
   }
   
   //GETTERS AND SETTERS FOR THE CHAPTER AND SUBJECT 
   
   //Chapter getter 
   public int getChapter() {
      return chapter;
   }
   
   //Chapter setter 
   public void setChapter(int chapter) {
      this.chapter = chapter;
   }
   
   //Subject getter
   public String getSubject() {
      return subject;
   } 
   
   //Subject setter
   public void setSubject(String subject) {
      this.subject = subject;
   }
   
   public void printQuiz() {
      System.out.println("The quiz was last accessed " + toString()); 
   }
   
   //Create a new toString method 
   public String toString() { 
      return "Quiz " + ", Format: " + getFormat() + ", Subject: " + getSubject() + ", Chapter: " + getChapter() + super.toString();
   }

   
}
