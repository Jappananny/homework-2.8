

import lombok.Getter;
import lombok.Setter;
import java.util.Objects;
import java.util.Set;
@Getter
@Setter
public class Passport {
    private Set<String> passportNumber;
    private String firstName;
    private String secondName;
    private String lastName;
    private final String yearOfBird;

    public Passport(Set<String> passportNumber, String firstName, String secondName,String lastName,
                    String yearOfBird) {
        this.passportNumber = passportNumber;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.yearOfBird = yearOfBird;
        if (firstName.length() ==0 || firstName == null ) {
            throw new RuntimeException("Введите имя");
        }
        if (secondName.length() ==0 || secondName == null) {
            throw new RuntimeException("введите фамилию");
        }
        if (lastName.length() ==0 || secondName == null) {
            throw new RuntimeException("введите фамилию");
        }
        if (yearOfBird.length() == 0 || yearOfBird == null) {
            throw new RuntimeException("Введите дату рождения");
        }
    }
    public boolean checkNumber(String s) {
        return passportNumber.contains(s);
    }
    public static Object find(Set<Passport> passportNumber, String number) {
        for (Passport passportNumbers: passportNumber) {
            if (passportNumbers.checkNumber(number)) {
                return passportNumbers;
            }
        }
        return "Такого паспорта нет";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportNumber, passport.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }
    @Override
    public String toString() {
        return "Номер паспорта: " + passportNumber +
                ", Имя: " + firstName +
                ", Отчество: " + secondName +
                ", Фамилия: " + lastName +
                ", Дата рождения: " + yearOfBird;
    }
}


