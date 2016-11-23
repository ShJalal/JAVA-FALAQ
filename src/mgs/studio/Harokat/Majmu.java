package mgs.studio.Harokat;

public class Majmu {

    public static int majmu = 1410;
    public static int[][] harokat(int tahun){

        int[][] hasil;
        if (tahun >= 1410 || tahun == 1440){
            hasil = new int[][] { { 44, 38, 0, 4 }, { 2, 38, 17, 0 }, { 2, 48, 8, 4 }, { 37, 20, 9, 8 }, { 28, 24, 22, 1}};
        }
        else{
            hasil = null;
        }
        return hasil;
    }
}
