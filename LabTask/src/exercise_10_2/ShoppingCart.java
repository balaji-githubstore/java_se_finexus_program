/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package exercise_10_2;

public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.PRIVATE);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}    