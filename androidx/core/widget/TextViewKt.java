package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001az\u0010\r\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001az\u0010\u0010\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\n0\u0001H\u0086\b¢\u0006\u0004\b\u0010\u0010\u000e\u001a;\u0010\u0013\u001a\u00020\f*\u00020\u00002%\b\u0004\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u0011H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0087\u0002\u0010\u0018\u001a\u00020\f*\u00020\u00002d\b\u0006\u0010\u0015\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00012d\b\u0006\u0010\u0016\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\n0\u00012%\b\u0006\u0010\u0017\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u0011H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "text", "", "start", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "", "action", "Landroid/text/TextWatcher;", "doBeforeTextChanged", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function4;)Landroid/text/TextWatcher;", TtmlNode.ANNOTATION_POSITION_BEFORE, "doOnTextChanged", "Lkotlin/Function1;", "Landroid/text/Editable;", "doAfterTextChanged", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)Landroid/text/TextWatcher;", "beforeTextChanged", "onTextChanged", "afterTextChanged", "addTextChangedListener", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;)Landroid/text/TextWatcher;", "core-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class TextViewKt {
    @NotNull
    public static final TextWatcher addTextChangedListener(@NotNull TextView textView, @NotNull Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4, @NotNull Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function42, @NotNull Function1<? super Editable, Unit> function1) {
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, Function4 function4, Function4 function42, Function1 function1, int i2, Object obj) {
    }

    @NotNull
    public static final TextWatcher doAfterTextChanged(@NotNull TextView textView, @NotNull Function1<? super Editable, Unit> function1) {
    }

    @NotNull
    public static final TextWatcher doBeforeTextChanged(@NotNull TextView textView, @NotNull Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
    }

    @NotNull
    public static final TextWatcher doOnTextChanged(@NotNull TextView textView, @NotNull Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
    }
}
