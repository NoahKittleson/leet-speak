import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class LeetSpeakTest {
  @Test
  public void leetSpeak_returnsAStringWithNoLeet_String () {
    LeetSpeak newLeetTest = new LeetSpeak();
    assertEquals("happy", newLeetTest.speakLeet("happy"));
  }

  @Test
  public void leetSpeak_returnsAStringWithEas3_String () {
    LeetSpeak newLeetTest = new LeetSpeak();
    assertEquals("l33tzp3ak", newLeetTest.speakLeet("leetspeak"));
  }

  @Test
  public void leetSpeak_returnAstringWithOAs0_String() {
    LeetSpeak newLeetTest = new LeetSpeak();
    assertEquals("b00l", newLeetTest.speakLeet("bool"));
  }

  @Test
  public void leetSpeak_returnAstringWithCapitalIAs1_String() {
    LeetSpeak newLeetTest = new LeetSpeak();
    assertEquals("capital 1", newLeetTest.speakLeet("capital I"));
  }

  @Test
  public void leetSpeak_returnAstringWithCertianSAsZ_String() {
    LeetSpeak newLeetTest = new LeetSpeak();
    assertEquals("Sazzy Sally", newLeetTest.speakLeet("Sassy Sally"));
  }
}
