package com.example.yogademoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {



    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Toolbar toolbar = findViewById(R.id.toolBar);


        newArray = new int[]{


                R.id.bow_pose,R.id.bridge_pose,R.id.chair_pose,R.id.child_pose,R.id.cobbler_pose,R.id.cow_pose,R.id.playji_pose,R.id.pauseji_pose,R.id.playji_pose,R.id.crunches_pose,R.id.situp_pose,R.id.situp_pose,R.id.rotation_pose,R.id.twist_pose,R.id.windmill_pose,


        };
    }

    public void Imagebuttonclicked(View view) {


        for (int i=0;i< newArray.length;i++){


            if (view.getId() == newArray[i]) {
                int value = i+1;
                Log.i("ПЕРВЫЙ",String.valueOf(value));
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);



            }
        }

    }
}