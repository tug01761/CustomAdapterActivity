package temple.edu.customadapteractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Resources res = getResources();
    String[] colors = res.getStringArray(R.array.string_color_name);

    //spinner text list
    String[] text={"White", "Red", "Blue", "Yellow", "Purple", "Gray", "Green", "Cyan", "Magenta", "Silver"};

    //color list
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
    int check = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.mySpinner);
        spinner.setOnItemSelectedListener(this);

        ColorAdapter colorAdapter = new ColorAdapter(getApplicationContext(), text, color);
        spinner.setAdapter(colorAdapter);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (++check > 1) {
            Intent myIntent = new Intent(getBaseContext(), SecondActivity.class);
            myIntent.putExtra("key", position);
            startActivity(myIntent);
            TextView selectedText=  view.findViewById(R.id.colorText);
            selectedText.setBackgroundColor(Color.parseColor("white"));
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}
