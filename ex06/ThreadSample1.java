public class ThreadSample1 extends Thread{ // [1]
  public static void main(String[] args) { // [2]
    ThreadSample1 sample1 = new ThreadSample1(); // [3]
    sample1.start(); // [4]
    for (int i = 0; i < 10; i++) {
      System.out.println("mainメソッドでの処理 = " + i);
    }
  }
  @Override
  public void run(){ // [5]
    for (int r = 0; r < 10; r++) {
      System.out.println("runメソッドでの処理" + r);
    }
  }
}
