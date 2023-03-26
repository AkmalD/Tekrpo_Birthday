package Tugas1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Family {
    private List<Niece> nieces = new ArrayList<>();
    private List<Uncle> uncles = new ArrayList<>();

    public boolean addNiece(String name, int day, int month) {
        // Check if a niece with the same name already exists
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return false;
            }
        }
        // Add the new niece to the list
        nieces.add(new Niece(name, day, month));
        // Sort the list of nieces by birthday
        Collections.sort(nieces, new Comparator<Niece>() {
            @Override
            public int compare(Niece n1, Niece n2) {
                if (n1.getBirthday().getMonth().compareTo(n2.getBirthday().getMonth()) != 0) {
                    return n1.getBirthday().getMonth().compareTo(n2.getBirthday().getMonth());
                } else {
                    return n1.getBirthday().getDayOfMonth() - n2.getBirthday().getDayOfMonth();
                }
            }
        });
        
        return true;
    }

    public boolean addUncle(String name) {
        // Check if an uncle with the same name already exists
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return false;
            }
        }
        // Add the new uncle to the list
        uncles.add(new Uncle(name));
        // Sort the list of uncles by name
        Collections.sort(uncles, new Comparator<Uncle>() {
            @Override
            public int compare(Uncle u1, Uncle u2) {
                return u1.getName().compareTo(u2.getName());
            }
        });
        return true;
    }

    public Niece findNiece(String name) {
        // Search for the niece with the given name
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return niece;
            }
        }
        return null;
    }

    public Uncle findUncle(String name) {
        // Search for the uncle with the given name
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return uncle;
            }
        }
        return null;
    }

    public void listNieces() {
        System.out.println("List of nieces (sorted by birthday):");
        for (Niece niece : nieces) {
            System.out.println("- " + niece.getName() + " (" + niece.getBirthday().toString() + ")");
        }
    }

    public void listUncles() {
        System.out.println("List of uncles (sorted by name):");
        for (Uncle uncle : uncles) {
            System.out.println("- " + uncle.getName());
        }
    }
}

