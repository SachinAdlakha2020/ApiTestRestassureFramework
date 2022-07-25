package org.wsi.data.item;

import org.testng.annotations.DataProvider;

public class ItemData {
    protected String itemId;
    protected String organizationCode;
    protected String productLine;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public ItemData(String itemId, String organizationCode, String productLine){
       this.setItemId(itemId);
       this.setOrganizationCode(organizationCode);
       this.setProductLine(productLine);
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
