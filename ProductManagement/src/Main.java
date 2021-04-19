import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("\nMenu ");
        System.out.println("1. Add a product");
        System.out.println("2. Edit a product");
        System.out.println("3. Remove a product");
        System.out.println("4. Display all products");
        System.out.println("5. Search a product by name");
        System.out.println("6. Sort by price");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        ProductManagement shop = new ProductManagement();
        Scanner scanner = new Scanner(System.in);
        int userChoice = -1;
        do {
            menu();
            System.out.println("Enter your choice: ");
            userChoice = scanner.nextInt();

            switch (userChoice){
                case 1:
                    shop.add();
                    break;
                case 2:
                    shop.editById();
                    break;
                case 3:
                    shop.removeById();
                    break;
                case 4:
                    shop.display();
                    break;
                case 5:
                    shop.searchByName();
                    break;
                case 6:
                    shop.sortByPrice();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (userChoice != 0);

    }
}
