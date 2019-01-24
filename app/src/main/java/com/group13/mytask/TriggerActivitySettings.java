package com.group13.mytask;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;

public class TriggerActivitySettings extends AppCompatActivity
        implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    Button but_time;
    int d, m, y;
    int hrs, min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigger_settings);
        but_time = findViewById(R.id.but_time);
        but_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                d = c.get(Calendar.DAY_OF_MONTH);
                m = c.get(Calendar.MONTH);
                y = c.get(Calendar.YEAR);

                DatePickerDialog datePickerDialog = new DatePickerDialog(TriggerActivitySettings.this,
                        TriggerActivitySettings.this, y,m,d);
                datePickerDialog.show();
            }
        });

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        d = dayOfMonth;
        m = month + 1;
        y = year;

        Calendar c = Calendar.getInstance();
        hrs = c.get(Calendar.HOUR_OF_DAY);
        min = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(TriggerActivitySettings.this,
                TriggerActivitySettings.this, hrs, min, DateFormat.is24HourFormat(this));
        timePickerDialog.show();
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        hrs = hourOfDay;
        min = minute;

    }
}
