package android.exemple.com.daddstories_0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Arabic_Slide_Adapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;
    //List of images
    public int[] list_images = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9,
            R.drawable.image_10,
            R.drawable.image_11,
            R.drawable.image_12,
            R.drawable.image_13,
            R.drawable.image_14,
            R.drawable.image_15,
            R.drawable.image_16,
            R.drawable.image_17,
            R.drawable.image_18,
            R.drawable.image_19,
            R.drawable.image_20,
            R.drawable.image_21,
            R.drawable.image_22,
            R.drawable.image_23,
            R.drawable.image_24,
            R.drawable.image_25,
            R.drawable.image_26,
            R.drawable.image_27,
            R.drawable.image_28,
            R.drawable.image_29,
            R.drawable.image_30
    };
    //List of Titles
    public String[] Arabic_list_titles = {
            "قطة في الأدغال",
            "كرتي الحمراء",
            "مغامرة فاكهة المانجو",
            "طبيب القطن",
            "مدينة الحكايات",
            "وقت الحمام لسامي وهاني",
            "كل شيء يبدو جديدا",
            "الخلايا",
            " عن السيرة الذاتية لزانيلي سيتو",
            "ألوان قوس قزح السبعة",
            "أين لولو؟",
            "نجم البحر",
            "البطريق",
            "يوميات فأر مسكين",
            "حكاية قطة لطيفة... ولكن مذنبة",
            "لارا الخنفساء الصفراء",
            "تجارب آنا الرائعة مع الطقس",
            "هل من أحد يشبهني",
            "الأسد الصغير",
            "دوار الشمس",
            "الفراشات",
            "عندما أكبر",
            "ماذا لو؟",
            "لا",
            "أنا سأساعد",
            "غداء سميرة الفظيع",
            "ماذا سأرتدي اليوم",
            "الغناء تحت المطر",
            "أغنية زينة",
            "البحث عن روح الربيع"
    };
    // List of description
    public String[] Arabic_list_descriptions = {
            "Description 1",
            "Description 2",
            "Description 3",
            "Description 4",
            "Description 5",
            "Description 6",
            "Description 7",
            "Description 8",
            "Description 9",
            "Description 10",
            "Description 11",
            "Description 12",
            "Description 13",
            "Description 14",
            "Description 15",
            "Description 16",
            "Description 17",
            "Description 18",
            "Description 19",
            "Description 20",
            "Description 21",
            "Description 22",
            "Description 23",
            "Description 24",
            "Description 25",
            "Description 26",
            "Description 27",
            "Description 28",
            "Description 29",
            "Description 30"
    };

    public Arabic_Slide_Adapter(Context context) {
        this.context=context;
    }

    @Override
    public int getCount() {
        return Arabic_list_titles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.arabic_slide, container, false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.arabic_slide_LinearLayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.arabic_slideimg);
        TextView titslide = (TextView) view.findViewById(R.id.arabic_slidetext);
        TextView descripslide = (TextView) view.findViewById(R.id.arabic_slidedescription);
        imgslide.setImageResource(list_images[position]);
        titslide.setText(Arabic_list_titles[position]);
        descripslide.setText(Arabic_list_descriptions[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
