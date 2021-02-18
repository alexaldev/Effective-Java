package chapter2.di;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(final Supplier<? extends Lexicon> lexiconFactory) {
        this.dictionary = lexiconFactory.get();
    }

    public boolean isValid(String word) {
        return dictionary.isAWord(word);
    }

    public List<String> suggestions(String typo) {
        return Collections.emptyList();
    }
}
