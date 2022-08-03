import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaTest {


    @Test
    public void GetAll() {
        ManagerAfisha manager = new ManagerAfisha();
        manager.addMovie("first");
        manager.addMovie("second");
        manager.addMovie("third");

        String[] actual = manager.findAll();
        String[] expected = { "first", "second", "third" };
        assertArrayEquals(actual, expected);
    }

    @Test
    public void GetLastMovie() {
        ManagerAfisha manager = new ManagerAfisha();
        manager.addMovie("first");
        manager.addMovie("second");
        manager.addMovie("third");

        String[] actual = manager.findLast();
        String[] expected = { "third", "second", "first" };
        assertArrayEquals(actual, expected);
    }

    @Test
    public void GetLastMovieLimit() {
        ManagerAfisha manager = new ManagerAfisha(2);
        manager.addMovie("first");
        manager.addMovie("second");
        manager.addMovie("third");

        String[] actual = manager.findLast();
        String[] expected = { "third", "second"};
        assertArrayEquals(actual, expected);
    }
}