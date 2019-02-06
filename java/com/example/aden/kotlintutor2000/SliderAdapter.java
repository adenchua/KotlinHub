package com.example.aden.kotlintutor2000;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.kotlin_hub_logo_transparent,
            R.drawable.step_by_step,
            R.drawable.test,
            R.drawable.play_games
    };

    public String[] slide_headings = {
            "Welcome to Kotlin Hub",
            "Step-By-Step Guide",
            "Check Your Understanding",
            "Challenge Your Friends"
    };

    public String[] slide_desc = {
            "",
            "Learning Kotlin should be easy. We have created a step-by-step pocket guide that is easy to follow and easy to read. Learn anytime, anywhere with Kotlin Hub",
            "Questions are added to the end of every lesson to check your understanding of the concepts and issues presented in the tutorial. No worries, answers are provided too",
            "Want to test your understanding of Kotlin against your friends? Kotlin Hub comes with an interactive game where you can compete with a friend with just a mobile phone"
    };


    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_description);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_desc[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
