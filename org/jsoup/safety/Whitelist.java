package org.jsoup.safety;

import java.util.Map;
import java.util.Set;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class Whitelist {
    private Map<TagName, Set<AttributeKey>> attributes;
    private Map<TagName, Map<AttributeKey, AttributeValue>> enforcedAttributes;
    private boolean preserveRelativeLinks;
    private Map<TagName, Map<AttributeKey, Set<Protocol>>> protocols;
    private Set<TagName> tagNames;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class AttributeKey extends TypedValue {
        public AttributeKey(String str) {
        }

        public static AttributeKey valueOf(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class AttributeValue extends TypedValue {
        public AttributeValue(String str) {
        }

        public static AttributeValue valueOf(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class Protocol extends TypedValue {
        public Protocol(String str) {
        }

        public static Protocol valueOf(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class TagName extends TypedValue {
        public TagName(String str) {
        }

        public static TagName valueOf(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class TypedValue {
        private String value;

        public TypedValue(String str) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public static Whitelist basic() {
    }

    public static Whitelist basicWithImages() {
    }

    private boolean isValidAnchor(String str) {
    }

    public static Whitelist none() {
    }

    public static Whitelist relaxed() {
    }

    public static Whitelist simpleText() {
    }

    private boolean testValidProtocol(Element element, Attribute attribute, Set<Protocol> set) {
    }

    public Whitelist addAttributes(String str, String... strArr) {
    }

    public Whitelist addEnforcedAttribute(String str, String str2, String str3) {
    }

    public Whitelist addProtocols(String str, String str2, String... strArr) {
    }

    public Whitelist addTags(String... strArr) {
    }

    public Attributes getEnforcedAttributes(String str) {
    }

    public boolean isSafeAttribute(String str, Element element, Attribute attribute) {
    }

    public boolean isSafeTag(String str) {
    }

    public Whitelist preserveRelativeLinks(boolean z) {
    }

    public Whitelist removeAttributes(String str, String... strArr) {
    }

    public Whitelist removeEnforcedAttribute(String str, String str2) {
    }

    public Whitelist removeProtocols(String str, String str2, String... strArr) {
    }

    public Whitelist removeTags(String... strArr) {
    }
}
