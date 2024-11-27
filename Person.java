import java.util.Scanner;

public class Person {
    String name; 
    String address;
    int date;
    int month;
    int year;
    double height;
    double weight;
    void GetInfo(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name: "); 
        name = obj.nextLine();
        System.out.println("Enter the Address: "); 
        address = obj.nextLine();
        System.out.println("Enter the date: "); 
        date = obj.nextInt();
        System.out.println("Enter the month: "); 
        month = obj.nextInt();
        System.out.println("Enter the year: "); 
        year = obj.nextInt();
        System.out.println("Enter the height: "); 
        height = obj.nextInt();
        System.out.println("Enter the weight: "); 
        weight = obj.nextInt();
     }
    
    void CalculateAge(){

    }
    
}
class Student extends Person{
   int rollno;
   int[] marks = new int[5];
   void CalculateAvg(){
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the rollno: "); 
    rollno = obj.nextInt();
    System.out.println("Enter the marks: ");
    for(int i =0; i < 5; i++){
        marks[i]= obj.nextInt();
    }
    double avg= 0;
    for(int i =0; i < 5; i++){
        avg = avg + marks[i];
    }
    avg = avg / 5;
    System.out.println("Average is: "+avg);
   }

}
class Employee extends Person{
    double empid=0;
    double salary;
    double Tax=0;
    void GetEInfo() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        salary = obj.nextInt();
    }

    void CalculateTax(){
        
       if((salary>=600000) && (salary<=900000))
       {
           Tax=salary*0.1;
           System.out.println("The tax on salary is:"+Tax);
       }
       else if((salary>=1000000) && (salary<=1200000))
       {
           Tax=salary*1.5;
           System.out.println("The tax on salary is:"+Tax);
       }
       else if((salary>=1200000) && (salary<=1500000))
       {
           Tax=salary*0.2;
           System.out.println("The tax on salary is:"+Tax);
       }
       else if((salary>=1500000))
       {
           Tax=salary*0.3;
           System.out.println("The tax on salary is:"+Tax);
       }
       else
       {
        System.out.println("There is no tax for this annual salary");
       }
    }
}
class TestInheritance{

    public static void main(String[] args) {
        Person p = new Person();
        p.GetInfo();
        Student s =new Student();
        s.CalculateAvg();
        Employee e = new Employee();
        e.GetEInfo();
        e.CalculateTax();
    }

}