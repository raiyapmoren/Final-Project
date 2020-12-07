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
public class CustomerAccess {
    ArrayList<Customer> customer = new ArrayList();
    public void Create(Customer c){
       customer.add(c);
    }  
    public ArrayList<Customer> getAll(){
        return customer;
    }   
}
