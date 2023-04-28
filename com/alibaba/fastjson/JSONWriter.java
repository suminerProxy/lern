package com.alibaba.fastjson;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class JSONWriter implements Closeable, Flushable {
    private JSONStreamContext context;
    private JSONSerializer serializer;
    private SerializeWriter writer;

    public JSONWriter(Writer writer) {
    }

    private void afterWriter() {
    }

    private void beforeWrite() {
    }

    private void beginStructure() {
    }

    private void endStructure() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void config(SerializerFeature serializerFeature, boolean z) {
    }

    public void endArray() {
    }

    public void endObject() {
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
    }

    public void startArray() {
    }

    public void startObject() {
    }

    public void writeKey(String str) {
    }

    public void writeObject(String str) {
    }

    public void writeValue(Object obj) {
    }

    public void writeObject(Object obj) {
    }
}
