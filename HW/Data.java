package HW;
import java.io.IOException;
import java.util.Scanner;
import HW.Check;
import HW.EmptyStringException;
import HW.ArrayCountElementException;
import HW.IncorrectValueException;

public class Data {
    public static void getData() throws EmptyStringException, ArrayCountElementException, IncorrectValueException, IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в следующем порядке (латиницей):\n" +
                    "<Фамилия> <Имя> <Отчество> <Дата рождения> <Номер телефона> <Пол>\n" +
                    "Пример: Ivanov Ivan Ivanovich 01.01.1990 9000000000 m");
            String inputData = scanner.nextLine().trim();

            if (inputData.isEmpty()) {
                throw new EmptyStringException("Пустая строка ввода");
            }

            String[] bufferArray = inputData.split("\\s+");
            if (bufferArray.length != 6) {
                throw new ArrayCountElementException("Неправильное количество данных или отсутствует пробел между данными");
            }

            Check.checkDateFormat(bufferArray[3]);
            Check.checkPhoneNumberFormat(bufferArray[4]);
            Check.checkGenderFormat(bufferArray[5]);
            WriteData.createFile(bufferArray);
        }
    }
}
