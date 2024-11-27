
import java.util.Scanner;

interface StackInterface{
    void Push();
    void Pop();
    void Peek();
    void Display();
}

interface QueueInterface{
    void Enqueue();
    void Dequeue();
    void Display();
}

class StackQueue implements StackInterface,QueueInterface 
   {

    Scanner sc = new Scanner(System.in);
    int n,i=0;int no;
    int arr[];
    int  top=-1;
    int front=0;
    int rear=0;
    
    public void Setsize()
    {
      int i=0;
      System.out.println("Enter the size of stack or queue: ");
      n=sc.nextInt();
     // rear=n;
      arr=new int [n];
       System.out.println("Enter the number of elements you want to add in the stack or queue:");
       no=sc.nextInt();
       System.out.println("Enter the elements in stack:");
       for(i=0;i<no;i++)
       {
          this.arr[i]=sc.nextInt();
          top++;
       }
    }
      
      public void Push()
    {
      int num=0;
      if(top==n-1)
      {
        System.out.println("Stack Overflow!");
      }
       else
      {
       System.out.println("Enter the number you want to insert:");
       num=sc.nextInt();
       top++;
       arr[top]=num;
      }
    }
  
     public void s_Display()
    {
       System.out.println("The stack  is:");
       for(i=0;i<=top;i++)
       {
          System.out.println(""+arr[i]);
       }
    }

     public void Pop()
    {
       int temp=0;
        if(top==-1)
        {
          System.out.println("Stack Underflow!");
        }
        else
        {
          temp=arr[top];
          arr[top]=0;
          top--;
        }
        System.out.println("The deleted element is:" + temp);
    }

    public void Peek()
    {
         System.out.println("The top element is: "+ arr[top]);
    }

    public void Enqueue()
    {
      System.out.println("Enter the element you  want to enter in the queue:");
      int q=sc.nextInt();
      rear=no;
      if(rear==n)
      {
         System.out.println("Queue Overflow!");
      }
      else
      {
         arr[rear]=q;
         rear++;  
      }

    }

    public void Dequeue()
    {
      if(front==rear)
      {
         System.out.println("Queue Underflow!");
      }
      else
      {
         int d=arr[front];
         for(i=0;i<rear-1;i++)
         {
            arr[i]=arr[i+1];
         }
         rear--;
         System.out.println("The deleted element is:"+d);
      }

    }

    public void q_display()
    {
      System.out.println("The Queue is:");
      for(i=front;i<rear;i++)
      {
         System.out.println(""+arr[i]);
      }
    }

  
}

class StackQueueTest1
{
  public static void main(String [] args)
  {
     Scanner sc = new Scanner(System.in);
     
      StackQueue s=new StackQueue();
      StackQueue q=new StackQueue();

      s.Setsize();
      System.out.println("Enter 1 for stack operations and 2 for queue operations:");
      int ch=sc.nextInt();

         switch(ch)
         {
           case 1: s.Push();
                   s.s_Display();
                   s.Pop();
                   s.Peek();
                   s.s_Display();
                   break;

           case 2 :s.Enqueue();
                   s.q_display();
                   s.Dequeue();  
                   s.q_display();
                   break;         

           default:System.out.println("Invalid");
         }
   }   
}
     


