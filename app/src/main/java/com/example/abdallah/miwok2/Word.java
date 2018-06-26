package com.example.abdallah.miwok2;


public class Word {
    private String mEnglish;
    private String mMiwok;
    private int mImage;
    private int mSound;


    public Word(String defaultWord, String miwokWord, int sound){
        mMiwok = miwokWord;
        mEnglish = defaultWord;
        mSound = sound;

    }
    public Word(String defaultWord, String miwokWord, int image, int sound){
        mMiwok = miwokWord;
        mEnglish = defaultWord;
        mImage = image;
        mSound = sound;
    }

    public String getEnglishWord() {
        return mEnglish;
    }

    public String getMiwokWord() {
        return mMiwok;
    }

    public int getImage(){return mImage;}

    public int getSound(){return mSound;}

}
