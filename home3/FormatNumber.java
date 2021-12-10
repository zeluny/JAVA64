package home3;

import java.text.*;


public class FormatNumber {
    
    public static void main(String[] args){

        double taxRate = 0.07, price = 205.5, tax=0.0, total=0.0;
        int unit = 5;
        tax = (unit*price)*taxRate;
        total = (unit*price)+tax;
        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setMaximumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        System.out.println("Total : $ "+formatter.format(total));
        System.out.println("Tax : $ "+formatter.format(tax));

        
    }
}
