import java.util.ArrayList;

class Cats extends Animal{ // Inheritance from Animal class


    ArrayList<Cats> catsArrayList = new ArrayList<>();

    public Cats() {} // A Constructor takes no parameters

    public Cats(String name, int age, int price){ // A Constructor takes three parameters
        this.name = name;
        this.age = age;
        this.price = price;
    }
    @Override
    int countAnimal(){
        return catsArrayList.size();
    }  // return size of cats
    @Override
    void printAllAnimals(){
        System.out.println("Cats { ");
        for (int i = 0; i < catsArrayList.size(); i++) {
            System.out.print((i+1)+"- Name : " + catsArrayList.get(i).name);
            System.out.print(" Age : " + catsArrayList.get(i).age);
            System.out.println("  Price : " + catsArrayList.get(i).price + " $ ");
            }
        System.out.println("}");
    }

}
