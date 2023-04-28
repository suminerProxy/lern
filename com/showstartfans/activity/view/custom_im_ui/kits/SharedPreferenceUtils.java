package com.showstartfans.activity.view.custom_im_ui.kits;

import android.content.SharedPreferences;
import android.net.Uri;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.LinkedList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SharedPreferenceUtils {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class UriSerializer implements JsonSerializer<Uri>, JsonDeserializer<Uri> {
        public Uri a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        }

        public JsonElement b(Uri uri, Type type, JsonSerializationContext jsonSerializationContext) {
        }

        @Override // com.google.gson.JsonDeserializer
        public /* bridge */ /* synthetic */ Uri deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        }

        @Override // com.google.gson.JsonSerializer
        public /* bridge */ /* synthetic */ JsonElement serialize(Uri uri, Type type, JsonSerializationContext jsonSerializationContext) {
        }
    }

    public static Object a(SharedPreferences sharedPreferences, String str, Object obj) {
    }

    public static <T> LinkedList<T> b(SharedPreferences sharedPreferences, String str, Class<T> cls) {
    }

    public static boolean c(SharedPreferences sharedPreferences, String str, Object obj) {
    }

    public static <T> boolean d(SharedPreferences sharedPreferences, String str, LinkedList<T> linkedList) {
    }
}
