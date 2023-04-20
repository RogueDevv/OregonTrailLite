package org.yup.oregontrail;

public class OregonTravelerApp {

    public static void main(String[] args){

        Traveler dwene = new Traveler( "Dwene", 100, 100);

        System.out.println("before hunting food: " + dwene.getFood());
        System.out.println(dwene.hunt());
        System.out.println("After hunt" + dwene.getFood());
        System.out.println(dwene.hunt());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.getFood());
    }


}
