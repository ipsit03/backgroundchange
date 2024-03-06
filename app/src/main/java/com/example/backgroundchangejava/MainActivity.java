package com.example.backgroundchangejava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout backgroundlayout;
    Button changeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backgroundlayout = findViewById(R.id.backgroundlayout);
        changeButton = findViewById(R.id.changebutton);

        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = getRandomColor();
                backgroundlayout.setBackgroundColor(color);
            }
        });
    }

    private int getRandomColor() {
        // Generate random RGB values
        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);
        // Combine into a color integer
        return 0xff000000 | (r << 16) | (g << 8) | b;
    }
}
