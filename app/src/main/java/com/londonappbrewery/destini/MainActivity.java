package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button first_button;
    Button second_button;
    TextView display_story;
    int storyIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        first_button =(Button) findViewById(R.id.buttonTop);
        second_button =(Button) findViewById(R.id.buttonBottom);
        display_story = (TextView) findViewById(R.id.storyTextView);


        display_story.setText(R.string.T1_Story);
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        first_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (storyIndex == 1 || storyIndex == 2) {
                    display_story.setText(R.string.T3_Story);
                    first_button.setText(R.string.T3_Ans1);
                    second_button.setText(R.string.T3_Ans2);
                    storyIndex = (storyIndex+2);
                }
                else if (storyIndex == 3 || storyIndex == 4){
                    display_story.setText(R.string.T6_End);
                    first_button.setVisibility(view.GONE);
                    second_button.setVisibility(view.GONE);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        second_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (storyIndex == 1 ) {
                    display_story.setText(R.string.T2_Story);
                    first_button.setText(R.string.T2_Ans1);
                    second_button.setText(R.string.T2_Ans2);
                    storyIndex = (storyIndex+1);
                }
                else if (storyIndex == 2) {
                    display_story.setText(R.string.T4_End);
                    first_button.setVisibility(view.GONE);
                    second_button.setVisibility(view.GONE);
                }else  if (storyIndex == 4 || storyIndex == 3){
                    display_story.setText(R.string.T5_End);
                    first_button.setVisibility(view.GONE);
                    second_button.setVisibility(view.GONE);
                }
            }
        });

    }
}
