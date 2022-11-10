import java.time.LocalDate;
public class Guest {
    // Atributy třídy Guest;
    private String firstName;
    private String lastName;
    private LocalDate birthdate;

    //Konstruktor třídy Guest s parametry jméno, příjmené, datum narození
    public Guest(String firstName, String lastName, LocalDate birthdate)
    {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthdate = birthdate;
    }

    //region Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    //endregion Getters and Setters

    //Metoda vypíše textový popis hosta
    public void getDescription(){
        System.out.println(getFirstName()+" "+getLastName()+" "+" "+getBirthdate());
    }
}
