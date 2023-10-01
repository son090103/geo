
package library;

import java.util.Scanner;


public class Library {
      protected Scanner sc;
    public Library(){
        sc  = new Scanner(System.in);
    }

    public String getString(String mes){
        System.out.println(mes);
        return sc.nextLine();
    }

    public int getint(String mes){
        System.out.println(mes);
        return sc.nextInt();
    }
    
        public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);  // chuyển chuỗi số nguyen thành số nguyên
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {  // xu ly ngoai le
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
        public float getFloat(String mess){
               System.out.println(mess);
        boolean check = false;
        float a = 0;
        while (!check) {
            try {
                a = Float.parseFloat(sc.nextLine());
                check = true;
            } catch (Exception e) {
                System.out.println("Error, Enter again: ");
            }
        }
        return a;
    }
}
