public class Main{
    public static void main(String[] args)
    {
        //Declarations
        double salesTax = .05;
        double priceOfPurchase = 9.99;
        double taxTotal;
        double priceAfterTax;

        //Statements
        taxTotal = priceOfPurchase * salesTax;
        priceAfterTax = taxTotal + priceOfPurchase;

        System.out.println("The price of your purchase after tax is: $" + priceAfterTax);
    }
}