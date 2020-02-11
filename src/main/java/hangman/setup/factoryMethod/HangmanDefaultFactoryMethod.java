package hangman.setup.factoryMethod;

import com.google.inject.Guice;
import com.google.inject.Injector;
import hangman.GUI;

import hangman.model.English;
import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.OriginalScore;
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.setup.guice.HangmanFactoryServices;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;

public class HangmanDefaultFactoryMethod extends HangmanFactoryMethod {
    @Override
    public Language createLanguage() {
        //return new English();
        Injector injectService = Guice.createInjector(new HangmanFactoryServices());
        return injectService.getInstance(Language.class);
    }

    @Override
    public HangmanDictionary createDictionary() {
        //return new EnglishDictionaryDataSource();
        Injector injectService = Guice.createInjector(new HangmanFactoryServices());
        return injectService.getInstance(HangmanDictionary.class);
    }

    @Override
    public HangmanPanel createHangmanPanel() {
        //return new HangmanStickmanPanel();
        Injector injectService = Guice.createInjector(new HangmanFactoryServices());
        return injectService.getInstance(HangmanPanel.class);
    }

    @Override
    public GameScore createGameScore(){
        Injector injectService = Guice.createInjector(new HangmanFactoryServices());
        return injectService.getInstance(GameScore.class);
    }
}
