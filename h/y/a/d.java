package h.y.a;

import android.content.Context;
import android.net.Uri;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0001\u001a<\u0010\u0012\u001a\u00020\f\"\b\b\u0000\u0010\u0013*\u00020\u0014*\u0002H\u00132!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0002\u0010\u001a\u001a\u0012\u0010\u001b\u001a\u00020\f*\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0001\u001a\u0012\u0010\u001d\u001a\u00020\f*\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f\u001a\u0012\u0010 \u001a\u00020\f*\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f\u001a\f\u0010!\u001a\u00020\"*\u0004\u0018\u00010\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006#"}, d2 = {"screenHeight", "", "Landroid/content/Context;", "getScreenHeight", "(Landroid/content/Context;)I", "screenWidth", "getScreenWidth", "toInt", "", "getToInt", "(Ljava/lang/String;)I", "addFilter", "", "Landroid/widget/EditText;", "filter", "Landroid/text/InputFilter;", "dip2px", "dp", "doOnGlobalLayout", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/view/View;", "work", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "maxLength", SessionDescription.ATTR_LENGTH, "setCanInputEnter", "can", "", "setCanInputSpace", "toUri", "Landroid/net/Uri;", "module_common_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class d {

    /* JADX WARN: Field signature parse error: b
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TV at position 1 ('V'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
     */
    /* compiled from: Extensions.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taihebase/activity/ExtensionsKt$doOnGlobalLayout$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ Function1<V, Unit> c;

        /* JADX WARN: Incorrect types in method signature: (TV;Lkotlin/jvm/functions/Function1<-TV;Lkotlin/Unit;>;)V */
        public a(View view, Function1 function1) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* compiled from: Extensions.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/taihebase/activity/ExtensionsKt$maxLength$1", "Landroid/text/InputFilter$LengthFilter;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends InputFilter.LengthFilter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f26064a;

        public b(int i2) {
        }
    }

    public static final void a(@NotNull EditText editText, @NotNull InputFilter inputFilter) {
    }

    public static final int b(@NotNull Context context, int i2) {
    }

    public static final <V extends View> void c(@NotNull V v, @NotNull Function1<? super V, Unit> function1) {
    }

    public static final int d(@NotNull Context context) {
    }

    public static final int e(@NotNull Context context) {
    }

    public static final int f(@Nullable String str) {
    }

    public static /* synthetic */ CharSequence g(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
    }

    public static /* synthetic */ CharSequence h(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
    }

    public static final void i(@NotNull EditText editText, int i2) {
    }

    public static final void j(@NotNull EditText editText, boolean z) {
    }

    private static final CharSequence k(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
    }

    public static final void l(@NotNull EditText editText, boolean z) {
    }

    private static final CharSequence m(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
    }

    @NotNull
    public static final Uri n(@Nullable String str) {
    }
}
