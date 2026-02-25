public class Product {

    private String pname;
    private String pcode;
    private int price;

    public Product() {
    }

    public Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPname() {
        return pname;
    }

    public String getPcode() {
        return pcode;
    }

    public int getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("pname: " + pname);
        System.out.println("pcode: " + pcode);
        System.out.println("price: " + price + "\n");
    }
}

class Cars {
    public static void main(String[] args) {

        Product p1 = new Product("Benz", "Car 123", 10000);
        System.out.println("Displaying p1:");
        p1.displayProduct();

        Product p2 = new Product("Toyota", "Car 345", 1004320);
        System.out.println("Displaying p2:");
        p2.displayProduct();

        Product p3 = new Product("Volkswagen", "Car 796", 234560);
        System.out.println("Displaying p3:");
        p3.displayProduct();

        Product lowest = p1;

        if (p2.getPrice() < lowest.getPrice()) {
            lowest = p2;
        }

        if (p3.getPrice() < lowest.getPrice()) {
            lowest = p3;
        }

        System.out.println("Displaying product with lowest price:");
        lowest.displayProduct();
    }
}
