public class ObjectTester {

    public static void main (String[] args) {

        //make a Dog object - instantiation
        Dog dog1 = new Dog();
        System.out.println(dog1);

        //make a Dog object - use non-default constructor
        Dog dog2 = new Dog("Karl", 3, "Golden Retriever");
        System.out.println(dog2);

        dog2.setName("Paul");
        System.out.println(dog2);

        //only print dogs name
        System.out.println(dog2.getName());

        Cat cat1 = new Cat();
        System.out.println(cat1);

        Cat cat2 = new Cat("Zeina", 7, "black and white");
        System.out.println(cat2);

        System.out.println(cat2.getName());

        

    }//end main

}//end class