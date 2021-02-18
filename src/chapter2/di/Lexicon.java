package chapter2.di;

import java.util.Collections;
import java.util.Set;

public class Lexicon {
    private static final Set<String> words = Collections.singleton("hell");

    public boolean isAWord(final String word) {
        return words.contains(word);
    }
}
