package android.exemple.com.daddstories_0.presentation.arabic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.exemple.com.daddstories_0.R;
import android.exemple.com.daddstories_0.data.Story;
import android.os.Bundle;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.List;

public class ArabicActivity extends AppCompatActivity {
private ChipGroup categoriesChips;
private   List<Story> list;
private RecyclerView rv;
private ArabicAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic);


         rv = findViewById(R.id.arabic_rv);
         adapter =new ArabicAdapter(this,list);
        rv.setAdapter(adapter);

        categoriesChips = findViewById(R.id.arabic_categoryList);
        categoriesChips.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                Chip chip = group.findViewById(checkedId);

                if (chip != null)
                    selectCategory(String.valueOf(chip.getText()));
            }
        });
    }

    private void selectCategory(String category) {
        ArabicViewmodel arabicViewmodel= ViewModelProviders.of(this).get(ArabicViewmodel.class);
        arabicViewmodel.getFilteredList(category);
        arabicViewmodel.filteredStories.observe(this, selectedCategory -> {
            adapter.filter(selectedCategory);
        });
    }
}