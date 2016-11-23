package mgs.studio.Operation;

/**
 * Created by Sh Jalal 87 on 11/21/2016.
 */
public class add {
    public static int[][] addition(int sawani, int daqiqoh, int darojah, int buruj)
    {
        int a = sawani % 60;
        if (a == 60)
        {
            a = 0;
        }
        int devide = sawani / 60;
        int b = (daqiqoh % 60) + devide;
        if (b == 60)
        {
            b = 0;
        }
        int devide2 = daqiqoh / 60;
        int d = (darojah % 30) + devide2;
        if (d == 30)
        {
            d = 0;
        }
        int devide3 = darojah / 30;
        int e = buruj % 12 + devide3;
        if (e == 12)
        {
            e = 0;
        }
        int devide4 = buruj / 12;
        int[][] hasil = new int[1][4];
        hasil[0][0] = a;
        hasil[0][1] = b;
        hasil[0][2]= d;
        hasil[0][3] = e;
        return hasil;
    }
}
