package AirlineResrvation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineTest {

    Airline airline;
    Seat seat;
    Passeger passeger;
    @BeforeEach
    void setUp() {
        seat = new Seat();
        passeger = new Passeger();
        airline = new Airline();
    }

    @AfterEach
    void tearDown() {
        seat = null;
        passeger = null;
    }

    @Test
    void testSeatCanSetTypeOfSeats(){
        seat.setSeatType(SeatType.FIRSTCLASS);
        assertEquals(SeatType.FIRSTCLASS, seat.getSeatType());

        seat.setSeatType(SeatType.ECONOMYCLASS);
        assertEquals(SeatType.ECONOMYCLASS, seat.getSeatType());

           }

    @Test
    void testAllSeatsOnAirplaineAreEmpty(){
        Seat[][] seats = airline.getSeats();
        for(Seat[] seat : seats){
            for(Seat seat1 : seat){
                assertNull(seat1);
            }
        }

    }

    @Test
    void testAssignFirst_15_SeatsAsFirstClassSeats(){
//        airline.setFirstClassSeats();
        airline.assign_15_SeatsAsFirstClassSeats(seat);
        Seat[][] seats = airline.getSeats();

        for(int i = 0; i < 2; i++);


    }

    @Test
    void testAssignFirst_25_SeatsAsBusinessClassSeats(){
//        airline.setClassSeats();
        airline.assign_15_SeatsAsEconomyClassSeats(seat);
        Seat[][] seats = airline.getSeats();

        for(int i = 1; i < 3; i++);

    }

//    @Test
//    void testAssignFirst_10_SeatsAsEconomyClassSeats(){
//        //        airline.setClassSeats();
//        airline.assign_25_SeatsAsEconomyClassSeats(seat);
//        Seat[][] seats = airline.getSeats();
//
//        for(int i = 3; i < 4; i++);
//
//    }
}