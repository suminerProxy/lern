package com.tencent.cloud.huiyansdkface.wejson;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class WeJson {
    private static final String EMPTY_ARR = "[]";
    private static final String EMPTY_MAP = "{}";
    private static final String[] replacementArr = null;
    private boolean cutLongStr;
    private int longStringLength;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TypeToken<T> {
        public Type type() {
        }
    }

    private <T> T fromArr(JSONArray jSONArray, Class cls) throws WeJsonException {
    }

    private <T> T fromArr(JSONArray jSONArray, GenericArrayType genericArrayType) throws WeJsonException {
    }

    private Object fromJsonData(Object obj, Type type) throws WeJsonException {
    }

    private List fromList(JSONArray jSONArray, Class<List> cls, Type type) throws WeJsonException {
    }

    private Map fromMap(JSONObject jSONObject, Class<Map> cls, Type type) throws WeJsonException {
    }

    private Object fromPojo(JSONObject jSONObject, Type type) throws WeJsonException {
    }

    private Class getClassOfType(Type type) {
    }

    private Type getComponentTypeOfList(Type type, JSONArray jSONArray) throws WeJsonException {
    }

    private <T> Type getMemberType(Type type, Field field, Object obj) throws WeJsonException {
    }

    private Object getObject(JSONArray jSONArray, int i2) throws WeJsonException {
    }

    private Object getObject(JSONObject jSONObject, String str) throws WeJsonException {
    }

    private <T> Type getSubType(Type type, Field field, Object obj) throws WeJsonException {
    }

    private Type getTypeOfList(Type type, String str, JSONArray jSONArray) throws WeJsonException {
    }

    private Type getValueType(Object obj) {
    }

    private <T> boolean isPrimitivePackageType(T t) {
    }

    private <T> void process(StringBuilder sb, T t) {
    }

    private <T> void processArr(StringBuilder sb, Object[] objArr) {
    }

    private void processIterable(StringBuilder sb, Iterable iterable) {
    }

    private void processMap(StringBuilder sb, Map<String, Object> map) {
    }

    private <T> void processObj(StringBuilder sb, T t) {
    }

    private void string(StringBuilder sb, String str) {
    }

    public <T> T fromJson(String str, Class<T> cls) throws WeJsonException {
    }

    public <T> T fromJson(String str, Type type) throws WeJsonException {
    }

    public <T> T fromJsonArr(JSONArray jSONArray, Type type) throws WeJsonException {
    }

    public Object fromJsonObj(JSONObject jSONObject, Type type) throws WeJsonException {
    }

    public void setCutLongStr(boolean z) {
    }

    public void setLongStringLength(int i2) {
    }

    public <T> String toJson(T t) {
    }

    public <T> String toJson(T t, int i2) {
    }
}
