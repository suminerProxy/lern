package h.s.a.l;

import android.graphics.Canvas;
import android.widget.ImageView;
import com.umeng.analytics.pro.am;
import h.s.a.j;
import h.s.a.m.h;
import h.s.a.n.e;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SGVADrawer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00000\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0018\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017¨\u0006\u001b"}, d2 = {"Lh/s/a/l/a;", "", "", "frameIndex", "", "Lh/s/a/l/a$a;", "d", "(I)Ljava/util/List;", "Landroid/graphics/Canvas;", "canvas", "Landroid/widget/ImageView$ScaleType;", "scaleType", "", "a", "(Landroid/graphics/Canvas;ILandroid/widget/ImageView$ScaleType;)V", "Lh/s/a/j;", "b", "Lh/s/a/j;", am.aF, "()Lh/s/a/j;", "videoItem", "Lh/s/a/n/e;", "Lh/s/a/n/e;", "()Lh/s/a/n/e;", "scaleInfo", "<init>", "(Lh/s/a/j;)V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class a {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final e f17822a;
    @NotNull
    private final j b;

    /* compiled from: SGVADrawer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"h/s/a/l/a$a", "", "Lh/s/a/m/h;", am.aF, "Lh/s/a/m/h;", "a", "()Lh/s/a/m/h;", "frameEntity", "", "Ljava/lang/String;", "()Ljava/lang/String;", "matteKey", "b", "imageKey", "<init>", "(Lh/s/a/l/a;Ljava/lang/String;Ljava/lang/String;Lh/s/a/m/h;)V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* renamed from: h.s.a.l.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class C0342a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        private final String f17823a;
        @Nullable
        private final String b;
        @NotNull
        private final h c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f17824d;

        public C0342a(@Nullable a aVar, @Nullable String str, @NotNull String str2, h hVar) {
        }

        @NotNull
        public final h a() {
        }

        @Nullable
        public final String b() {
        }

        @Nullable
        public final String c() {
        }
    }

    public a(@NotNull j jVar) {
    }

    public void a(@NotNull Canvas canvas, int i2, @NotNull ImageView.ScaleType scaleType) {
    }

    @NotNull
    public final e b() {
    }

    @NotNull
    public final j c() {
    }

    @NotNull
    public final List<C0342a> d(int i2) {
    }
}
