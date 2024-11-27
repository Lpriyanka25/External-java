
import java.io.*;

class StudentInfo{

    private String name;
    private String course;
    private int age;


    public void GetInfo()
    {
        try( BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
      {

       System.out.println("Enter the name of Student:");
       name=br.readLine();

       System.out.println("Enter age of  Student: ");
       age=Integer.parseInt(br.readLine());

       System.out.println("Enter the course of the student:");
       course=br.readLine();

      }
      catch(IOException e)
      {
        System.out.println("Error while taking input:"+e.getMessage());
      }
    }

    public void writeToFile(String fileName)
    {
        try(FileOutputStream fos=new FileOutputStream(fileName);
            DataOutputStream dos=new DataOutputStream(fos))
            {
               dos.writeUTF(name);
               dos.writeInt(age);
               dos.writeUTF(course);
            }
    
         catch(IOException e)
        {
            System.out.println("Error while writing to file"+ e.getMessage());
        }
   }

   public void readFromFile(String fileName)
   {
      try(FileInputStream fis=new FileInputStream(fileName);
          DataInputStream dis=new DataInputStream(fis))
          {
            String fileNameRead=dis.readUTF();
            int fileAgeRead=dis.readInt();
            String fileCourseRead=dis.readUTF();
          }

      catch(IOException e)    
      {
        System.out.println("Error while reading from file"+ e.getMessage());
      }
   }

   public static void main(String [] args)
   {
      StudentInfo student=new StudentInfo();
      student.GetInfo();

      String fileName="student_record.txt";
      student.writeToFile(fileName);
      student.readFromFile(fileName);
   }

}
    

    