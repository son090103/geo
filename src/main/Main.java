/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.Controller;

/**
 *
 * @author son
 */
public class Main {
    public static void main(String[] args) {
      String title= "Menu";
      String mc[]={"Enter 11 country","Display","Search","Display sort","Exit"};
        Controller c= new Controller(title, mc);
        c.run();
    }
}
