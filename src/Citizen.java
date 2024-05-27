public class Citizen extends Person{
    private String citizenship;
    private String nationality;
    private String personalCode;

    public Citizen() {
    }

    public Citizen(String name, String surname, String birthDate, String citizenship, String nationality, String personalCode) {
        super(name, surname, birthDate);
        this.citizenship = citizenship;
        this.nationality = nationality;
        this.personalCode = personalCode;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    @Override
    public void introduce() {
        System.out.println("hi, I am a citizen.");
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "citizenship='" + citizenship + '\'' +
                ", nationality='" + nationality + '\'' +
                ", personalCode='" + personalCode  + "\', " +
                super.toString() +  "}";
    }
}
