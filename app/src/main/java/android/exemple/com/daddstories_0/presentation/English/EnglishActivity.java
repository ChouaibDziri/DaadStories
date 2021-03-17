package android.exemple.com.daddstories_0.presentation.English;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.exemple.com.daddstories_0.R;
import android.os.Bundle;

public class EnglishActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private English_Slide_Adapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        viewPager = (ViewPager) findViewById(R.id.english_view_pager);
        myadapter = new English_Slide_Adapter(this);
        viewPager.setAdapter(myadapter);
    }
}