package com.showstartfans.activity.view.textview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import h.u.a.u.e4.b;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CountDownLiveSubTextView extends AppCompatTextView {
    private Context b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private h.u.a.u.e4.b f7266d;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements b.InterfaceC0364b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f7267a;
        public final /* synthetic */ CountDownLiveSubTextView b;

        public a(CountDownLiveSubTextView countDownLiveSubTextView, b bVar) {
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

    public CountDownLiveSubTextView(Context context) {
    }

    public static /* synthetic */ String a(CountDownLiveSubTextView countDownLiveSubTextView) {
    }

    public static /* synthetic */ h.u.a.u.e4.b b(CountDownLiveSubTextView countDownLiveSubTextView) {
    }

    public h.u.a.u.e4.b c(long j2, b bVar) {
    }

    public void d() {
    }

    public void setStr(String str) {
    }

    public CountDownLiveSubTextView(Context context, AttributeSet attributeSet) {
    }

    public CountDownLiveSubTextView(Context context, AttributeSet attributeSet, int i2) {
    }
}
