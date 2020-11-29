package tech.delia;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalendarServiceTest
{
    private CalendarService calendarService;

    @BeforeEach
    public void setUp()
    {
        calendarService = new CalendarService();
    }

    @Test
    void isItSpringYetIsTrueWhen2SwallowAndOthers()
    {
        assertTrue(calendarService.isItSpringYet(List.of(
                new Bird(Species.PIGEON, Sex.MALE, 60),
                new Bird(Species.SWALLOW, Sex.UNKNOWN, 15),
                new Bird(Species.CROW, Sex.FEMALE, 80),
                new Bird(Species.SWALLOW, Sex.MALE, 18)
        )));
    }

    @Test
    void isItSpringYetIsFalseWhen1Swallow()
    {
        assertFalse(calendarService.isItSpringYet(List.of(
                new Bird(Species.SWALLOW, Sex.FEMALE, 18)
        )));
    }
}
