package com.showstartfans.activity.view.textview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import h.u.a.u.e4.b;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CountDownTextView extends AppCompatTextView {
    private Context b;
    private h.u.a.u.e4.b c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements b.InterfaceC0364b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7273a;
        public final /* synthetic */ b b;
        public final /* synthetic */ CountDownTextView c;

        public a(CountDownTextView countDownTextView, String str, b bVar) {
        }

        @Override // h.u.a.u.e4.b.InterfaceC0364b
        public void a(long j2, int i2, int i3, int i4, int i5, String str, String str2, String str3) {
        }

        @Override // h.u.a.u.e4.b.InterfaceC0364b
        public void onFinish() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void onCountDownFinish();

        void onUntilFinished(long j2);
    }

    public CountDownTextView(Context context) {
    }

    public static /* synthetic */ Context a(CountDownTextView countDownTextView) {
    }

    public static /* synthetic */ h.u.a.u.e4.b b(CountDownTextView countDownTextView) {
    }

    public void c() {
    }

    public h.u.a.u.e4.b d(long j2, String str, b bVar) {
    }

    public void e() {
    }

    public CountDownTextView(Context context, AttributeSet attributeSet) {
    }

    public CountDownTextView(Context context, AttributeSet attributeSet, int i2) {
    }
}
