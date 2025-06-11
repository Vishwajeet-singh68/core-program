import java.util.*;
public class CourseFee2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double fee = in.nextDouble();
        double discountPercent = in.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
