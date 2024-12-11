package assigment1.assigment1;

public class ShoppingCart {
    Product [] cartItems= new Product[5];
    int itemCount=0;


    public void addProductToCart(Product product) {
        if (product.price > 0) {


        if (itemCount < cartItems.length) {
            cartItems[itemCount] = product;
            itemCount++;
            System.out.println("the product is added to cart");
            System.out.println("number of items = " + itemCount);
            System.out.println(" ");

        } else {
            System.out.println("the cart is full");
            System.out.println("-----------");

        }
    }
        else {
            System.out.println("Error: Product price must be greater than zero.");
        }
    }

public void calculateTotalCost(){
        double totalCost=0.0;
        for (int i=0; i<5;i++){
            totalCost= totalCost+cartItems[i].price* cartItems[i].quantity;
        }
    System.out.println("the total price is "+ totalCost);
}

public void displayCartContent(){
        for (int i=0;i<5;i++){
            cartItems[i].displayProductInfo();
            System.out.println("----------");
        }
}
}
