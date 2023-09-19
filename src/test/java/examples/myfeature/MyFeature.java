package examples.myfeature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class MyFeature {

  private static final Logger log = LoggerFactory.getLogger(MyFeature.class);

  public MyFeature() {
    super();
  }

  public void send(final String x) {
    log.info("Hello {}!", x);
  }

  public List<Map<String, Object>> getExpectedResult() {
    return List.of(Map.of("id", 1, "desc", "desc1"), Map.of("id", 2, "desc", "desc2"));
  }

  public Boolean assertResult1(final List<Map<String, Object>> result) {
    log.info("assertResult1");
    return true;
  }

  public Boolean assertResult2(final List<Map<String, Object>> result) {
    log.info("assertResult2");
    return true;
  }
}
