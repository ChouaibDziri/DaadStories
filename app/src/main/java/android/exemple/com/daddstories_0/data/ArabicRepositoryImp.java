package android.exemple.com.daddstories_0.data;

import android.exemple.com.daddstories_0.R;
import android.exemple.com.daddstories_0.data.sources.firebaseRemote;
import android.exemple.com.daddstories_0.domain.ArabicRepository;

import java.util.ArrayList;
import java.util.List;

public class ArabicRepositoryImp implements ArabicRepository {

    @Override
    public ArrayList<Story> selectCategory(String category) {
        ArrayList<Story> selectedCat =new ArrayList<>();
        ArrayList<Story> list =new ArrayList<>();
        firebaseRemote remote = new firebaseRemote();
        list.addAll(remote.getArabicStories());

        for (int i=0; i<list.size() ;i++) {
            if(category.equals(list.get(i).getCategory())  || category.equals("الكل"))
            {
                selectedCat.add(list.get(i));
            }
        }
        return selectedCat;
    }

}
