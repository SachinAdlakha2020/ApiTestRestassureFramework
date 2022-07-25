package org.wsi.data.order;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class OrderData {
    //protected Brand brand;
    //protected List<? extends OrderLine> orderLines;
    protected String orderNo;
    protected String orderHeaderKey;
    protected String billToKey;
    protected String shipToKey;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderHeaderKey() {
        return orderHeaderKey;
    }

    public void setOrderHeaderKey(String orderHeaderKey) {
        this.orderHeaderKey = orderHeaderKey;
    }

    public String getBillToKey() {
        return billToKey;
    }

    public void setBillToKey(String billToKey) {
        this.billToKey = billToKey;
    }

    public String getShipToKey() {
        return shipToKey;
    }

    public void setShipToKey(String shipToKey) {
        this.shipToKey = shipToKey;
    }

    public OrderData(String orderNo, String orderHeaderKey, String billToKey, String shipToKey){
        this.setOrderNo(orderNo);
        this.setOrderHeaderKey(orderHeaderKey);
        this.setBillToKey(billToKey);
        this.setShipToKey(shipToKey);
    }

    public List<OrderData> getOrderList(){
        //int OrderClass;
        return new ArrayList<OrderData>();
    }


    @DataProvider(name = "orderData-provider")
    public Object[][] orderData(){
        //return new Object[][]{{"Scenario"}};
        return new Object[][]{
                {new OrderData("37898712789","202289218018098","Bill01","Bill01")},
                {new OrderData("47898712789","202289218018099","Bill02","Bill02")},
                {new OrderData("57898712789","202289218018100","Bill03","Bill03")}
        };

    }

}
