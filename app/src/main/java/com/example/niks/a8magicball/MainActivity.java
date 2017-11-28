package com.example.niks.a8magicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_roll;

        button_roll = (Button)findViewById(R.id.button);

       final ImageView Ball = (ImageView)findViewById(R.id.image_ball);


       final int[] BallArray = {
               R.drawable.ball1,
               R.drawable.ball2,
               R.drawable.ball3,
               R.drawable.ball4,
        R.drawable.ball5,


       };
      button_roll.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Random rand = new Random();

              int num = rand.nextInt(5);

              Ball.setImageResource(BallArray[num]);

          }
      });

    }
}
