package MyExampless.Classes;

public class Static {

    public static void main(String[] args) {
        RenasTechStudentRegistrationForm MyForm=new RenasTechStudentRegistrationForm();
        MyForm.Name="Hayri";
        MyForm.Surname="Aslan";

        System.out.println(MyForm.Name);
        System.out.println(MyForm.School);

        RenasTechStudentRegistrationForm MyNewForm=new RenasTechStudentRegistrationForm();

        System.out.println(MyNewForm.Name);

    }
}

class RenasTechStudentRegistrationForm {
/*
The Static Keyword in Java Mainly Use For Memory Management.
The Static Veriable can be used to refer the comment property of all object
(Which is not unique for each other)
In other words, a static field is shared by all copies of the class,does all see the same.

*/
    String Name;
    String Surname;

    static String School="Renastech School";


}
