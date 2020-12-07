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
public class OrderItemAccess {
     ArrayList<OrderItem> orderitem = new ArrayList();
    public void Create(OrderItem oi){
       orderitem.add(oi);
    }  
    public ArrayList<OrderItem> getAll(){
        return orderitem;
    }
}

