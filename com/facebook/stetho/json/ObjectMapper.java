package com.facebook.stetho.json;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ObjectMapper {
    @GuardedBy("mJsonValueMethodCache")
    private final Map<Class<?>, Method> mJsonValueMethodCache;

    private <T> T _convertFromJSONObject(JSONObject jSONObject, Class<T> cls) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, JSONException {
    }

    private JSONObject _convertToJSONObject(Object obj) throws JSONException, InvocationTargetException, IllegalAccessException {
    }

    private static boolean canDirectlySerializeClass(Class cls) {
    }

    private List<Object> convertArrayToList(Field field, JSONArray jSONArray) throws IllegalAccessException, JSONException {
    }

    private JSONArray convertListToJsonArray(Object obj) throws InvocationTargetException, IllegalAccessException {
    }

    private Enum getEnumByMethod(String str, Class<? extends Enum> cls, Method method) {
    }

    private Enum getEnumValue(String str, Class<? extends Enum> cls) {
    }

    private Object getJsonValue(Object obj, Class<?> cls, Field field) throws InvocationTargetException, IllegalAccessException {
    }

    @Nullable
    private Method getJsonValueMethod(Class<?> cls) {
    }

    @Nullable
    private static Method getJsonValueMethodImpl(Class<?> cls) {
    }

    private Object getValueForField(Field field, Object obj) throws JSONException {
    }

    private static boolean isWrapperOrPrimitiveType(Class<?> cls) {
    }

    public <T> T convertValue(Object obj, Class<T> cls) throws IllegalArgumentException {
    }
}
