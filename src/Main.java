import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    private static Random RANDOM = new Random();

    public static void main(String[] args) throws ProductException {

        Product bamamas = new Product("Банан",89.90,0.5);
        System.out.println(bamamas);
        Product nail = new Product("Деревянные гвозди", 820,3.0);
        System.out.println(nail);
        Product rice = new Product("Рис",119.99,10.5);
        System.out.println(rice);
        Product sand = new Product("Песок строительный",6, 4500.0);
        System.out.println(sand);
        Set<Product> productS = new HashSet<>();
        productS.add(bamamas);
        productS.add(nail);
        System.out.println("======================================================");
        productS.toString();
        productS.remove(bamamas);
        productS.toString();
        RecipesService trade = new RecipesService();
        Product mayonese = new Product("Майонез",96.50,1.0 );
        productS.add(mayonese);
        Recipes fireNeil = new Recipes("Жаренные гвозди",48.99,productS);
        trade.add(fireNeil);
        System.out.println(trade);
        //Задача № 3
        Set<Integer> number = new HashSet<>();
        Set<Integer> numberRemuve = new HashSet<>();
        for (int i=1; i <=20;i++){
            number.add(RANDOM.nextInt(1001));
        }
        for (Integer number1: number) {
            if (!(number1 % 2 == 0)){
            numberRemuve.add(number1);
            } else {
                System.out.print(number1+" ");
            }
        }
        for (Integer number1: numberRemuve) {
            number.remove(number1);


        }








    }
}