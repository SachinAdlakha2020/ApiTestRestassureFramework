package org.wsi.dataprovider.itemdataprovider;

import org.testng.annotations.DataProvider;
import org.wsi.data.item.ItemData;
import org.wsi.data.order.OrderData;
import org.wsi.utility.excel.DataFromExcel;

import java.io.IOException;
import java.util.ArrayList;

public class ItemDataProvider {

    private static ArrayList<ItemData> getItemDataFromExcel() throws IOException {

        String filePath= System.getProperty("user.dir") + "/src/testdata/Item/itemTestData.xlsx";

        Object[][] excelData = DataFromExcel.ReadDataFromExcel(filePath,"itemData");

        ArrayList<ItemData> dataList=new ArrayList<>();

        for (Object[] excelDatum : excelData) {
            ItemData data=new ItemData();
            for (int i = 0; i < excelDatum.length; i++) {

                if(i==0) data.setItemId(excelDatum[i].toString());
                if(i==1) data.setOrganizationCode(excelDatum[i].toString());
                if(i==2) data.setProductLine(excelDatum[i].toString());

            }
            dataList.add(data);
        }
        return dataList;
    }


    @DataProvider(name = "itemData-provider")
    public Object[][] itemData(){
        //return new Object[][]{{"Scenario"}};
        return new Object[][]{
                {new ItemData("3900210","WS","CMO")},
                {new ItemData("3900211","WS","CMO")},
                {new ItemData("3900212","WS","CMO")},
        };

    }

}
