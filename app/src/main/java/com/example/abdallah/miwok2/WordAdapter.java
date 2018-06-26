package com.example.abdallah.miwok2;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int color){
        super(context,0, words);
        mColor = color;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwok = listItemView.findViewById(R.id.miwok_word);
        assert currentWord != null;
        miwok.setText(currentWord.getMiwokWord());

        TextView english = listItemView.findViewById(R.id.default_word);
        english.setText(currentWord.getEnglishWord());

        ImageView image = listItemView.findViewById(R.id.image);
        if (currentWord.getImage() != 0){
        image.setImageResource(currentWord.getImage());
        image.setVisibility(View.VISIBLE);}

        else {image.setVisibility(View.GONE);}

        View textContainer = listItemView.findViewById(R.id.list_layout);
        int color = ContextCompat.getColor(getContext(), mColor);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

