package com.google.gson;

import com.google.gson.internal.Excluder;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private Excluder excluder;
    private final List<TypeAdapterFactory> factories;
    private FieldNamingStrategy fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final List<TypeAdapterFactory> hierarchyFactories;
    private final Map<Type, InstanceCreator<?>> instanceCreators;
    private boolean lenient;
    private LongSerializationPolicy longSerializationPolicy;
    private boolean prettyPrinting;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;

    public GsonBuilder() {
    }

    private void addTypeAdaptersForDate(String str, int i2, int i3, List<TypeAdapterFactory> list) {
    }

    public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
    }

    public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
    }

    public Gson create() {
    }

    public GsonBuilder disableHtmlEscaping() {
    }

    public GsonBuilder disableInnerClassSerialization() {
    }

    public GsonBuilder enableComplexMapKeySerialization() {
    }

    public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
    }

    public GsonBuilder generateNonExecutableJson() {
    }

    public GsonBuilder registerTypeAdapter(Type type, Object obj) {
    }

    public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeAdapterFactory) {
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
    }

    public GsonBuilder serializeNulls() {
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
    }

    public GsonBuilder setDateFormat(String str) {
    }

    public GsonBuilder setExclusionStrategies(ExclusionStrategy... exclusionStrategyArr) {
    }

    public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldNamingPolicy) {
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
    }

    public GsonBuilder setLenient() {
    }

    public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longSerializationPolicy) {
    }

    public GsonBuilder setPrettyPrinting() {
    }

    public GsonBuilder setVersion(double d2) {
    }

    public GsonBuilder setDateFormat(int i2) {
    }

    public GsonBuilder setDateFormat(int i2, int i3) {
    }

    public GsonBuilder(Gson gson) {
    }
}
