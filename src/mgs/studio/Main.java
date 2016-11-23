package mgs.studio;

import mgs.studio.Count.bukdulMutlaq;
import mgs.studio.Harokat.Ayyam;
import mgs.studio.Harokat.Mabsutoh;
import mgs.studio.Harokat.Majmu;
import mgs.studio.Harokat.Syahr;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int tahun;
    public static int bulan;
    public static int ayyam;
    public static int saah;
    public static int daqiqoh;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    }
    public static int getValue(String input, int batasAwal , int batasAkhir){
        Scanner read = new Scanner(System.in);
        while (true){
            System.out.println(input);
            String dataInput = read.next();
            int inputParse = Integer.parseInt(dataInput);
            if (inputParse >= batasAwal && inputParse <= batasAkhir){

            }
        }
    }
}
