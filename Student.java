package oops;

class Student 
{
    private String name;
    private int age;
    private int roll ;

    //getName method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll() {
        return roll;
    } 

    public void setRoll(int roll) {
        this.roll = roll;
    }
}

class Main 
{
    public static void main(String[] args) 
    {
        Student s = new Student();
        
        // setting values of the variables
        s.setName("Mohit");
        s.setAge(25);
        s.setRoll(36);
        
        // Displaying values of the variables
        System.out.println("His name: " + s.getName());
        System.out.println("His age: " + s.getAge());
        System.out.println("His roll: " + s.getRoll());
        
        s.setName("Sumit");
        s.setAge(24);
        s.setRoll(15);
        
        // Displaying values of the variables
        System.out.println("His name: " + s.getName());
        System.out.println("His age: " + s.getAge());
        System.out.println("His roll: " + s.getRoll());
    }
}
