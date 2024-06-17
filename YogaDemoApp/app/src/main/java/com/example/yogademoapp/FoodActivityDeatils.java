package com.example.yogademoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FoodActivityDeatils extends AppCompatActivity {


    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_deatils);


        textView = findViewById(R.id.txt);
        String dstory = getIntent().getStringExtra("story");
        textView.setText(dstory);

    }

    public void gooback(View view) {

        Intent intent = new Intent(FoodActivityDeatils.this,FoodActivity.class);
        startActivity(intent);
        finish();

    }

    /**
     * Called when the activity has detected the user's press of the back
     * key. The {@link #getOnBackPressedDispatcher() OnBackPressedDispatcher} will be given a
     * chance to handle the back button before the default behavior of
     * {@link Activity#onBackPressed()} is invoked.
     *
     * @see #getOnBackPressedDispatcher()
     * @deprecated This method has been deprecated in favor of using the
     * {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.
     * The OnBackPressedDispatcher controls how back button events are dispatched
     * to one or more {@link OnBackPressedCallback} objects.
     */
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(FoodActivityDeatils.this,FoodActivity.class);
        startActivity(intent);
        finish();

    }
}