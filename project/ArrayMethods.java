package project;

public interface ArrayMethods {
    public double getAverageValue();
    public int min();
    public int max();
    public int min2(); //volatile
    public int max2(); //volatile
    public void generateValues(int a,int b);
    public boolean contains(int value);
    public int countofValues(int value);
    public int countOfEvenValues();
    public void incrementValues();
    public void sort(boolean asc);
    public void addItem(int newValue);
    public void addItem(int newValue, int position);//volatile
    public int[] copy();
    public int getItem(int position);
}