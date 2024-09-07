import java.util.ArrayList;

class Dogs extends Animal { // Inheritance from Animal class


    ArrayList <Dogs> dogsArrayList = new ArrayList<>();

    public Dogs(){} // A Constructor takes no parameters
    public Dogs(String name, int age, int price){ // A Constructor takes three parameters
        this.name = name;
        this.age = age;
        this.price = price;
    }
    @Override
    int countAnimal(){
        return dogsArrayList.size();
    } // return size of dogs
    @Override
    void printAllAnimals(){
        System.out.println("Dogs { ");
        for (int i = 0; i < dogsArrayList.size(); i++) {
            System.out.print((i+1)+"- Name : " + dogsArrayList.get(i).name);
            System.out.print(" Age : " + dogsArrayList.get(i).age);
            System.out.println("  Price : " + dogsArrayList.get(i).price + " $ ");


        }
        System.out.println("}");
    }


}
