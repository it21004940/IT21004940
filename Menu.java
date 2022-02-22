import java.util.Scanner;

public class Menu{
    Scanner input = new Scanner(System.in);

    public static void main(String []args){
        Menu menu = new Menu();
        
        menu.displayMainMenu();
        
    }

    void displayMainMenu(){
        int code1;
        
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println(" ***  Menu  ***");
        System.out.println("1. Conversion Site");
        System.out.println("2. Calculation Site");
        System.out.println("0. Exit");
        System.out.print("Select One :");

        code1 = input.nextInt();

        if(code1 == 1){
            displayConversionSubMenu();  // option 1

        }else if(code1 == 2){
            displayCalculationSubMenu();  // option 2

        }else if(code1 == 0){
            System.exit(0);        // option 0


        }else{
            System.out.println("Wrong Input");     
            displayMainMenu();                  

        }
           

    } ///////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    void displayConversionSubMenu(){

        int code2;
        System.out.println("");
        System.out.println("*** Conversion Sub Menu ***");
        System.out.println("1 . Conversion Length");
        System.out.println("2 . Conversion Weight");
        System.out.println("3 . Conversion Temperature");
        System.out.println("0. Exit");

        System.out.print("Select One: ");
        code2 = input.nextInt();


        if(code2 == 1){

            displayConversionLengthSubmenu();

        }else if(code2 == 2){

            displayConversionWeightSubmenu();

        }else if(code2 == 3){

            displayConversionTemperatureSubmenu();

        }else if(code2 == 0){

            displayMainMenu();

        }else{

            System.out.println("Wrong Input");
            displayConversionSubMenu();

        }

    } 
    void displayCalculationSubMenu(){

        int code3;

        System.out.println("");
        System.out.println("*** Calculation Sub Site ***");
        System.out.println("1. Sum of Series");
        System.out.println("2. Sum of Array");
        System.out.println("3. Product of Series");
        System.out.println("4. Product of Array"); 
        System.out.println("0. Exit");

        System.out.print("Select One :");
        code3 = input.nextInt();

        Calculation calculation1 = new Calculation();

        int start_val,end_val,incr_val,output,size;
        int[] arr;




    if(code3 == 1){
        System.out.print("Start Value :");
        start_val = input.nextInt();
        System.out.print("End Value :");
        end_val = input.nextInt();
        System.out.print("Increment Value :");
        incr_val = input.nextInt();
        output = calculation1.SumOfSeries(start_val,end_val,incr_val);
        System.out.println("Output : " + output);
        displayCalculationSubMenu();
    }else if(code3 == 2){
        System.out.print("Size of array :");
        size = input.nextInt();

        arr = new int[size];

        for(int i = 0; i < size;i++){
            System.out.print("Enter value for index " + i + " :");
            arr[i] = input.nextInt();
        }
        output = calculation1.SumOfArray(arr,size);
        System.out.println("Output : " + output);
        displayCalculationSubMenu();

    }else if(code3 == 3){
        System.out.print("Start Value :");
        start_val = input.nextInt();
        System.out.print("End Value :");
        end_val = input.nextInt();
        System.out.print("Increment Value :");
        incr_val = input.nextInt();
        output = calculation1.ProductOfSeries(start_val,end_val,incr_val);
        System.out.println("Output : " + output);
        displayCalculationSubMenu();
    }else if(code3 == 4){
        System.out.print("Size of array :");
        size = input.nextInt();

        arr = new int[size];

        for(int i = 0; i < size;i++){
            System.out.print("Enter value for index " + i + " :");
            arr[i] = input.nextInt();
        }
        output = calculation1.SumOfArray(arr,size);
        System.out.println("Result : " + output);
        displayCalculationSubMenu();

    }else if(code3 == 0){
        displayMainMenu();

    }else{
        System.out.println("Invalid Input");
        displayCalculationSubMenu();
    }
}

        
    
    void displayConversionLengthSubmenu(){
        double distance,output;
        int code4;

        System.out.println("");
        System.out.println("--- Conversion Length Menu ---");
        System.out.println("1 . KM to Miles");
        System.out.println("2 . Miles to KM");
        System.out.println("3 . Feet to Metres");
        System.out.println("4 . Metres to Feet");
        System.out.println("0. Exit");

        System.out.print("Select One :");
        code4 = input.nextInt();

        Conversion conversion1 = new Conversion();


        if(code4 == 1){
            System.out.print("Enter the distance(KM) :");
            distance = input.nextDouble();
            output = conversion1.KMToMiles(distance);
            System.out.println("Output : " + output + " Miles");
            displayConversionLengthSubmenu();
        }else if(code4 == 2){
            System.out.print("Enter the distance(Miles) :");
            distance = input.nextDouble();
            output = conversion1.MilesToKM(distance);
            System.out.println("Output : " + output + " km");
            displayConversionLengthSubmenu();
        }else if(code4 == 3){
            System.out.print("Enter the distance(Feet) :");
            distance = input.nextDouble();
            output = conversion1.FeetToMetres(distance);
            System.out.println("output : " + output + " m");
            displayConversionLengthSubmenu();
        }else if(code4 == 4){
            System.out.print("Enter the distance(m) :");
            distance = input.nextDouble();
            output = conversion1.MetresToFeet(distance);
            System.out.println("output : " + output + " feet");
            displayConversionLengthSubmenu();
        }else if(code4 == 0){
            displayConversionSubMenu();
        }else{
            System.out.println("Invalid Input");
                displayConversionLengthSubmenu();
        }

        
    } 
    void displayConversionWeightSubmenu(){
        double weight,output;
        int code5;

        System.out.println("");
        System.out.println("--- Conversion Weight Menu ---");
        System.out.println("1 . KG to Pounds");
        System.out.println("2 . Pounds to KG");
        System.out.println("0. Exit");

        System.out.print("Select One :");
        code5 = input.nextInt();

        Conversion conversion2 = new Conversion();

        if(code5 == 1){
            System.out.print("Enter the weight(Kg) :");
            weight = input.nextDouble();
            output = conversion2.KgToPounds(weight);
            System.out.println("Output : " + output + " pounds");
            displayConversionWeightSubmenu();
        }else if(code5 == 2){
            System.out.print("Enter the weight(Pounds) :");
            weight = input.nextDouble();
            output = conversion2.PoundsToKg(weight);
            System.out.println("Result : " + output + " km");
            displayConversionWeightSubmenu();
        }else if(code5 == 0){
            displayConversionSubMenu();
        }else{
            System.out.println("Invalid Input");
            displayConversionWeightSubmenu();
        }

        


    }
    void displayConversionTemperatureSubmenu(){
        double output,temperature;
        int code6;

        System.out.println("");
        System.out.println("--- Conversion Temperature Menu ---");
        System.out.println("1 . Celcius to Fahrenheit");
        System.out.println("2 . Fahrenheit to Celcius");
        System.out.println("0. Exit");

        System.out.print("Select One :");

        code6 = input.nextInt();

        Conversion conversion3 = new Conversion();

        if(code6 == 1){
            System.out.print("Enter the tempreture(C) :");
            temperature = input.nextDouble();
            output = conversion3.CelciusToFahrenheit(temperature);
            System.out.println("Output : " + output + " F");
            displayConversionTemperatureSubmenu();
        }else if(code6 == 2){
            System.out.print("Enter the tempreture(F) :");
            temperature = input.nextDouble();
            output = conversion3.FahrenheightToCelcius(temperature);
            System.out.println("Output : " + output + " C");
            displayConversionTemperatureSubmenu();
        }else if(code6 == 0){
            displayConversionSubMenu();
        }else{
            System.out.println("Invalid Input");
            displayConversionTemperatureSubmenu();
        }

        
    }

}