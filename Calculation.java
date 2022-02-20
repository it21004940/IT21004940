import java.util.Scanner;
public class Calculation{

   public int SumOfSeries(int start, int end, int incr){

    int sum = 0;  
    
    while(start <= end)  
    {  
    
    sum = sum + start;  
    
    incr++;  
    }  
     
    System.out.println(sum);  
    
        return SumOfSeries(start, end, incr);


    }


    int SumOfArray(int data[], int size){

        
        return SumOfArray(data, size);





    }
    int ProductOfSeries(int start, int end, int incr){

        return ProductOfSeries(start, end, incr);


        


    } 
    int ProductOfArray(int data[], int size){

       
        return ProductOfArray(data, size);

    }
       
  
}