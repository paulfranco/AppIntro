package co.paulfran.paulfranco.appintro;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MyIntro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("Slide 1", "icon1", R.drawable.android1, Color.MAGENTA));
        addSlide(AppIntroFragment.newInstance("Slide 2", "icon2", R.drawable.android1, Color.RED));
        addSlide(AppIntroFragment.newInstance("Slide 3", "icon3", R.drawable.android1, Color.GREEN));
        addSlide(AppIntroFragment.newInstance("Slide 4", "icon4", R.drawable.android1, Color.BLUE));
        addSlide(AppIntroFragment.newInstance("Slide 5", "icon5", R.drawable.android1, Color.YELLOW));
        setBarColor(Color.parseColor("#000000"));
        showStatusBar(false);

    }

    @Override
    public void onDonePressed(Fragment f) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentF) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
        Toast.makeText(this, "Clicked Skip!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        Toast.makeText(this, "Slide changed!", Toast.LENGTH_SHORT).show();
    }
}
