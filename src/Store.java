import java.util.Scanner;

class Store {

    enum Types {
        DOGS,
        CATS,
        BIRDS
    }

    private Scanner sc = new Scanner(System.in);
    private Dogs dogs = new Dogs();
    private Cats cats = new Cats();
    private Birds birds = new Birds();


    public void addAnimal(String name, int age, int price, Types types) {

        switch (types) {
            case Types.DOGS:
                dogs.dogsArrayList.add(new Dogs(name, age, price));
                break;
            case Types.CATS:
                cats.catsArrayList.add(new Cats(name, age, price));
                break;
            case Types.BIRDS:
                birds.birdsArrayList.add(new Birds(name, age, price));
                break;
            default:
                System.out.println("The Type not Found!");
                break;
        }


    }




    void printSpecificAnimal(Types types) {
        switch (types) {
            case Types.DOGS -> dogs.printAllAnimals();
            case Types.CATS -> cats.printAllAnimals();
            case Types.BIRDS -> birds.printAllAnimals();
        }
    }
    void printAllAnimals(){
        dogs.printAllAnimals();
        cats.printAllAnimals();
        birds.printAllAnimals();
        System.out.println("----------------------------------");
    }
    void remove(Types types){
        int i = 1 ;
        while (i > 0) {
            printSpecificAnimal(types);
            try{
                System.out.println("What do you want to delete (To Exit 0 ): ");
                int choice = sc.nextInt();
                if ( choice == 0){
                    i = 0;
                } else {
                    if (types.name().equals(Types.DOGS.name())) {
                        dogs.dogsArrayList.remove(choice - 1);
                        i = dogs.countAnimal();
                        System.out.println("The Animal has been deleted");
                    } else if (types.name().equals(Types.CATS.name())) {
                        cats.catsArrayList.remove(choice - 1);
                        i = cats.countAnimal();
                        System.out.println("The Animal has been deleted");
                    } else if (types.name().equals(Types.BIRDS.name())) {
                        birds.birdsArrayList.remove(choice - 1);
                        i = birds.countAnimal();
                        System.out.println("The Animal has been deleted");
                    }
                }
            } catch (IndexOutOfBoundsException e ){
                    System.out.println("Not Found");
                }
        }

    }
    void countAllAnimals() {
         System.out.println(Types.DOGS.name() + " : " + dogs.countAnimal());
         System.out.println(Types.CATS.name() + " : " + cats.countAnimal());
         System.out.println(Types.BIRDS.name() + " : " + birds.countAnimal());

     }




}
