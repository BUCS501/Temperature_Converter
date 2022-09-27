package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView celsius_text;
    private TextView fahr_text;
    private TextView celsius_val;
    private TextView fahr_val;
    private TextView msg;
    private SeekBar celsius_seekbar;
    private SeekBar fahr_seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celsius_text = (TextView) findViewById(R.id.celsius_text);
        fahr_text = (TextView) findViewById(R.id.fahr_text);

        celsius_val = (TextView) findViewById(R.id.celsius_val);
        fahr_val = (TextView) findViewById(R.id.fahr_val);

        msg = (TextView) findViewById(R.id.msg);

        celsius_seekbar = (SeekBar) findViewById(R.id.celsius_seekbar);
        fahr_seekbar = (SeekBar) findViewById(R.id.fahr_seekBar);

    }
}