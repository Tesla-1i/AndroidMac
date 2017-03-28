package mxy.com.activitylifecycletest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by OurEDA on 17/3/25.
 */

public class Titlelayout extends LinearLayout {

    public Titlelayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);

    }
}
