package com.example.aden.kotlintutor2000;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SlideAdapterMainMenu extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SlideAdapterMainMenu(Context context) {
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.why_learn_kotlin,
            R.drawable.evolution_kotlin,
            R.drawable.about_kotlin_hub
    };


    @Override
    public int getCount() {
        return slide_images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.main_activity_slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.main_activity_slide_image);
        slideImageView.setImageResource(slide_images[position]);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(position ==0) {
                    Intent myIntent = new Intent(context, WhyKotlinActivity.class);
                    context.startActivity(myIntent);
                }
                else if (position ==1) {
                   Intent myIntent = new Intent(context, KotlinEvolutionActivity.class);
                   context.startActivity(myIntent);
                }
                else { //position 2
                    Intent myIntent = new Intent(context, AboutUsActivity.class);
                    context.startActivity(myIntent);
                }
            }

        });

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout) object);
    }
}
