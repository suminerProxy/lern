package com.mob.tools.gui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mob.tools.gui.BitmapProcessor;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AsyncImageView extends ImageView implements Handler.Callback, BitmapProcessor.BitmapCallback {
    private static final int MSG_IMG_GOT = 1;
    private static final SecureRandom RND = null;
    private Bitmap defaultBm;
    private int defaultRes;
    private int desiredHeight;
    private int desiredWidth;
    private long diskCacheTime;
    private Bitmap errorBm;
    private int errorRes;
    private boolean lastReqIsOk;
    private long maxBytes;
    private Path path;
    private int quality;
    private float[] rect;
    private WeakReference<AsyncImageView> refAiv;
    private Bitmap result;
    private boolean scaleToCrop;
    private String url;
    private boolean useDiskCache;
    private boolean useRamCache;

    public AsyncImageView(Context context) {
    }

    private BitmapProcessor.BitmapDesiredOptions getBitmapDesiredOptions() {
    }

    private int[] getSize() {
    }

    private Bitmap goCrop(Bitmap bitmap) {
    }

    private void init(Context context) {
    }

    private void myClip(Canvas canvas) {
    }

    public void deleteCachedFile(String str) {
    }

    public void execute(String str, int i2) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void onImageGot(String str, Bitmap bitmap) {
    }

    public void removeRamCache(String str) {
    }

    public void setBitmap(Bitmap bitmap) {
    }

    public void setCompressOptions(int i2, int i3, int i4, long j2) {
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setRound(float f2) {
    }

    public void setScaleToCropCenter(boolean z) {
    }

    public void setUseCacheOption(boolean z, boolean z2) {
    }

    public void execute(String str, int i2, int i3) {
    }

    public void setRound(float f2, float f3, float f4, float f5) {
    }

    public void setUseCacheOption(boolean z, boolean z2, long j2) {
    }

    public AsyncImageView(Context context, AttributeSet attributeSet) {
    }

    public void execute(String str, Bitmap bitmap) {
    }

    public void execute(String str, Bitmap bitmap, Bitmap bitmap2) {
    }

    public AsyncImageView(Context context, AttributeSet attributeSet, int i2) {
    }
}
