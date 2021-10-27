public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed=breed;
    }

    // A constructor that assumes that a default student is a ninth-grader
    public Dog(String a, int b) {
        super(a,b);
        this.breed = "poodle";
    }

    // A default/no-argument constructor
    public Dog() {
        super("Jerry", 10);
        this.breed = "poodle";
    }

    // makeNoise() method

    @Override
    public void makeNoise() {
        super.makeNoise();
    }


    // toString method


    // Getter

    public String getBreed() {
        return breed;
    }


    // Setter

    public void setBreed(String breed) {
        this.breed = breed;
    }
}