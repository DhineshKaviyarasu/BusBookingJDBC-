package com.Bus;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    Bus(int busNo, boolean ac, int capacity){
        this.ac=ac;
        this.busNo=busNo;
        this.capacity=capacity;
    }
    public void displaybusinfo(){
        System.out.println("BusNo-"+busNo+"-Ac-"+ac+"-Capacity-"+capacity);
    }

}