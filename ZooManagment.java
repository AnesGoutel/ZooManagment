package ZooManagment;

import java.util.ArrayList;
import java.util.List;


abstract class animal {

protected static String name;
static int age;
static String diet;
static double weight;
static float hourstosleep;

public void sleep() {
System.out.println("This animal sleeps: " + animal.hourstosleep + " hours a day\n\n");
};

public abstract void eat();
public abstract void showDetails();

}


class mammal extends animal {
public mammal(String s, int a, double d, float nbh, String r)

{
mammal.name = s;
mammal.age = a;
mammal.weight = d;
mammal.diet = r;
mammal.hourstosleep = nbh;
};


public void breastfeeding() {  
System.out.println("This mammal feeds its young with milk.");
};

@Override 
public void eat() {
System.out.println("This mammal is a: " + diet);
};

@Override
public void showDetails() {
System.out.println("The name of our mammal is: " + name + ", its age is: " + age + " years and its weight is: " + weight + "kg");
};

}

  
class bird extends animal {
public bird(String s, int a, double d, float nbh, String r) {
bird.name = s;
bird.age = a;
bird.weight = d;
bird.diet = r;
bird.hourstosleep = nbh;        
}
public void sing() {
System.out.println("This bird sings");
};
public void fly(){ // 
System.out.println("This bird flies");
}
public void layEggs () {
System.out.println("It lays eggs");
};
@Override
public void eat() {
System.out.println("This bird is a: " + diet);
}

@Override
public void showDetails() {
System.out.println("The name of our bird is: " + name + ", its age is: " + age + " years and its weight is: " + weight + "kg");
}}

   
class reptile extends animal 
{   
static int numberOfScales;
public reptile(String s, int a, double d, float nbh, String r, int chp) 
{
reptile.name = s;
reptile.age = a;
reptile.weight = d;
reptile.hourstosleep = nbh;
reptile.diet = r;
reptile.numberOfScales = chp;
}
public void layEggs() {
System.out.println("It lays eggs");
};

@Override
public void eat() {
System.out.println("This reptile is a " + diet);
}

@Override
public void showDetails() {
System.out.println("The name of our reptile is: " + name + ", its age is: " + age + " years and its weight is: " + weight + "kg");
};

}

 
class zoo {

static ArrayList<String> animalList = new ArrayList<>();

static String openingDate = "04/11/2004";

public void add(String animal) {
animalList.add(animal);
}
public void remove(animal animal) {
animalList.remove(animal);
};
public void planEvent(String location, String date) {
System.out.println("The event will take place on: " + date + " in " + location);
};

public static void trackPopulation(int count){
System.out.println("We have in our zoo: " + count + " animals");
};

public void showList(){
System.out.println("  ~~~WELCOME TO OUR ZOO~~~\n ");
zoo.trackPopulation(animalList.size());
System.out.println("This zoo was opened on " + zoo.openingDate + " and has the following animals: " + zoo.animalList);
}
}


class Main {
public static void main(String[] args) {

zoo zoo = new zoo();


mammal lion = new mammal("Simba", 2, 15.6, 7, "carnivore");

zoo.add(lion.name);

lion.showDetails();
lion.eat();
lion.breastfeeding();
lion.sleep();


mammal monkey = new mammal("George", 4, 34, 13, "herbivore"); 
zoo.add(monkey.name);

monkey.showDetails();         
monkey.eat();
monkey.breastfeeding();
monkey.sleep();


bird canary = new bird("tutu", 1, 0.4, 6, "herbivore");

zoo.add(canary.name);

canary.showDetails();
canary.eat();
canary.sing();
canary.layEggs();
canary.fly(); 
canary.sleep();


reptile snake = new reptile("gigi", 4, 27, 5, "carnivore", 2); 

zoo.add(reptile.name);

snake.showDetails();
snake.eat();
snake.layEggs();
snake.sleep();

zoo.planEvent("Annaba", "01/10/2024");

System.out.println(); 

zoo.showList();
}
}


