package com.sobot.chat.widget.gif;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import java.io.InputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GifView extends View implements GifAction {
    private GifImageType animationType;
    private Bitmap currentImage;
    private DrawThread drawThread;
    private GifDecoder gifDecoder;
    private boolean isRun;
    private boolean pause;
    private Rect rect;
    @SuppressLint({"HandlerLeak"})
    private Handler redrawHandler;
    private int showHeight;
    private int showWidth;

    /* renamed from: com.sobot.chat.widget.gif.GifView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 extends Handler {
        public final /* synthetic */ GifView this$0;

        public AnonymousClass1(GifView gifView) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* renamed from: com.sobot.chat.widget.gif.GifView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$sobot$chat$widget$gif$GifView$GifImageType = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class DrawThread extends Thread {
        public final /* synthetic */ GifView this$0;

        private DrawThread(GifView gifView) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ DrawThread(GifView gifView, AnonymousClass1 anonymousClass1) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class GifImageType {
        private static final /* synthetic */ GifImageType[] $VALUES = null;
        public static final GifImageType COVER = null;
        public static final GifImageType SYNC_DECODER = null;
        public static final GifImageType WAIT_FINISH = null;
        public final int nativeInt;

        private GifImageType(String str, int i2, int i3) {
        }

        public static GifImageType valueOf(String str) {
        }

        public static GifImageType[] values() {
        }
    }

    public GifView(Context context) {
    }

    public static /* synthetic */ GifDecoder access$100(GifView gifView) {
    }

    public static /* synthetic */ boolean access$200(GifView gifView) {
    }

    public static /* synthetic */ boolean access$300(GifView gifView) {
    }

    public static /* synthetic */ Bitmap access$402(GifView gifView, Bitmap bitmap) {
    }

    public static /* synthetic */ Handler access$500(GifView gifView) {
    }

    private void reDraw() {
    }

    private void setGifDecoderImage(byte[] bArr) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // com.sobot.chat.widget.gif.GifAction
    public void parseOk(boolean z, int i2) {
    }

    public void setGifImage(byte[] bArr) {
    }

    public void setGifImageType(GifImageType gifImageType) {
    }

    public void setShowDimension(int i2, int i3) {
    }

    public void showAnimation() {
    }

    public void showCover() {
    }

    public void startGifView() {
    }

    public void stopGifView() {
    }

    public void setGifImage(InputStream inputStream) {
    }

    public void setGifImage(int i2) {
    }

    private void setGifDecoderImage(InputStream inputStream) {
    }

    public GifView(Context context, AttributeSet attributeSet) {
    }

    public GifView(Context context, AttributeSet attributeSet, int i2) {
    }
}
