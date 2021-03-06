/** Models a student,inherits from Person*/
public class Student extends Person implements Hugable,Kissable{
                    //Inheritance
  private String studentNumber;
  private String course;
  Person person = new Person(getName(),getAge(),getGender());
  		
  public Student() {
  
	    super();//Inheritance
	    setStudentNumber("Unknown");
	    setCourse("Unassigned");
  }

  public Student(String snum,String c, String name,int age, char gender){ //Constructor
	     //new Person(name,age,gender);
	     super(name,age,gender);
	     //setName(name);
	     //setAge(age);
	     //setGender(gender);
	     setStudentNumber(snum);
	     setCourse(c);
  }

  public String getStudentNumber(){
	     return studentNumber;
  }

  public String getCourse() {
	     return course;
  }

  public void setStudentNumber(String snum){
	     studentNumber = snum;
  }

  public void setCourse(String c){
	     course = c;
  }
  
 /* public String toString(){
	     return "Student Number is " + getStudentNumber() + 
	     "\nCourse is " + getCourse() + 
	     "\nName is " + getName() +
	     "\nAge is " + getAge() +
	     "\nGender is " + getGender();
  }	*/
  	// alternative way to write subclass toString()
  	  public String toString(){
	     return "Student Number is " + getStudentNumber() + 
	     "\nCourse is " + getCourse() + 
	     "\nOther details: " + super.toString();//Inheritance Overriding
   } 
   	
   	
   public String hug(int x){
   	
   	return "You've been hugged " + x + " times";
   	
   }
   	public String kiss(int x){
   	
   	return "Get Lost";
   	
   }

    public double squeezeable(int y) {
        return 0;
    }
}