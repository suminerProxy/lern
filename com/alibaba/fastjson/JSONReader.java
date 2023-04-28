package com.alibaba.fastjson;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import java.io.Closeable;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class JSONReader implements Closeable {
    private JSONStreamContext context;
    private final DefaultJSONParser parser;
    private Reader reader;

    public JSONReader(Reader reader) {
    }

    private void endStructure() {
    }

    private void readAfter() {
    }

    public static String readAll(Reader reader) {
    }

    private void readBefore() {
    }

    private void startStructure() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void config(Feature feature, boolean z) {
    }

    public void endArray() {
    }

    public void endObject() {
    }

    public boolean hasNext() {
    }

    public int peek() {
    }

    public Integer readInteger() {
    }

    public Long readLong() {
    }

    public <T> T readObject(TypeReference<T> typeReference) {
    }

    public String readString() {
    }

    public void startArray() {
    }

    public void startObject() {
    }

    public <T> T readObject(Type type) {
    }

    public JSONReader(JSONLexer jSONLexer) {
    }

    public JSONReader(DefaultJSONParser defaultJSONParser) {
    }

    public <T> T readObject(Class<T> cls) {
    }

    public void readObject(Object obj) {
    }

    public Object readObject() {
    }

    public Object readObject(Map map) {
    }
}
