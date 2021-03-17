package android.exemple.com.daddstories_0.presentation.arabic;

import android.exemple.com.daddstories_0.data.ArabicRepositoryImp;
import android.exemple.com.daddstories_0.data.Story;
import android.exemple.com.daddstories_0.domain.ArabicRepository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class ArabicViewmodel extends ViewModel {

    public MutableLiveData<ArrayList<Story>> filteredStories =new MutableLiveData();
     ArabicRepository arabicRepository =new ArabicRepositoryImp();

     void getFilteredList(String category)
     {
         filteredStories.setValue(arabicRepository.selectCategory(category));
     }
}
