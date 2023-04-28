package com.google.common.net;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.Immutable;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
@Beta
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class InternetDomainName {
    private static final CharMatcher DASH_MATCHER = null;
    private static final CharMatcher DOTS_MATCHER = null;
    private static final Joiner DOT_JOINER = null;
    private static final Splitter DOT_SPLITTER = null;
    private static final int MAX_DOMAIN_PART_LENGTH = 63;
    private static final int MAX_LENGTH = 253;
    private static final int MAX_PARTS = 127;
    private static final int NO_SUFFIX_FOUND = -1;
    private static final CharMatcher PART_CHAR_MATCHER = null;
    private final String name;
    private final ImmutableList<String> parts;
    private final int publicSuffixIndex;
    private final int registrySuffixIndex;

    public InternetDomainName(String str) {
    }

    private InternetDomainName ancestor(int i2) {
    }

    private int findSuffixOfType(Optional<PublicSuffixType> optional) {
    }

    public static InternetDomainName from(String str) {
    }

    public static boolean isValid(String str) {
    }

    private static boolean matchesType(Optional<PublicSuffixType> optional, Optional<PublicSuffixType> optional2) {
    }

    private static boolean matchesWildcardSuffixType(Optional<PublicSuffixType> optional, String str) {
    }

    private static boolean validatePart(String str, boolean z) {
    }

    private static boolean validateSyntax(List<String> list) {
    }

    public InternetDomainName child(String str) {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    public boolean hasParent() {
    }

    public boolean hasPublicSuffix() {
    }

    public boolean hasRegistrySuffix() {
    }

    public int hashCode() {
    }

    public boolean isPublicSuffix() {
    }

    public boolean isRegistrySuffix() {
    }

    public boolean isTopDomainUnderRegistrySuffix() {
    }

    public boolean isTopPrivateDomain() {
    }

    public boolean isUnderPublicSuffix() {
    }

    public boolean isUnderRegistrySuffix() {
    }

    public InternetDomainName parent() {
    }

    public ImmutableList<String> parts() {
    }

    public InternetDomainName publicSuffix() {
    }

    public InternetDomainName registrySuffix() {
    }

    public String toString() {
    }

    public InternetDomainName topDomainUnderRegistrySuffix() {
    }

    public InternetDomainName topPrivateDomain() {
    }
}
