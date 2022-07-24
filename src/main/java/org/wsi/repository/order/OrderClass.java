package org.wsi.repository.order;

import java.util.ArrayList;
import java.util.List;

public class OrderClass {
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

    public OrderClass(String orderNo, String orderHeaderKey, String billToKey, String shipToKey){
        this.setOrderNo(orderNo);
        this.setOrderHeaderKey(orderHeaderKey);
        this.setBillToKey(billToKey);
        this.setShipToKey(shipToKey);
    }

    public List<OrderClass> getOrderList(){
        //int OrderClass;
        return new ArrayList<OrderClass>();
    }


}
