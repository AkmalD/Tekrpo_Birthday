package Tugas1;
import java.util.HashMap;
import java.util.Map;

public class Uncle {
    private String name;
    private Map<Niece, String> presents = new HashMap<>();

    public Uncle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String present) {
        // Check if the niece has already received a present from this uncle
        if (presents.containsKey(recipient)) {
            return false;
        }
        // Add the present to the list
        presents.put(recipient, present);
        return true;
    }

    public void listPresents() {
        System.out.println("List of presents from " + name + ":");
        for (Map.Entry<Niece, String> entry : presents.entrySet()) {
            Niece niece = entry.getKey();
            String present = entry.getValue();
            System.out.println("- " + niece.getName() + " received " + present);
        }
    }
}