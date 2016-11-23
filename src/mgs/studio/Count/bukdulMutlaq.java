package mgs.studio.Count;

import mgs.studio.Harokat.Ayyam;
import mgs.studio.Harokat.Mabsutoh;
import mgs.studio.Harokat.Majmu;
import mgs.studio.Harokat.Syahr;
import mgs.studio.Operation.add;

public class bukdulMutlaq {

    public static int[][] alwastu(int tahun, int syahr, int ayyam){

        int[][] hasil = new int[5][4];
        int[][] a = Majmu.harokat(tahun);
        int[][] b = Mabsutoh.FindingMabsutoh(tahun);
        int[][] c = Syahr.FindingSyahr(syahr);
        int[][] d = Ayyam.FindingAyyam(ayyam);
        System.out.print("Alwastu : " );
        int sawani = a[0][0] + b[0][0] + c[0][0] + d[0][0];
        int daqiqoah = a[0][1] + b[0][1] + c[0][1] + d[0][1];
        int darojah = a[0][2] + b[0][2] + c[0][2] + d[0][2];
        int buruj = a[0][3] + b[0][3] + c[0][3] + d[0][3];
        int[][] alwastuwastuha = add.addition(sawani, daqiqoah, darojah, buruj);
        hasil[0][0] = alwastuwastuha[0][0];
        hasil[0][1] = alwastuwastuha[0][1];
        hasil[0][2] = alwastuwastuha[0][2];
        hasil[0][3] = alwastuwastuha[0][3];
        int sawani1 = a[1][0] + b[1][0] + c[1][0] + d[1][0];
        int daqiqoah1 = a[1][1] + b[1][1] + c[1][1] + d[1][1];
        int darojah1 = a[1][2] + b[1][2] + c[1][2] + d[1][2];
        int buruj1 = a[1][3] + b[1][3] + c[1][3] + d[1][3];
        int[][] alwastukhosotuha = add.addition(sawani1, daqiqoah1, darojah1, buruj1);
        hasil[1][0] = alwastukhosotuha[0][0];
        hasil[1][1] = alwastukhosotuha[0][1];
        hasil[1][2] = alwastukhosotuha[0][2];
        hasil[1][3] = alwastukhosotuha[0][3];
        int sawani2 = a[2][0] + b[2][0] + c[2][0] + d[2][0];
        int daqiqoah2 = a[2][1] + b[2][1] + c[2][1] + d[2][1];
        int darojah2 = a[2][2] + b[2][2] + c[2][2] + d[2][2];
        int buruj2 = a[2][3] + b[2][3] + c[2][3] + d[2][3];
        int[][] alwastuwastuhu = add.addition(sawani2, daqiqoah2, darojah2, buruj2);
        hasil[2][0] = alwastuwastuhu[0][0];
        hasil[2][1] = alwastuwastuhu[0][1];
        hasil[2][2] = alwastuwastuhu[0][2];
        hasil[2][3] = alwastuwastuhu[0][3];
        int sawani3 = a[3][0] + b[3][0] + c[3][0] + d[3][0];
        int daqiqoah3 = a[3][1] + b[3][1] + c[3][1] + d[3][1];
        int darojah3 = a[3][2] + b[3][2] + c[3][2] + d[3][2];
        int buruj3 = a[3][3] + b[3][3] + c[3][3] + d[3][3];
        int[][] alwastukhosotuhu = add.addition(sawani3, daqiqoah3, darojah3, buruj3);
        hasil[3][0] = alwastukhosotuhu[0][0];
        hasil[3][1] = alwastukhosotuhu[0][1];
        hasil[3][2] = alwastukhosotuhu[0][2];
        hasil[3][3] = alwastukhosotuhu[0][3];
        int sawani4 = a[4][0] + b[4][0] + c[4][0] + d[4][0];
        int daqiqoah4 = a[4][1] + b[4][1] + c[4][1] + d[4][1];
        int darojah4 = a[4][2] + b[4][2] + c[4][2] + d[4][2];
        int buruj4 = a[4][3] + b[4][3] + c[4][3] + d[4][3];
        int[][] alwastuuqdatuhu = add.addition(sawani4, daqiqoah4, darojah4, buruj4);
        hasil[4][0] = alwastuuqdatuhu[0][0];
        hasil[4][1] = alwastuuqdatuhu[0][1];
        hasil[4][2] = alwastuuqdatuhu[0][2];
        hasil[4][3] = alwastuuqdatuhu[0][3];
        return hasil;
    }
}
