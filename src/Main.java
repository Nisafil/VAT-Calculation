import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amount, VATrate1 = 0.18,VATrate2 = 0.08,VATrate, VATamount, amountwithVAT;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Fee Amount : " );
        amount = input.nextDouble();


        double str =(amount<=1000 && amount>=0)? (VATrate = VATrate1) : (VATrate = VATrate2);
        VATamount = amount * VATrate;
        amountwithVAT = amount + VATamount;

        System.out.println("Amount Without VAT : " + amount);
        System.out.println("VAT Rate : " + VATrate);
        System.out.println("VAT Amount : " + VATamount);
        System.out.println("Amount With VAT : " + amountwithVAT);





    }
}