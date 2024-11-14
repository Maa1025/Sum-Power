package sum.power;

public class SumPower {

    public static void main(String[] args) {
        int sum = 0;
  
    for (int i = 1; i <= 10; i++){ 
        int powerOfTwo = i * i; //to calculate power of two
        sum += powerOfTwo; //add to the sum 
        System.out.println("Number: " +i+ ",Power of Two (n^2):" +powerOfTwo);
    }
    System.out.println("Sum of the power of two from 1 to 10:" + sum);
    }
    
}
