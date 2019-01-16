
//Student Database Handling
package StudentDatabase;

import java.util.Scanner;

public class Student {
	
	private String firstname;
	private String lastname;
	private int admissionyear;
	private String studentID;
	private String courses = null;
	private int TutionBalance = 0;
	private static int costofcourse = 600;
	private static int id = 1001;
	private int payment;
	
	//Constructor promt user to enter the details
	public Student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Firstname: ");
		this.firstname = sc.nextLine();
		System.out.println("Enter the lastname: ");
		this.lastname = sc.nextLine();
		System.out.println("Enter the Current Year Of Study: ");
		this.admissionyear = sc.nextInt();
		
		
		setStudentID();
		
		
		enroll();
		payment();
		
		showinfo();
	}
	
	//Generate an ID
	
	private void setStudentID() {
		id++;
		//Grade Level + ID
		studentID = admissionyear+""+id;
		 
	}
	 
	
	
	//Enroll n Courses
	
	public void enroll()
	{
		//Get Inside a loop when user hits 0
		do {
			System.out.print("Enter the name Of the course you want to enroll: or(Press Q to quit::");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if(!course.equals("Q"))
			{
				courses = courses +"\n  "+ course;
				TutionBalance = TutionBalance + costofcourse;
			}
			else 
				{
				break;
				}
		  }while(1!=0);
		System.out.println("Enrolled in:"+courses);
		System.out.println("Tution Balance Cost:" + TutionBalance);
	}
	
	//View Balance 
	 
	  public void ViewBalance()
	  {
		  System.out.println("Your Due Balance is $" + TutionBalance);
	  }
	  
	
	
	//Payment Status
	  public void payment()
	  {   
		  ViewBalance();
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Please pay your tution fees: $");
		  payment = sc.nextInt();
		  TutionBalance = TutionBalance - payment;
		  System.out.println("Thank you for your payment:-)");
		  ViewBalance();
	  }
	
	//Status
	  public void showinfo()
	  {
		  System.out.println("Name:"+ firstname +""+lastname);
		  System.out.println("Admission Year:" +admissionyear);
		  System.out.println("ID:" +studentID);
		  
		  System.out.println("Courses:" + courses);
		  System.out.println("Tution Due Cost:"+TutionBalance);
		  
	  }

}
