package org.order;

import org.baseclasses.Base;
import org.testng.annotations.Test;
import org.wsi.data.order.OrderData;
import org.wsi.dataprovider.orderdataprovider.OrderDataProvider;
import org.wsi.utility.restapihelper.GetApiHelper;

import static org.testng.AssertJUnit.assertTrue;

public class OrdersTest extends Base {
    @Test(dataProvider = "orderData-provider", dataProviderClass = OrderDataProvider.class)
    public void testDCOrderSingleLine(OrderData orderData){
        assertTrue(true);
        System.out.println("testDCOrderSingleLine methods is executed successfully.");
        System.out.println(orderData.getOrderNo() + " : " + orderData.getBillToKey());
        //Create the Item with av available inventory
        GetApiHelper.postRequest();

        //Create the item


    }
}
