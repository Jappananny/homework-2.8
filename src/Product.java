import lombok.Getter;
import lombok.Setter;
import java.util.Objects;


@Getter
@Setter
public class Product {
    private String name;
    private double priceForKillo;
    private double killo;
    private double allcost;
    private boolean buy;


    public Product(String name,double priceForKillo, double killo) throws ProductException {
        if (name.length() == 0 || name == null)
            throw new ProductException("Что за продукт ?");
        else {
            this.name = name;
        }
        this.priceForKillo = priceForKillo;
        this.killo = killo;
        this.allcost = priceForKillo * killo;
    }
    public void checkBuy(){
        this.buy = true;
    }
    public void buy() {
        buy = true;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        return "Продукт " + name + ", стоит " + priceForKillo + " руб. за киллограмм и весит "
                + killo + " кг. общая стоимость " + allcost + " руб.";
    }
}
