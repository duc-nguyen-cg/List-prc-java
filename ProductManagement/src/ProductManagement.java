import java.util.*;

public class ProductManagement {
    static Scanner scanner = new Scanner(System.in);
    private ArrayList<Product> products = new ArrayList<>();


    public void add(){
        System.out.println("Enter new product's ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter new product's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new product's price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        products.add(new Product(id, name, price));
    }


    public boolean removeById(){
        if (products.isEmpty()){
            System.out.println("The shop is empty!");
            return false;
        } else {
            System.out.println("Enter the product's ID to remove: ");
            String id = scanner.nextLine();
            for (Product product: products){
                if (product.getId().equals(id)){
                    products.remove(product);
                    System.out.println("Remove "+product);
                    return true;
                }
            }
            System.out.println("Not found!");
            return false;
        }
    }


    public boolean editById(){
        if (products.isEmpty()){
            System.out.println("The shop is empty!");
            return false;
        } else {
            System.out.println("Enter the product's ID to edit: ");
            String id = scanner.nextLine();

            for (Product product : products) {
                if (product.getId().equals(id)) {
                    System.out.println("Edit name: ");
                    product.setName(scanner.nextLine());
                    System.out.println("Edit price: ");
                    product.setPrice(scanner.nextDouble());
                    scanner.nextLine();
                    return true;
                }
            }
            System.out.println("Not found!");
            return false;
        }
    }


    public void display(){
        System.out.println("----------------------");
        System.out.println("All available products: ");
        if (products.isEmpty()){
            System.out.println("Empty!");
        } else {

            for (Product product : products) {
                System.out.println(product);
            }
        }
        System.out.println();
    }


    public boolean searchByName(){
        if (products.isEmpty()){
            System.out.println("The shop is empty!");
            return false;
        } else {
            System.out.println("Enter the product's name: ");
            String name = scanner.nextLine();
            for (Product product: products){
                if (product.getName().equals(name)){
                    System.out.println(product);
                    return true;
                }
            }
            System.out.println("Not found!");
            return false;
        }
    }


    public void sortByPrice(){
        if (products.isEmpty()) {
            System.out.println("The shop is empty!");
        } else {
            System.out.println("1. Ascending ");
            System.out.println("2. Descending ");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            ArrayList<Product> newList = (ArrayList<Product>) products.clone();
            switch (choice){
                case 1:
                    Collections.sort(newList, new AscendingSortByPrice());
                    System.out.println("Sort by Ascending");
                    for (Product product: newList){
                        System.out.println(product);
                    }
                    break;
                case 2:
                    Collections.sort(newList, new DescendingSortByPrice());
                    System.out.println("Sort by Descending");
                    for (Product product: newList){
                        System.out.println(product);
                    }
                    break;
            }
        }

    }
}
