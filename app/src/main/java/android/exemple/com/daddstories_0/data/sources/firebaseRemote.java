package android.exemple.com.daddstories_0.data.sources;

import android.exemple.com.daddstories_0.R;
import android.exemple.com.daddstories_0.data.Story;

import java.util.ArrayList;
import java.util.List;

public class firebaseRemote
{
    public List<Story> getArabicStories()
    {
        ArrayList<Story> list = new ArrayList();
        list.add(new Story("حكايات وحوار","قطة في الأدغال", R.drawable.image_1));
        list.add(new Story("حكايات وحوار","كرتي الحمراء",R.drawable.image_2));
        list.add(new Story("علوم","مغامرة فاكهة المانجو",R.drawable.image_3));
        list.add(new Story("علوم","طبيب القطن",R.drawable.image_4));
        list.add(new Story("كائنات حيه","مدينة الحكايات",R.drawable.image_5));
        list.add(new Story("كائنات حيه","وقت الحمام لسامي وهاني",R.drawable.image_6));
        list.add(new Story("كائنات حيه","كل شيء يبدو جديدا",R.drawable.image_7));
        list.add(new Story("خيال وإبداع","الخلايا",R.drawable.image_8));
        list.add(new Story("لعب","عن السيرة الذاتية لزانيلي سيتو",R.drawable.image_9));
        list.add(new Story("لعب","ألوان قوس قزح السبعة",R.drawable.image_10));
        list.add(new Story("لعب","أين لولو؟",R.drawable.image_11));
        list.add(new Story("لعب","نجم البحر",R.drawable.image_12));
        list.add(new Story("مغامرات","البطريق",R.drawable.image_13));
        list.add(new Story("سلوك وقيم","يوميات فأر مسكين",R.drawable.image_14));
        list.add(new Story("سلوك وقيم","حكاية قطة لطيفة... ولكن مذنبة",R.drawable.image_15));
        list.add(new Story("قراءه وتعلم","لارا الخنفساء الصفراء",R.drawable.image_16));

        return list;
    }
}
