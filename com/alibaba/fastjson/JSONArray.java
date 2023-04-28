package com.alibaba.fastjson;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class JSONArray extends JSON implements List<Object>, Cloneable, RandomAccess, Serializable {
    public transient Type componentType;
    private final List<Object> list;
    public transient Object relatedArray;

    public JSONArray() {
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Object> collection) {
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
    }

    public Object clone() {
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
    }

    @Override // java.util.List
    public Object get(int i2) {
    }

    public BigDecimal getBigDecimal(int i2) {
    }

    public BigInteger getBigInteger(int i2) {
    }

    public Boolean getBoolean(int i2) {
    }

    public boolean getBooleanValue(int i2) {
    }

    public Byte getByte(int i2) {
    }

    public byte getByteValue(int i2) {
    }

    public Type getComponentType() {
    }

    public Date getDate(int i2) {
    }

    public Double getDouble(int i2) {
    }

    public double getDoubleValue(int i2) {
    }

    public Float getFloat(int i2) {
    }

    public float getFloatValue(int i2) {
    }

    public int getIntValue(int i2) {
    }

    public Integer getInteger(int i2) {
    }

    public JSONArray getJSONArray(int i2) {
    }

    public JSONObject getJSONObject(int i2) {
    }

    public Long getLong(int i2) {
    }

    public long getLongValue(int i2) {
    }

    public <T> T getObject(int i2, Class<T> cls) {
    }

    public Object getRelatedArray() {
    }

    public Short getShort(int i2) {
    }

    public short getShortValue(int i2) {
    }

    public String getString(int i2) {
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
    }

    @Override // java.util.List
    public Object set(int i2, Object obj) {
    }

    public void setComponentType(Type type) {
    }

    public void setRelatedArray(Object obj) {
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
    }

    @Override // java.util.List
    public List<Object> subList(int i2, int i3) {
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
    }

    public <T> List<T> toJavaList(Class<T> cls) {
    }

    @Override // java.util.List
    public void add(int i2, Object obj) {
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends Object> collection) {
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i2) {
    }

    @Override // java.util.List
    public Object remove(int i2) {
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
    }

    public JSONArray(List<Object> list) {
    }

    public JSONArray(int i2) {
    }
}
