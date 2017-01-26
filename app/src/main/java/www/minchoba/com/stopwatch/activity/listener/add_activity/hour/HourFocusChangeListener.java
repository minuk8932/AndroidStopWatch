package www.minchoba.com.stopwatch.activity.listener.add_activity.hour;

import android.view.View;
import android.widget.EditText;

/**
 * Created by minchoba on 2017. 1. 25.
 */
public class HourFocusChangeListener implements View.OnFocusChangeListener {
    private EditText etHour;

    public HourFocusChangeListener (EditText etHour){
        this.etHour = etHour;
    }

    @Override
    public void onFocusChange(View view, boolean b) {
        if(!b){
            String hourStr = etHour.getText().toString();

            if(hourStr.length() == 0 || Integer.parseInt(hourStr) > 59){ // 공백으로 두거나, 분이 59가 넘어가면.
                etHour.setText("00");
            }
        }
    }
}
