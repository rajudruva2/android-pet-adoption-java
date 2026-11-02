package com.demo.petadoption;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PetAdoptionActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(40, 48, 40, 40);
        layout.setBackgroundColor(Color.rgb(248, 249, 252));

        TextView heading = new TextView(this);
        heading.setText("Pet Adoption");
        heading.setTextSize(28);
        heading.setTextColor(Color.rgb(32, 45, 68));
        layout.addView(heading);

        TextView intro = new TextView(this);
        intro.setText("Meet your future companion");
        intro.setTextSize(16);
        intro.setTextColor(Color.rgb(95, 105, 120));
        LinearLayout.LayoutParams introParams = new LinearLayout.LayoutParams(-1, -2);
        introParams.setMargins(0, 12, 0, 24);
        layout.addView(intro, introParams);

        String[][] entries = new String[][] {
            {"Milo", "Playful cat · 2 years"},
            {"Luna", "Friendly dog · 3 years"},
            {"Coco", "Gentle rabbit · 1 year"}
        };
        for (String[] entry : entries) {
            LinearLayout card = new LinearLayout(this);
            card.setOrientation(LinearLayout.VERTICAL);
            card.setPadding(24, 20, 24, 20);
            card.setBackgroundColor(Color.WHITE);

            TextView itemTitle = new TextView(this);
            itemTitle.setText(entry[0]);
            itemTitle.setTextSize(19);
            itemTitle.setTextColor(Color.rgb(36, 50, 75));
            card.addView(itemTitle);

            TextView detail = new TextView(this);
            detail.setText(entry[1]);
            detail.setTextSize(14);
            detail.setTextColor(Color.rgb(105, 115, 130));
            LinearLayout.LayoutParams detailParams = new LinearLayout.LayoutParams(-1, -2);
            detailParams.setMargins(0, 8, 0, 0);
            card.addView(detail, detailParams);

            LinearLayout.LayoutParams cardParams = new LinearLayout.LayoutParams(-1, -2);
            cardParams.setMargins(0, 0, 0, 16);
            layout.addView(card, cardParams);
        }
        setContentView(layout);
    }
}
