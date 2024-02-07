package HW;

import java.io.IOException;
import java.util.Scanner;
import HW.Data;
import HW.EmptyStringException;
import HW.ArrayCountElementException;
import HW.IncorrectValueException;

public class Main {
    public static void main(String[] args) {
        try {
            Data.getData();
        } catch (EmptyStringException | ArrayCountElementException | IncorrectValueException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

