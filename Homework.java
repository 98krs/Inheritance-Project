//Subclass - Homework 

public class Homework extends Coursework { //Homework is a subclass of the Coursework superclass. The subclass will inherit the superclass variables/methods 

   //Create the variables 
   private int page; //the homework is from a certain page of the textbook (ex. page 340)
   private String questions; //the homework is certain practice questions (ex. 1-9) 
   
   //Default constructor 
   public Homework() {
   }
   
   //Create 2 constructors for page and questions
   public Homework(int page, String questions) {
      this.page = page; //this.page = our parameter page
      this.questions = questions; //this.questions = our parameter questions 
   }
   
   //Constructor that is going to take more parameters - page, questions, format (super), time allotted (super) 
   public Homework(int page, String questions, String format, double timeAllotted) {
      this.page = page;
      this.questions = questions; 
      //Call methods from the Coursework superclass because Homework extends from that class. Therefore Homework inherits its methods. 
      setFormat(format); //Set format method
      setTimeAllotted(timeAllotted); //Set time allotted method 
   }
   
   //GETTERS AND SETTERS FOR THE PAGE AND QUESTIONS 
   
   //Page getter 
   public int getPage() {
      return page;
   }
   
   //Page setter 
   public void setPage(int page) {
      this.page = page;
   }
   
   //Questions getter 
   public String getQuestions() {
      return questions;
   }
   
   //Questions setter 
   public void setQuestions(String questions) {
      this.questions = questions; 
   }
   
   //PRINT METHOD
   public void printHomework() {
      System.out.println("The homework was last accessed " + toString()); 
   }

}