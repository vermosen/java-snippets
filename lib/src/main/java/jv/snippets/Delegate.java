package jv.snippets;

import java.util.function.Consumer;


public class Delegate<T> {
  public Delegate(Consumer<T> func) {
    this.m_func = func;
  }

  public void invoke(T arg) {
    m_func.accept(arg);
  }

  private Consumer<T> m_func;
}
