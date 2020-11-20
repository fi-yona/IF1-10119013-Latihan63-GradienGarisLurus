/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan63.gradiengarislurus;

/**
 *
 * @author Fiona Avila
 */


public class Main {

    public static void main(String[] args) {
        Koordinat k1 = new Koordinat(2,10,5,7);
        int gradien1 = k1.hitungGradien();
        System.out.println("Garis yang melalui titik (" + k1.getX1() + "," + k1.getY1() + ") dan (" + k1.getX2() + "," + k1.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + gradien1);
        
        Koordinat k2 = new Koordinat(5,1,3,12);
        int gradien2 = k2.hitungGradien();
        System.out.println("Garis yang melalui titik (" + k2.getX1() + "," + k2.getY1() + ") dan (" + k2.getX2() + "," + k2.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + gradien2);
        
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
    
}
