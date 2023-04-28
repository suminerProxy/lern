package com.sobot.pictureframe;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;
import com.sobot.chat.imageloader.SobotImageLoader;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotUILImageLoader extends SobotImageLoader {

    /* renamed from: com.sobot.pictureframe.SobotUILImageLoader$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 extends SimpleImageLoadingListener {
        public final /* synthetic */ SobotUILImageLoader this$0;
        public final /* synthetic */ SobotImageLoader.SobotDisplayImageListener val$listener;

        public AnonymousClass1(SobotUILImageLoader sobotUILImageLoader, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener) {
        }

        public void onLoadingComplete(String str, View view, Bitmap bitmap) {
        }
    }

    /* renamed from: com.sobot.pictureframe.SobotUILImageLoader$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends SimpleImageLoadingListener {
        public final /* synthetic */ SobotUILImageLoader this$0;
        public final /* synthetic */ SobotImageLoader.SobotDisplayImageListener val$listener;

        public AnonymousClass2(SobotUILImageLoader sobotUILImageLoader, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener) {
        }

        public void onLoadingComplete(String str, View view, Bitmap bitmap) {
        }
    }

    private void initImageLoader(Context context) {
    }

    @Override // com.sobot.chat.imageloader.SobotImageLoader
    public void displayImage(Context context, ImageView imageView, String str, @DrawableRes int i2, @DrawableRes int i3, int i4, int i5, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener) {
    }

    @Override // com.sobot.chat.imageloader.SobotImageLoader
    public void displayImage(Context context, ImageView imageView, @DrawableRes int i2, @DrawableRes int i3, @DrawableRes int i4, int i5, int i6, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener) {
    }
}
