package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultDateTypeAdapter extends TypeAdapter<Date> {
    private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final List<DateFormat> dateFormats;
    private final Class<? extends Date> dateType;

    public DefaultDateTypeAdapter(Class<? extends Date> cls) {
    }

    private Date deserializeToDate(String str) {
    }

    private static Class<? extends Date> verifyDateType(Class<? extends Date> cls) {
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ Date read(JsonReader jsonReader) throws IOException {
    }

    public String toString() {
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Date date) throws IOException {
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read  reason: avoid collision after fix types in other method */
    public Date read2(JsonReader jsonReader) throws IOException {
    }

    /* renamed from: write  reason: avoid collision after fix types in other method */
    public void write2(JsonWriter jsonWriter, Date date) throws IOException {
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, String str) {
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i2) {
    }

    public DefaultDateTypeAdapter(int i2, int i3) {
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i2, int i3) {
    }
}
