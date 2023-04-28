package com.google.common.net;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
@Beta
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HostAndPort implements Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private HostAndPort(String str, int i2, boolean z) {
    }

    public static HostAndPort fromHost(String str) {
    }

    public static HostAndPort fromParts(String str, int i2) {
    }

    public static HostAndPort fromString(String str) {
    }

    private static String[] getHostAndPortFromBracketedHost(String str) {
    }

    private static boolean isValidPort(int i2) {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    public String getHost() {
    }

    public int getPort() {
    }

    public int getPortOrDefault(int i2) {
    }

    public boolean hasPort() {
    }

    public int hashCode() {
    }

    public HostAndPort requireBracketsForIPv6() {
    }

    public String toString() {
    }

    public HostAndPort withDefaultPort(int i2) {
    }
}
