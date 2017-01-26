package www.minchoba.com.stopwatch.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;

import www.minchoba.com.stopwatch.R;
import www.minchoba.com.stopwatch.activity.listener.add_activity.hour.HourFocusChangeListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.hour.HourMinusClickListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.hour.HourMinusLongClickListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.hour.HourMinusTouchListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.hour.HourPlusClickListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.hour.HourPlusLongClickListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.hour.HourPlusTouchListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.minute.MinuteFocusChangeListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.minute.MinuteMinusClickListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.minute.MinuteMinusLongClickListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.minute.MinuteMinusTouchListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.minute.MinutePlusClickListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.minute.MinutePlusLongClickListener;
import www.minchoba.com.stopwatch.activity.listener.add_activity.minute.MinutePlusTouchListener;
import www.minchoba.com.stopwatch.activity.util.FontAwesome;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        final EditText etHour = (EditText) findViewById(R.id.et_add_hour);

        etHour.setOnFocusChangeListener(new HourFocusChangeListener(etHour));

        final EditText etMinute = (EditText) findViewById(R.id.et_add_minute);

        etMinute.setOnFocusChangeListener(new MinuteFocusChangeListener(etMinute));

        Button btnHourPlus = (Button) findViewById(R.id.btn_add_hour_plus);
        btnHourPlus.setTypeface(FontAwesome.getTypeface(this)); //class를 생성해 fontAwesome을 가져와 쓴다.

        Button btnHourMinus = (Button) findViewById(R.id.btn_add_hour_minus);
        btnHourMinus.setTypeface(FontAwesome.getTypeface(this));

        Button btnMinutePlus = (Button) findViewById(R.id.btn_add_minute_plus);
        btnMinutePlus.setTypeface(FontAwesome.getTypeface(this));

        Button btnMinuteMinus = (Button) findViewById(R.id.btn_add_minute_minus);
        btnMinuteMinus.setTypeface(FontAwesome.getTypeface(this));

        btnHourPlus.setOnClickListener(new HourPlusClickListener(etHour));
        HourPlusLongClickListener hourPlusLongClickListener = new HourPlusLongClickListener(this, etHour);
        btnHourPlus.setOnLongClickListener(hourPlusLongClickListener);
        btnHourPlus.setOnTouchListener(new HourPlusTouchListener(hourPlusLongClickListener));

        btnHourMinus.setOnClickListener(new HourMinusClickListener(etHour));
        HourMinusLongClickListener hourMinusLongClickListener = new HourMinusLongClickListener(this, etHour);
        btnHourMinus.setOnLongClickListener(hourMinusLongClickListener);
        btnHourMinus.setOnTouchListener(new HourMinusTouchListener(hourMinusLongClickListener));

        btnMinutePlus.setOnClickListener(new MinutePlusClickListener(etMinute));
        MinutePlusLongClickListener minutePlusLongClickListener = new MinutePlusLongClickListener(this, etMinute);
        btnMinutePlus.setOnLongClickListener(minutePlusLongClickListener);
        btnMinutePlus.setOnTouchListener(new MinutePlusTouchListener(minutePlusLongClickListener));

        btnMinuteMinus.setOnClickListener(new MinuteMinusClickListener(etMinute));
        MinuteMinusLongClickListener minuteMinusLongClickListener = new MinuteMinusLongClickListener(this, etMinute);
        btnMinuteMinus.setOnLongClickListener(minuteMinusLongClickListener);
        btnMinuteMinus.setOnTouchListener(new MinuteMinusTouchListener(minuteMinusLongClickListener));

        Button btnAlarmAdd = (Button) findViewById(R.id.btn_alarm_add);
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.fa_plus));
        sb.append(" ");
        sb.append(btnAlarmAdd.getText()); // 권장 방법
//        btnAlarmAdd.setText(getResources().getString(R.string.fa_plus)
//                + " "
//                + btnAlarmAdd.getText()
//        );
        btnAlarmAdd.setTypeface(FontAwesome.getTypeface(this)); // fontAwesome을 글자 앞에 붙이기 위함.

    }
}