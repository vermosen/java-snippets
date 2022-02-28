
package jv.snippets;

import java.io.File;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigurationTest {

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
