package com.company;

public class Main {
    ////method is needed to automatically seed the collection
    private static void seedCollection(WaterCollection<River> rivers)
    {
        rivers.addWater(new River("Dnipro","Ukraine",1230));
        rivers.addWater(new River("Anipro","Ukraine",1250));
        rivers.addWater(new River("Dnipro","Ukraine",1231));
        rivers.addWater(new River("Bnipro","Ukraine",220));
        rivers.addWater(new River("Cniprasdo","Ukraine",20));
        rivers.addWater(new River("Dnipro","Ukraine",730));
        rivers.addWater(new River("Hnipro","Ukraine",930));
        rivers.addWater(new River("Dnipro","Ukraine",830));
        rivers.addWater(new River("Gnipro","Ukraine",330));
        rivers.addWater(new River("Dnipro","Ukraine",530));
        rivers.addWater(new River("Unipro","Ukraine",130));
    }
    ////for careful display of river info
    private static void ViewInfo(River river){
        System.out.println(river.ToString());
    }
    ////for careful display of rivers info
    private static void ViewInfo(WaterCollection<River> rivers){
        for (River river : rivers) ViewInfo(river);
    }
    ////contains first task
    private static void firstEx(){
        WaterCollection<River> rivers = new WaterCollection<>();
        seedCollection(rivers);

        System.out.println("---------------First------------------");
        River smallestRiver= rivers.getSmallestWater();
        ViewInfo(smallestRiver);
    }
    ////contains second task
    private static void secondEx(){
        WaterCollection<River> rivers = new WaterCollection<>();
        seedCollection(rivers);

        System.out.println("---------------Second------------------");
        WaterCollection<River> rivers2 = rivers.getLengthGreaterAvgWaters();
        ViewInfo(rivers2);
    }
    ////contains third task
    private static void thirdEx(){
        WaterCollection<River> rivers = new WaterCollection<>();
        seedCollection(rivers);

        System.out.println("---------------Third before sort------------------");
        ViewInfo(rivers);
        System.out.println("---------------Third after sort------------------");
        rivers.sort();
        ViewInfo(rivers);
    }
    ////contains fourth task
    private static void fourthEx(){
        WaterCollection<River> rivers = new WaterCollection<>();
        seedCollection(rivers);

        System.out.println("---------------Fourth------------------");
        River river = rivers.findByName("Anipro");
        river.setLength(111);
        river.setName("Pripyat");
        ViewInfo(river);
    }
    public static void main(String[] args) {
        System.out.println("Name\t Dislocation\t Length");
        ////first
        firstEx();
        ////second
        secondEx();
        ////third
        thirdEx();
        ////fourth
        fourthEx();
    }
}
