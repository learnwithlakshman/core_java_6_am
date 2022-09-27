package com.careerit.cj.day14;
interface Game{
    void start();
    void play();
    void stop();


}

abstract class AbstractGame implements Game {
    public void start() {
        System.out.println("The game \"" + this.getClass().getSimpleName() + "\" is going to start");
    }
    public void stop() {
        System.out.println("The game \"" + this.getClass().getSimpleName() + "\" is going to stop");
    }
}

class Car extends AbstractGame implements  Game {


    public void play() {
        System.out.println("You are playing \"" + this.getClass().getSimpleName() + "\" game, please wear seat belt");
    }

    public void fly() {
        System.out.println("The car fly....");
    }
}

class Bike extends AbstractGame implements  Game{
    public void play() {
        System.out.println("You are playing \"" + this.getClass().getSimpleName() + "\" game, Please wear helmet");
    }


}

class Ship extends  AbstractGame implements  Game {


    public void play() {
        System.out.println("You are playing \"" + this.getClass().getSimpleName() + "\" game, Please wear water jacket");
    }


}

public class CastingExample {

    public static void main(String[] args) {

        Game[] games = getGames();

        for (Game game : games) {
            if (game instanceof Car) {
                Car obj = (Car) game;
                obj.start();
                obj.play();
                obj.fly();
                obj.stop();
            } else {
                game.start();
                game.play();
                game.stop();
            }
        }


    }

    private static Game[] getGames() {
        return new Game[]{new Car(), new Bike(), new Ship(), new Car(), new Car(), new Bike(), new Ship(), new Car(), new Car(), new Bike(), new Ship(), new Car(), new Car(), new Bike(), new Ship(), new Car()};
    }
}
