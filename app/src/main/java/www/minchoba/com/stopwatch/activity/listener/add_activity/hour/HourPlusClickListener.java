package www.minchoba.com.stopwatch.activity.listener.add_activity.hour;

import android.view.View;
import android.widget.EditText;

/**
 * Created by minchoba on 2017. 1. 25..
 */
public class HourPlusClickListener implements View.OnClickListener{
    private EditText etHour;

    public HourPlusClickListener(EditText etHour){
        this.etHour = etHour;
    }

    @Override
    public void onClick(View view) {
        String hourStr = etHour.getText().toString(); //text 창의 내용 가져오기

        if (hourStr.equals("99")) {   // text가 99일때 버튼이 눌리면
            etHour.setText("00");       // 00으로 초기화 해주세요
        } else {
            int hour = Integer.parseInt(hourStr) + 1;   // 그것이 아니면 int로 바꾸어 1을 더해 hour 변수에 할당.

            if (hour < 10) {                                // hour 값이 1자리 숫자면
                StringBuilder sb = new StringBuilder();
                sb.append("0");                         // 해당 hour 앞에 0을 붙여서
                sb.append(hour);
                etHour.setText(sb.toString());          // 다시 String으로 변환 후 text 창에 띄워요.
            } else {
                etHour.setText(String.valueOf(hour));   // 그게 아니면 hour를 그냥 String으로 바꾸고 띄우기만 하면 됩니다.

            }
        }
    }
}
