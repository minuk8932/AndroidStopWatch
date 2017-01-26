package www.minchoba.com.stopwatch.activity.listener.add_activity.minute;

import android.view.View;
import android.widget.EditText;

/**
 * Created by minchoba on 2017. 1. 25..
 */
public class MinutePlusClickListener implements View.OnClickListener{
    private EditText etMinute;

    public MinutePlusClickListener(EditText etMinute){
        this.etMinute = etMinute;
    }

    @Override
    public void onClick(View view) {
        String minuteStr = etMinute.getText().toString(); //text 창의 내용 가져오기

        if (minuteStr.equals("59")) {
            etMinute.setText("00");
        } else {
            int minute = Integer.parseInt(minuteStr) + 1;

            if (minute < 10) {
                StringBuilder sb = new StringBuilder();
                sb.append("0");
                sb.append(minute);
                etMinute.setText(sb.toString());
            } else {
                etMinute.setText(String.valueOf(minute));

            }
        }
    }
}
