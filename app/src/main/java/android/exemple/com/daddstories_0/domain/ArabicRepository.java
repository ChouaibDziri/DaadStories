package android.exemple.com.daddstories_0.domain;

import android.exemple.com.daddstories_0.data.Story;

import java.util.ArrayList;
import java.util.List;

public interface ArabicRepository {

     ArrayList<Story> selectCategory(String category);
}
