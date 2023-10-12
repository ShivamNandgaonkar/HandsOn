package oops;

class vehicle {
    String brand;
    int year;

    public void displayinfo() {
        System.out.println("Brand and year of the vehicle");
    }
}

class car extends vehicle {
    String model;

    public void displayinfo() {
        System.out.println("Brand and Year of the Vehicle");
    }
}

class Sportscar extends car {
    int topspeed;

    public void displayinfo() {
        System.out.println("Brand, year, model and topspeed of the car");
    }
}

 class supervehicle {
    public static void main(String[] args) {
        //creating object of the subclass
        Sportscar c = new Sportscar();
        //access fields and methods
        c.brand = "Porche";
        c.model = "Panamera";
        c.year = 2022;
        c.topspeed = 200;
        System.out.println("Brand name is " + c.brand);
        System.out.println("Model name is " + c.model);
        System.out.println("Year is " + c.year);
        System.out.println("Topspeed is " + c.topspeed);
    }
}
