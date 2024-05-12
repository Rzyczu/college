import People.Professor;

public class Subject {
    private String Name;
    private int Hours;
    private Professor Lecturer;

    public Subject(String name, int hours, Professor lecturer) {
        Name = name;
        Hours = hours;
        Lecturer = lecturer;
    }

    public String getName() {
        return Name;
    }

    public int getHours() {
        return Hours;
    }

    public Professor getLecturer() {
        return Lecturer;
    }

    public String getInfo() {
        return "Name: " + Name + ", Hours: " + Hours + ", Lecturer: " + Lecturer.getName();
    }

    public void changeHoursNumber(int hours) {
        Hours = hours;
    }

    public void changeLecturer(Professor lecturer) {
        Lecturer = lecturer;
    }
}
