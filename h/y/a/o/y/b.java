package h.y.a.o.y;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.tencent.android.tpush.common.Constants;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseSheetFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0004J\b\u0010\u000f\u001a\u00020\u0010H$J\b\u0010\u0011\u001a\u00020\u0010H$J\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H$J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0004J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\nH\u0004J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\nH\u0004J\b\u0010$\u001a\u00020\u0010H\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006%"}, d2 = {"Lcom/taihebase/activity/view/bottomsheet/BaseSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "ctx", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "setCtx", "(Landroid/content/Context;)V", "getContentView", "", "getContentViewBinding", "Landroidx/viewbinding/ViewBinding;", "getSheetDialog", "Lcom/taihebase/activity/view/bottomsheet/BottomDialog;", "initData", "", "initListener", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "setCanotDrag", "setPeekHeight", "peekHeight", "setTopOffset", Constants.FLAG_TAG_OFFSET, "topOffsetDefault", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class b extends BottomSheetDialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @Nullable
    private Context ctx;

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public int getContentView() {
    }

    @Nullable
    public ViewBinding getContentViewBinding() {
    }

    @Nullable
    public final Context getCtx() {
    }

    @NotNull
    public final c getSheetDialog() {
    }

    public abstract void initData();

    public abstract void initListener();

    public abstract void initView(@NotNull View view, @Nullable Bundle bundle);

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
    }

    public final void setCanotDrag() {
    }

    public final void setCtx(@Nullable Context context) {
    }

    public final void setPeekHeight(int i2) {
    }

    public final void setTopOffset(int i2) {
    }

    public final void topOffsetDefault() {
    }
}
