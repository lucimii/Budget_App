package com.example.budgetingapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayout = findViewById(R.id.LinLay);

        fillPaintingGallery();
    }

    private void fillPaintingGallery() {

        ImageButton buttonItem;

for (int i = 0; i < PicDataBase.id.length; i++) {


    buttonItem = new ImageButton(this);

    buttonItem.setImageDrawable(getDrawable(PicDataBase.id[i]));
    mLinearLayout.addView(buttonItem);
}

    }

}


