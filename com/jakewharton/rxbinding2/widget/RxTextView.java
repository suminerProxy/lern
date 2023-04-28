package com.jakewharton.rxbinding2.widget;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.InitialValueObservable;
import i.a.b0;
import i.a.x0.g;
import i.a.x0.r;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RxTextView {
    private RxTextView() {
    }

    public static /* synthetic */ void a(@NonNull TextView textView, Integer num) throws Exception {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<TextViewAfterTextChangeEvent> afterTextChangeEvents(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<TextViewBeforeTextChangeEvent> beforeTextChangeEvents(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super Integer> color(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    public static b0<TextViewEditorActionEvent> editorActionEvents(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    public static b0<Integer> editorActions(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super CharSequence> error(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super Integer> errorRes(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super CharSequence> hint(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super Integer> hintRes(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super CharSequence> text(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<TextViewTextChangeEvent> textChangeEvents(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<CharSequence> textChanges(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super Integer> textRes(@NonNull TextView textView) {
    }

    @NonNull
    @CheckResult
    public static b0<TextViewEditorActionEvent> editorActionEvents(@NonNull TextView textView, @NonNull r<? super TextViewEditorActionEvent> rVar) {
    }

    @NonNull
    @CheckResult
    public static b0<Integer> editorActions(@NonNull TextView textView, @NonNull r<? super Integer> rVar) {
    }
}
