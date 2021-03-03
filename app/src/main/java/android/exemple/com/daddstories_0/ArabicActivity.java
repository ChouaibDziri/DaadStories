package android.exemple.com.daddstories_0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ArabicActivity extends AppCompatActivity {
private ViewPager viewPager;
private Arabic_Slide_Adapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic);
        viewPager = (ViewPager) findViewById(R.id.araic_view_pager);
        myadapter = new Arabic_Slide_Adapter(this);
        viewPager.setAdapter(myadapter);
    }
}