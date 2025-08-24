import java.util.Scanner;

class Continent {
    String continent;

    void continentName(String continent) {
        System.out.println("Continent: " + continent);
    }
}

class Country extends Continent {
    String country;

    void countryName(String country) {
        System.out.println("Country: " + country);
    }
}

class City extends Country {
    String city;

    void cityName(String city) {
        System.out.println("City: " + city);
    }
}

public class OOPS_LAB2B {   // ✅ Same as file name
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Multilevel Inheritance ----");

        System.out.print("Enter Continent Name: ");
        String continent = sc.nextLine();

        System.out.print("Enter Country Name: ");
        String country = sc.nextLine();

        System.out.print("Enter City Name: ");
        String city = sc.nextLine();

        City c = new City();
        c.continentName(continent);
        c.countryName(country);
        c.cityName(city);

        sc.close();
    }
}
