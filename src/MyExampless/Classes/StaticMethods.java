package MyExampless.Classes;

public class StaticMethods {
    public static void main(String[] args) {
        CupcakeMold MyCupCake= new CupcakeMold();
        MyCupCake.GetStyle();

        CupcakeMold.GetStyle();
    }
}
class CupcakeMold{
    //Fields
    static String School="Renastech";
    /*
    Static means that the field or method marked as such is available at the class level.
    In other owrds, you dont need to create an instance of the class to access it

    */
    public static void GetStyle(){
        System.out.println("Tornado");
    }
}
