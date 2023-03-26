package Tugas1;
import java.time.LocalDate;

public class Niece {
    private String name;
    private LocalDate birthday;

    public Niece(String name, int day, int month) {
        this.name = name;
        this.birthday = LocalDate.of(LocalDate.now().getYear(), month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}