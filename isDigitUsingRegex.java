import java.util.regex.*;

class Solution {
    public boolean isDigitUsingRegex(String s) {
        //   ^ - start
        //   (()|()) for condition
        //   + - 1 or more times
        //   * - 0 or more times
        //   ? - optional it may or may not come eg. a? means "a" is true "" is also true
        //   . - any character
        //   \\. - means '.' character should come
        //   \\d means digits(0-9)
        //   $ - end
        String regex = "^[+-]?((\\d+)|(\\d+\\.\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$";
        return Pattern.matches(regex,s);
    }
}