package com.company;
//River class
public class River implements IWater {
    //private fields for river
    private String Name;
    private final String Dislocation;
    private double Length;
//Constructor for create River with full information
    public River(String name,String dislocation,double length)
    {
        Name=name;
        Dislocation=dislocation;
        Length=length;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDislocation() {
        return Dislocation;
    }

    public double getLength() {
        return Length;
    }
    public void setLength(int value) {
        Length=value;
    }
    public String ToString(){
        return getName()+"\t\t"+getDislocation()+"\t\t"+getLength();
    }
}
