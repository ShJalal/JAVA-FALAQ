package mgs.studio.Harokat;

public class Ayyam {
    public static int[][] FindingAyyam(int inputayyam){
         int[][] ayyam;
        if (inputayyam == 28)
        {
            ayyam = new int[][]{ { 53, 35, 27, 0 }, { 48, 35, 27, 0 }, { 21, 56, 8, 0 }, { 11, 49, 5, 0 }, { 58, 28, 1, 0 } };
        }
        else if (inputayyam == 29)
        {
            ayyam = new int[][]{ { 2, 35, 28, 0 }, { 57, 34, 28, 0 }, { 56, 6, 22, 0 }, { 5, 53, 18, 0 }, { 9, 32, 1, 0 } };
        }
        else if (inputayyam == 30)
        {
            ayyam = new int[][]{ { 10, 34, 29, 0 }, { 5, 34, 29, 0 }, { 31, 17, 5, 1 }, { 59, 56, 1, 1 }, { 19, 35, 1, 0 } };
        }
        else
        {
            ayyam = null;
        }
        return ayyam;

    }
}
