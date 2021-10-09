package splander;
import java.util.*;

public class Chip {
    private int chip;
    private String color;
    Scanner scan = new Scanner(System.in);

    public Chip() {
    }

    public Chip(int chip, String color) {
        this.chip = chip;
        this.color = color;
    }

    public int getChip() {
        return this.chip;
    }

    public String getColor() {
        return this.color;
    }


}

