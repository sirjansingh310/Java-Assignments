package incremental.assignment3.task1;

public class Main {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Hamster();
        rodents[1] = new Mouse();
        rodents[2] = new Gerbil();
        for(Rodent rodent : rodents){
            System.out.println(rodent.getType());
            rodent.makeSound();
        }
    }
}
