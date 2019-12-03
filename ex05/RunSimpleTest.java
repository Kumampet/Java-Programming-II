import java.io.IOException;


public class ExampleCode1 {
  @Test
  public static void testMethod1() {
  }

  @Test
  public static void testMethod2() {
    throw new RuntimeException("Test2 should fail");

  @Test
  public static void testMethod3() {
    // Test3 should fail
    int a = 1 / 0;
  }

}
