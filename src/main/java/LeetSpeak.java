
import java.util.ArrayList;
import java.util.List;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class LeetSpeak {
    public static void main(String[] args) {
  }

  public static String speakLeet(String input) {
    char[] inputArray = input.toCharArray();
    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] == 'e') {
        inputArray[i] = '3';
      } else if (inputArray[i] == 'o') {
        inputArray[i] = '0';
      } else if (inputArray[i] == 'I') {
        inputArray[i] = '1';
      } else if (inputArray[i] == 's' && (i != 0 || inputArray[i-1] != ' ')) {
        inputArray[i] = 'z';
      }
    }

    String newString = new String(inputArray);
    return newString;
  }


}
