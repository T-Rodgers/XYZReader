package com.example.xyzreader.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

public class CustomFonts {

    public static void setCustomFontOne(TextView textView, Context context) {
        textView.setTypeface(Typeface.createFromAsset(context.getResources().getAssets(), "NotoSansJP-Bold.otf"));
    }


    public static void setCustomFontTwo(TextView textView, Context context) {
        textView.setTypeface(Typeface.createFromAsset(context.getResources().getAssets(), "OpenSans-Regular.ttf"));
    }
}
