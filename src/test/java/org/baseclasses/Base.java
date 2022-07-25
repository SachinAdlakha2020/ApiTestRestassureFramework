package org.baseclasses;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
    @BeforeTest
    public static void setup(){
        System.out.println("Calling setup methods");
    }

    @AfterTest
    public static void tearDown(){
        System.out.println("Calling teardown methods");
    }

}
