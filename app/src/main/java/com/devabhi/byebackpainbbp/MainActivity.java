package com.devabhi.byebackpainbbp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BulletSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button frontarrow;
    TextView descriptionTextView;
    Button backarrow;
    TextView exerciseTitleTextView;
    TextView subtitleTextView;
    ImageView mainimage;
    Context context;
    Resources resources;
    ImageView lowerTummyImageView, abdominalImageView, bridgeImageView, piriformisImageView,
            catCowImageView, shoulderRollImageView, overheadArmImageView,
            postOpImageView;
    SpannableString string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frontarrow = (Button) findViewById(R.id.frontarrow);
        subtitleTextView = findViewById(R.id.subtitleTextView);
        exerciseTitleTextView = findViewById(R.id.exerciseTitleTextView);
        mainimage = findViewById(R.id.mainimage);
        descriptionTextView = findViewById(R.id.description);
        lowerTummyImageView = findViewById(R.id.lowerTummyImageView);
        abdominalImageView = findViewById(R.id.abdominalStrengthImageView);
        bridgeImageView = findViewById(R.id.bridgeImageView);
        piriformisImageView = findViewById(R.id.piriformisImageView);
        catCowImageView = findViewById(R.id.catCowImageView);
        shoulderRollImageView = findViewById(R.id.shoulderRollImageView);
        overheadArmImageView = findViewById(R.id.overHeadArmReachImageView);
        postOpImageView = findViewById(R.id.postOpImageView);

        backarrow = findViewById(R.id.backarrow);
        if (AppPrefs.IsEnglish(getApplicationContext())) {
            context = LocaleHelper.setLocale(MainActivity.this, "en");
            resources = context.getResources();

            string = new SpannableString(resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description) + "\n" + resources.getString(R.string.exercise1_4_description));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                string.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise1_description)).length() + 1, (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                string.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description)).length() + 1, (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                string.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description)).length() + 1, (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description) + "\n" + resources.getString(R.string.exercise1_4_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            descriptionTextView.setText(string);
            subtitleTextView.setText(resources.getString(R.string.lower_tummy_strengthening));
            exerciseTitleTextView.setText(resources.getString(R.string.lower_back));
            frontarrow.setOnClickListener(new View.OnClickListener() {

                                              @Override
                                              public void onClick(View v) {
                                                  switch (subtitleTextView.getText().toString()) {
                                                      case "Lower Tummy Strengthening":
                                                          exerciseDeep();
                                                          break;
                                                      case "Deep Abdominal Strengthening":
                                                          exerciseBridge();
                                                          break;
                                                      case "Bridge":
                                                          exrcisePiriformis();
                                                          break;
                                                      case "Piriformis Stretch":
                                                          exerciseCatCow();
                                                          break;
                                                      case "To perform the Cat-Cow Pose":
                                                          exerciseShoulderRoll();
                                                          break;
                                                      case "To perform the shoulder roll":
                                                          exerciseOverArm();
                                                          break;
                                                      case "Overhead arm reach":
                                                          exerciseLowBack();
                                                          break;
                                                      case "Low Back Stretch":
                                                          exerciseLowerTummy(string);
                                                          break;
                                                  }

                                              }
                                          }
            );

            backarrow.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 switch (subtitleTextView.getText().toString()) {
                                                     case "Lower Tummy Strengthening":
                                                         exerciseLowBack();
                                                         break;
                                                     case "Deep Abdominal Strengthening":
                                                         exerciseLowerTummy(string);
                                                         break;
                                                     case "Bridge":
                                                         exerciseDeep();
                                                         break;
                                                     case "Piriformis Stretch":
                                                         exerciseBridge();
                                                         break;
                                                     case "To perform the Cat-Cow Pose":
                                                         exrcisePiriformis();
                                                         break;
                                                     case "To perform the shoulder roll":
                                                         exerciseCatCow();
                                                         break;
                                                     case "Overhead arm reach":
                                                         exerciseShoulderRoll();
                                                         break;
                                                     case "Low Back Stretch":
                                                         exerciseOverArm();
                                                         break;
                                                 }
                                             }
                                         }
            );
        } else if (AppPrefs.IsHindi(getApplicationContext())) {
            context = LocaleHelper.setLocale(MainActivity.this, "hi");
            resources = context.getResources();

            string = new SpannableString(resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description) + "\n" + resources.getString(R.string.exercise1_4_description));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                string.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise1_description)).length() + 1, (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                string.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description)).length() + 1, (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                string.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description)).length() + 1, (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description) + "\n" + resources.getString(R.string.exercise1_4_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            descriptionTextView.setText(string);
            subtitleTextView.setText(resources.getString(R.string.lower_tummy_strengthening));
            exerciseTitleTextView.setText(resources.getString(R.string.lower_back));
            frontarrow.setOnClickListener(new View.OnClickListener() {

                                              @Override
                                              public void onClick(View v) {
                                                  switch (subtitleTextView.getText().toString()) {
                                                      case "निचले पेट को मजबूत बनाना":
                                                          exerciseDeep();
                                                          break;
                                                      case "गहरी पेट की मजबूती":
                                                          exerciseBridge();
                                                          break;
                                                      case "पुल":
                                                          exrcisePiriformis();
                                                          break;
                                                      case "पिरिफॉर्मिस स्ट्रैच":
                                                          exerciseCatCow();
                                                          break;
                                                      case "कैट-काउ पोज़ करने के लिए":
                                                          exerciseShoulderRoll();
                                                          break;
                                                      case "शोल्डर रोल करने के लिए":
                                                          exerciseOverArm();
                                                          break;
                                                      case "ओवरहेड आर्म पहुंचता है":
                                                          exerciseLowBack();
                                                          break;
                                                      case "लो बैक स्ट्रेच":
                                                          exerciseLowerTummy(string);
                                                          break;
                                                  }

                                              }
                                          }
            );

            backarrow.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 switch (subtitleTextView.getText().toString()) {
                                                     case "निचले पेट को मजबूत बनाना":
                                                         exerciseLowBack();
                                                         break;
                                                     case "गहरी पेट की मजबूती":
                                                         exerciseLowerTummy(string);
                                                         break;
                                                     case "पुल":
                                                         exerciseDeep();
                                                         break;
                                                     case "पिरिफॉर्मिस स्ट्रैच":
                                                         exerciseBridge();
                                                         break;
                                                     case "कैट-काउ पोज़ करने के लिए":
                                                         exrcisePiriformis();
                                                         break;
                                                     case "शोल्डर रोल करने के लिए":
                                                         exerciseCatCow();
                                                         break;
                                                     case "ओवरहेड आर्म पहुंचता है":
                                                         exerciseShoulderRoll();
                                                         break;
                                                     case "लो बैक स्ट्रेच":
                                                         exerciseOverArm();
                                                         break;
                                                 }
                                             }
                                         }
            );
        } else if (AppPrefs.IsMarathi(getApplicationContext())) {
            context = LocaleHelper.setLocale(MainActivity.this, "mr");
            resources = context.getResources();
            string = new SpannableString(resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description) + "\n" + resources.getString(R.string.exercise1_4_description));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                string.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise1_description)).length() + 1, (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                string.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description)).length() + 1, (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                string.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description)).length() + 1, (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description) + "\n" + resources.getString(R.string.exercise1_4_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            descriptionTextView.setText(string);
            subtitleTextView.setText(resources.getString(R.string.lower_tummy_strengthening));
            exerciseTitleTextView.setText(resources.getString(R.string.lower_back));
            frontarrow.setOnClickListener(new View.OnClickListener() {

                                              @Override
                                              public void onClick(View v) {
                                                  switch (subtitleTextView.getText().toString()) {
                                                      case "कमी पेट मजबूत करणे":
                                                          exerciseDeep();
                                                          break;
                                                      case "तीव्र पोट घट्टपणा":
                                                          exerciseBridge();
                                                          break;
                                                      case "ब्रिज":
                                                          exrcisePiriformis();
                                                          break;
                                                      case "पिरीफॉर्मिस स्ट्रेच":
                                                          exerciseCatCow();
                                                          break;
                                                      case "मांजरी-गाय पोझेस करण्यासाठी":
                                                          exerciseShoulderRoll();
                                                          break;
                                                      case "खांदा गुंडाळण्यासाठी":
                                                          exerciseOverArm();
                                                          break;
                                                      case "ओव्हरहेड आर्मपर्यंत पोहोचतो":
                                                          exerciseLowBack();
                                                          break;
                                                      case "लो बॅक स्ट्रेच":
                                                          exerciseLowerTummy(string);
                                                          break;
                                                  }

                                              }
                                          }
            );

            backarrow.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 switch (subtitleTextView.getText().toString()) {
                                                     case "कमी पेट मजबूत करणे":
                                                         exerciseLowBack();
                                                         break;
                                                     case "तीव्र पोट घट्टपणा":
                                                         exerciseLowerTummy(string);
                                                         break;
                                                     case "ब्रिज":
                                                         exerciseDeep();
                                                         break;
                                                     case "पिरीफॉर्मिस स्ट्रेच":
                                                         exerciseBridge();
                                                         break;
                                                     case "मांजरी-गाय पोझेस करण्यासाठी":
                                                         exrcisePiriformis();
                                                         break;
                                                     case "खांदा गुंडाळण्यासाठी":
                                                         exerciseCatCow();
                                                         break;
                                                     case "ओव्हरहेड आर्मपर्यंत पोहोचतो":
                                                         exerciseShoulderRoll();
                                                         break;
                                                     case "लो बॅक स्ट्रेच":
                                                         exerciseOverArm();
                                                         break;
                                                 }
                                             }
                                         }
            );
        } else if (AppPrefs.IsGujarati(getApplicationContext())) {

            context = LocaleHelper.setLocale(MainActivity.this, "gu");
            resources = context.getResources();
            string = new SpannableString(resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description) + "\n" + resources.getString(R.string.exercise1_4_description));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                string.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise1_description)).length() + 1, (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                string.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description)).length() + 1, (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                string.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description)).length() + 1, (resources.getString(R.string.exercise1_description) + "\n" + resources.getString(R.string.exercise1_2_description) + "\n" + resources.getString(R.string.exercise1_3_description) + "\n" + resources.getString(R.string.exercise1_4_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            descriptionTextView.setText(string);
            subtitleTextView.setText(resources.getString(R.string.lower_tummy_strengthening));
            exerciseTitleTextView.setText(resources.getString(R.string.lower_back));
            frontarrow.setOnClickListener(new View.OnClickListener() {

                                              @Override
                                              public void onClick(View v) {
                                                  switch (subtitleTextView.getText().toString()) {
                                                      case "નીચલા પેટને મજબૂત બનાવવું":
                                                          exerciseDeep();
                                                          break;
                                                      case "ઊંડા પેટની મજબૂતી":
                                                          exerciseBridge();
                                                          break;
                                                      case "પુલ":
                                                          exrcisePiriformis();
                                                          break;
                                                      case "પિરીફોર્મિસ સ્ટ્રેચ":
                                                          exerciseCatCow();
                                                          break;
                                                      case "કેટ-ગાય પોઝ કરવા માટે":
                                                          exerciseShoulderRoll();
                                                          break;
                                                      case "ખભા રોલ કરવા માટે":
                                                          exerciseOverArm();
                                                          break;
                                                      case "ઓવરહેડ હાથ સુધી પહોંચે છે":
                                                          exerciseLowBack();
                                                          break;
                                                      case "લો બેક સ્ટ્રેચ":
                                                          exerciseLowerTummy(string);
                                                          break;
                                                  }

                                              }
                                          }
            );

            backarrow.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 switch (subtitleTextView.getText().toString()) {
                                                     case "નીચલા પેટને મજબૂત બનાવવું":
                                                         exerciseLowBack();
                                                         break;
                                                     case "ઊંડા પેટની મજબૂતી":
                                                         exerciseLowerTummy(string);
                                                         break;
                                                     case "પુલ":
                                                         exerciseDeep();
                                                         break;
                                                     case "પિરીફોર્મિસ સ્ટ્રેચ":
                                                         exerciseBridge();
                                                         break;
                                                     case "કેટ-ગાય પોઝ કરવા માટે":
                                                         exrcisePiriformis();
                                                         break;
                                                     case "ખભા રોલ કરવા માટે":
                                                         exerciseCatCow();
                                                         break;
                                                     case "ઓવરહેડ હાથ સુધી પહોંચે છે":
                                                         exerciseShoulderRoll();
                                                         break;
                                                     case "લો બેક સ્ટ્રેચ":
                                                         exerciseOverArm();
                                                         break;
                                                 }
                                             }
                                         }
            );
        }






        lowerTummyImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exerciseLowerTummy(string);
            }
        });

        abdominalImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exerciseDeep();


            }
        });

        bridgeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exerciseBridge();


            }
        });

        piriformisImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exrcisePiriformis();


            }
        });

        catCowImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exerciseCatCow();

            }
        });

        shoulderRollImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exerciseShoulderRoll();


            }
        });
        overheadArmImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exerciseOverArm();


            }
        });

        postOpImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exerciseLowBack();


            }
        });


    }

    public void exerciseDeep() {
        SpannableString spannableString = new SpannableString(resources.getString(R.string.exercise2_description) + "\n" + resources.getString(R.string.exercise2_2_description) + "\n" + resources.getString(R.string.exercise2_3_description));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            spannableString.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise2_description)).length() + 1, (resources.getString(R.string.exercise2_description) + "\n" + resources.getString(R.string.exercise2_2_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableString.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise2_description) + "\n" + resources.getString(R.string.exercise2_2_description)).length() + 1, (resources.getString(R.string.exercise2_description) + "\n" + resources.getString(R.string.exercise2_2_description) + "\n" + resources.getString(R.string.exercise2_3_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        }


        subtitleTextView.setText(resources.getString(R.string.deep_abdominal_strengthening));
        mainimage.setImageDrawable(getResources().getDrawable(R.drawable.deep_abdominal));
        descriptionTextView.setText(spannableString);
        exerciseTitleTextView.setText(resources.getString(R.string.lower_back));
    }

    public void exerciseBridge() {
        SpannableString spannableString1 = new SpannableString(resources.getString(R.string.exercise3_description) + "\n" + resources.getString(R.string.exercise3_2_description) + "\n" + resources.getString(R.string.exercise3_3_description));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            spannableString1.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise3_description)).length() + 1, (resources.getString(R.string.exercise3_description) + "\n" + resources.getString(R.string.exercise3_2_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableString1.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise3_description) + "\n" + resources.getString(R.string.exercise3_2_description)).length() + 1, (resources.getString(R.string.exercise3_description) + "\n" + resources.getString(R.string.exercise3_2_description) + "\n" + resources.getString(R.string.exercise3_3_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }

        descriptionTextView.setText(spannableString1);
        subtitleTextView.setText(resources.getString(R.string.bridge));
        mainimage.setImageDrawable(getResources().getDrawable(R.drawable.bridge));
        exerciseTitleTextView.setText(resources.getString(R.string.lower_back));
    }

    public void exrcisePiriformis() {
        SpannableString spannableString2 = new SpannableString(resources.getString(R.string.exercise4_description) + "\n" + resources.getString(R.string.exercise4_2_description) + "\n" + resources.getString(R.string.exercise4_3_description) + "\n" + resources.getString(R.string.exercise4_4_description));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            spannableString2.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise4_description)).length() + 1, (resources.getString(R.string.exercise4_description) + "\n" + resources.getString(R.string.exercise4_2_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableString2.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise4_description) + "\n" + resources.getString(R.string.exercise4_2_description)).length() + 1, (resources.getString(R.string.exercise4_description) + "\n" + resources.getString(R.string.exercise4_2_description) + "\n" + resources.getString(R.string.exercise4_3_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableString2.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise4_description) + "\n" + resources.getString(R.string.exercise4_2_description) + "\n" + resources.getString(R.string.exercise4_3_description)).length() + 1, (resources.getString(R.string.exercise4_description) + "\n" + resources.getString(R.string.exercise4_2_description) + "\n" + resources.getString(R.string.exercise4_3_description) + "\n" + resources.getString(R.string.exercise4_4_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        }

        descriptionTextView.setText(spannableString2);
        subtitleTextView.setText(resources.getString(R.string.piriformis_stretch));
        mainimage.setImageDrawable(getResources().getDrawable(R.drawable.piri));
        exerciseTitleTextView.setText(resources.getString(R.string.lower_back));
    }

    public void exerciseCatCow() {
        SpannableString spannableString3 = new SpannableString(resources.getString(R.string.exercise5_description) + "\n" + resources.getString(R.string.exercise5_2_description) + "\n" + resources.getString(R.string.exercise5_3_description));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {

            spannableString3.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise5_description)).length() + 1, (resources.getString(R.string.exercise5_description) + "\n" + resources.getString(R.string.exercise5_2_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableString3.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise5_description) + "\n" + resources.getString(R.string.exercise5_2_description)).length() + 1, (resources.getString(R.string.exercise5_description) + "\n" + resources.getString(R.string.exercise5_2_description) + "\n" + resources.getString(R.string.exercise5_3_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        }

        descriptionTextView.setText(spannableString3);
        subtitleTextView.setText(resources.getString(R.string.to_perform_the_catcow_pose));
        mainimage.setImageDrawable(getResources().getDrawable(R.drawable.catcow));
        exerciseTitleTextView.setText(resources.getString(R.string.upper_back_pain));
    }

    public void exerciseShoulderRoll() {
        descriptionTextView.setText(resources.getString(R.string.exercise6_description));
        subtitleTextView.setText(resources.getString(R.string.to_perform_the_shoulder_roll));
        exerciseTitleTextView.setText(resources.getString(R.string.upper_back_pain));
        mainimage.setImageDrawable(getResources().getDrawable(R.drawable.shoulder));
    }

    public void exerciseOverArm() {
        SpannableString spannableString4 = new SpannableString(resources.getString(R.string.exercise7_description) + "\n" + resources.getString(R.string.exercise7_2_description) + "\n" + resources.getString(R.string.exercise7_3_description) + "\n" + resources.getString(R.string.exercise7_4_description) + "\n" + resources.getString(R.string.exercise7_5_description) + "\n" + resources.getString(R.string.exercise7_6_description));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            spannableString4.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), 0, (resources.getString(R.string.exercise7_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableString4.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise7_description)).length() + 1, (resources.getString(R.string.exercise7_description) + "\n" + resources.getString(R.string.exercise7_2_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableString4.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise7_description) + "\n" + resources.getString(R.string.exercise7_2_description)).length() + 1, (resources.getString(R.string.exercise7_description) + "\n" + resources.getString(R.string.exercise7_2_description) + "\n" + resources.getString(R.string.exercise7_3_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableString4.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise7_description) + "\n" + resources.getString(R.string.exercise7_2_description) + "\n" + resources.getString(R.string.exercise7_3_description)).length() + 1, (resources.getString(R.string.exercise7_description) + "\n" + resources.getString(R.string.exercise7_2_description) + "\n" + resources.getString(R.string.exercise7_3_description) + "\n" + resources.getString(R.string.exercise7_4_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableString4.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise7_description) + "\n" + resources.getString(R.string.exercise7_2_description) + "\n" + resources.getString(R.string.exercise7_3_description) + "\n" + resources.getString(R.string.exercise7_4_description)).length() + 1, (resources.getString(R.string.exercise7_description) + "\n" + resources.getString(R.string.exercise7_2_description) + "\n" + resources.getString(R.string.exercise7_3_description) + "\n" + resources.getString(R.string.exercise7_4_description) + "\n" + resources.getString(R.string.exercise7_5_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableString4.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise7_description) + "\n" + resources.getString(R.string.exercise7_2_description) + "\n" + resources.getString(R.string.exercise7_3_description) + "\n" + resources.getString(R.string.exercise7_4_description) + "\n" + resources.getString(R.string.exercise7_5_description)).length() + 1, (resources.getString(R.string.exercise7_description) + "\n" + resources.getString(R.string.exercise7_2_description) + "\n" + resources.getString(R.string.exercise7_3_description) + "\n" + resources.getString(R.string.exercise7_4_description) + "\n" + resources.getString(R.string.exercise7_5_description) + "\n" + resources.getString(R.string.exercise7_6_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        }

        descriptionTextView.setText(spannableString4);
        subtitleTextView.setText(resources.getString(R.string.overhead_arm_reach));
        mainimage.setImageDrawable(getResources().getDrawable(R.drawable.overhead_arm_reach_1));
        exerciseTitleTextView.setText(resources.getString(R.string.upper_back_pain));
    }

    public void exerciseLowBack() {
        SpannableString spannableString5 = new SpannableString(resources.getString(R.string.exercise9_description) + "\n" + resources.getString(R.string.exercise9_2_description) + "\n" + resources.getString(R.string.exercise9_3_description));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            spannableString5.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise9_description)).length() + 1, (resources.getString(R.string.exercise9_description) + "\n" + resources.getString(R.string.exercise9_2_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableString5.setSpan(new BulletSpan(10, getResources().getColor(R.color.colorPrimary), 10), (resources.getString(R.string.exercise9_description) + "\n" + resources.getString(R.string.exercise9_2_description)).length() + 1, (resources.getString(R.string.exercise9_description) + "\n" + resources.getString(R.string.exercise9_2_description) + "\n" + resources.getString(R.string.exercise9_3_description)).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }

        descriptionTextView.setText(spannableString5);
        subtitleTextView.setText(resources.getString(R.string.low_back_stretch));
        mainimage.setImageDrawable(getResources().getDrawable(R.drawable.piri));
        exerciseTitleTextView.setText(resources.getString(R.string.post_op));
    }

    public void exerciseLowerTummy(SpannableString string) {
        descriptionTextView.setText(string);
        subtitleTextView.setText(resources.getString(R.string.lower_tummy_strengthening));
        mainimage.setImageDrawable(getResources().getDrawable(R.drawable.lower_tummy));
        exerciseTitleTextView.setText(resources.getString(R.string.lower_back));
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }
}

