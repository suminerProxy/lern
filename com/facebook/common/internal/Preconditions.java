package com.facebook.common.internal;

import com.baidu.platform.comapi.map.MapBundleKey;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int index, int size, @Nullable String desc) {
        if (index < 0) {
            return format("%s (%s) must not be negative", desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return format("%s (%s) must be less than size (%s)", desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException("negative size: " + size);
    }

    private static String badPositionIndex(int index, int size, @Nullable String desc) {
        if (index < 0) {
            return format("%s (%s) must not be negative", desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return format("%s (%s) must not be greater than size (%s)", desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException("negative size: " + size);
    }

    private static String badPositionIndexes(int start, int end, int size) {
        if (start < 0 || start > size) {
            return badPositionIndex(start, size, "start index");
        }
        return (end < 0 || end > size) ? badPositionIndex(end, size, "end index") : format("end index (%s) must not be less than start index (%s)", Integer.valueOf(end), Integer.valueOf(start));
    }

    public static void checkArgument(@Nullable Boolean expression) {
        if (expression != null && !expression.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int index, int size) {
        return checkElementIndex(index, size, MapBundleKey.MapObjKey.OBJ_SL_INDEX);
    }

    public static <T> T checkNotNull(@Nullable T reference) {
        java.util.Objects.requireNonNull(reference);
        return reference;
    }

    public static int checkPositionIndex(int index, int size) {
        return checkPositionIndex(index, size, MapBundleKey.MapObjKey.OBJ_SL_INDEX);
    }

    public static void checkPositionIndexes(int start, int end, int size) {
        if (start < 0 || end < start || end > size) {
            throw new IndexOutOfBoundsException(badPositionIndexes(start, end, size));
        }
    }

    public static void checkState(boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
    }

    public static String format(@Nullable String template, Object... args) {
        int indexOf;
        String valueOf = String.valueOf(template);
        StringBuilder sb = new StringBuilder(valueOf.length() + (args.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (i2 < args.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb.append(valueOf.substring(i3, indexOf));
            sb.append(args[i2]);
            i3 = indexOf + 2;
            i2++;
        }
        sb.append(valueOf.substring(i3));
        if (i2 < args.length) {
            sb.append(" [");
            sb.append(args[i2]);
            for (int i4 = i2 + 1; i4 < args.length; i4++) {
                sb.append(", ");
                sb.append(args[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static int checkElementIndex(int index, int size, @Nullable String desc) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(badElementIndex(index, size, desc));
        }
        return index;
    }

    public static <T> T checkNotNull(@Nullable T reference, @Nullable Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    public static int checkPositionIndex(int index, int size, @Nullable String desc) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(badPositionIndex(index, size, desc));
        }
        return index;
    }

    public static void checkState(boolean expression, @Nullable Object errorMessage) {
        if (!expression) {
            throw new IllegalStateException(String.valueOf(errorMessage));
        }
    }

    public static void checkArgument(boolean expression, @Nullable Object errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    public static <T> T checkNotNull(@Nullable T reference, @Nullable String errorMessageTemplate, Object... errorMessageArgs) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(format(errorMessageTemplate, errorMessageArgs));
    }

    public static void checkState(boolean expression, @Nullable String errorMessageTemplate, Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalStateException(format(errorMessageTemplate, errorMessageArgs));
        }
    }

    public static void checkArgument(boolean expression, @Nullable String errorMessageTemplate, Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalArgumentException(format(errorMessageTemplate, errorMessageArgs));
        }
    }
}
