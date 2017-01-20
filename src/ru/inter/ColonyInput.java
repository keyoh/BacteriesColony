package ru.inter;

public class ColonyInput {
    public void colonyCheck(int[] colonies) throws ColonyInputException {
        {
            if (colonies.length < 3)
                throw new ColonyInputException("Not enough vessels! Between 3 and 50 elements (inclusive) are required.");
            if (colonies.length > 50)
                throw new ColonyInputException("Too many vessels! Between 3 and 50 elements (inclusive) are required.");
            for (int colony : colonies) {
                if (colony > 100)
                    throw new ColonyInputException("Too many bacteria in one or more vessels! Between 1 and 100 elements (inclusive) are required.");
                if (colony < 1)
                    throw new ColonyInputException("One or more vessels doesn't have enough bacteria! Between 1 and 100 elements (inclusive) are required.");
            }
        }
    }
}
