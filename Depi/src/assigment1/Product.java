package assigment1.assigment1;

public class Product {

       public int id ;
       public String description;
       public double price;
       public int quantity;

        public Product (int productId,String productDescription,double productPrice,int availableQuantity ){
            this.id= productId;
            this.description= productDescription;
            this.price=productPrice;
            this.quantity=availableQuantity;
            //this.displayProductInfo();

        }
        public void displayProductInfo(){
            System.out.println("product id = " + id );
            System.out.println( "descreption = "  + description );
            System.out.println("price = "+ price);
            System.out.println("quantity = "+quantity);

        }


}
