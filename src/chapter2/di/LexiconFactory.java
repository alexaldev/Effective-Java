package chapter2.di;

import java.util.function.Supplier;

public class LexiconFactory implements Supplier<Lexicon> {

    private static final LexiconFactory instance = new LexiconFactory();

    public static LexiconFactory getInstance() {
        return instance;
    }

    @Override
    public Lexicon get() {
        return new Lexicon();
    }
}
