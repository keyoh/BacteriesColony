package ru.inter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ColonyInputException {

        int[] colonies = {5, 3, 4, 6, 1 };

        BacteriesColony i = new BacteriesColony();

        colonies = i.performTheExperiment(colonies);

        System.out.println(Arrays.toString(colonies));

    }
}
