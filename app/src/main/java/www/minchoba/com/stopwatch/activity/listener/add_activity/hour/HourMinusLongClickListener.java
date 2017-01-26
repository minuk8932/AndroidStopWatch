package www.minchoba.com.stopwatch.activity.listener.add_activity.hour;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.EditText;

/**
 * Created by minchoba on 2017. 1. 25..
 */
public class HourMinusLongClickListener implements View.OnLongClickListener {
    private static final int CONTROL_TIME_INTERVAL = 100;


    private EditText etHour;
    private static boolean isUIThreadRunning;
    private Activity activity;

    public HourMinusLongClickListener(Context context, EditText etHour) {
        this.etHour = etHour;
        isUIThreadRunning = false;
        activity = (Activity) context;

    }

    @Override
    public boolean onLongClick(View view) {
        isUIThreadRunning = true;

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (isUIThreadRunning) {
                    try {

                        Thread.sleep(CONTROL_TIME_INTERVAL);

                    } catch (InterruptedException e) {

                    }
                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            String hourStr = etHour.getText().toString();

                            if (hourStr.equals("00")) {
                                etHour.setText("99");
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
                    });
                }

            }
        }).start();


        return false;
    }

    public void setUIThreadRunning(boolean isUIThreadRunning) {
        this.isUIThreadRunning = isUIThreadRunning;
    }
}
