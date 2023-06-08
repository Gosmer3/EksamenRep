package comparable;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Customer[] customers = new Customer[4];

        Customer c1 = new Customer("Hans", "Jensen", 54);
        Customer c2 = new Customer("Ib", "Hansen", 51);
        Customer c3 = new Customer("Mads", "Madsen", 90);
        Customer c4 = new Customer("Evers", "Karlsen", 15);

        customers[0] = c1;
        customers[1] = c2;
        customers[2] = c3;
        customers[3] = c4;

        System.out.println(lastCustomer(customers));

        System.out.println(c1.compareTo(c3));

        System.out.println(Arrays.toString(afterCustomer(customers, c1)));
    }

    public static Customer[] afterCustomer(Customer[] customers, Customer c1) {
        Customer [] efter = new Customer[customers.length];
        int antal = 0;

        for (Customer c : customers){
            if (c.compareTo(c1)>0){
                efter[antal] = c;
                antal++;
            }
        }
        return efter;
    }

    public static Customer lastCustomer(Customer[] customers) {
        Customer last = customers[0];

        for(Customer c : customers){
            if (last.compareTo(c)<0){
                last = c;
            }
        }
        return last;
    }
}
