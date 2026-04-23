import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  @Test
  public void testMostCommonTimeEfficient() {
    int[] nums = {1, 2, 2, 3};
    assertEquals(2, Practice.mostCommonTimeEfficient(nums));
  }

  @Test
  public void testMostCommonTimeEfficientAllSame() {
    int[] nums = {5, 5, 5, 5};
    assertEquals(5, Practice.mostCommonTimeEfficient(nums));
  }

  @Test
  public void testMostCommonTimeEfficientSingleElement() {
    int[] nums = {7};
    assertEquals(7, Practice.mostCommonTimeEfficient(nums));
  }
  @Test
  public void testMostCommonSpaceEfficient() {
    int[] nums = {1, 2, 2, 3};
    assertEquals(2, Practice.mostCommonSpaceEfficient(nums));
  }

  @Test
  public void testMostCommonSpaceEfficientAllSame() {
    int[] nums = {5, 5, 5, 5};
    assertEquals(5, Practice.mostCommonSpaceEfficient(nums));
  }

  @Test
  public void testMostCommonSpaceEfficientSingleElement() {
    int[] nums = {7};
    assertEquals(7, Practice.mostCommonSpaceEfficient(nums));
  }

}
