package nl.learninablitz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class OddNumberFilterTest {

    @Test
    public void testFilterOdds_normalScenario_expectedResult() {
        OddNumberFilter filter = new OddNumberFilter();
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 3, 5);
        assertEquals(expected, filter.filterOdds(input));
    }

    @Test
    public void testFilterOdds_emptyList_expectedResult() {
        OddNumberFilter filter = new OddNumberFilter();
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, filter.filterOdds(input));
    }

    @Test
    public void testFilterOdds_allEvenNumbers_expectedResult() {
        OddNumberFilter filter = new OddNumberFilter();
        List<Integer> input = Arrays.asList(2, 4, 6, 8);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, filter.filterOdds(input));
    }

    @Test
    public void testFilterOdds_allOddNumbers_expectedResult() {
        OddNumberFilter filter = new OddNumberFilter();
        List<Integer> input = Arrays.asList(1, 3, 5, 7);
        List<Integer> expected = Arrays.asList(1, 3, 5, 7);
        assertEquals(expected, filter.filterOdds(input));
    }
}
