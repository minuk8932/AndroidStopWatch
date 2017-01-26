package www.minchoba.com.stopwatch.activity.listener.add_activity.minute;

import android.view.View;
import android.widget.EditText;

/**
 * Created by minchoba on 2017. 1. 25..
 */
public class MinuteFocusChangeListener implements View.OnFocusChangeListener {
    private EditText etMinute;

    public MinuteFocusChangeListener ( EditText etMinute){
        this.etMinute = etMinute;
    }
    @Override
    public void onFocusChange(View view, boolean b) {
        if(!b){
            String minuteStr = etMinute.getText().toString();

            if(minuteStr.length() == 0 || Integer.parseInt(minuteStr) > 59){ // 분에 해당하는 text가
                                                                    // 공백이거나 59보다 큰 숫자가 들어가면
                etMinute.setText("00");                 // 00으로 초기화 해주세요.
            }
            else if(minuteStr.length() == 1){           // 만약 위의조건이 아닐때 분에 해당하는 text 길이가 1이면 (ex:6)
                StringBuilder sb = new StringBuilder();
                sb.append("0");                         // 그 text앞에 0을 붙여주세요 (ex:06)
                sb.append(minuteStr);
                etMinute.setText(sb.toString());
            }
        }
    }
}
