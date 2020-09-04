package zjdp.template.p3;

import java.io.File;

public class WordNoSortTemplate extends WordsTemplate {
    WordNoSortTemplate(File file) {
        super(file);
    }

    public boolean isSort() {
        return false;
    }
}
