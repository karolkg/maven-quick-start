package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;
public class Application {

    public Application() {
        System.out.println("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main(String[] args) {
        System.out.println("Starting Application");
        Application app = new Application();
        System.out.println(app.countWords("Cos tam do obliczenia"));
    }

    private int countWords(String words) {
        String[] split = StringUtils.split(words, " ");
        return split == null ? 0 : split.length;
    }

}