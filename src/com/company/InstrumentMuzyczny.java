package com.company;

public interface InstrumentMuzyczny {

    public double PI = 3.14;

    public String getNazwa();

    public String getDzwiek();

    public int getCena();

    public void setCena(int price);


    //ale nie mogę mieć np
    // protected void setTajnaZmianaCeny();
    // i jak bym chciał z tego kozystac to w kazdej klasie musze dodac tą metodę

}
