import java.util.Scanner;

class MyException extends Exception{
   
    public MyException(String message)
    {
        super(message);
    }
}

class MathOperation
{
      void Addition(int a,int b) throws MyException
      {
        int result=a+b;
        if(result>1000)
        {
           throw new MyException("TooLongAdddition:Addition exceeds 1000");
        }
        System.out.println("Addition is:"+result);        
      }

     void Subtraction(int a,int b) throws MyException
     {
       int result=a-b;
       if(result<0)
       {
        throw new MyException("NegativeAnswer:Subtraction result is below 0.");
       }
       System.out.println("Subtraction is:"+result);
     }

     void Multiplication(int a,int b) throws MyException
     {
       int result=a*b;
       if(result>5000)
       {
        throw new MyException("TooLongMultiplication:Multiplication exceeds 5000");
       }
       System.out.println("Multiplication is:"+result);
     }

     void Division(int a,int b) throws MyException
     {
          if(b==0)
          {
            throw new MyException("Divide by zero is not allowed.");
          }
          else{
            double result=a/b;
            System.out.println("Division is:"+result);
          }
     }

     public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two numbers for operation:");
      int a=sc.nextInt();
      int b=sc.nextInt();
      MathOperation m=new MathOperation();
      
      try {
          m.Addition(a,b);
      }
       catch (Exception e) {
        System.out.println(e.getMessage());
      }

      try {
        m.Subtraction(a,b);
      }
       catch (Exception e) {
       System.out.println(e.getMessage());
      }

      try {
        m.Multiplication(a,b);
      }
       catch (Exception e) {
       System.out.println(e.getMessage());
      }

      try {
        m.Division(a,b);
      }
       catch (Exception e) {
       System.out.println(e.getMessage());
      }
    
    }
}