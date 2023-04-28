package com.facebook.drawee.view;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MultiDraweeHolder<DH extends DraweeHierarchy> {
    @VisibleForTesting
    public ArrayList<DraweeHolder<DH>> mHolders;
    @VisibleForTesting
    public boolean mIsAttached;

    public void add(DraweeHolder<DH> holder) {
    }

    public void clear() {
    }

    public void draw(Canvas canvas) {
    }

    public DraweeHolder<DH> get(int index) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public boolean onTouchEvent(MotionEvent event) {
    }

    public void remove(int index) {
    }

    public int size() {
    }

    public boolean verifyDrawable(Drawable who) {
    }

    public void add(int index, DraweeHolder<DH> holder) {
    }
}
