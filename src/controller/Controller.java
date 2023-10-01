/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Althoghmt;
import menu.Menu;
import java.util.ArrayList;

/**
 *
 * @author son
 */
public class Controller extends Menu{
     private Althoghmt a = new Althoghmt();
   
     public Controller(String title,String []mc){
         super(title,mc);
     }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                a.addcountry();
                break;
            case 2:
                a.display();
                break;
            case 3:
                // tìm kiếm quốc gian theo tên đã search 
                a.search();
                break;
            case 4:
            {
                a.sortByCountryName();
                a.display();
                break;
            }
            default:
                System.out.println("chi nhap tu 1 den 4");
        }
    }
    
    
}
