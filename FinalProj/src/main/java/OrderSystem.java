/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
public class OrderSystem {
    

    public static void main(String[] args) {
        CustomerAccess customer = new CustomerAccess();
        ProductAccess product = new ProductAccess();
        OrderAccess order = new OrderAccess();
        OrderItemAccess orderitem = new OrderItemAccess();
        
        Customer c = new Customer("12645", "Vince", "Smith", "215-5555");
        customer.Create(c);
        c = new Customer("9678", "Scott", "Smith", "612-4444");
        customer.Create(c);
        c = new Customer("7880", "Kyle", "Williams", "543-3333");
        customer.Create(c);
        
        Product p = new Product("12", "Sushi", 45, 1);
        product.Create(p);
        p = new Product("10", "Balut", 89, 3);
        product.Create(p);
        p = new Product("4", "Wasabi", 102, 2);
        product.Create(p);
        
        Order o = new Order(1, customer.getAll().get(0).getCustomerID(), "12/6/2020");
        order.Create(o);
        o = new Order(2, customer.getAll().get(1).getCustomerID(), "12/7/2020");
        order.Create(o);
        o = new Order(3, customer.getAll().get(2).getCustomerID(), "12/8/2020");
        order.Create(o);
        
        OrderItem oi = new OrderItem(order.getAll().get(0).getOrderNumber(), 
                1, 
                product.getAll().get(0).getProductID(),
                product.getAll().get(0).getDescription(),
                2,
                product.getAll().get(0).getPrice()
                );
        orderitem.Create(oi);
           oi = new OrderItem(order.getAll().get(0).getOrderNumber(), 
                2, 
                product.getAll().get(1).getProductID(),
                product.getAll().get(1).getDescription(),
                3,
                product.getAll().get(1).getPrice()
                );
        orderitem.Create(oi);
        
        oi = new OrderItem(order.getAll().get(1).getOrderNumber(), 
                1, 
                product.getAll().get(1).getProductID(),
                product.getAll().get(1).getDescription(),
                4,
                product.getAll().get(1).getPrice()
                );
        orderitem.Create(oi);
        oi = new OrderItem(order.getAll().get(1).getOrderNumber(), 
                2, 
                product.getAll().get(2).getProductID(),
                product.getAll().get(2).getDescription(),
                5,
                product.getAll().get(2).getPrice()
                );
        orderitem.Create(oi);
        
         oi = new OrderItem(order.getAll().get(2).getOrderNumber(), 
                1, 
                product.getAll().get(0).getProductID(),
                product.getAll().get(0).getDescription(),
                6,
                product.getAll().get(0).getPrice()
                );
        orderitem.Create(oi);
        oi = new OrderItem(order.getAll().get(2).getOrderNumber(), 
                2, 
                product.getAll().get(2).getProductID(),
                product.getAll().get(2).getDescription(),
                7,
                product.getAll().get(2).getPrice()
                );
        orderitem.Create(oi);
        
        System.out.println("***Customers***\n");
        for(int i = 0; i<customer.getAll().size(); i++){
            System.out.println(customer.getAll().get(i).toString());
         
        }
        System.out.println("***Products***\n");
        for(int i = 0; i<product.getAll().size(); i++){
            System.out.println(product.getAll().get(i).toString());
        }
        
        System.out.println("***Orders***\n");
        for(int i = 0; i<order.getAll().size(); i++){
            System.out.println(order.getAll().get(i).toString());
        }
        
        System.out.println("***Order Items***\n");
        for(int i = 0; i<order.getAll().size(); i++){
             System.out.println(orderitem.getAll().get(i).toString());
        }     
        
        System.out.println("***Order details***\n");
        double total = 0;
        for(int i = 0; i<customer.getAll().size(); i++){
            total = 0;
            System.out.println("Orders for " +customer.getAll().get(i).getFirstName()+ " " +customer.getAll().get(i).getLastName()+ ": ");
            System.out.println("Date: " + order.getAll().get(i).getDate());
             System.out.println("Order Number: " + order.getAll().get(i).getOrderNumber());
            for(int j = 0; j<orderitem.getAll().size(); j++){
                if(orderitem.getAll().get(j).getOrderNumber()==order.getAll().get(i).getOrderNumber()){
                    System.out.println("Line: " + orderitem.getAll().get(j).getLineNumber());
                    System.out.println("Description: " + orderitem.getAll().get(j).getProductDescription());
                    System.out.println("Quantity: " +orderitem.getAll().get(j).getQuantity());
                    System.out.printf("Price: $%.2f\n",orderitem.getAll().get(j).getPrice());
                    total += orderitem.getAll().get(j).getQuantity() * orderitem.getAll().get(j).getPrice();
                    System.out.println();
                } 
            }
            System.out.printf("Total: $%.2f\n", total);
            System.out.println();
        }   
        
    }   
}


