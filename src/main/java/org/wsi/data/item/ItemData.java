package org.wsi.data.item;

import org.testng.annotations.DataProvider;

public class ItemData {
    protected String itemId;
    protected String organizationCode;
    protected String productLine;

    public ItemData() {

    }

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


}
