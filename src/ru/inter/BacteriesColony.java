package ru.inter;

public class BacteriesColony {
    private boolean isColonyChanged = true;

    public int[] performTheExperiment(int[] colonies) throws ColonyInputException {
        ColonyInput check = new ColonyInput();
        check.colonyCheck(colonies);

        int[] colonyChange = new int[colonies.length];

        while(isColonyChanged) {
            isColonyChanged = false;

            for (int i = 1; i < colonies.length - 1; i++){
                if (colonies[i-1] > colonies[i] && colonies[i+1] > colonies[i]) {
                    colonyChange[i] = 1;
                    isColonyChanged = true;
                } else if (colonies[i-1] < colonies[i] && colonies[i+1] < colonies[i]) {
                    colonyChange[i] = -1;
                    isColonyChanged = true;
                } else {
                    colonyChange[i] = 0;
                }
            }

            for (int i = 1; i < colonies.length - 1; i++) {
                colonies[i] = colonies[i] + colonyChange[i];
            }
        }

        return colonies;
    }
}
