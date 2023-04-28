package com.sobot.pictureframe;

import android.content.Context;
import android.widget.ImageView;
import com.sobot.chat.imageloader.SobotImageLoader;
import com.squareup.picasso.Callback;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotPicassoImageLoader extends SobotImageLoader {

    /* renamed from: com.sobot.pictureframe.SobotPicassoImageLoader$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 extends Callback.EmptyCallback {
        public final /* synthetic */ SobotPicassoImageLoader this$0;
        public final /* synthetic */ ImageView val$imageView;
        public final /* synthetic */ SobotImageLoader.SobotDisplayImageListener val$listener;
        public final /* synthetic */ String val$path;

        public AnonymousClass1(SobotPicassoImageLoader sobotPicassoImageLoader, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener, ImageView imageView, String str) {
        }

        public void onSuccess() {
        }
    }

    /* renamed from: com.sobot.pictureframe.SobotPicassoImageLoader$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends Callback.EmptyCallback {
        public final /* synthetic */ SobotPicassoImageLoader this$0;
        public final /* synthetic */ ImageView val$imageView;
        public final /* synthetic */ SobotImageLoader.SobotDisplayImageListener val$listener;

        public AnonymousClass2(SobotPicassoImageLoader sobotPicassoImageLoader, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener, ImageView imageView) {
        }

        public void onSuccess() {
        }
    }

    @Override // com.sobot.chat.imageloader.SobotImageLoader
    public void displayImage(Context context, ImageView imageView, String str, int i2, int i3, int i4, int i5, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener) {
    }

    @Override // com.sobot.chat.imageloader.SobotImageLoader
    public void displayImage(Context context, ImageView imageView, int i2, int i3, int i4, int i5, int i6, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener) {
    }
}
