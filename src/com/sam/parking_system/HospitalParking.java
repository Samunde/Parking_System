package com.sam.parking_system;

public class HospitalParking implements ParkingSystem{
    double ticketFee;
    int time;
    double surCharge=0.20;
    HospitalParking(int time){
        this.time=time;
    }
    @Override
    public double processTicket() {

        if((time>=5)&&(time<=17)){
            ticketFee=MORNING+(MORNING*surCharge);
        }else if((time>17)&&(time<=24)){
            ticketFee=NIGHTLY+(NIGHTLY*surCharge);
        }else if((time>=1)&&(time<5)){
            ticketFee=TWENTY_FOUR+(TWENTY_FOUR*surCharge);
        }else{
            System.out.println("Time should be between 1 and 24");
        }
        System.out.println("Price for Hospital parking is $ "+ticketFee);
        return ticketFee;
    }
}
