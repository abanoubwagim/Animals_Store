import java.util.ArrayList;

class Birds extends Animal{ // Inheritance from Animal class

    ArrayList<Birds> birdsArrayList = new ArrayList<>();

    public Birds() {} // A Constructor takes no parameters

    public Birds(String name, int age, int price){ // A Constructor takes three parameters
        this.name = name;
        this.age = age;
        this.price = price;
    }
    @Override
    int countAnimal(){
        return birdsArrayList.size();
    } // return size of birds
    @Override
    void printAllAnimals(){
        System.out.println("Birds { ");
        for (int i = 0; i < birdsArrayList.size(); i++) {
            System.out.print((i+1)+"- Name : " + birdsArrayList.get(i).name);
            System.out.print(" Age : " + birdsArrayList.get(i).age);
            System.out.println("  Price : " + birdsArrayList.get(i).price + " $ ");
        }
        System.out.println("}");
    }

}
