package www.minchoba.com.stopwatch.activity.listener.add_activity.minute;

import android.view.View;
import android.widget.EditText;

/**
 * Created by minchoba on 2017. 1. 25..
 */
public class MinuteMinusClickListener implements View.OnClickListener{
    private EditText etHour;

    public MinuteMinusClickListener(EditText etHour){
        this.etHour = etHour;
    }

    @Override
    public void onClick(View view) {
        String hourStr = etHour.getText().toString(); //text 창의 내용 가져오기

        if (hourStr.equals("00")) {
            etHour.setText("59");
        } else {
            int hour = Integer.parseInt(hourStr) - 1;

            if (hour < 10) {
                StringBuilder sb = new StringBuilder();
                sb.append("0");
                sb.append(hour);
                etHour.setText(sb.toString());
            } else {
                etHour.setText(String.valueOf(hour));

            }
        }
    }
}
