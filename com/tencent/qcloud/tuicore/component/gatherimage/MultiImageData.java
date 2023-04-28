package com.tencent.qcloud.tuicore.component.gatherimage;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MultiImageData implements Cloneable {
    public static final int maxSize = 9;
    public int bgColor;
    public Map<Integer, Bitmap> bitmapMap;
    public int columnCount;
    public int defaultImageResId;
    public int gap;
    public List<Object> imageUrls;
    public int maxHeight;
    public int maxWidth;
    public int rowCount;
    public int targetImageSize;

    public MultiImageData() {
    }

    /* renamed from: clone  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m35clone() throws CloneNotSupportedException {
    }

    public Bitmap getBitmap(int i2) {
    }

    public int getDefaultImageResId() {
    }

    public List<Object> getImageUrls() {
    }

    public void putBitmap(Bitmap bitmap, int i2) {
    }

    public void setDefaultImageResId(int i2) {
    }

    public void setImageUrls(List<Object> list) {
    }

    public int size() {
    }

    public MultiImageData clone() throws CloneNotSupportedException {
    }

    public MultiImageData(int i2) {
    }

    public MultiImageData(List<Object> list, int i2) {
    }
}
