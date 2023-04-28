package com.facebook.drawee.drawable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface Rounded {
    int getBorderColor();

    float getBorderWidth();

    float getPadding();

    boolean getPaintFilterBitmap();

    float[] getRadii();

    boolean getScaleDownInsideBorders();

    boolean isCircle();

    void setBorder(int color, float width);

    void setCircle(boolean isCircle);

    void setPadding(float padding);

    void setPaintFilterBitmap(boolean paintFilterBitmap);

    void setRadii(float[] radii);

    void setRadius(float radius);

    void setScaleDownInsideBorders(boolean scaleDownInsideBorders);
}
