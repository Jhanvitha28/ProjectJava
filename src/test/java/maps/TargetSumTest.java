package maps;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class TargetSumTest {
    @Test
    public void testFindTwoSumIndices() {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] expected = {3, 5};
        int[] result = TargetSum.findTwoSumIndices(nums, target);
        assertArrayEquals(expected, result);
    }
    @Test
    public void testFindTwoSumIndicesNoSolution() {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 200;
        int[] result = TargetSum.findTwoSumIndices(nums, target);
        assertArrayEquals(new int[0], result);
    }
    @Test
    public void testFindTwoSumIndicesEmptyArray() {
        int[] nums = {};
        int target = 100;
        int[] result = TargetSum.findTwoSumIndices(nums, target);
        assertArrayEquals(new int[0], result);
    }
}
