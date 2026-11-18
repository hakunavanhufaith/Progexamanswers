class Dog {
    private String name;
    
    public Dog(String name) {
        this.name = name;
    }
    
    public void display() {
        System.out.println("Dog name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        
        //Arrays & Class - Objects
        //Array of Objetcs
        Dog[] dogs = new Dog[3];
        
        dogs[0] = new Dog("Buddy");
        dogs[0] = new Dog("Max");
        dogs[0] = new Dog("Rocky");
        
        for (int i = 0; i < dogs.length; i++){
            dogs[i].display();
        }
    }
}