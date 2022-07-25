package org.wsi.dataprovider.orderdataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wsi.data.order.OrderData;
import org.wsi.utility.excel.DataFromExcel;
import java.io.IOException;
import java.util.ArrayList;

public class OrderDataProvider {



    private static ArrayList<OrderData> getOrderDataFromExcel() throws IOException {

        String filePath= System.getProperty("user.dir") + "/src/testdata/orderTestData.xlsx";

        Object[][] excelData = DataFromExcel.ReadDataFromExcel(filePath,"orderData");

        System.out.println(excelData[0][1].toString());

        ArrayList<OrderData> orderDataList=new ArrayList<>();

        for (Object[] excelDatum : excelData) {
            OrderData data=new OrderData();
            for (int i = 0; i < excelDatum.length; i++) {

                if(i==0) data.setOrderNo(excelDatum[i].toString());
                if(i==1) data.setOrderHeaderKey(excelDatum[i].toString());
                if(i==2) data.setBillToKey(excelDatum[i].toString());
                if(i==3) data.setShipToKey(excelDatum[i].toString());
                //System.out.println("Read values from excel : " + data.getOrderNo() );
            }
            orderDataList.add(data);
        }
        return orderDataList;
    }
    @DataProvider(name = "orderData-provider")
    public static Object[][] orderData() throws IOException {
        ArrayList<OrderData> orderData= getOrderDataFromExcel();
        Object[][] testData=new Object[orderData.size()][];
        for (int i = 0; i < orderData.size(); i++) {
            testData[i] = new Object[]{orderData.get(i)};
        }
        return testData;

    }

}

