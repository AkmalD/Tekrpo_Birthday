package Tugas1;
public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        {
            // Add some nieces
            family.addNiece("Alice", 1, 1);
            family.addNiece("Bob", 2, 2);
            family.addNiece("Charlie", 3, 3);

            // Add some uncles
            family.addUncle("Dave");
            family.addUncle("Eve");

            // Add some presents
            Uncle dave = family.findUncle("Dave");
            Uncle eve = family.findUncle("Eve");
            Niece alice = family.findNiece("Alice");
            Niece bob = family.findNiece("Bob");
            Niece charlie = family.findNiece("Charlie");

            dave.addPresent(alice, "Teddy bear");
            dave.addPresent(bob, "Toy car");
            eve.addPresent(alice, "Doll");
            eve.addPresent(charlie, "Puzzle");

            // List the nieces and uncles
            family.listNieces();
            family.listUncles();

            // List the presents for each uncle
            dave.listPresents();
            eve.listPresents();
        }
    }
}
