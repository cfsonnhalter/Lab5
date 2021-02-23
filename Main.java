import java.util.ArrayList;  //imports ArrayLists utilities 

class Main 
{
  public static void main(String[] args)
  {
    Student student1 = new Student(); //initializes the new student object
    student1.setName("Arnold Spielberg"); /// uses methods from Student.java to assign values to variables
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    Student student2 = new Student(); //initializes the second student object
    student2.setName("Christopher Sonnhalter");
    student2.setGPA(4.3);
    student2.setMajor("Information Systems");

  
    student1.print(); //uses print methods from Student.java to print out information 
    student2.print();

    ArrayList<Double> gpas = new ArrayList<Double>(); // initializes a new array list

    gpas.add(4.0);  //adds value to the array list 
    gpas.add(4.3);  //adds value to the array list 

    double sum = 0; //decalres a variable sum 

    double gpa1 = gpas.get(0); //declares a variable for calculations 
    double gpa2 = gpas.get(1); // delcaresa  variable for calculations 
    sum = sum + gpa1 + gpa2;  // adds the two values together to get a sum

    double avg = sum / gpas.size();  //sum is divided by size to find average 

    System.out.println("The average GPA is: " + avg);  // prints the average GPA 
  }

}