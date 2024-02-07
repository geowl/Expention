package HW;

public class Check {
    public static void checkDateFormat(String date) throws IncorrectValueException {
        char[] checkData = date.toCharArray();
        if (checkData.length == 10 && (checkData[2] == '.' && checkData[5] == '.')) {
        } else {
            throw new IncorrectValueException("Неверный формат даты. Правильный формат: dd.mm.yyyy");
        }
    }

    public static void checkPhoneNumberFormat(String phoneNumber) throws IncorrectValueException {
        try {
            Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            throw new IncorrectValueException("Неверный формат номера телефона. Правильный формат: 111222334455");
        }
    }

    public static void checkGenderFormat(String gender) throws IncorrectValueException {
        if (gender.length() != 1 || (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f"))) {
            throw new IncorrectValueException("Неверный формат пола. Правильный формат: m или f");
        }
    }
}
