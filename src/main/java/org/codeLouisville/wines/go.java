package org.codeLouisville.wines;

public class go {
    public static void main(String[] args) {
        CSVreader red=new CSVreader("winequality-red.csv");
        CSVreader white=new CSVreader("winequality-white.csv");

        for (wineBean w: white.getData()){
            System.out.println(w);
        }
    }
}
