package h.g.a.p.p;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* compiled from: GlideException.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class q extends Exception {
    private static final StackTraceElement[] EMPTY_ELEMENTS = null;
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private h.g.a.p.a dataSource;
    private String detailMessage;
    @Nullable
    private Exception exception;
    private h.g.a.p.g key;

    public q(String str) {
    }

    private void addRootCauses(Throwable th, List<Throwable> list) {
    }

    private static void appendCauses(List<Throwable> list, Appendable appendable) {
    }

    private static void appendCausesWrapped(List<Throwable> list, Appendable appendable) throws IOException {
    }

    private static void appendExceptionMessage(Throwable th, Appendable appendable) {
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
    }

    public List<Throwable> getCauses() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
    }

    @Nullable
    public Exception getOrigin() {
    }

    public List<Throwable> getRootCauses() {
    }

    public void logRootCauses(String str) {
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
    }

    public void setLoggingDetails(h.g.a.p.g gVar, h.g.a.p.a aVar) {
    }

    public void setOrigin(@Nullable Exception exc) {
    }

    public q(String str, Throwable th) {
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
    }

    public void setLoggingDetails(h.g.a.p.g gVar, h.g.a.p.a aVar, Class<?> cls) {
    }

    public q(String str, List<Throwable> list) {
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
    }

    private void printStackTrace(Appendable appendable) {
    }

    /* compiled from: GlideException.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a implements Appendable {

        /* renamed from: d  reason: collision with root package name */
        private static final String f16846d = "";

        /* renamed from: e  reason: collision with root package name */
        private static final String f16847e = "  ";
        private final Appendable b;
        private boolean c;

        public a(Appendable appendable) {
        }

        @NonNull
        private CharSequence a(@Nullable CharSequence charSequence) {
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence) throws IOException {
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence, int i2, int i3) throws IOException {
        }
    }
}
