public class Main {
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












    }
}