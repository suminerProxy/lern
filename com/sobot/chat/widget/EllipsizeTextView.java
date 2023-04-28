package com.sobot.chat.widget;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class EllipsizeTextView extends TextView {
    private static final String DEFAULT_ELLIPSIZE_TEXT = "...";
    private int mEllipsizeIndex;
    private CharSequence mEllipsizeText;
    private boolean mIsExactlyMode;
    private int mMaxLines;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class Range<T extends Comparable<? super T>> {
        private final T mLower;
        private final T mUpper;

        public Range(T t, T t2) {
        }

        public boolean contains(T t) {
        }

        public T getLower() {
        }

        public T getUpper() {
        }
    }

    public EllipsizeTextView(Context context) {
    }

    private void adjustEllipsizeEndText(Layout layout) {
    }

    private Range<Integer> computeCharacterStyleRange(List<Range<Integer>> list, int i2) {
    }

    private List<Range<Integer>> computeCharacterStyleRanges(CharSequence charSequence) {
    }

    private int computeMaxLineCount(Layout layout) {
    }

    private int computeRemovedEllipsizeEndCharacterCount(int i2, CharSequence charSequence) {
    }

    private boolean isExceedMaxLine(Layout layout) {
    }

    private boolean isOutOfBounds(Layout layout) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setEllipsizeText(CharSequence charSequence, int i2) {
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
    }

    public EllipsizeTextView(Context context, AttributeSet attributeSet) {
    }
}
