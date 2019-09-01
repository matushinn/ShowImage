package com.example.showimage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button changeImageButton = (Button) findViewById(R.id.changeImage);

        changeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView animalImage = (ImageView) findViewById(R.id.animal);

                animalImage.setImageResource(R.drawable.lion);
            }
        });
    }
}
