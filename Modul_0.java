import java.util.Random;

class HelloWorld {
        public static void main(String[] args) {
        System.out.println("Michal \n 29 \n Z");
    }
}

class Variables {
    public static void main(String[] args) {
        int age = 43;
        String name = "User";
        char score = 'A';
        boolean verification = true;
        double accountStatus = 20.154;
        System.out.println(age + " " + name + " " + score + " " + verification + " " + accountStatus);
    }
 }

class App {
    public static void main(String[] args) {
       String myName = "Janusz";
       int myAge = 22;
       double height = 1.78;
       char carClass = 'A';
       boolean isGoodProgrammer = true;
       System.out.println(myName + "\n" + myAge + "\n" + height + "\n" + carClass + "\n" + isGoodProgrammer);
    }
 }

class trafficApp {
    public static void main(String[] args) {
        String ok = "Good to go";
        String wrong = "Big traffic ahead";
        boolean roadTraffic = true ;
        boolean newRoadTraffic = false;
        if (roadTraffic) {
            System.out.println(ok);
        } else {
            System.out.println(wrong);
        }
        if (newRoadTraffic) {
            System.out.print(ok);
        } else {
            System.out.println(wrong);
        }
    } 
 }

class Number {
    public static void main(String[] args) {
        String space = " ";
        double X = 13;
        if(X % 7 == 0) {
            System.out.println("Liczba 7 jest dzielnikiem liczby" + space + X);
        } else {
            System.out.println("Liczba 7 NIE jest dzielinikiem liczby" + space + X);
        }
    }
}

class Array {
    public static void main(String[] args) {
        String names[] = new String[5];
        names[0] = "Ania";
        names[1] = "Krzysiek";
        names[2] = "Paula";
        names[3] = "Janusz";
        names[4] = "Wieslaw";
        String name = names[2];
        System.out.println(name + "\n" + names[3]);
    }
}

class Cinema {
    public static void main(String[] args) {
        String movies [] = new String [10];
        movies[0] = "mov1";
        movies[1] = "mov2";
        movies[2] = "mov3";
        movies[3] = "mov4";
        movies[4] = "mov5";
        movies[5] = "mov6";
        movies[6] = "mov7";
        movies[7] = "mov8";
        movies[8] = "mov9";
        movies[9] = "mov10";
        String movie = movies[5];
        System.out.println(movie);
    }
}

class CinemaRandom {
    public static void main(String[] args) {
        String movies [] = new String [10];
        movies[0] = "mov1";
        movies[1] = "mov2";
        movies[2] = "mov3";
        movies[3] = "mov4";
        movies[4] = "mov5";
        movies[5] = "mov6";
        movies[6] = "mov7";
        movies[7] = "mov8";
        movies[8] = "mov9";
        movies[9] = "mov10";
        // System.out.println(movies[4]);
        Random randMovie = new Random();
        int movieIndex = randMovie.nextInt(movies.length);
        String movie = movies[movieIndex];
        System.out.println(movie);
    }
}


class Plane {
    public int planeAscent(int speed, int altitude, int time) {
        return (speed * altitude) / time;
    }
    public String landingGear (String gear) {
        return gear;
    }
    public boolean lightsOn (boolean lights) {
        return lights;
    }
    public void altitude(){}
}
class PlaneCalculator {
    public static void main(String[] args) {
        Plane calculator = new Plane();
        int result = calculator.planeAscent(10, 2, 4);
        System.out.println(result);
    }
}


class SimpleCalculator {
    public int addAToB(int a, int b) {
        return a + b;
    }
    public int subtractAFromB(int a, int b) {
        return b - a;
    }
}    
class Application {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.addAToB(2, 200);
        System.out.println(result);    
    }
}


class Username {
    public String userName;
    public int userPin;
    public String userAge;
}


class CalculatorApp {
    public double subtractAFromB(double a, double b) {
        return b - a;
    }
}

class Result {
    public static void main(String[] args) {
        CalculatorApp calculator = new CalculatorApp();
        double result = calculator.subtractAFromB(15.45, 10.21);
        System.out.println(result);
    }
}

class User {
    private String name;
    private String sex;

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }
    public String getSex() {
        return this.sex;
    }
}

class UserApplication {
    public static void main (String[] args) {
        User michal = new User("Michal", "male");
        String name = michal.getName();
        String sex = michal.getSex();

        System.out.println(name + " " + sex);
    }
}

class TheLrgCity {          // TheLrgCity - The largest city in selected country
    private String city;
    private int population;

    public TheLrgCity(String city, int population) {
        this.city = city;
        this.population = population;
    }

    public String getCity() {
        return this.city;
    }
    public int getPopulation() {
        return this.population;
    }
}

class CityApplication {
    public static void main(String[] args) {
        TheLrgCity usa = new  TheLrgCity("New York", 8468000);
        TheLrgCity poland = new  TheLrgCity("Warsaw", 1765000);
        String cityUsa = usa.getCity();
        String cityPoland = poland.getCity();
        int populationUsa = usa.getPopulation();
        int populationPoland = poland.getPopulation();

        System.out.println(cityUsa + " " + populationUsa + "\n" + cityPoland + " " + populationPoland );
    } 
}

class Vehicle {
    private String model;
    private String year;
    
    public Vehicle (String model, String year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return this.model;
    }
    public String getYear() {
        return this.year;
    }
}

class Car extends Vehicle {
    private double engineCapacity;

    public Car(double engineCapacity, String model, String year) {
        super(model, year);
        this.engineCapacity = engineCapacity;
    }
    public double getEngineCapacity() {
        return this.engineCapacity;
    }
    public void turnOnEngine() {
    }
    public void turnOffEngine() {
    }
}

class CarApplication {
    public static void main(String[] args) {
        Car car = new Car(2.5, "XYZ", "2014");
        String model = car.getModel();
        double engineCapacity = car.getEngineCapacity();
        System.out.println(model + "\n" + engineCapacity);
    }
}

class Animal {
    private String eat;
    private String drink;

    public Animal(String eat, String drink) {
        this.eat = eat;
        this.drink = drink;
    }
    public String getEat() {
        return this.eat;
    }
    public String getDrink() {
        return this.drink;
    }
}

class Dog extends Animal {
    public Dog(String eat, String drink){
        super(eat, drink);
    } 
}

class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog("chips", "water");
        String drink = dog.getDrink();
        String eat = dog.getEat();
        System.out.println(drink + " " + eat);
    }
}

