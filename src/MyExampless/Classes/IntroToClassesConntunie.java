package MyExampless.Classes;

import javax.naming.Name;
import java.util.Scanner;

public class IntroToClassesConntunie {


    public static void main(String[] args) {

        StudentRegistrationForm MyForm=new StudentRegistrationForm();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Name : ");
        MyForm.Name=sc.nextLine();

        System.out.println("Please Enter Your Surname : ");
        MyForm.Surname=sc.nextLine();

        System.out.println("Please Enter Your Age : ");
        MyForm.Age=sc.nextInt();

        System.out.println("Please Enter Your Gender : ");
        MyForm.Gender=sc.next();

        MyForm.PrintRegistrationForm();

    }

}

class StudentRegistrationForm{
    //FIELDS
    String Name;
    String Surname;
    int Age;
    String Gender;

    String School="RenasTech School";

    //METHODS
    void PrintRegistrationForm(){
        System.out.println("Name : "+Name);
        System.out.println("Surname : "+Surname);
        System.out.println("Age : "+Age);
        System.out.println("Gender : "+Gender);
    }


}
