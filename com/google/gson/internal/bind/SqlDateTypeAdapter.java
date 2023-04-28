package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    public static final TypeAdapterFactory FACTORY = null;
    private final DateFormat format;

    /* renamed from: com.google.gson.internal.bind.SqlDateTypeAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements TypeAdapterFactory {
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        }
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ Date read(JsonReader jsonReader) throws IOException {
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Date date) throws IOException {
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read  reason: avoid collision after fix types in other method */
    public synchronized Date read2(JsonReader jsonReader) throws IOException {
    }

    /* renamed from: write  reason: avoid collision after fix types in other method */
    public synchronized void write2(JsonWriter jsonWriter, Date date) throws IOException {
    }
}
