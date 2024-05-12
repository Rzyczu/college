import People.Professor;

public class Subject {
    public String Name;
    public int Hours;
    public Professor Lecturer;

    public Subject(String name, int hours, Professor lecturer) {
        Name = name;
        Hours = hours;
        Lecturer = lecturer;
    }

    //todo poprawić
    public String getInfo() {
        return "name: " + Name + ", hours: " + Hours + ", lecturer: " + Lecturer;
    }

    public void changeHoursNumber(int hours) {
        Hours = hours;
    }

    public void changeLecturer(Professor lecturer) {
        Lecturer = lecturer;
    }

}
