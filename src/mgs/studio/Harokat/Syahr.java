package mgs.studio.Harokat;

public class Syahr {
    public static int[][] FindingSyahr(int inputBulan){
        int[][] syahr;
        inputBulan -= 2;
        if (inputBulan == 1)//muharrom
        {
            syahr = new int[][] { { 10, 34, 29, 0 }, { 5, 34, 29, 0 }, { 31, 17, 5, 1 }, { 56, 56, 1, 1 }, { 19, 35, 1, 0 } };
        }
        else if (inputBulan == 2)//sofar
        {
            syahr = new int[][] { { 11, 9, 28, 1 }, { 0, 9, 28, 1 }, { 27, 24, 27, 1 }, { 4, 50, 20, 1 }, { 28, 7, 3, 0 } };

        }
        else if (inputBulan == 3)//Robiul awal
        {
            syahr = new int[][] { { 21, 43, 27, 2 }, { 4, 43, 27, 2 }, { 17, 41, 2, 3 }, { 2, 47, 22, 2 }, { 47, 42, 4, 0 } };
        }
        else if (inputBulan == 4)//Robius sani
        {
            syahr = new int[][] { { 23, 18, 26, 3 }, { 2, 18, 26, 3 }, { 53, 48, 24, 3 }, { 7, 40, 11, 3 }, { 55, 14, 6, 0 } };
        }
        else if (inputBulan == 5)//Jumadil awal
        {
            syahr = new int[][] { { 33, 52, 25, 4 }, { 6, 52, 25, 4 }, { 24, 6, 0, 5 }, { 6, 37, 13, 4 }, { 14, 50, 7, 0 } };
        }
        else if (inputBulan == 6)//jumadil akhir
        {
            syahr = new int[][] { { 34, 27, 24, 5 }, { 2, 27, 24, 5 }, { 20, 13, 22, 5 }, { 11, 30, 2, 5 }, { 22, 22, 9, 0 } };
        }
        else if (inputBulan == 7)//rojab
        {
            syahr = new int[][] { { 44, 1, 24, 6 }, { 8, 1, 24, 6 }, { 51, 30, 27, 6 }, { 10, 27, 4, 6 }, { 42, 57, 10, 0 } };
        }
        else if (inputBulan == 8)//syaban
        {
            syahr = new int[][] { { 46, 36, 22, 7 }, { 4, 36, 22, 7 }, { 46, 37, 19, 7 }, { 14, 20, 23, 6 }, { 51, 29, 12, 0 } };
        }
        else if (inputBulan == 9)//romadhon
        {
            syahr = new int[][] { { 56, 10, 22, 8 }, { 8, 60, 32, 8 }, { 17, 55, 24, 5 }, { 13, 17, 25, 7 }, { 10, 5, 14, 0 } };
        }
        else if (inputBulan == 10)//syawal
        {
            syahr = new int[][] { { 57, 45, 20, 9 }, { 4, 45, 20, 9 }, { 13, 2, 17, 9 }, { 18, 10, 14, 8 }, { 18, 37, 15, 0 } };
        }
        else if (inputBulan == 11)//dzul qo'dah
        {
            syahr = new int[][] { { 7, 20, 20, 10 }, { 9, 19, 20, 10 }, { 44, 19, 22, 10 }, { 7, 7, 16, 9 }, { 37, 12, 17, 0 } };
        }
        else if (inputBulan == 12)//dzul hijjah
        {
            syahr = new int[][] { { 9, 55, 18, 11 }, { 5, 54, 18, 11 }, { 40, 26, 14, 11 }, { 22, 0, 5, 10 }, { 46, 44, 18, 0 } };
        }
        else
        {
            syahr = null;
        }
        return syahr;
    }

}
