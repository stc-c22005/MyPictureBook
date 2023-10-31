package jp.suntech.c22005.mypicturebook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ImageButtonがクリックされたらSubActivity
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        loadFragment(new TopFragment());
    }

    private void loadFragment(TopFragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.topFragmentContainer, fragment)
                .commit();
    }
}
//TopFragmentを表示する
