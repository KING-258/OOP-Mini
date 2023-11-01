public class King extends Thread {
          public void print() {
                    try {
                              System.out.print("K");
                              Thread.sleep(500);
                              System.out.print("I");
                              Thread.sleep(500);
                              System.out.print("N");
                              Thread.sleep(500);
                              System.out.print("G");
                              Thread.sleep(500);
                    } catch (Exception e) {
                    }
                    System.out.println();
          }
}