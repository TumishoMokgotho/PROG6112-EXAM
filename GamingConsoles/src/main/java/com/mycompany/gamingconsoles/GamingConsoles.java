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

        int[][] sales = {{1000, 2000, 3000}, {2000, 3000, 1200}, {1500, 1100, 1200}};
        String[] gamingConsole = {"ps5", "xbox", "switch"};
        String[] stores = {"Cape Town", "Port Elizabeth", "Pretoria"};

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                int[] storeTotals = new int[sales.length];
            }
        }
        int[] storeTotals = null;
                for (int row = 0; row < sales.length; row++) {
                    for (int col = 0; col < sales[row].length; col++) {
                        storeTotals[row] += sales[row][col];
                    }
                }
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("GAMING CONSOLE REPORT");
                System.out.println("----------------------------------------------------------------------------");
                System.out.println(Arrays.toString(sales));
                System.out.println("");

                int grandTotal = 0;
                for (int total : storeTotals) {
                    grandTotal += total;
                }

                System.out.println("----------------------------------------------------------------------------");
                System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
                System.out.println("----------------------------------------------------------------------------");
                System.out.println(stores);
                System.out.println(grandTotal);

                int maxIndex = 0;
                for (int i = 1; i < storeTotals.length; i++) {
                    if (storeTotals[i] > storeTotals[maxIndex]) {
                        maxIndex = i;
                    }
                }
                System.out.println("City with the most sales:" + maxIndex);
                System.out.println("----------------------------------------------------------------------------");
            }
        }
    
