package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView celsius_text;
    private TextView fahr_text;
    private TextView celsius_val;
    private TextView fahr_val;
    private TextView msg;
    private SeekBar celsius_seekbar;
    private SeekBar fahr_seekbar;
    private Integer cel_set;
    private Integer fah_set;

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

        celsius_seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                celsius_val.setText(String.valueOf(celsius_seekbar.getProgress()));

                if (Integer.parseInt(String.valueOf(celsius_seekbar.getProgress())) <= 20){
                    msg.setText("I wish it were warmer.");
                }
                else{
                    msg.setText("I wish it were colder.");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                celsius_val.setText(String.valueOf(celsius_seekbar.getProgress()));

                fah_set = (Integer.parseInt(String.valueOf(celsius_seekbar.getProgress()))) * (9 / 5) + 32;

                fahr_seekbar.setProgress(Integer.parseInt(String.valueOf(fah_set)));
            }
        });

        fahr_seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                fahr_val.setText(String.valueOf(fahr_seekbar.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                if (Integer.parseInt(String.valueOf(fahr_seekbar.getProgress())) < 32){
                    fahr_seekbar.setProgress(32);
                }

                fahr_val.setText(String.valueOf(fahr_seekbar.getProgress()));

                cel_set = (Integer.parseInt(String.valueOf(fahr_seekbar.getProgress())) - 32) * (5 / 9);

                celsius_seekbar.setProgress(Integer.parseInt(String.valueOf(cel_set)));

            }
        });


    }
}