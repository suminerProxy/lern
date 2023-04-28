package com.sobot.pictureframe;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.sobot.chat.imageloader.SobotImageLoader;
import h.g.a.t.h;
import h.g.a.t.l.p;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotGlideImageLoader extends SobotImageLoader {

    /* renamed from: com.sobot.pictureframe.SobotGlideImageLoader$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements h<String, Bitmap> {
        public final /* synthetic */ SobotGlideImageLoader this$0;
        public final /* synthetic */ ImageView val$imageView;
        public final /* synthetic */ SobotImageLoader.SobotDisplayImageListener val$listener;
        public final /* synthetic */ String val$path;

        public AnonymousClass1(SobotGlideImageLoader sobotGlideImageLoader, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener, ImageView imageView, String str) {
        }

        public /* bridge */ /* synthetic */ boolean onException(Exception exc, Object obj, p pVar, boolean z) {
        }

        public boolean onException(Exception exc, String str, p<Bitmap> pVar, boolean z) {
        }

        public /* bridge */ /* synthetic */ boolean onResourceReady(Object obj, Object obj2, p pVar, boolean z, boolean z2) {
        }

        public boolean onResourceReady(Bitmap bitmap, String str, p<Bitmap> pVar, boolean z, boolean z2) {
        }
    }

    /* renamed from: com.sobot.pictureframe.SobotGlideImageLoader$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements h<Integer, Bitmap> {
        public final /* synthetic */ SobotGlideImageLoader this$0;
        public final /* synthetic */ ImageView val$imageView;
        public final /* synthetic */ SobotImageLoader.SobotDisplayImageListener val$listener;

        public AnonymousClass2(SobotGlideImageLoader sobotGlideImageLoader, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener, ImageView imageView) {
        }

        public boolean onException(Exception exc, Integer num, p<Bitmap> pVar, boolean z) {
        }

        public /* bridge */ /* synthetic */ boolean onException(Exception exc, Object obj, p pVar, boolean z) {
        }

        public /* bridge */ /* synthetic */ boolean onResourceReady(Object obj, Object obj2, p pVar, boolean z, boolean z2) {
        }

        public boolean onResourceReady(Bitmap bitmap, Integer num, p<Bitmap> pVar, boolean z, boolean z2) {
        }
    }

    @Override // com.sobot.chat.imageloader.SobotImageLoader
    public void displayImage(Context context, ImageView imageView, String str, @DrawableRes int i2, @DrawableRes int i3, int i4, int i5, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener) {
    }

    @Override // com.sobot.chat.imageloader.SobotImageLoader
    public void displayImage(Context context, ImageView imageView, @DrawableRes int i2, @DrawableRes int i3, @DrawableRes int i4, int i5, int i6, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener) {
    }
}
