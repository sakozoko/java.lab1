package com.company;

import java.util.*;

//is abstraction for rivers collection
public class RiverCollection implements Iterable<River> {

    private final ArrayList<River> _rivers;

    public RiverCollection(){
        _rivers=new ArrayList<>();
    }
    public RiverCollection(River[] rivers){
        _rivers = new ArrayList<>(Arrays.asList(rivers));
    }
    public RiverCollection(ArrayList<River> rivers) {
        _rivers = rivers;
    }

    //return river from collection
    public River get(int item){
        return _rivers.get(item);
    }
    //adds river to collection
    public void addRiver(River river){
        _rivers.add(river);
    }
    //returns river that is shorted than others
    public River getSmallestRiver(){
        int in=0;
        for (int i = 1; i < getSize(); i++) {
            if(this.get(in).getLength()>this.get(i).getLength())
                in=i;
        }
        return this.get(in);
    }
    //returns average length value
    private double avgLength(){
        return sumLength()/getSize();
    }
    //return length of array
    private int getSize()
    {
        return _rivers.size();
    }
    //sums the lengths in the collection
    private double sumLength(){
        double sum=0;
        for (River river : _rivers) {
            sum+=river.getLength();
        }
        return sum;
    }
    // returns rivers whose length is longest that the average length in the collection
    public RiverCollection getLengthGreaterAvgRivers(){
        ArrayList<River> temp = new ArrayList<>();
        for (River river : _rivers) {
            if(river.getLength()>avgLength())
                temp.add(river);
        }
        return new RiverCollection(temp);
    }
    //sorting by input comparator. you can implement comparator to compare by name or length or dislocation
    public void sort(Comparator<River> comparer){
        _rivers.sort(comparer);
    }
    //searching in collection by input name. return result or null
    public River findByName(String sname){
        for (River river : _rivers) {
            if(river.getName().equalsIgnoreCase(sname))
                return river;
        }
        return null;
    }


    @Override
    public Iterator<River> iterator() {
        return _rivers.iterator();
    }
}
