//Shane Bettis

public class Cat {
    
    //data variable, they describe our Cat objects in the computer
    public String name;
    public int age;
    public String color;

    //default constructor
    public Cat () {
        this.name = "Tom";
        this.age = 1;
        this.color = "Orange";
    }

    //non-default constructor
    public Cat (String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //setters - accessors
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //getters - mutators
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return name + ", " + age + ", " + color;
    }

}