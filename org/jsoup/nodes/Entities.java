package org.jsoup.nodes;

import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import org.jsoup.nodes.Document;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class Entities {
    private static final Document.OutputSettings DefaultOutput = null;
    private static final char[] codeDelims = null;
    public static final int codepointRadix = 36;
    private static final int empty = -1;
    private static final String emptyName = "";
    private static final HashMap<String, String> multipoints = null;

    /* renamed from: org.jsoup.nodes.Entities$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$jsoup$nodes$Entities$CoreCharset = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class CoreCharset {
        private static final /* synthetic */ CoreCharset[] $VALUES = null;
        public static final CoreCharset ascii = null;
        public static final CoreCharset fallback = null;
        public static final CoreCharset utf = null;

        private CoreCharset(String str, int i2) {
        }

        public static CoreCharset byName(String str) {
        }

        public static CoreCharset valueOf(String str) {
        }

        public static CoreCharset[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class EscapeMode {
        private static final /* synthetic */ EscapeMode[] $VALUES = null;
        public static final EscapeMode base = null;
        public static final EscapeMode extended = null;
        public static final EscapeMode xhtml = null;
        private int[] codeKeys;
        private int[] codeVals;
        private String[] nameKeys;
        private String[] nameVals;

        private EscapeMode(String str, int i2, String str2, int i3) {
        }

        public static /* synthetic */ String[] access$100(EscapeMode escapeMode) {
        }

        public static /* synthetic */ String[] access$102(EscapeMode escapeMode, String[] strArr) {
        }

        public static /* synthetic */ int[] access$200(EscapeMode escapeMode) {
        }

        public static /* synthetic */ int[] access$202(EscapeMode escapeMode, int[] iArr) {
        }

        public static /* synthetic */ int[] access$300(EscapeMode escapeMode) {
        }

        public static /* synthetic */ int[] access$302(EscapeMode escapeMode, int[] iArr) {
        }

        public static /* synthetic */ String[] access$400(EscapeMode escapeMode) {
        }

        public static /* synthetic */ String[] access$402(EscapeMode escapeMode, String[] strArr) {
        }

        private int size() {
        }

        public static EscapeMode valueOf(String str) {
        }

        public static EscapeMode[] values() {
        }

        public int codepointForName(String str) {
        }

        public String nameForCodepoint(int i2) {
        }
    }

    private Entities() {
    }

    public static /* synthetic */ void access$000(EscapeMode escapeMode, String str, int i2) {
    }

    private static void appendEncoded(Appendable appendable, EscapeMode escapeMode, int i2) throws IOException {
    }

    private static boolean canEncode(CoreCharset coreCharset, char c, CharsetEncoder charsetEncoder) {
    }

    public static int codepointsForName(String str, int[] iArr) {
    }

    public static String escape(String str, Document.OutputSettings outputSettings) {
    }

    public static String getByName(String str) {
    }

    public static Character getCharacterByName(String str) {
    }

    public static boolean isBaseNamedEntity(String str) {
    }

    public static boolean isNamedEntity(String str) {
    }

    private static void load(EscapeMode escapeMode, String str, int i2) {
    }

    public static String unescape(String str) {
    }

    public static String unescape(String str, boolean z) {
    }

    public static String escape(String str) {
    }

    public static void escape(Appendable appendable, String str, Document.OutputSettings outputSettings, boolean z, boolean z2, boolean z3) throws IOException {
    }
}
