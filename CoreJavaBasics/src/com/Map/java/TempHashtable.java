package com.Map.java;

public class TempHashtable {
    int i;
    TempHashtable (int i)
    {
        this.i = i;
    }

    public int hashCode()
    {
        return i;
    }

    public String toString()
    {
        return i+" ";
    }
}
