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

            if(hourStr.length() == 0){ // text가 공백이면 (길이:0)
                etHour.setText("00"); //해당 hour text 창을 00으로 초기화 해주세요
            }
        }
    }
}
