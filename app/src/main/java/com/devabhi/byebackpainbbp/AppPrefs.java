package com.devabhi.byebackpainbbp;

import android.content.Context;
import android.content.SharedPreferences;

public class AppPrefs {
    private static final String IS_ENGLISH = "IS_ENGLISH";
    private static final String MyPref = "langPref";
    private static final String IS_GUJARATI = "IS_GUJARATI";
    private static final String IS_HINDI = "IS_HINDI";
    private static final String IS_MARATHI = "IS_MARATHI";

    public static boolean IsEnglish(Context context) {
        return context.getApplicationContext().getSharedPreferences(MyPref, 0).getBoolean(IS_ENGLISH, false);
    }

    public static void setIsEnglish(Context context, boolean z) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(MyPref, 0).edit();
        edit.putBoolean(IS_ENGLISH, z);
        edit.commit();
    }

    public static boolean IsGujarati(Context context) {
        return context.getApplicationContext().getSharedPreferences(MyPref, 0).getBoolean(IS_GUJARATI, false);
    }

    public static void setIsGujarati(Context context, boolean z) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(MyPref, 0).edit();
        edit.putBoolean(IS_GUJARATI, z);
        edit.commit();
    }

    public static boolean IsHindi(Context context) {
        return context.getApplicationContext().getSharedPreferences(MyPref, 0).getBoolean(IS_HINDI, false);
    }

    public static void setIsHindi(Context context, boolean z) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(MyPref, 0).edit();
        edit.putBoolean(IS_HINDI, z);
        edit.commit();
    }

    public static boolean IsMarathi(Context context) {
        return context.getApplicationContext().getSharedPreferences(MyPref, 0).getBoolean(IS_MARATHI, false);
    }

    public static void setIsMarathi(Context context, boolean z) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(MyPref, 0).edit();
        edit.putBoolean(IS_MARATHI, z);
        edit.commit();
    }
}
