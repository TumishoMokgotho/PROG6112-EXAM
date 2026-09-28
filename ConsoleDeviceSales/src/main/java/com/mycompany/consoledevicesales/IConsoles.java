/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoledevicesales;

/**
 *
 * @author tumim
 */
abstract class Consoles {

    private String deviceType;
    private String storeName;
    private int totalSales;

    public Consoles(String deviceType, String storeName, int totalSales) {
        this.deviceType = deviceType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getStoreName() {
        return storeName;
    }

    public int getTotalSales() {
        return totalSales;
    }

}

public interface IConsoles {

    String getConsoleType();

    String getStore();

    int getTotalSales();
}
