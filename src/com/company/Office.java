package com.company;

import java.util.ArrayList;
import java.util.List;

public class Office {
    List<Cabinet> cabinets = new ArrayList<>();
    public void addcabinet(Cabinet cabinet){
        cabinets.add(cabinet);
    }
}
