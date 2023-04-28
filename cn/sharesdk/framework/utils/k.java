package cn.sharesdk.framework.utils;

import java.io.IOException;

/* compiled from: UnicodeEscaper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class k implements Escaper {

    /* compiled from: UnicodeEscaper.java */
    /* renamed from: cn.sharesdk.framework.utils.k$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        public int f232a;
        public char[] b;
        public final /* synthetic */ Appendable c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k f233d;

        public AnonymousClass1(k kVar, Appendable appendable) {
        }

        private void a(char[] cArr, int i2) throws IOException {
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i2, int i3) throws IOException {
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
        }
    }

    /* compiled from: UnicodeEscaper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a extends ThreadLocal<char[]> {
        private a() {
        }

        public char[] a() {
        }

        @Override // java.lang.ThreadLocal
        public /* synthetic */ char[] initialValue() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        }
    }

    public static final int b(CharSequence charSequence, int i2, int i3) {
    }

    public int a(CharSequence charSequence, int i2, int i3) {
    }

    public abstract char[] a(int i2);

    @Override // cn.sharesdk.framework.utils.Escaper
    public String escape(String str) {
    }

    public final String a(String str, int i2) {
    }

    @Override // cn.sharesdk.framework.utils.Escaper
    public Appendable escape(Appendable appendable) {
    }

    private static final char[] a(char[] cArr, int i2, int i3) {
    }
}
