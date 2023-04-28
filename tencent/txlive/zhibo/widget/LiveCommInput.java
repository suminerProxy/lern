package tencent.txlive.zhibo.widget;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import h.u.a.w.d0.d2;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LiveCommInput.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u0012\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\u001a\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010(\u001a\u00020\u0018H\u0002J\u0006\u0010)\u001a\u00020\u0018R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Ltencent/txlive/zhibo/widget/LiveCommInput;", "Landroidx/fragment/app/DialogFragment;", "inputHi", "", "inputType", "", "maxInputLen", "imeOption", "(Ljava/lang/String;III)V", "editComment", "Landroid/widget/EditText;", "fragmentManager", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Ljava/lang/ref/WeakReference;", "setFragmentManager", "(Ljava/lang/ref/WeakReference;)V", "imOption", "listener", "Lcom/showstartfans/activity/widget/popupwindow/OnDanmuInputCall;", "getListener", "setListener", "dismi", "", "doneView", "mInput", "listenerKeyBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onStart", "onViewCreated", "view", "setInputStyle", "shows", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class LiveCommInput extends DialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @Nullable
    private EditText editComment;
    @Nullable
    private WeakReference<FragmentManager> fragmentManager;
    private int imOption;
    @Nullable
    private String inputHi;
    private int inputType;
    @Nullable
    private WeakReference<d2> listener;
    private int maxInputLen;

    public LiveCommInput(@NotNull String str, int i2, int i3, int i4) {
    }

    private final void doneView(EditText editText) {
    }

    public static /* synthetic */ void e(LiveCommInput liveCommInput) {
    }

    public static /* synthetic */ boolean f(LiveCommInput liveCommInput, TextView textView, int i2, KeyEvent keyEvent) {
    }

    public static /* synthetic */ boolean g(LiveCommInput liveCommInput, View view, int i2, KeyEvent keyEvent) {
    }

    public static /* synthetic */ boolean h(LiveCommInput liveCommInput, View view, MotionEvent motionEvent) {
    }

    private final void listenerKeyBar() {
    }

    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    private static final void m1749onViewCreated$lambda0(LiveCommInput liveCommInput) {
    }

    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    private static final boolean m1750onViewCreated$lambda1(LiveCommInput liveCommInput, TextView textView, int i2, KeyEvent keyEvent) {
    }

    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    private static final boolean m1751onViewCreated$lambda2(LiveCommInput liveCommInput, View view, int i2, KeyEvent keyEvent) {
    }

    /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
    private static final boolean m1752onViewCreated$lambda3(LiveCommInput liveCommInput, View view, MotionEvent motionEvent) {
    }

    private final void setInputStyle() {
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public final void dismi() {
    }

    @Nullable
    public final WeakReference<FragmentManager> getFragmentManager() {
    }

    @Nullable
    public final WeakReference<d2> getListener() {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
    }

    public final void setFragmentManager(@Nullable WeakReference<FragmentManager> weakReference) {
    }

    public final void setListener(@Nullable WeakReference<d2> weakReference) {
    }

    public final void shows() {
    }

    public /* synthetic */ LiveCommInput(String str, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
