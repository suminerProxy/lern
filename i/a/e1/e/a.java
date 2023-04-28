package i.a.e1.e;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;

/* compiled from: CompositeException.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    /* compiled from: CompositeException.java */
    /* renamed from: i.a.e1.e.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class C0429a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        public C0429a(String message) {
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
        }
    }

    /* compiled from: CompositeException.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class b {
        public abstract void a(Object o2);
    }

    /* compiled from: CompositeException.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final PrintStream f26745a;

        public c(PrintStream printStream) {
        }

        @Override // i.a.e1.e.a.b
        public void a(Object o2) {
        }
    }

    /* compiled from: CompositeException.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        private final PrintWriter f26746a;

        public d(PrintWriter printWriter) {
        }

        @Override // i.a.e1.e.a.b
        public void a(Object o2) {
        }
    }

    public a(@i.a.e1.b.f Throwable... exceptions) {
        this(exceptions == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(exceptions));
    }

    private void appendStackTrace(StringBuilder b2, Throwable ex, String prefix) {
        StackTraceElement[] stackTrace;
        b2.append(prefix);
        b2.append(ex);
        b2.append('\n');
        for (StackTraceElement stackTraceElement : ex.getStackTrace()) {
            b2.append("\t\tat ");
            b2.append(stackTraceElement);
            b2.append('\n');
        }
        if (ex.getCause() != null) {
            b2.append("\tCaused by: ");
            appendStackTrace(b2, ex.getCause(), "");
        }
    }

    @Override // java.lang.Throwable
    @i.a.e1.b.f
    public synchronized Throwable getCause() {
        int i2;
        String[] split;
        if (this.cause == null) {
            String property = System.getProperty("line.separator");
            if (this.exceptions.size() > 1) {
                IdentityHashMap identityHashMap = new IdentityHashMap();
                StringBuilder sb = new StringBuilder();
                sb.append("Multiple exceptions (");
                sb.append(this.exceptions.size());
                sb.append(ChineseToPinyinResource.Field.RIGHT_BRACKET);
                sb.append(property);
                for (Throwable th : this.exceptions) {
                    int i3 = 0;
                    while (true) {
                        if (th != null) {
                            for (int i4 = 0; i4 < i3; i4++) {
                                sb.append("  ");
                            }
                            sb.append("|-- ");
                            sb.append(th.getClass().getCanonicalName());
                            sb.append(": ");
                            String message = th.getMessage();
                            if (message != null && message.contains(property)) {
                                sb.append(property);
                                for (String str : message.split(property)) {
                                    for (int i5 = 0; i5 < i3 + 2; i5++) {
                                        sb.append("  ");
                                    }
                                    sb.append(str);
                                    sb.append(property);
                                }
                            } else {
                                sb.append(message);
                                sb.append(property);
                            }
                            int i6 = 0;
                            while (true) {
                                i2 = i3 + 2;
                                if (i6 >= i2) {
                                    break;
                                }
                                sb.append("  ");
                                i6++;
                            }
                            StackTraceElement[] stackTrace = th.getStackTrace();
                            if (stackTrace.length > 0) {
                                sb.append("at ");
                                sb.append(stackTrace[0]);
                                sb.append(property);
                            }
                            if (!identityHashMap.containsKey(th)) {
                                identityHashMap.put(th, Boolean.TRUE);
                                th = th.getCause();
                                i3++;
                            } else {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    for (int i7 = 0; i7 < i2; i7++) {
                                        sb.append("  ");
                                    }
                                    sb.append("|-- ");
                                    sb.append("(cause not expanded again) ");
                                    sb.append(cause.getClass().getCanonicalName());
                                    sb.append(": ");
                                    sb.append(cause.getMessage());
                                    sb.append(property);
                                }
                            }
                        }
                    }
                }
                this.cause = new C0429a(sb.toString().trim());
            } else {
                this.cause = this.exceptions.get(0);
            }
        }
        return this.cause;
    }

    @i.a.e1.b.f
    public List<Throwable> getExceptions() {
        return this.exceptions;
    }

    @Override // java.lang.Throwable
    @i.a.e1.b.f
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public int size() {
        return this.exceptions.size();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream s) {
        printStackTrace(new c(s));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter s) {
        printStackTrace(new d(s));
    }

    public a(@i.a.e1.b.f Iterable<? extends Throwable> errors) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (errors != null) {
            for (Throwable th : errors) {
                if (th instanceof a) {
                    linkedHashSet.addAll(((a) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List<Throwable> unmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.exceptions = unmodifiableList;
            this.message = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    private void printStackTrace(b s) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i2 = 1;
        for (Throwable th : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i2);
            sb.append(" :\n");
            appendStackTrace(sb, th, "\t");
            i2++;
        }
        s.a(sb.toString());
    }
}
