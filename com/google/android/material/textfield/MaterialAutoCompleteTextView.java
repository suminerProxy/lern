package com.google.android.material.textfield;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    private static final int MAX_ITEMS_MEASURED = 15;
    @Nullable
    private final AccessibilityManager accessibilityManager;
    @NonNull
    private final ListPopupWindow modalListPopup;
    @NonNull
    private final Rect tempRect;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ MaterialAutoCompleteTextView this$0;

        public AnonymousClass1(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context) {
    }

    public static /* synthetic */ ListPopupWindow access$000(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
    }

    public static /* synthetic */ void access$100(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
    }

    @Nullable
    private TextInputLayout findTextInputLayoutAncestor() {
    }

    private int measureContentWidth() {
    }

    private <T extends ListAdapter & Filterable> void updateText(Object obj) {
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
