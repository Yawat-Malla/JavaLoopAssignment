import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        double total=0 ,VAT=0,discount = 0,quantity= 0,order=0 ; String item="";
        String sano_butta="**********************";
        String lamo_butta="*********************************************************************";
        String t_items="",t_quantity="",t_total="";
        System.out.println(lamo_butta);
        System.out.println("*                              Yawat Cafe                           *");
        System.out.println(lamo_butta);
        System.out.println("                                                    ");
        System.out.println("Today's Menu");
        System.out.println(sano_butta);
        System.out.println("Food items      Price       ");
        System.out.println("Momo            80");
        System.out.println("Chowmein        70");
        System.out.println("Biriyani        90");
        System.out.println(sano_butta);
        System.out.println(sano_butta);
        System.out.println("Enter number of items: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i = 1 ; i<=n;i++) {
            System.out.println("Enter:");
            System.out.println("1 to order momo");
            System.out.println("2 to enter chowmein " );
            System.out.println("3 to enter biriyani.");
            order = obj.nextInt();
            System.out.println("Enter quantity: ");
            quantity = obj.nextInt();
            if (order == 1) {
                item = "momo";
                total = 80 * quantity;
            } else if (order == 2) {
                item = "chowmein";
                total = 70 * quantity;
            } else if (order == 3) {
                item = "biryani";
                total = 90 * quantity;
            } else {
                System.out.println("Order invalid");
            }
            t_items +="\n"+item;
            t_quantity+="\n"+  quantity ;
            t_total+= "\n"+ total ;
            VAT = (13 * total) / 100;
            discount = (10 * total) / 100;

        }
        String ft_items = "Items\t "+t_items;
        String ft_quantity = "Quantity\t "+t_quantity;
        String ft_total = "Total\t " +t_total;
        double grand_total = total + VAT - discount;
        System.out.println(lamo_butta);
        System.out.println(ft_items+ft_quantity+ft_total);
//
        System.out.println("Total VAT: " + VAT);
        System.out.println("Total discount: " + discount);
        System.out.println("Grand Total: " + grand_total);
        System.out.println(lamo_butta);
    }
}