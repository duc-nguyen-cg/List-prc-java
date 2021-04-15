public class MyListTest {

    public static int testIndex = 1;
    public static String testElement = "New York";

    public static void combinationTest(MyList cities){
        cities.print();
        System.out.println("size = "+cities.size());
        System.out.println(cities.contains(testElement));
        System.out.println(cities.indexOf(testElement));
        System.out.println(cities.get(testIndex));
        System.out.println();
    }

    public static void main(String[] args) {
        MyList<String> cities = new MyList<>();

        cities.add(testIndex, testElement);
        combinationTest(cities);

        //test clone()
        Object[] newCities = cities.clone();
        for(int i = 0; i < newCities.length; i++){
            System.out.print(newCities[i]+", ");
        }

        cities.remove(testIndex);
        combinationTest(cities);


        cities.add("Toronto");
        cities.add("Seattle");
        cities.add("London");
        cities.add("Paris");
        System.out.println("size = "+cities.size());
        cities.print();
        cities.clear();
        cities.print();

        for(int i = 0; i < newCities.length; i++){
            System.out.print(newCities[i]+", ");
        }
    }
}
