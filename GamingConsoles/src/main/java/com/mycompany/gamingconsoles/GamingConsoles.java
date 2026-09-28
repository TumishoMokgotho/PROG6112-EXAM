/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gamingconsoles;

import java.util.Arrays;

/**
 *
 * @author tumim
 */
public class GamingConsoles {

    public static void main(String[] args) {

        int[][] sales = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};
        String[] gamingConsole = {"ps5", "xbox", "switch"};
        String[] stores = {"Cape Town", "Port Elizabeth", "Pretoria"};

        int[] storeTotal = new int[sales.length];

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                storeTotal[row] += sales[row][col];
            }
        }
        int[] categoryTotal = new int[sales[0].length];

        for (int row = 0; row < sales.length; row++);
        {
            int row = 0;
            for (int col = 0; col < sales[row].length; col++);
            {
                int col = 0;
                categoryTotal[col] += sales[row][col];
            }
        }
        int grandTotal = 0;
        for (int total : storeTotal) {
            grandTotal += total;
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("Gaming Console Report");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(stores);

        //Manual sorting
        int[] rankedTotal = storeTotal.clone();
        String[] rankedStore = stores.clone();

        for (int i = 0; i < rankedTotal.length - 1; i++) {
            for (int j = 0; j < rankedTotal.length - 1 - i; j++) {
                if (rankedTotal[j] < rankedTotal[j + 1]) {
                    //Swap Totals
                    int temp = rankedTotal[j];
                    rankedTotal[j] = rankedTotal[j + 1];
                    rankedTotal[j + 1] = temp;
                    //Swap store names
                    String tempStore = rankedStore[j];
                    rankedStore[j] = rankedStore[j + 1];
                    rankedStore[j + 1] = tempStore;
                }
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("Console Sales Totals For Each City");
        System.out.println("---------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < rankedStore.length; i++) {
            System.out.println((i + 1) + ". " + rankedStore[i] + " " + rankedTotal[i]);
        }
        int highestIndex = 0;

        for (int i = 1; i < storeTotal.length; i++) {
            if (storeTotal[i] > storeTotal[highestIndex]) {
                highestIndex = i;
            }
        }
        System.out.println("City with the highest sales:" + stores[highestIndex] + "( " + storeTotal[highestIndex] + ")");
        System.out.println("---------------------------------------------------------------------------------------------------------");
    }
}
