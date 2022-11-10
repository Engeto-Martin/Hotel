import java.time.LocalDate;
import java.util.List;

public class Booking {
    //Atributy tříd Booking
    private Room room;

    private List<Guest> allGuests;
    private String typeOfVacation;
    private LocalDate startVacation;
    private LocalDate endVacation;

    //Konstruktor třídy Booking s parametry
     public Booking(Room room, List<Guest> allGuests, String typeOfVacation, LocalDate startVacation, LocalDate endVacation) {
        this.room = room;
        this.allGuests = allGuests;
        this.typeOfVacation = typeOfVacation;
        this.startVacation = startVacation;
        this.endVacation = endVacation;
    }

    //region Getters and Setters
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }



    public List<Guest> getAllGuests() {
        return allGuests;
    }

    public void setAllGuests(List<Guest> allGuests) {
        this.allGuests = allGuests;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public LocalDate getStartVacation() {
        return startVacation;
    }

    public void setStartVacation(LocalDate startVacation) {
        this.startVacation = startVacation;
    }

    public LocalDate getEndVacation() {
        return endVacation;
    }

    public void setEndVacation(LocalDate endVacation) {
        this.endVacation = endVacation;
    }
    //endregion Getters and Setters

    //Metoda vypisuje rezervace
    public void  getDescription(){
        if (allGuests.isEmpty()||startVacation.isAfter(endVacation)){
            System.out.println("Nelze vytvořit rezeravci. Prosím zkontrolujte zda je správně vyplněné datum pobytu a zda je k rezervaci přidělen host.");
        }
        else {
            for (Guest allGuest : allGuests) {
                System.out.println("Pokoj čílso " + room.getNumberOfRoom() + " má zarezervovaný " + allGuest.getFirstName() + " " + allGuest.getLastName() + " jako " + getTypeOfVacation() + " pobyt " + " od: " + getStartVacation() + " do: " + getEndVacation());
            }
        }
    }

}
