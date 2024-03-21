package machine;

import java.util.Scanner;

enum state {
    buy, fill, take, remaining, exit;
}
public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int disposalC = 9;
    static int income = 550;

    public static String input () {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (state == "buy"){
            input = scanner.nextLine();
            return input;
        }
        else if (state.equals("choosing a type of coffee")){
            input = scanner.nextLine();
        }
        return input;
    }
    public static void display () {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(disposalC + " disposable cups");
        System.out.println("$" + income + " of money");
    }
    public static void buy () {
        Scanner scanner = new Scanner(System.in);
        String inputS;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        inputS = scanner.nextLine();
        if (inputS.equals("back")){
            return;
        }
        int input = Integer.parseInt(inputS);
        if (input == 1) {
            if (water < 250){
                System.out.println("Sorry, not enough water!");
                return;
            }
            else if (coffee < 16){
                System.out.println("Sorry, not enough coffee!");
                return;
            }
            else if (disposalC < 1){
                System.out.println("Sorry, not enough disposable cups!");
                return;
            }
            water -= 250;
            coffee -= 16;
            disposalC -= 1;
            income += 4;
        }
        else if (input == 2) {
            if (water < 350){
                System.out.println("Sorry, not enough water!");
                return;
            }
            else if (coffee < 20){
                System.out.println("Sorry, not enough coffee!");
                return;
            }
            else if (milk < 75){
                System.out.println("Sorry, not enough milk!");
                return;
            }
            else if (disposalC < 1){
                System.out.println("Sorry, not enough disposable cups!");
                return;
            }
            water -= 350;
            milk -=75;
            coffee -= 20;
            disposalC -= 1;
            income += 7;
        }
        else if (input == 3) {
            if (water < 200){
                System.out.println("Sorry, not enough water!");
                return;
            }
            else if (coffee < 12){
                System.out.println("Sorry, not enough coffee!");
                return;
            }
            else if (milk < 100){
                System.out.println("Sorry, not enough milk!");
                return;
            }
            else if (disposalC < 1){
                System.out.println("Sorry, not enough disposable cups!");
                return;
            }
            water -= 200;
            milk -= 100;
            coffee -= 12;
            disposalC -= 1;
            income += 6;
        }

    }
    public static void fill () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffee += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add: ");
        disposalC += scanner.nextInt();

    }
    public static void take () {
        System.out.println("I gave you $" + income);
        income = 0;

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.nextLine();
            if (input.equals("buy")) {
                state buy = state.buy;
                buy();
                System.out.println("");
            } else if (input.equals("fill")) {
                state fill = state.fill;
                fill();
                System.out.println("");
            } else if (input.equals("take")) {
                state take =
                take();
                System.out.println("");
            } else if (input.equals("remaining")) {
                display();
                System.out.println("");
            } else if (input.equals("exit")){
                break;
            }
        /*System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterAva = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkAva = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has");
        int coffeeAva = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        int water, milk, coffeeB;
        water = cups * 200;
        milk = cups * 50;
        coffeeB = cups * 15;
        int cupsAva = 0;
        int cupsWat = waterAva / 200;
        int cupsMil = milkAva / 50;
        int cupsCoff = coffeeAva / 15;
        if ((cupsWat < cupsMil || cupsWat < cupsMil) && (cupsWat < cupsCoff || cupsWat <= cupsCoff)){
            cupsAva = cupsWat;
        }
        else if ((cupsMil < cupsCoff || cupsMil <= cupsCoff) && (cupsMil < cupsWat || cupsMil <= cupsWat)){
            cupsAva = cupsMil;
        }
        else if ((cupsCoff < cupsMil || cupsCoff <= cupsMil) && (cupsCoff < cupsWat || cupsCoff < cupsWat)){
            cupsAva = cupsCoff;
        }
        if (cupsAva == cups){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if (cupsAva > cups){
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupsAva - cups) +" more than that)");
        }
        else if (cupsAva < cups){
            System.out.println("No, I can make only " + cupsAva + " cup(s) of coffee");*/
        }
    }
}

