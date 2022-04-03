package com.company;

public class Main {
    ////method is needed to automatically seed the collection
    private static void seedCollection(RiverCollection rivers)
    {
        rivers.addRiver(new River("Dnipro","Ukraine",1230));
        rivers.addRiver(new River("Anipro","Ukraine",1250));
        rivers.addRiver(new River("Dnipro","Ukraine",1231));
        rivers.addRiver(new River("Bnipro","Ukraine",220));
        rivers.addRiver(new River("Cniprasdo","Ukraine",20));
        rivers.addRiver(new River("Dnipro","Ukraine",730));
        rivers.addRiver(new River("Hnipro","Ukraine",930));
        rivers.addRiver(new River("Dnipro","Ukraine",830));
        rivers.addRiver(new River("Gnipro","Ukraine",330));
        rivers.addRiver(new River("Dnipro","Ukraine",530));
        rivers.addRiver(new River("Unipro","Ukraine",130));
    }
    ////for careful display of river info
    private static void ViewInfo(River river){
        System.out.println(river.ToString());
    }
    ////for careful display of rivers info
    private static void ViewInfo(RiverCollection rivers){
        for (River river : rivers) ViewInfo(river);
    }
    ////contains first task
    private static void firstEx(){
        RiverCollection rivers = new RiverCollection();
        seedCollection(rivers);

        System.out.println("---------------First------------------");
        River smallestRiver= rivers.getSmallestRiver();
        ViewInfo(smallestRiver);
    }
    ////contains second task
    private static void secondEx(){
        RiverCollection rivers = new RiverCollection();
        seedCollection(rivers);

        System.out.println("---------------Second------------------");
        RiverCollection rivers2 = rivers.getLengthGreaterAvgRivers();
        ViewInfo(rivers2);
    }
    ////contains third task
    private static void thirdEx(){
        RiverCollection rivers = new RiverCollection();
        seedCollection(rivers);

        System.out.println("---------------Third before sort------------------");
        ViewInfo(rivers);
        System.out.println("---------------Third after sort------------------");
        rivers.sort();
        ViewInfo(rivers);
    }
    ////contains fourth task
    private static void fourthEx(){
        RiverCollection rivers = new RiverCollection();
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
