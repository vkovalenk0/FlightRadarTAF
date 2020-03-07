package com.epam.mentorship;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private DriverManager() {

    }

//    public static WebDriver getDriver() {
//
//    }

    public static void close() {
        driver.get().quit();
        driver.remove();
    }

    public static void main(String[] args) {

    }
}
