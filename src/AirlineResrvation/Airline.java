package AirlineResrvation;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private Seat[][] seats = new Seat[4][10];
    private List<Passeger> waitinglist = new ArrayList<>();


    public Seat[][] getSeats() {
        return seats;
    }
    public void assign_15_SeatsAsFirstClassSeats(Seat seat){//assign 15 seats as first class seats on the airplane
        seat.setSeatType(SeatType.FIRSTCLASS);
        for(int i = 0; i < 2; i++){//loop@ down the row
            for(int j = 0; j < 10; j++){
                if(i < 1){
                    seats[i][j] = seat;
                }else if(i == 1 && j < 5){
                    seats[i][j] = seat;
                }else{
                    break;
                }

            }
        }

    }

    public void assign_15_SeatsAsEconomyClassSeats(Seat seat) {
        seat.setSeatType(SeatType.ECONOMYCLASS);
        for (int i = 1; i < 4; i++) {
            for (int j = 5; j < 10; j++){
                if (i == 5){
                    seats[i][j] = seat;
                }else if(i == 1 && j < 5){
                    seats[i][j] = seat;
                }else {
                break;
                }
            }
        }

        }



//    public void assign_10_SeatsAsEconomyClassSeats(Seat seat) {
//        seat.setSeatType(SeatType.ECONOMYCLASS);
//        for (int i = 3; i < 4; i++) {
//            for (int j = 3; j < 10 ; j++) {
//                if(i < 3){
//                    seats[i][j] = seat;
////                }else if(i == 1 && j < 5){
////                    seats[i][j] = seat;
//                }else{
//                    break;
//                }
//
//            }
//
//        }
//    }
}
