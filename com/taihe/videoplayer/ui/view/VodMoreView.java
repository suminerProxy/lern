package com.taihe.videoplayer.ui.view;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import h.x.g.f;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class VodMoreView extends RelativeLayout implements RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener {
    private static final String s = "android.media.VOLUME_CHANGED_ACTION";
    private static final String t = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    private Context b;
    private SeekBar c;

    /* renamed from: d  reason: collision with root package name */
    private SeekBar f7955d;

    /* renamed from: e  reason: collision with root package name */
    private Switch f7956e;

    /* renamed from: f  reason: collision with root package name */
    private Switch f7957f;

    /* renamed from: g  reason: collision with root package name */
    private c f7958g;

    /* renamed from: h  reason: collision with root package name */
    private AudioManager f7959h;

    /* renamed from: i  reason: collision with root package name */
    private RadioGroup f7960i;

    /* renamed from: j  reason: collision with root package name */
    private RadioButton f7961j;

    /* renamed from: k  reason: collision with root package name */
    private RadioButton f7962k;

    /* renamed from: l  reason: collision with root package name */
    private RadioButton f7963l;

    /* renamed from: m  reason: collision with root package name */
    private RadioButton f7964m;

    /* renamed from: n  reason: collision with root package name */
    private LinearLayout f7965n;

    /* renamed from: o  reason: collision with root package name */
    private LinearLayout f7966o;

    /* renamed from: p  reason: collision with root package name */
    private d f7967p;
    private final SeekBar.OnSeekBarChangeListener q;
    private final SeekBar.OnSeekBarChangeListener r;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ VodMoreView b;

        public a(VodMoreView vodMoreView) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ VodMoreView b;

        public b(VodMoreView vodMoreView) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void a(float f2);

        void d(boolean z);

        void g(boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VodMoreView f7968a;

        private d(VodMoreView vodMoreView) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ d(VodMoreView vodMoreView, a aVar) {
        }
    }

    public VodMoreView(Context context) {
    }

    public static /* synthetic */ void a(VodMoreView vodMoreView, int i2) {
    }

    public static /* synthetic */ void b(VodMoreView vodMoreView, int i2) {
    }

    public static /* synthetic */ void c(VodMoreView vodMoreView) {
    }

    public static float d(Activity activity) {
    }

    private void e(Context context) {
    }

    private void h(int i2) {
    }

    private void i() {
    }

    private void j() {
    }

    private void l(int i2) {
    }

    public void f() {
    }

    public void g() {
    }

    public void k(f.e eVar) {
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
    }

    public void setBrightProgress(int i2) {
    }

    public void setCallback(c cVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public VodMoreView(Context context, AttributeSet attributeSet) {
    }

    public VodMoreView(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i2) {
    }
}
