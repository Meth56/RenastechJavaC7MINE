package MyExampless.Classes;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.sql.SQLOutput;

public class IntroToClasses {
    public static void main(String[] args) {

        String Car1Make="Ford";
        String Car1Model="Mustang";
        String Car1Color="Red";

        String Car2Make="BMW";
        String Car2Model="M3";
        String Car2Color="Black";

        PrintCar(Car1Make,Car1Model,Car1Color);

        System.out.println("----------------------");


//        String MyString = new String("Something");


        Car MySportsCar=new Car();
        MySportsCar.Make="Subaru";
        MySportsCar.Model="BRZ";
        MySportsCar.Color="Blue";
        MySportsCar.ModelYear=2022;

        PrintCarClass(MySportsCar);



    }

    public static void PrintCarClass(Car param1){
        System.out.println("Make : "+param1.Make);
        System.out.println("Model : "+param1.Model);
        System.out.println("Color : "+param1.Color);
        System.out.println("ModelYear : "+param1.ModelYear);

    }

    public static void PrintCar(String param1,String param2,String param3){

        System.out.println("MAKE : "+param1);
        System.out.println("MODEL : "+param2);
        System.out.println("COLOR : "+param3);

    }
}

class Car{

    //Fields

    String Make;
    String Model;
    String Color;
    int ModelYear;


}
