package www.minchoba.com.stopwatch.activity.listener.add_activity.minute;

import android.view.MotionEvent;
import android.view.View;

import www.minchoba.com.stopwatch.activity.listener.add_activity.hour.HourPlusLongClickListener;

/**
 * Created by minchoba on 2017. 1. 25..
 */
public class MinutePlusTouchListener implements View.OnTouchListener{
    private MinutePlusLongClickListener minutePlusLongClickListener;

    public MinutePlusTouchListener(MinutePlusLongClickListener minutePlusLongClickListener){
        this.minutePlusLongClickListener = minutePlusLongClickListener;
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(motionEvent.getAction() == motionEvent.ACTION_UP){
            minutePlusLongClickListener.setUIThreadRunning(false);
        }
        return false;
    }
}
