package assigment1.assigment1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(123,"skirt",11.5,1);
        Product product2 = new Product(124,"t-shirt",22.5,1);
        Product product3 = new Product(125,"blouse",33.5,1);
        Product product4 = new Product(126,"blouse",11.5,1);
        Product product5 = new Product(127,"blouse",22.5,1);
        Product product6 = new Product(128,"blouse",33.5,1);



        ShoppingCart shoppingCart= new ShoppingCart();
        shoppingCart.addProductToCart(product1);
        shoppingCart.addProductToCart(product2);
        shoppingCart.addProductToCart(product3);
        shoppingCart.addProductToCart(product4);
        shoppingCart.addProductToCart(product5);
        shoppingCart.addProductToCart(product6);

        shoppingCart.displayCartContent();
        shoppingCart.calculateTotalCost();
    }

}
