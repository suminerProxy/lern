package com.sobot.chat.widget.gif;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sobot.chat.core.HttpUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GifView2 extends View implements View.OnTouchListener {
    public static final float SCALE_MAX = 3.0f;
    private static final float SCALE_MIN = 0.5f;
    private final int DEFAULT_MOVIE_VIEW_DURATION;
    private int currentAnimationTime;
    private double downX;
    private double downY;
    public int gifResource;
    private String gifUrl;
    private boolean isCanTouch;
    public volatile boolean isPaused;
    public boolean isPlaying;
    private boolean isScale;
    private boolean isVisible;
    public LoadFinishListener loadFinishListener;
    private double moveDist;
    private double moveRawX;
    private double moveRawY;
    private double moveX;
    private double moveY;
    private Movie movie;
    private float movieLeft;
    private int movieMeasuredMovieHeight;
    private int movieMeasuredMovieWidth;
    private int movieMovieResourceId;
    private float movieScale;
    private long movieStart;
    private float movieTop;
    private double oldDist;
    private int point_num;

    /* renamed from: com.sobot.chat.widget.gif.GifView2$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements HttpUtils.FileCallBack {
        public final /* synthetic */ GifView2 this$0;

        public AnonymousClass1(GifView2 gifView2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void inProgress(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void onError(Exception exc, String str, int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void onResponse(File file) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface LoadFinishListener {
        void endCallBack(String str);
    }

    public GifView2(Context context) {
    }

    private void drawMovieFrame(Canvas canvas) {
    }

    private void init(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    private void invalidateView() {
    }

    private void setSelfPivot(float f2, float f3) {
    }

    private double spacing(MotionEvent motionEvent) {
    }

    private void updateAnimationTime() {
    }

    public void displayImage(String str, File file, GifView2 gifView2) {
    }

    public File getFilesDir(Context context, String str) {
    }

    public File getImageDir(Context context) {
    }

    public int getMovieMovieResourceId() {
    }

    public boolean isSdCardExist() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i2) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
    }

    public void pause() {
    }

    public void play() {
    }

    public void setGifImage(FileInputStream fileInputStream) {
    }

    public void setInitScale() {
    }

    public void setIsCanTouch(boolean z) {
    }

    public void setLoadFinishListener(LoadFinishListener loadFinishListener) {
    }

    public void setMovieMovieResourceId(int i2, InputStream inputStream) {
    }

    public void setPivot(float f2, float f3) {
    }

    public void setScale(float f2) {
    }

    public GifView2(Context context, @Nullable AttributeSet attributeSet) {
    }

    public GifView2(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public void setGifImage(FileInputStream fileInputStream, String str) {
    }
}
