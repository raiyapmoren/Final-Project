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
public class ProductAccess {
     ArrayList<Product> product = new ArrayList();
    public void Create(Product p){
       product.add(p);
    }  
    public ArrayList<Product> getAll(){
        return product;
    }
}

