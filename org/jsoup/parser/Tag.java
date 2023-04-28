package org.jsoup.parser;

import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class Tag {
    private static final String[] blockTags = null;
    private static final String[] emptyTags = null;
    private static final String[] formListedTags = null;
    private static final String[] formSubmitTags = null;
    private static final String[] formatAsInlineTags = null;
    private static final String[] inlineTags = null;
    private static final String[] preserveWhitespaceTags = null;
    private static final Map<String, Tag> tags = null;
    private boolean canContainInline;
    private boolean empty;
    private boolean formList;
    private boolean formSubmit;
    private boolean formatAsBlock;
    private boolean isBlock;
    private boolean preserveWhitespace;
    private boolean selfClosing;
    private String tagName;

    private Tag(String str) {
    }

    private static void register(Tag tag) {
    }

    public static Tag valueOf(String str, ParseSettings parseSettings) {
    }

    public boolean canContainBlock() {
    }

    public boolean equals(Object obj) {
    }

    public boolean formatAsBlock() {
    }

    public String getName() {
    }

    public int hashCode() {
    }

    public boolean isBlock() {
    }

    public boolean isData() {
    }

    public boolean isEmpty() {
    }

    public boolean isFormListed() {
    }

    public boolean isFormSubmittable() {
    }

    public boolean isInline() {
    }

    public boolean isKnownTag() {
    }

    public boolean isSelfClosing() {
    }

    public boolean preserveWhitespace() {
    }

    public Tag setSelfClosing() {
    }

    public String toString() {
    }

    public static boolean isKnownTag(String str) {
    }

    public static Tag valueOf(String str) {
    }
}
