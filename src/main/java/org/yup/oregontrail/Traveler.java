package org.yup.oregontrail;

public class Traveler {

    private String name;
    private int health;
    private boolean isHealthy;
    private int food;

    public Traveler(String name, int health, int food) {
        this.name = name;
        this.health = health;
        this.food = food;
        this.isHealthy = true;
    }

    public String hunt(){

        //user needs to hunt
        //they have a 50 percent chance of being successful
        if(Math.random() > .5){

        //if they are successful we add 100 to their food and 0 to their food if not
        this.setFood(this.food + 100);
        //or += 100;

            return " The hunt was successful for " + getName() + " And their food is now at: " + getFood();

        }

        return " The hunt was a big failure for " + getName() + " And they've let their family down. the food is still at: " + getFood();


    }

    public String eat(){

        //Consumes 20 of the traveler's food. If the traveler doesn't have 20 food, the traveler is no longer healthy.
        if(this.getFood() >= 20) {
            this.setFood(this.getFood() - 20);
            this.setHealthy(true);
            this.setHealth(100);
            return "Man o man, that was delicious";
        }else{
            this.setHealthy(false);
            this.setHealth(0);
            return " I am so hungry and don't have enough food. I think I'm dying.";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
