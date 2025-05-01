
import java.util.LinkedList;

public class Tugas1 {
    public static void main(String[] args) {
        // 1. Deklarasi variabel Integer
        int jumlahBaris = 3;
        System.out.println("Jumlah barisnya adalah: " + jumlahBaris);

        // 2. Deklarasi variabel String
        String kalimatBaru = "Deklarasi tipe data String";
        System.out.println("kalimatBaru: " + kalimatBaru);

        // 3. Array 1 Dimensi
        int[] empatAngka = {7,10,20,23};
        System.out.println("empat angka: ");
        for (int angka : empatAngka) {
            System.out.print("angka " + angka + " ");
        }
              System.out.println();

        // 4. Array 2 Dimensi
        String[][] alfabet = {
            {"A", "B", "C"},
            {"D", "E", "F"},
            {"G", "H", "I"}
        };
         System.out.println("alfabet: ");
        for (int i = 0; i < alfabet.length; i++) {
            for (int j = 0; j < alfabet[i].length; j++) {
                System.out.print(alfabet[i][j]);
            }
             System.out.println();
        }

        // 5. Deklarasi LinkedList
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(26);
        listAngka.add(8);
        listAngka.add(23);
        listAngka.add(24);
        listAngka.add(16);
        System.out.println("listAngka: " + listAngka);
    }
}