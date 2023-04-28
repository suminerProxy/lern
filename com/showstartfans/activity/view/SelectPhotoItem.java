package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.taihe.photoselector.model.PhotoModel;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SelectPhotoItem extends FrameLayout implements CompoundButton.OnCheckedChangeListener {
    private SimpleDraweeView b;
    private CheckBox c;

    /* renamed from: d  reason: collision with root package name */
    private PhotoModel f6958d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f6959e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f6960f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6961g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6962h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f6963i;

    /* renamed from: j  reason: collision with root package name */
    public FrameLayout f6964j;

    /* renamed from: k  reason: collision with root package name */
    private View f6965k;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        void e(int i2);
    }

    public SelectPhotoItem(@NonNull Context context) {
    }

    private void a() {
    }

    private void c() {
    }

    private void d() {
    }

    public void b() {
    }

    public void e(PhotoModel photoModel, int i2, boolean z) {
    }

    public void f(boolean z) {
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
    }

    public void setCanCheck(boolean z) {
    }

    public void setCheckIndex(int i2) {
    }

    public void setData(PhotoModel photoModel) {
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
    }

    public SelectPhotoItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public SelectPhotoItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public SelectPhotoItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
    }
}
