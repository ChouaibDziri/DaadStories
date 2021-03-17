package android.exemple.com.daddstories_0.presentation.Deutch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.exemple.com.daddstories_0.R;
import android.os.Bundle;

public class DeutschActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private Deutsch_Slide_Adapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deutsch);
        viewPager = (ViewPager) findViewById(R.id.deutsch_view_pager);
        myadapter = new Deutsch_Slide_Adapter(this);
        viewPager.setAdapter(myadapter);
    }
}