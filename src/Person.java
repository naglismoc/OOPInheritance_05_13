public class Person extends Object implements IHobbies{
    private String name;
    private String surname;
    private String birthDate;
    private String[] hobbies;

    public Person() {
    }

    public Person(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public void introduce(){
        System.out.println("hi, I am a person.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    @Override
    public void listHobies() {
        for (String hobby: hobbies) {
            System.out.println(hobby);
        }
    }

    @Override
    public String returnHobby(int pos) {
        if(hobbies.length > pos && pos >= 0) {
            return hobbies[pos];
        }else{
            return "";
        }
    }
}
