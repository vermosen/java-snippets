
package jv.snippets;

import java.io.File;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DelegateTest {

  private int m_counter = 0;

  public void method(int value) {
    m_counter += value;
  }

  @Test void incrementCounter() {
      
    Delegate<Integer> dlg = new Delegate<Integer>((a) -> this.method(a));
    dlg.invoke(1);
    dlg.invoke(2);
    dlg.invoke(3);

    assertTrue(this.m_counter == 6);
  }

  @Test void testFileAbsolutePath() {
    
    var root = "";
    var env = System.getenv();


    if (env.values().contains("TMP")) {
      root = env.get("TMP");
    } else if (env.values().contains("TEMP")) {
      root = env.get("TEMP");
    } else {
      root = "/tmp";
    }

    var f = new File(root, "test.txt");

    assertEquals(f.getPath(), "/tmp/test.txt");
  }
}
