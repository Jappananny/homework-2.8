import java.util.Objects;

public class Number {
    private final int number1;
    private final int number2;

    public Number(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return number1 == number.number1 && number2 == number.number2;
    }
    @Override
    public int hashCode() {
        return Objects.hash(number1, number2);
    }

    @Override
    public String toString() {
        return number1 + " * " + number2 + " = ? \n";
    }
}
