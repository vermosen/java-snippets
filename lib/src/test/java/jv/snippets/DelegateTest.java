/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jv.snippets;

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
}
