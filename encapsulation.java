class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // use setter to ensure validation
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter for name (optional)
    public String getName() {
        return name;
    }

    // Setter for name (optional)
    public void setName(String name) {
        this.name = name;
    }

    // Main method to test
    public static void main(String[] args) {
        Person person1 = new Person("Maroine", 20);
        person1.setAge(-5); // invalid age
        System.out.println(person1.getAge()); // prints 20
    }
}
