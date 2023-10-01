
package controller;

import country.countryterrain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import library.Library;


public class Althoghmt {
      private  ArrayList<countryterrain> arr = new ArrayList<>();
      private Library l = new Library();
      public Althoghmt(){
          arr = new ArrayList<>();
      }
      public void addcountry(){
          Scanner sc= new Scanner(System.in);
          for(int i=0;i<10;i++){
              String countrycode = l.getString("Enter countryCode: ");
              String name = l.getString("Enter countryName: ");
              float area = l.getFloat("Enter totalArea: ");
              String countryTerrain = l.getString("countryTerrain: ");
              countryterrain c = new countryterrain(countrycode, name, area, countryTerrain);
              arr.add(c);
          }
      }
    public void display(){
        for(int i=0 ;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    //search theo tên 
    public void search() throws Exception{
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("Enter name you want to find: ");
        String name = sc.nextLine();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getCountryName().equals(name)){
                System.out.println(arr.get(i));
                return;
            } 
        }
        } catch (Exception e) {
            throw new Exception("Error retrieving information: " );
        }
           
        }
    
   // sắp xếp theo tên alp
   public void sortByCountryName() {
        Collections.sort(arr, new Comparator<countryterrain>() {
            @Override
            public int compare(countryterrain c1, countryterrain c2) {
                return c1.getCountryName().compareTo(c2.getCountryName());
            }
        });
    }

   
}
