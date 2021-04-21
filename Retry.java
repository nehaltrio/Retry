package KeyPress;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Retry {
  public static void main(String[] args) throws Exception {
    
    Robot robot = new Robot();
    
    for (int i = 0; i <20; i++) {
      Thread.sleep(4000);
      robot.keyPress(KeyEvent.VK_F5);
      robot.keyRelease(KeyEvent.VK_F5);
    }
  }
}
