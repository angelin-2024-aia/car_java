class Continent {
    void continentName() {
        System.out.println("Continent: Asia");
    }
}

class Country extends Continent {
    void countryName() {
        System.out.println("Country: Japan");
    }
}

class City extends Country {
    void cityName() {
        System.out.println("City: Tokyo");
    }
}

public class OOPS_LAB2B {
    public static void main(String[] args) {
        System.out.println("---- Multilevel Inheritance ----");
        City c = new City();
        c.continentName();
        c.countryName();
        c.cityName();
    }
}