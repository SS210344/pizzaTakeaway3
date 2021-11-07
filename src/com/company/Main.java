package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        double price = 0.0;
        boolean valid = true;
        String pizzaSize ="";
        while (valid == true){
            try {
                System.out.println("pizza size:");
                System.out.println("sizes: small: 7.99 median: 10.99  large: 13.99");
                pizzaSize = input.next();
            }
            catch(Exception e){
                System.out.println("not a string: "+e);
                input.next();
            }
            if (pizzaSize.equals("small")){
                price =7.99;
                valid = false;
            }
            if (pizzaSize.equals("median")){
                price =10.99;
                valid = false;
            }
            if (pizzaSize.equals("large")){
                price =13.99;
                valid = false;
            }
            else{
                System.out.println("not a valid pizza size");
            }
        }
        ArrayList<String> aloudToppings = new ArrayList<>();
        aloudToppings.add("cheese");
        aloudToppings.add("tomato");
        aloudToppings.add("ham");
        aloudToppings.add("pineapple");
        aloudToppings.add("peperoni");
        aloudToppings.add("sweetcorn");
        aloudToppings.add("end");


        System.out.println("you get 2 free toppings then it costs 1.25 per one after");



        System.out.println("aloud toppings: or type end to stop");
        for (int i = 0; i < aloudToppings.size(); i++) {
            System.out.println(aloudToppings.get(i));

        }

        ArrayList<String> toppings = new ArrayList<>();
        String topping = "";
        int count = 0;
        valid = true;
        while (true){
            valid = true;
            boolean aloudToppingVar = false;
            boolean present = false;
            while (valid == true) {
                present = false;
                try {
                    System.out.println("topping:");
                    topping = input.next();
                    for (int i = 0; i < aloudToppings.size(); i++) {
                        if (topping.equals(aloudToppings.get(i))) {
                            aloudToppingVar = true;
                        }
                    }
                    if (aloudToppingVar == true ){
                        if(toppings.size() != 0){
                            for (int i = 0; i < toppings.size(); i++) {
                                if (toppings.get(i).equals(topping)) {
                                    present = true;
                                }
                            }
                            if(present == false){
                                valid = false;
                            }

                        }
                        else{
                            valid = false;
                        }
                    }
                    if (valid == true){
                        System.out.println("not an aloud topping");
                    }

                } catch (Exception e) {
                    System.out.println("not a string: " + e);
                    input.next();
                }
            }
            if (topping .equals("end")){
                break;
            }
            count++;
            toppings.add(topping);
        }

        if (count > 2 ) {
            price = price + 1.25 * (count - 2);
        }
        System.out.println("pizza toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(toppings.get(i));

        }
        System.out.println("final price: "+price);
    }
}
