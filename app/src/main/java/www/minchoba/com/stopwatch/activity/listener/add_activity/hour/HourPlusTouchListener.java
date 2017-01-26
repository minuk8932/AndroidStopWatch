package www.minchoba.com.stopwatch.activity.listener.add_activity.hour;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by minchoba on 2017. 1. 25..
 */
public class HourPlusTouchListener implements View.OnTouchListener{
    private HourPlusLongClickListener hourPlusLongClickListener;

    public HourPlusTouchListener(HourPlusLongClickListener hourPlusLongClickListener){
        this.hourPlusLongClickListener = hourPlusLongClickListener;
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(motionEvent.getAction() == motionEvent.ACTION_UP){
            hourPlusLongClickListener.setUIThreadRunning(false);
        }
        return false;
    }
}
