package www.minchoba.com.stopwatch.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import www.minchoba.com.stopwatch.R;

/**
 * Created by minchoba on 2017. 1. 18..
 */
public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_DELAY = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();               // 상단 바 없애주기.
        setContentView(R.layout.activity_splash); // AndroidManifest.xml 에서 가장 처음 나올 액티비티를 설정
                                                                                        // 후 바꾸기

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();

            }
        },SPLASH_DELAY);
    }
}
