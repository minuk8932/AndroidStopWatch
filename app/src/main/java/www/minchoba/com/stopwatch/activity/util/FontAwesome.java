package www.minchoba.com.stopwatch.activity.util;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by minchoba on 2017. 1. 25..
 */
public class FontAwesome {
    private static final String FONTAWESOME_PATH = "fonts/fontawesome-webfont.ttf";
    private static Typeface typeface;

    public static Typeface getTypeface(Context context) {
        return Typeface.createFromAsset(context.getAssets(), FONTAWESOME_PATH);
    }
}
