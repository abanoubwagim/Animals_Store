public class Main {
    public static void main(String[] args) {


    Store store = new Store();
    store.addAnimal("British Shorthair", 5 , 150 , Store.Types.CATS);
    store.addAnimal("Abyssinian ", 8 , 75 , Store.Types.CATS);
    store.addAnimal("Devon Rex", 7 , 115 , Store.Types.CATS);
    store.addAnimal("Burmese ", 10 , 50 , Store.Types.CATS);
    store.addAnimal("Maine Coon ", 12 , 100 , Store.Types.CATS);

    store.addAnimal("German Shepherd ", 5 ,1500 , Store.Types.DOGS);
    store.addAnimal("PitBull ", 2 ,440 , Store.Types.DOGS);
    store.addAnimal("grephone  ", 8 ,320 , Store.Types.DOGS);
    store.addAnimal("rode  ", 10 ,750 , Store.Types.DOGS);

    store.addAnimal("Eagle ", 21 ,500 , Store.Types.BIRDS);
    store.addAnimal("Hummingbirds ", 10 ,440 , Store.Types.BIRDS);
    store.addAnimal("Kingfisher  ", 12 , 320, Store.Types.BIRDS);
    store.addAnimal("sparrow ", 1 ,750 , Store.Types.BIRDS);


    store.remove(Store.Types.DOGS);
    store.remove(Store.Types.CATS);

    store.printSpecificAnimal(Store.Types.BIRDS);
    
    store.printAllAnimals();
    store.countAllAnimals();








    }
}
