package e;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* compiled from: AggregateException.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a extends Exception {
    private static final String DEFAULT_MESSAGE = "There were multiple errors.";
    private static final long serialVersionUID = 1;
    private List<Throwable> innerThrowables;

    public a(String str, Throwable[] thArr) {
    }

    @Deprecated
    public Throwable[] getCauses() {
    }

    @Deprecated
    public List<Exception> getErrors() {
    }

    public List<Throwable> getInnerThrowables() {
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
    }

    public a(String str, List<? extends Throwable> list) {
    }

    public a(List<? extends Throwable> list) {
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
    }
}
