package org.wsi.dataprovider.itemdataprovider;

import org.testng.annotations.DataProvider;
import org.wsi.data.item.ItemData;
import org.wsi.data.order.OrderData;
import org.wsi.utility.excel.DataFromExcel;

import java.io.IOException;
import java.util.ArrayList;

public class ItemDataProvider {

    public static ArrayList<ItemData> getItemDataFromExcel() throws IOException {

        String filePath = System.getProperty("user.dir") + "/src/testdata/Item/itemTestData.xlsx";

        Object[][] excelData = DataFromExcel.ReadDataFromExcel(filePath, "itemData");

        ArrayList<ItemData> dataList = new ArrayList<>();

        for (Object[] excelDatum : excelData) {
            ItemData data = new ItemData();
            for (int i = 0; i < excelDatum.length; i++) {

                if (i == 0) data.setItemId(excelDatum[i].toString());
                if (i == 1) data.setOrganizationCode(excelDatum[i].toString());
                if (i == 2) data.setProductLine(excelDatum[i].toString());

            }
            dataList.add(data);
        }
        return dataList;
    }

    @DataProvider(name = "itemData-provider")
    public Object[][] itemData() throws IOException {
        ArrayList<ItemData> itemData= getItemDataFromExcel();
        Object[][] testData=new Object[itemData.size()][];
        for (int i = 0; i < itemData.size(); i++) {
            testData[i] = new Object[]{itemData.get(i)};
        }
        return testData;

    }

}
