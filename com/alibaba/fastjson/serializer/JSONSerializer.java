package com.alibaba.fastjson.serializer;

import java.io.Writer;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class JSONSerializer {
    public List<AfterFilter> afterFilters;
    public List<BeforeFilter> beforeFilters;
    public final SerializeConfig config;
    public SerialContext context;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    private int indentCount;
    public Locale locale;
    public List<NameFilter> nameFilters;
    public final SerializeWriter out;
    public List<PropertyFilter> propertyFilters;
    public List<PropertyPreFilter> propertyPreFilters;
    public IdentityHashMap<Object, SerialContext> references;
    public TimeZone timeZone;
    public List<ValueFilter> valueFilters;

    public JSONSerializer() {
    }

    public static Object processValue(JSONSerializer jSONSerializer, Object obj, Object obj2, Object obj3) {
    }

    public static final void write(Writer writer, Object obj) {
    }

    public boolean apply(Object obj, Object obj2, Object obj3) {
    }

    public boolean applyName(Object obj, Object obj2) {
    }

    public void close() {
    }

    public void config(SerializerFeature serializerFeature, boolean z) {
    }

    public void decrementIdent() {
    }

    public List<AfterFilter> getAfterFilters() {
    }

    public List<BeforeFilter> getBeforeFilters() {
    }

    public SerialContext getContext() {
    }

    public DateFormat getDateFormat() {
    }

    public String getDateFormatPattern() {
    }

    public List<NameFilter> getNameFilters() {
    }

    public List<PropertyFilter> getPropertyFilters() {
    }

    public List<PropertyPreFilter> getPropertyPreFilters() {
    }

    public List<ValueFilter> getValueFilters() {
    }

    public SerializeWriter getWriter() {
    }

    public void incrementIndent() {
    }

    public void println() {
    }

    public Object processKey(Object obj, Object obj2, Object obj3) {
    }

    public void setContext(SerialContext serialContext, Object obj, Object obj2, int i2) {
    }

    public void setDateFormat(DateFormat dateFormat) {
    }

    public String toString() {
    }

    public final void writeKeyValue(char c, String str, Object obj) {
    }

    public void writeReference(Object obj) {
    }

    public final void writeWithFieldName(Object obj, Object obj2) {
    }

    public final void writeWithFormat(Object obj, String str) {
    }

    public JSONSerializer(SerializeWriter serializeWriter) {
    }

    public final void writeWithFieldName(Object obj, Object obj2, Type type, int i2) {
    }

    public JSONSerializer(SerializeConfig serializeConfig) {
    }

    public JSONSerializer(SerializeWriter serializeWriter, SerializeConfig serializeConfig) {
    }

    public void setDateFormat(String str) {
    }

    public static final void write(SerializeWriter serializeWriter, Object obj) {
    }

    public final void write(Object obj) {
    }

    public final void write(String str) {
    }
}
