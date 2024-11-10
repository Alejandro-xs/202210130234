import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExtractor {
    public static void main(String[] args) {
        String sourceCode = "一般学习一门编程语言的时候，基本上第一个程序是输出\\\"Hello World!\\\"";
        Pattern pattern = Pattern.compile("\"((?:\\\\\"|[^\"])+)\"");
        Matcher matcher = pattern.matcher(sourceCode);
        String result = sourceCode;
        while (matcher.find()) {
            String foundString = matcher.group(1).replace("\\\"", "\"");
            result = result.replace(matcher.group(0), "\"" + foundString + "\"");
        }
        System.out.println(result);
    }
}
