package www.minchoba.com.stopwatch.activity.listview.item;


import android.widget.Button;
import android.widget.TextView;

public class MainListViewItem {
    private String timeStr;
    private boolean isRunning;

    public MainListViewItem(String timeStr, boolean isRunning){
        this.timeStr = timeStr;
        this.isRunning = isRunning;
    }

    public String getTimeStr(){
        return timeStr;
    }
    public void setTimeStr(String timeStr){
        this.timeStr = timeStr;
    }

    public boolean getIsRunning(){
        return isRunning;
    }
    public void setIsRunning(boolean isRunning){
        this.isRunning = isRunning;
    }

}
