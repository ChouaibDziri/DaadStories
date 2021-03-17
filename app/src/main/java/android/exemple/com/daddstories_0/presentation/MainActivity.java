package android.exemple.com.daddstories_0.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.exemple.com.daddstories_0.R;
import android.exemple.com.daddstories_0.presentation.Deutch.DeutschActivity;
import android.exemple.com.daddstories_0.presentation.English.EnglishActivity;
import android.exemple.com.daddstories_0.presentation.arabic.ArabicActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanshEnglishActivity(View view) {
        Intent Englishintent = new Intent(this, EnglishActivity.class);
        startActivity(Englishintent);
    }

    public void lanshArabicActivity(View view) {
        Intent Arabicintent = new Intent(this, ArabicActivity.class);
        startActivity(Arabicintent);
    }

    public void lanshDeutshActivity(View view) {
        Intent Deutschintent = new Intent(this, DeutschActivity.class);
        startActivity(Deutschintent);
    }
}