/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2_202357201009;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class methodx {
    
    public double luas_lingkaran(double diameter) {
        double jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    
    public double volume_tabung(double diameter, double tinggi) {
        double luas = luas_lingkaran(diameter);
        double volume = luas * tinggi;
        return volume;
    }
    
    public double volume_kerucut(double diameter, double tinggi) {
        double luas = luas_lingkaran(diameter);
        double volume = (luas * tinggi) / 3.0;
        return volume;
    }
    
    public double volume_bola(double diameter) {
        double jari2 = diameter / 2.0;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jari2, 3);
        return volume;
    }
    
    public static void main(String[] args) {
        methodx mt = new methodx();
        
        String pilihanString = JOptionPane.showInputDialog(null,
                "pilihlah bangun ruang:\n1. Tabung\n2. kerucut\n3. Bola", 
                "PIlihan", JOptionPane.QUESTION_MESSAGE);
        
        int pilihan = Integer.parseInt(pilihanString);
        
        double diameter, tinggi;
        
        if (pilihan == 1) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, " masukkan diameter Lingkaran : "));
            tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, " masukkan tinggi : "));
            double volume_tabung = mt.volume_tabung(diameter, tinggi);
            JOptionPane.showMessageDialog(null, "volume Tabung : " + volume_tabung);
            System.out.println("volume Tabung : " + volume_tabung);
        } else if (pilihan == 2) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, " masukkan diameter Lingkaran : "));
            tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, " masukkan tinggi : "));
            double volume_kerucut = mt.volume_kerucut(diameter, tinggi);
            JOptionPane.showMessageDialog(null, "volume Kerucut : " + volume_kerucut);
            System.out.println("volume Kerucut : " + volume_kerucut);
        } else if (pilihan == 3) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, " masukkan diameter Lingkaran : "));
            double volume_bola = mt.volume_bola(diameter);
            JOptionPane.showMessageDialog(null, "volume Bola : " + volume_bola);
            System.out.println("volume Bola : " + volume_bola);
        } else {
            JOptionPane.showMessageDialog(null, "pilihan tidak ada");
        }
        System.exit(0);
    }
}
