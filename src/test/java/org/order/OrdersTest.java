package org.order;

import org.baseclasses.Base;
import org.testng.annotations.Test;
import org.wsi.data.order.OrderData;
import org.wsi.datahelper.orderhelper.OrderHelper;

import static org.testng.AssertJUnit.assertTrue;

public class OrdersTest extends Base {
    @Test(dataProvider = "orderData-provider", dataProviderClass = OrderHelper.class)
    public void testDCOrderSingleLine(OrderData orderData){
        assertTrue(true);
        System.out.println("testDCOrderSingleLine methods is executed successfully.");
        System.out.println(orderData.getOrderNo());
        //Create the Item with av available inventory


    }
}
