package com.company;

public class Two_DArrayPrinting {
    public static void main(String[] args) {
        int[][] flats ={{101,102,103,104},{201,202,202}};
        for (int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.println(flats[i][j]);
            }
        }
    }
}
