package com.sobot.chat.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import com.sobot.chat.imageloader.SobotImageLoader;
import h.g.a.p.a;
import h.g.a.p.p.q;
import h.g.a.t.h;
import h.g.a.t.l.p;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotGlideV4ImageLoader extends SobotImageLoader {

    /* renamed from: com.sobot.chat.imageloader.SobotGlideV4ImageLoader$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements h<Bitmap> {
        public final /* synthetic */ SobotGlideV4ImageLoader this$0;
        public final /* synthetic */ ImageView val$imageView;
        public final /* synthetic */ SobotImageLoader.SobotDisplayImageListener val$listener;
        public final /* synthetic */ String val$path;

        public AnonymousClass1(SobotGlideV4ImageLoader sobotGlideV4ImageLoader, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener, ImageView imageView, String str) {
        }

        @Override // h.g.a.t.h
        public boolean onLoadFailed(@Nullable q qVar, Object obj, p<Bitmap> pVar, boolean z) {
        }

        @Override // h.g.a.t.h
        public /* bridge */ /* synthetic */ boolean onResourceReady(Bitmap bitmap, Object obj, p<Bitmap> pVar, a aVar, boolean z) {
        }

        /* renamed from: onResourceReady  reason: avoid collision after fix types in other method */
        public boolean onResourceReady2(Bitmap bitmap, Object obj, p<Bitmap> pVar, a aVar, boolean z) {
        }
    }

    /* renamed from: com.sobot.chat.imageloader.SobotGlideV4ImageLoader$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements h<Bitmap> {
        public final /* synthetic */ SobotGlideV4ImageLoader this$0;
        public final /* synthetic */ ImageView val$imageView;
        public final /* synthetic */ SobotImageLoader.SobotDisplayImageListener val$listener;

        public AnonymousClass2(SobotGlideV4ImageLoader sobotGlideV4ImageLoader, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener, ImageView imageView) {
        }

        @Override // h.g.a.t.h
        public boolean onLoadFailed(@Nullable q qVar, Object obj, p<Bitmap> pVar, boolean z) {
        }

        @Override // h.g.a.t.h
        public /* bridge */ /* synthetic */ boolean onResourceReady(Bitmap bitmap, Object obj, p<Bitmap> pVar, a aVar, boolean z) {
        }

        /* renamed from: onResourceReady  reason: avoid collision after fix types in other method */
        public boolean onResourceReady2(Bitmap bitmap, Object obj, p<Bitmap> pVar, a aVar, boolean z) {
        }
    }

    @Override // com.sobot.chat.imageloader.SobotImageLoader
    public void displayImage(Context context, ImageView imageView, String str, @DrawableRes int i2, @DrawableRes int i3, int i4, int i5, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener) {
    }

    @Override // com.sobot.chat.imageloader.SobotImageLoader
    public void displayImage(Context context, ImageView imageView, @DrawableRes int i2, @DrawableRes int i3, @DrawableRes int i4, int i5, int i6, SobotImageLoader.SobotDisplayImageListener sobotDisplayImageListener) {
    }
}
