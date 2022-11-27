import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    private static Random RANDOM = new Random();
    public static void main(String[] args) throws ProductException {
        Product bananas = new Product("Банан",89.90,0.5);
        System.out.println(bananas);
        Product nail = new Product("Деревянные гвозди", 820,3.0);
        System.out.println(nail);
        Product rice = new Product("Рис",119.99,10.5);
        System.out.println(rice);
        Product sand = new Product("Песок строительный",6, 4500.0);
        System.out.println(sand);
        Product mayonese = new Product("Майонез",96.50,1.0 );
        System.out.println(mayonese);
        ProductServise allProducts = new ProductServise();
        allProducts.add(bananas);
        allProducts.add(nail);
        allProducts.add(mayonese);
        System.out.println("======================================================");
        RecipesService trade = new RecipesService();
        Recipes fireNeil = new Recipes("Жаренные гвозди",48.99,allProducts);
        trade.add(fireNeil);
        System.out.println(fireNeil);
        System.out.println("======================================================");
        //Задача 3
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


        System.out.println("======================================================");
        Number num1 = new Number(2, 2);
        Number num2 = new Number(2, 3);
        Number num3 = new Number(2, 4);
        Number num4 = new Number(2, 5);
        Number num5 = new Number(2, 6);
        Number num6 = new Number(2, 7);
        Number num7 = new Number(2, 8);
        Number num8 = new Number(2, 9);
        Number num9 = new Number(3, 3);
        Number num10 = new Number(4, 4);
        Number num11 = new Number(5, 5);
        Number num12 = new Number(6, 6);
        Number num13 = new Number(7, 7);
        Number num14 = new Number(8, 8);
        Number num15 = new Number(9, 9);

        Set<Number> numberSet = new HashSet<>();

        numberSet.add(num1);
        numberSet.add(num2);
        numberSet.add(num3);
        numberSet.add(num4);
        numberSet.add(num5);
        numberSet.add(num6);
        numberSet.add(num7);
        numberSet.add(num8);
        numberSet.add(num9);
        numberSet.add(num11);
        numberSet.add(num12);
        numberSet.add(num13);
        numberSet.add(num14);
        numberSet.add(num15);

        Iterator itr = numberSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("======================================================");









    }
}