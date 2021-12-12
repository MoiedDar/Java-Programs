import java.util.*;
class StudentGrade
  {
   public static void main(String a[])
     {
       int studentmarks;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter marks of student");
       studentmarks=in.nextInt();
       if((studentmarks>=450)&&(studentmarks<=500))
         {
           System.out.println("Grade A");
         }
       if((studentmarks>=400)&&(studentmarks<=449))
         {
           System.out.println("Grade B");
         }
       if((studentmarks>=300)&&(studentmarks<=399))
         {
           System.out.println("Grade C");
         }
       if(studentmarks<300)
         {
           System.out.println("Fail");
         }
     }
   }
