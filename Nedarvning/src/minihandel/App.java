package minihandel;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Iphone",1000);
        Product p2 = new Product(1, "PS5",5000);
        Product p3 = new Product(1, "MAC",10000);
        Product p4 = new Product(1, "Fodbold",150);
        Product p5 = new Product(1, "Netflix",300);

        Customer c1 = new Customer("Hans", LocalDate.of(2000,5,29));
        Customer c2 = new Customer("Bo", LocalDate.of(2001,8,29));


        Order o1 = new Order(1);
        o1.createOrderLine(1,p1);
        o1.createOrderLine(3,p4);
        o1.createOrderLine(5,p3);

        Order o2 = new Order(2);
        o2.createOrderLine(1,p2);
        o2.createOrderLine(3,p5);

        Order o3 = new Order(3);
        o3.createOrderLine(3,p4);
        o3.createOrderLine(1,p1);

        Order o4  = new Order(4);

        c1.addOrder(o1);
        c1.addOrder(o2);

    }
}
