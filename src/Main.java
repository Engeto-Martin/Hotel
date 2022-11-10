import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Guest> listOfGuests = new ArrayList<>();
        //Přidání všech hostů dp kolekce listOfGeusts
        Guest firstGuest = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest secondGuest = new Guest("Jan", "Dvořák", LocalDate.of(1995, 5, 5));
        listOfGuests.add(firstGuest);
        listOfGuests.add(secondGuest);

        //Výpis všech hostů
        System.out.println("Přehled všch hostů \n");
        for (Guest guest : listOfGuests) {
            guest.getDescription();
        }

        ArrayList<Room> listOfRooms = new ArrayList<>();
        //Vytvoření pokojů přidání pokojů do kolekce
        Room firstRoom = new Room(1,1,true,true,1000);
        Room secondRoom = new Room(2,1,true,true,1000);
        Room thirdRoom = new Room(3,3,false,true,2400);
        listOfRooms.add(firstRoom);
        listOfRooms.add(secondRoom);
        listOfRooms.add(thirdRoom);

        //Výpis všech hostů uložených v kolekci
        System.out.println("-------------- \nPřehled všech pokojů \n");
        for (Room rooms : listOfRooms) {
            rooms.getDescription();
        }

        ArrayList<Booking> listOfBooks = new ArrayList<>();
        //Vytvoření rezervací a přidání do kolekce
        Booking firstBooking = new Booking(firstRoom,List.of(firstGuest),"rekreační",LocalDate.of(2022,7,19),LocalDate.of(2022,7,26));
        Booking secondBooking = new Booking(thirdRoom,List.of(firstGuest,secondGuest),"rekreační",LocalDate.of(2022,9,1),LocalDate.of(2022,9,14));
        listOfBooks.add(firstBooking);
        listOfBooks.add(secondBooking);

        //Vypis všech rezervací
        System.out.println("-------------- \nPřehled všech rezervací \n");
        for (Booking bookings :listOfBooks){
            bookings.getDescription();
        }
    }
}