
package jv.snippets;

import java.io.File;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CastTest {

  @Test void testCastString() {
    
    var in = (Object)"foo";

    if(in instanceof String) {
      var out = (String)in;
      assertEquals(out, "foo");
    }
  }

  @Test void testCastFloat() {
    
    var in = (Object)2.3312e7;

    if(in instanceof Double) {
      var out = (Double)in;
      assertEquals(out, 2.3312e7);
    }
  }
}
