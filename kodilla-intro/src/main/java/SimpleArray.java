public class SimpleArray {
    public static void main(String[] args) {
        String[] cities = new String[5];
        cities[0] = "Reykjavik";
        cities[1] = "Vik";
        cities[2] = "Isafjordur";
        cities[3] = "Akureyri";
        cities[4] = "Hella";
        String city = cities[3];
        System.out.println(city);
        int numberOfElements = cities.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów ");
    }
}

