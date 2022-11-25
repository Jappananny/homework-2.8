import javax.swing.*;

public class Main {
    public static void main(String[] args) throws ProductException {

        Product bamamas = new Product("Банан",89.90,0.5);
        System.out.println(bamamas);
        Product nail = new Product("Деревянные гвозди", 820,3.0);
        System.out.println(nail);
        Product rice = new Product("Рис",119.99,10.5);
        System.out.println(rice);
        Product sand = new Product("Песок строительный",6, 4500.0);
        System.out.println(sand);
        ProductS productS = new ProductS();
        productS.add(bamamas);
        productS.add(nail);
        System.out.println("======================================================");
        productS.toString();
        productS.remove(bamamas);
        productS.toString();


    }
}