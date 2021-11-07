import java.util.Scanner;
public class Primetest{
    public static void main(String[]args){
        int num,i,count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value");
        num=sc.nextInt();
        boolean isPrime=true;
        for( i=2;i<num;i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(num+"is a Prime number");
        }else{
            System.out.println(num+"is not a prime number");
        
        
            
        }
    }
}
