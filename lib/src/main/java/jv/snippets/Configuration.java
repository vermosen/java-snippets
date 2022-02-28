package jv.snippets;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class Configuration {
  
  public Configuration() {
  }

  private String m_foo;
  private double m_bar;
  private boolean m_baz;

  static public Configuration parse(String path) throws Exception {

    var mapper = new ObjectMapper(new YAMLFactory());

    try {
      var rv = mapper.readValue(new File("src/main/resources/config.yaml"), Configuration.class);
      return rv;
    } catch (Exception ex) {
      throw ex;
    }
  }
}
