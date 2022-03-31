package com.example.slutprojekt.model;

public class OrderBean {
    //OrderDate,Region,Rep1,Rep2,Item,Units,UnitCost,Total
    String OrderDate = "";
    String Region = "";
    String Rep1 = "";
    String Rep2 = "";
    String Item = "";
    String Units = "";
    String UnitCost = "";
    String Total = "";
    
    public OrderBean() {
        
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getRep1() {
        return Rep1;
    }

    public void setRep1(String rep1) {
        Rep1 = rep1;
    }

    public String getRep2() {
        return Rep2;
    }

    public void setRep2(String rep2) {
        Rep2 = rep2;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public String getUnits() {
        return Units;
    }

    public void setUnits(String units) {
        Units = units;
    }

    public String getUnitCost() {
        return UnitCost;
    }

    public void setUnitCost(String unitCost) {
        UnitCost = unitCost;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    
}
