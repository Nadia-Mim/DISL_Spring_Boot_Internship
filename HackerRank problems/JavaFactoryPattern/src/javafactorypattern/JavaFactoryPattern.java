package javafactorypattern;

import java.util.*;
/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-factory/problem?isFullScreen=true
 */
public class JavaFactoryPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FoodFactory foodFactory = new FoodFactory();
        Food food = foodFactory.getFood(sc.nextLine());
        System.out.println("The factory returned "+food.getClass());
        System.out.println(food.getType());
    }
}
interface Food {
    public String getType();
}
class Pizza implements Food {
 public String getType() {
 return "Someone ordered a Fast Food!";
 }
}

class Cake implements Food {

 public String getType() {
 return "Someone ordered a Dessert!";
 }
}
class FoodFactory {
    public Food getFood(String order) {
        if(order.equalsIgnoreCase("Cake")){
            return new Cake();
        }
        else if(order.equalsIgnoreCase("Pizza")){
            return new Pizza();
        }
        return null;
    }
}

