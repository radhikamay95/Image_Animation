package com.example.gittest.image_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

 boolean showing=true;
   //method for image animation
    public void fade(View view){

        //viewing user defined logs in console
        Log.i("info", "tapped");

        //imageview initialization
        ImageView imageView_shinchan=findViewById(R.id.imageView);
        ImageView imageView_hima=findViewById(R.id.imageView2);

        //condition for image viewing
        if(showing){
            showing=false;
            imageView_shinchan.animate().alpha(1).setDuration(2000);
            imageView_hima.animate().alpha(0).setDuration(2000);
        }
        else
        {
            showing=true;
            imageView_shinchan.animate().alpha(0).setDuration(2000);
            imageView_hima.animate().alpha(1).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
