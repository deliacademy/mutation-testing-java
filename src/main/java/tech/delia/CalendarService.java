package tech.delia;

import java.util.List;

public class CalendarService
{
    /**
     * Will tell whether if Spring has come yet, based on a given flock of birds.
     *
     * @param birds A flock of birds that were spotted
     * @return Wether if it is Spring yet, based on the rule: "A swallow does not a spring make"
     */
    public boolean isItSpringYet(List<Bird> birds)
    {
        int swallowsCount = 0;

        for (Bird bird: birds) {
            if (Species.SWALLOW.equals(bird.getSpecies())) {
                swallowsCount++;
            }
        }

        return swallowsCount > 1;
    }
}
