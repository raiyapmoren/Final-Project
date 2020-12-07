/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
    import java.util.ArrayList;
public class OrderAccess {
    ArrayList<Order> order = new ArrayList();
    public void Create(Order o){
       order.add(o);
    }  
    public ArrayList<Order> getAll(){
        return order;
    }
}

