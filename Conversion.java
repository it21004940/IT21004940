public class Conversion{

    public double KMToMiles(double distance){


       double Km2Mi = distance * 0.62;

        return Km2Mi ;

    }
    public double MilesToKM(double distance){


        double Mi2Km = distance * 1.60;

        return Mi2Km;

    }
    public double FeetToMetres(double distance){


        double F2M = distance / 0.30;

        return F2M;

    }
    public double MetresToFeet(double distance){

        double M2F = distance * 3.28;

        return M2F;

    }
    public double KgToPounds(double weight){

        double Kg2P = weight * 2.20;

        return Kg2P;

    }
    public double PoundsToKg(double weight){

        double P2Kg = weight * 0.45;


        return P2Kg;

    }
    public double CelciusToFahrenheit(double temperature){

        double C2F =  (9/5) * temperature + 32;

        return C2F;

    } 
    double FahrenheightToCelcius(double temperature){

        double F2C = (5/9) * (temperature - 32);


        return F2C;

    }
  
}