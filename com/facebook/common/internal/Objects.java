package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Arrays;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Objects {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ToStringHelper {
        private final String className;
        private final ValueHolder holderHead;
        private ValueHolder holderTail;
        private boolean omitNullValues;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class ValueHolder {
            @Nullable
            public String name;
            @Nullable
            public ValueHolder next;
            @Nullable
            public Object value;

            private ValueHolder() {
            }

            public /* synthetic */ ValueHolder(AnonymousClass1 anonymousClass1) {
            }
        }

        private ValueHolder addHolder() {
            ValueHolder valueHolder = new ValueHolder(null);
            this.holderTail.next = valueHolder;
            this.holderTail = valueHolder;
            return valueHolder;
        }

        public ToStringHelper add(String name, @Nullable Object value) {
            return addHolder(name, value);
        }

        public ToStringHelper addValue(@Nullable Object value) {
            return addHolder(value);
        }

        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public String toString() {
            boolean z = this.omitNullValues;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.className);
            sb.append('{');
            String str = "";
            for (ValueHolder valueHolder = this.holderHead.next; valueHolder != null; valueHolder = valueHolder.next) {
                Object obj = valueHolder.value;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = valueHolder.name;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private ToStringHelper(String className) {
            ValueHolder valueHolder = new ValueHolder(null);
            this.holderHead = valueHolder;
            this.holderTail = valueHolder;
            this.omitNullValues = false;
            this.className = (String) Preconditions.checkNotNull(className);
        }

        public ToStringHelper add(String name, boolean value) {
            return addHolder(name, String.valueOf(value));
        }

        public ToStringHelper addValue(boolean value) {
            return addHolder(String.valueOf(value));
        }

        private ToStringHelper addHolder(@Nullable Object value) {
            addHolder().value = value;
            return this;
        }

        public ToStringHelper add(String name, char value) {
            return addHolder(name, String.valueOf(value));
        }

        public ToStringHelper addValue(char value) {
            return addHolder(String.valueOf(value));
        }

        public ToStringHelper add(String name, double value) {
            return addHolder(name, String.valueOf(value));
        }

        public ToStringHelper addValue(double value) {
            return addHolder(String.valueOf(value));
        }

        private ToStringHelper addHolder(String name, @Nullable Object value) {
            ValueHolder addHolder = addHolder();
            addHolder.value = value;
            addHolder.name = (String) Preconditions.checkNotNull(name);
            return this;
        }

        public ToStringHelper add(String name, float value) {
            return addHolder(name, String.valueOf(value));
        }

        public ToStringHelper addValue(float value) {
            return addHolder(String.valueOf(value));
        }

        public ToStringHelper add(String name, int value) {
            return addHolder(name, String.valueOf(value));
        }

        public ToStringHelper addValue(int value) {
            return addHolder(String.valueOf(value));
        }

        public ToStringHelper add(String name, long value) {
            return addHolder(name, String.valueOf(value));
        }

        public ToStringHelper addValue(long value) {
            return addHolder(String.valueOf(value));
        }
    }

    private Objects() {
    }

    @CheckReturnValue
    public static boolean equal(@Nullable Object a2, @Nullable Object b) {
        return a2 == b || (a2 != null && a2.equals(b));
    }

    public static <T> T firstNonNull(@Nullable T first, @Nullable T second) {
        return first != null ? first : (T) Preconditions.checkNotNull(second);
    }

    public static int hashCode(@Nullable Object... objects) {
        return Arrays.hashCode(objects);
    }

    public static ToStringHelper toStringHelper(Object self) {
        return new ToStringHelper(self.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(Class<?> clazz) {
        return new ToStringHelper(clazz.getSimpleName());
    }

    public static ToStringHelper toStringHelper(String className) {
        return new ToStringHelper(className);
    }
}
