/* Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, 
ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.*/

package com.inheritance.multilevelinheritance.onlineretail;

public class MainOnlineRetail {

    public static void main(String[] args) {

        // Multilevel inheritance demonstration
        Order order1 = new Order(111, "2025-07-10");
        Order order2 = new ShippedOrder(102, "2025-07-11", "TRK082191");
        Order order3 = new DeliveredOrder(103, "2025-07-12", "TRK441006", "2025-07-25");

        System.out.println(order1.getOrderStatus());
        System.out.println(order2.getOrderStatus());
        System.out.println(order3.getOrderStatus());
    }
}