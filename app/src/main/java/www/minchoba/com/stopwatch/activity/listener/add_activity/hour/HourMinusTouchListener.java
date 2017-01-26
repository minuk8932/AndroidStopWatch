package www.minchoba.com.stopwatch.activity.listener.add_activity.hour;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by minchoba on 2017. 1. 25..
 */
public class HourMinusTouchListener implements View.OnTouchListener{
    private HourMinusLongClickListener hourMinusLongClickListener;

    public HourMinusTouchListener(HourMinusLongClickListener hourMinusLongClickListener){
        this.hourMinusLongClickListener = hourMinusLongClickListener;
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(motionEvent.getAction() == motionEvent.ACTION_UP){
            hourMinusLongClickListener.setUIThreadRunning(false);
        }
        return false;
    }
}
