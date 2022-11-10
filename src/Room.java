public class Room {
    //Atributy třídy Room
    private int numberOfRoom;
    private int numberOfBeds;
    private boolean isBalcony;
    private boolean isViewSea;
    private int pricePerNight;

    //Konstruktor třídy Room s parametry
    public Room(int numberOfRoom, int numberOfBeds, boolean isBalcony, boolean isViewSea, int pricePerNight) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.isViewSea = isViewSea;
        this.pricePerNight = pricePerNight;
    }

    //region Getters and Setters

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isViewSea() {
        return isViewSea;
    }

    public void setViewSea(boolean viewSea) {
        isViewSea = viewSea;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    //endregion

    //Metoda vypíše textový popis jednotlivých ppokojů
    public void getDescription(){
        System.out.println("Číslo pokoje: "+getNumberOfRoom()+" Počet postelí: "+getNumberOfBeds()+" Balkón: "+isBalcony()+" Výhled na moře: "+isViewSea()+" Cena za noc: "+getPricePerNight()+" Kč");
    }
}
