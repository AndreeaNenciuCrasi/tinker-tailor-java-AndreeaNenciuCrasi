package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;

class TinkerTailor {

    int n, k;

    public TinkerTailor(int n, int k) {
        this.n = n;
        this.k = k;
    }


    public List execute() {
        List<Integer> outcome = new ArrayList<>();
        List<Integer> initial = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < this.n; i++) {
            initial.add(i + 1);
        }

        while(initial.size() > 0){
            index = (index +k -1) % initial.size();
            outcome.add(initial.remove(index));
        }

        return outcome;
    }
}