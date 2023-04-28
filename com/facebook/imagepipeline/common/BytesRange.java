package com.facebook.imagepipeline.common;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.util.HashCodeUtil;
import com.facebook.infer.annotation.Nullsafe;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Nullsafe(Nullsafe.Mode.STRICT)
@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BytesRange {
    public static final int TO_END_OF_CONTENT = Integer.MAX_VALUE;
    @Nullable
    private static Pattern sHeaderParsingRegEx;
    public final int from;
    public final int to;

    public BytesRange(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public static BytesRange from(int from) {
        Preconditions.checkArgument(Boolean.valueOf(from >= 0));
        return new BytesRange(from, Integer.MAX_VALUE);
    }

    @Nullable
    public static BytesRange fromContentRangeHeader(@Nullable String header) throws IllegalArgumentException {
        if (header == null) {
            return null;
        }
        if (sHeaderParsingRegEx == null) {
            sHeaderParsingRegEx = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = sHeaderParsingRegEx.split(header);
            Preconditions.checkArgument(Boolean.valueOf(split.length == 4));
            Preconditions.checkArgument(Boolean.valueOf(split[0].equals("bytes")));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            Preconditions.checkArgument(Boolean.valueOf(parseInt2 > parseInt));
            Preconditions.checkArgument(Boolean.valueOf(parseInt3 > parseInt2));
            if (parseInt2 < parseInt3 - 1) {
                return new BytesRange(parseInt, parseInt2);
            }
            return new BytesRange(parseInt, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", header), e2);
        }
    }

    public static BytesRange toMax(int to) {
        Preconditions.checkArgument(Boolean.valueOf(to > 0));
        return new BytesRange(0, to);
    }

    private static String valueOrEmpty(int n2) {
        return n2 == Integer.MAX_VALUE ? "" : Integer.toString(n2);
    }

    public boolean contains(@Nullable BytesRange compare) {
        return compare != null && this.from <= compare.from && this.to >= compare.to;
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof BytesRange) {
            BytesRange bytesRange = (BytesRange) other;
            return this.from == bytesRange.from && this.to == bytesRange.to;
        }
        return false;
    }

    public int hashCode() {
        return HashCodeUtil.hashCode(this.from, this.to);
    }

    public String toHttpRangeHeaderValue() {
        return String.format(null, "bytes=%s-%s", valueOrEmpty(this.from), valueOrEmpty(this.to));
    }

    public String toString() {
        return String.format(null, "%s-%s", valueOrEmpty(this.from), valueOrEmpty(this.to));
    }
}
