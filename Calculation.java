public class Calculation{

   public int SumOfSeries(int start, int end, int incr){

    int sum = 0;
    for(int i = start; i <= end; i+=incr){
        sum = sum + i;
    }
    return sum;
}

    


    int SumOfArray(int data[], int size){

        int sum = 0;
        for(int i = 0;i<size;i++){
            sum = sum + data[i];
        }
        return sum;
    }

    
    int ProductOfSeries(int start, int end, int incr){

        int product = 0;
        for(int i = start; i <= end; i+=incr){
            product = product * i;
        }
        return product;
    }


    int ProductOfArray(int data[], int size){

        int product = 0;
        for(int i = 0;i<size;i++){
            product = product * data[i];
        }
        return product;
    }
       
  
}