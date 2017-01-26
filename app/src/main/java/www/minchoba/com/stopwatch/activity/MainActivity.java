package www.minchoba.com.stopwatch.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import www.minchoba.com.stopwatch.R;
import www.minchoba.com.stopwatch.activity.listview.adapter.MainListViewAdapter;
import www.minchoba.com.stopwatch.activity.listview.item.MainListViewItem;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MainListViewItem> mainArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainArrayList = new ArrayList<>();
        mainArrayList.add(new MainListViewItem("00:00", false));
        mainArrayList.add(new MainListViewItem("10:11", false));
        mainArrayList.add(new MainListViewItem("12:13", false));
        mainArrayList.add(new MainListViewItem("14:15", false));
        mainArrayList.add(new MainListViewItem("16:17", false)); //item에서 생성자 선언이 되었으므로 초기화.

        MainListViewAdapter mainListViewAdapter = new MainListViewAdapter(mainArrayList);
        ListView listViewMain = (ListView) findViewById(R.id.listview_main);
        listViewMain.setAdapter(mainListViewAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_add:
                Intent addIntent = new Intent(MainActivity.this, AddActivity.class);
                MainActivity.this.startActivity(addIntent);
                break;

            case R.id.action_setting:
                Intent settingIntent = new Intent(MainActivity.this, SettingActivity.class);
                MainActivity.this.startActivity(settingIntent);
                break;
        }

        return true;
    }
}
