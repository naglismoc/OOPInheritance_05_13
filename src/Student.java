public class Student extends Citizen{
    private String university;
    private String studiesSubject;

    public Student() {
    }

    public Student(String name, String surname, String birthDate, String citizenship, String nationality, String personalCode, String university, String studiesSubject) {
        super(name, surname, birthDate, citizenship, nationality, personalCode);
        this.university = university;
        this.studiesSubject = studiesSubject;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudiesSubject() {
        return studiesSubject;
    }

    public void setStudiesSubject(String studiesSubject) {
        this.studiesSubject = studiesSubject;
    }

    @Override
    public void introduce() {
        System.out.println("hi, I am a person.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", studiesSubject='" + studiesSubject + "\', " +
                 super.toString() + "}";
    }
}
