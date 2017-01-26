package www.minchoba.com.stopwatch.activity.listener.add_activity.minute;

import android.view.MotionEvent;
import android.view.View;

import www.minchoba.com.stopwatch.activity.listener.add_activity.hour.HourMinusLongClickListener;

/**
 * Created by minchoba on 2017. 1. 25..
 */
public class MinuteMinusTouchListener implements View.OnTouchListener{
    private MinuteMinusLongClickListener minuteMinusLongClickListener;

    public MinuteMinusTouchListener(MinuteMinusLongClickListener minuteMinusLongClickListener){
        this.minuteMinusLongClickListener = minuteMinusLongClickListener;
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(motionEvent.getAction() == motionEvent.ACTION_UP){
            minuteMinusLongClickListener.setUIThreadRunning(false);
        }
        return false;
    }
}
