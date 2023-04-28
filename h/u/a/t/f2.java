package h.u.a.t;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GsonUtils.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007J.\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\t\"\u0004\b\u0000\u0010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\rJ-\u0010\u000e\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0007¢\u0006\u0002\u0010\u000fJ'\u0010\u000e\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/showstartfans/activity/utils/GsonUtils;", "", "()V", "gson", "Lcom/google/gson/Gson;", "toJson", "", "any", "toList", "", ExifInterface.GPS_DIRECTION_TRUE, "json", "cls", "Ljava/lang/Class;", "toObject", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "ParameterizedTypeImpl", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class f2 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final f2 f24468a = null;
    @NotNull
    private static final Gson b = null;

    /* compiled from: GsonUtils.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B%\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/showstartfans/activity/utils/GsonUtils$ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "raw", "Ljava/lang/Class;", "args", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "[Ljava/lang/reflect/Type;", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "getOwnerType", "getRawType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements ParameterizedType {
        @Nullable
        private Class<?> b;
        @NotNull
        private Type[] c;

        public a(@Nullable Class<?> cls, @Nullable Type[] typeArr) {
        }

        @Override // java.lang.reflect.ParameterizedType
        @NotNull
        public Type[] getActualTypeArguments() {
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
        }

        @Override // java.lang.reflect.ParameterizedType
        @NotNull
        public Type getRawType() {
        }
    }

    private f2() {
    }

    @JvmStatic
    @NotNull
    public static final String a(@Nullable Object obj) {
    }

    @JvmStatic
    @Nullable
    public static final <T> T c(@Nullable String str, @NotNull Class<T> cls) throws JsonSyntaxException {
    }

    @JvmStatic
    @Nullable
    public static final <T> T d(@Nullable String str, @NotNull Type type) throws JsonSyntaxException {
    }

    @Nullable
    public final <T> List<T> b(@Nullable String str, @Nullable Class<T> cls) throws JsonSyntaxException {
    }
}
