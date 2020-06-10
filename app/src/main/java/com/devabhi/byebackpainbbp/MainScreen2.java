package com.devabhi.byebackpainbbp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainScreen2 extends AppCompatActivity {

    CardView card_english, card_hindi, card_marathi, card_gujarati;
    TextView tv_gujarati, tv_marathi, tv_hindi, tv_english;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen2);
        card_english = findViewById(R.id.card_english);
        card_hindi = findViewById(R.id.card_hindi);
        card_marathi = findViewById(R.id.card_marathi);
        card_gujarati = findViewById(R.id.card_gujarati);
        tv_gujarati = findViewById(R.id.tv_gujarati);
        tv_marathi = findViewById(R.id.tv_marathi);
        tv_hindi = findViewById(R.id.tv_hindi);
        tv_english = findViewById(R.id.tv_english);
        next = findViewById(R.id.next);
        if (AppPrefs.IsGujarati(getApplicationContext()) ||
                AppPrefs.IsMarathi(getApplicationContext()) ||
                AppPrefs.IsHindi(getApplicationContext()) ||
                AppPrefs.IsEnglish(getApplicationContext())) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
        card_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card_english.setCardBackgroundColor(getResources().getColor(R.color.selected_btn_clr));
                card_hindi.setCardBackgroundColor(getResources().getColor(R.color.white));
                card_marathi.setCardBackgroundColor(getResources().getColor(R.color.white));
                card_gujarati.setCardBackgroundColor(getResources().getColor(R.color.white));
                tv_english.setTextColor(getResources().getColor(R.color.white));
                tv_hindi.setTextColor(getResources().getColor(R.color.black));
                tv_marathi.setTextColor(getResources().getColor(R.color.black));
                tv_gujarati.setTextColor(getResources().getColor(R.color.black));
                AppPrefs.setIsEnglish(getApplicationContext(), true);
                AppPrefs.setIsHindi(getApplicationContext(), false);
                AppPrefs.setIsMarathi(getApplicationContext(), false);
                AppPrefs.setIsGujarati(getApplicationContext(), false);
            }
        });

        card_hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card_english.setCardBackgroundColor(getResources().getColor(R.color.white));
                card_hindi.setCardBackgroundColor(getResources().getColor(R.color.selected_btn_clr));
                card_marathi.setCardBackgroundColor(getResources().getColor(R.color.white));
                card_gujarati.setCardBackgroundColor(getResources().getColor(R.color.white));
                tv_english.setTextColor(getResources().getColor(R.color.black));
                tv_hindi.setTextColor(getResources().getColor(R.color.white));
                tv_marathi.setTextColor(getResources().getColor(R.color.black));
                tv_gujarati.setTextColor(getResources().getColor(R.color.black));

                AppPrefs.setIsEnglish(getApplicationContext(), false);
                AppPrefs.setIsHindi(getApplicationContext(), true);
                AppPrefs.setIsMarathi(getApplicationContext(), false);
                AppPrefs.setIsGujarati(getApplicationContext(), false);
            }
        });
        card_marathi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card_english.setCardBackgroundColor(getResources().getColor(R.color.white));
                card_hindi.setCardBackgroundColor(getResources().getColor(R.color.white));
                card_marathi.setCardBackgroundColor(getResources().getColor(R.color.selected_btn_clr));
                card_gujarati.setCardBackgroundColor(getResources().getColor(R.color.white));
                tv_english.setTextColor(getResources().getColor(R.color.black));
                tv_hindi.setTextColor(getResources().getColor(R.color.black));
                tv_marathi.setTextColor(getResources().getColor(R.color.white));
                tv_gujarati.setTextColor(getResources().getColor(R.color.black));

                AppPrefs.setIsEnglish(getApplicationContext(), false);
                AppPrefs.setIsHindi(getApplicationContext(), false);
                AppPrefs.setIsMarathi(getApplicationContext(), true);
                AppPrefs.setIsGujarati(getApplicationContext(), false);
            }
        });
        card_gujarati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card_english.setCardBackgroundColor(getResources().getColor(R.color.white));
                card_hindi.setCardBackgroundColor(getResources().getColor(R.color.white));
                card_marathi.setCardBackgroundColor(getResources().getColor(R.color.white));
                card_gujarati.setCardBackgroundColor(getResources().getColor(R.color.selected_btn_clr));
                tv_english.setTextColor(getResources().getColor(R.color.black));
                tv_hindi.setTextColor(getResources().getColor(R.color.black));
                tv_marathi.setTextColor(getResources().getColor(R.color.black));
                tv_gujarati.setTextColor(getResources().getColor(R.color.white));

                AppPrefs.setIsEnglish(getApplicationContext(), false);
                AppPrefs.setIsHindi(getApplicationContext(), false);
                AppPrefs.setIsMarathi(getApplicationContext(), false);
                AppPrefs.setIsGujarati(getApplicationContext(), true);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
