package temple.edu.customadapteractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    int[] color={Color.parseColor("white"),
            Color.parseColor("red"),
            Color.parseColor("blue"),
            Color.parseColor("yellow"),
            Color.parseColor("purple"),
            Color.parseColor("grey"),
            Color.parseColor("green"),
            Color.parseColor("cyan"),
            Color.parseColor("magenta"),
            Color.parseColor("silver")};
    View background;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        background = (View) findViewById(R.id.background);
        Intent intent = getIntent();
        int position = intent.getIntExtra("key", 0);
        background.setBackgroundColor(color[position]);

    }
}
