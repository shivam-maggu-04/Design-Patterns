package org.example.Factory;



public class Main {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        orderService.sendNotification();

        DeliveryService deliveryService  = new DeliveryService();
        deliveryService.sendNotification();
        }

}