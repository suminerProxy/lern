package com.sobot.chat.imageloader;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class SobotImageLoader {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotDisplayImageListener {
        void onSuccess(View view, String str);
    }

    public abstract void displayImage(Context context, ImageView imageView, @DrawableRes int i2, @DrawableRes int i3, @DrawableRes int i4, int i5, int i6, SobotDisplayImageListener sobotDisplayImageListener);

    public abstract void displayImage(Context context, ImageView imageView, String str, @DrawableRes int i2, @DrawableRes int i3, int i4, int i5, SobotDisplayImageListener sobotDisplayImageListener);
}
