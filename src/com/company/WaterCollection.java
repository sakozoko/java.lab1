package com.company;

import java.util.*;

//is abstraction for waters collection
public class WaterCollection<T extends IWater> implements Iterable<T>{

    private final ArrayList<T> _waters;

    public WaterCollection(){
        _waters=new ArrayList<>();
    }
    public WaterCollection(T[] waters){
        _waters = new ArrayList<>(Arrays.asList(waters));
    }
    public WaterCollection(ArrayList<T> waters) {
        _waters = waters;
    }
    //returns average length value
    private double avgLength(){
        return sumLength()/getSize();
    }
    //return length of array
    private int getSize()
    {
        return _waters.size();
    }
    //sums the lengths in the collection
    private double sumLength(){
        double sum=0;
        for (T water : this) {
            sum+=water.getLength();
        }
        return sum;
    }
    //return water from collection
    public T get(int item){
        return _waters.get(item);
    }
    //adds water to collection
    public void addWater(T water){
        _waters.add(water);
    }
    //returns water that is shorted than others
    public T getSmallestWater(){
        int in=0;
        for (int i = 1; i < getSize(); i++) {
            if(this.get(in).getLength()>this.get(i).getLength())
                in=i;
        }
        return this.get(in);
    }

    // returns rivers whose length is longest that the average length in the collection
    public WaterCollection<T> getLengthGreaterAvgWaters(){
        ArrayList<T> temp = new ArrayList<>();
        for (T water : this) {
            if(water.getLength()>avgLength())
                temp.add(water);
        }
        return new WaterCollection<>(temp);
    }
    //sorting by input comparator. you can implement comparator to compare by name or length or dislocation
    public void sort(Comparator<T> comparator){
        _waters.sort(comparator);
    }
    //sorting by name
    public void sort()
    {
        _waters.sort(new ComparatorByName());
    }

    //searching in collection by input name. return result or null
    public T findByName(String sname){
        for (T water : this) {
            if(water.getName().equalsIgnoreCase(sname))
                return water;
        }
        return null;
    }


    @Override
    public Iterator<T> iterator() {
        return _waters.iterator();
    }

    private  class ComparatorByName implements Comparator<T> {
        @Override
        public int compare(T o1, T o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
