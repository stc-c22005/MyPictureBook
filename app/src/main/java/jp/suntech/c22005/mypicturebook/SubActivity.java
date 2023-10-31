package jp.suntech.c22005.mypicturebook;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        //TextViewを取得
        TextView titleTREX = findViewById(R.id.TitleTREX);
        TextView titleBrakio = findViewById(R.id.Titlebrakio);
        TextView titlePterano = findViewById(R.id.Titleputerano);
        TextView textMainTitle = findViewById(R.id.TextMainTitle);

        //最初は「恐竜図鑑」のみを表示
        String text = getResources().getString(R.string.tv_maintitle);
        TextView textView = findViewById(R.id.TextMainTitle);
        //TextViewに対応するテキストを設定
        titleTREX.setText("");
        titleBrakio.setText("");
        titlePterano.setText("");
        textMainTitle.setText(text);

        //「ブラキオサウルス」ボタンを取得
        Button buttonBrachiosaurus = findViewById(R.id.button);

        //「ブラキオサウルス」ボタンがクリックされたときの処理
        buttonBrachiosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //「ブラキオサウルス」を表示
                String text = getResources().getString(R.string.bt_title);
                TextView textView = findViewById(R.id.Titlebrakio);
                // TextViewに対応するテキストを設定
                titleTREX.setText("");
                titleBrakio.setText(text);
                titlePterano.setText("");
                textMainTitle.setText("");

                //SubFragment1 を表示
                SubFragment1 subFragment1 = new SubFragment1();
                //フラグメントを置き換えるトランザクションを開始
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //既存のフラグメントを削除（置き換える）
                transaction.replace(R.id.FrameLayout, subFragment1);
                //トランザクションをコミット
                transaction.commit();
            }
        });

        //「ティラノサウルス」ボタンを取得
        Button buttonTREX = findViewById(R.id.button2);

        //「ティラノサウルス」ボタンがクリックされたときの処理
        buttonTREX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //「ティラノサウルス」を表示
                String text = getResources().getString(R.string.bt_title4);
                TextView textView = findViewById(R.id.TitleTREX);
                //TextViewに対応するテキストを設定
                titleTREX.setText(text);
                titleBrakio.setText("");
                titlePterano.setText("");
                textMainTitle.setText("");

                //SubFragment2 を表示
                SubFragment2 subFragment2 = new SubFragment2();
                //フラグメントを置き換えるトランザクションを開始
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //既存のフラグメントを削除（置き換える）
                transaction.replace(R.id.FrameLayout, subFragment2);
                //トランザクションをコミット
                transaction.commit();
            }
        });

        //「プテラノドン」ボタンを取得
        Button buttonPteranodon = findViewById(R.id.button3);

        //「プテラノドン」ボタンがクリックされたときの処理
        buttonPteranodon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //「プテラノドン」を表示
                String text = getResources().getString(R.string.bt_title3);
                TextView textView = findViewById(R.id.Titleputerano);
                //TextViewに対応するテキストを設定
                titleTREX.setText("");
                titleBrakio.setText("");
                titlePterano.setText(text);
                textMainTitle.setText("");

                //SubFragment3 を表示
                SubFragment3 subFragment3 = new SubFragment3();
                //フラグメントを置き換えるトランザクションを開始
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //既存のフラグメントを削除（置き換える）
                transaction.replace(R.id.FrameLayout, subFragment3);
                //トランザクションをコミット
                transaction.commit();
            }
        });
    }
}
