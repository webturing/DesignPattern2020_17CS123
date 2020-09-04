package zjdp.template.p3;

import java.io.File;
import java.util.Arrays;

public class WordSortTemplate extends WordsTemplate {
    WordSortTemplate(File file) {
        super(file);
    }

    public void sort(String[] word) {
        Arrays.sort(word);
    }
}
