package com.sam.parking_system;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HospitalParking hospitalParking=new HospitalParking(18);
        MallParking mallParking=new MallParking(18);
        hospitalParking.processTicket();
        mallParking.processTicket();
    }
}