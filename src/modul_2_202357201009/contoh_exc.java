/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2_202357201009;

/**
 *
 * @author ASUS
 */
public class contoh_exc {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c"};
        try {
            System.out.println(bil / 0);
            System.out.println(b[3]);
        } catch (ArithmeticException ai) {
            System.out.println("error Aritmetik");
            System.out.println(ai.getMessage());
        } catch (ArrayIndexOutOfBoundsException n) {
            System.out.println("error karena melebihi kapasitas");
            System.out.println(n.getMessage());
        } catch (Exception e) {
            System.out.println("ada error");
            
            System.out.println(e.getMessage());
        }
    }
}
