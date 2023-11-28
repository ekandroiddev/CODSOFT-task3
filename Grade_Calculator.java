import java.util.Scanner;

public class Grade_Calculator {
     void grade_calculation(int totalmarks){
        if (totalmarks >= 300)
            System.out.println("Grade 'A'");

        else if (totalmarks >= 225 & totalmarks <= 299)
            System.out.println("Grade 'B'");

        else if (totalmarks >= 125 & totalmarks <= 224)
            System.out.println("Grade 'C'");

        else
            System.out.println("Grade 'D'");
     }
     
     void inputMarks(){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Mark's of subject 1st :-");
        int marks_Of_First_Subject = obj.nextInt();

        System.out.print("Enter Mark's of subject  2nd :-");
        int marks_Of_Second_subject = obj.nextInt();

        System.out.print("Enter Mark's of subject  3rd :-");
        int marks_Of_Third_Subject = obj.nextInt();

        System.out.print("Enter Mark's of subject 4th :-");
        int marks_Of_Fourth_Subject = obj.nextInt();

        System.out.print("Enter Mark's of subject 5th :-");
        int marks_Of_Fifth_Subject = obj.nextInt();

        int Total_Marks = marks_Of_First_Subject + marks_Of_Second_subject + marks_Of_Third_Subject + marks_Of_Fourth_Subject + marks_Of_Fifth_Subject;
        System.out.println("Total marks is :- " + Total_Marks);
        System.out.println("Average Percentage is :- " + Total_Marks / 5 + "%");

        obj.close();
        
        grade_calculation(Total_Marks);
     }

    public static void main(String[] args) {
        Grade_Calculator gradecalculatorobj=new Grade_Calculator();
        gradecalculatorobj.inputMarks();
    }
}

