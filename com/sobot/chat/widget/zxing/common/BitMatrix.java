package com.sobot.chat.widget.zxing.common;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class BitMatrix implements Cloneable {
    private final int[] bits;
    private final int height;
    private final int rowSize;
    private final int width;

    public BitMatrix(int i2) {
    }

    private String buildToString(String str, String str2, String str3) {
    }

    public static BitMatrix parse(boolean[][] zArr) {
    }

    public void clear() {
    }

    /* renamed from: clone  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m32clone() throws CloneNotSupportedException {
    }

    public boolean equals(Object obj) {
    }

    public void flip(int i2, int i3) {
    }

    public boolean get(int i2, int i3) {
    }

    public int[] getBottomRightOnBit() {
    }

    public int[] getEnclosingRectangle() {
    }

    public int getHeight() {
    }

    public BitArray getRow(int i2, BitArray bitArray) {
    }

    public int getRowSize() {
    }

    public int[] getTopLeftOnBit() {
    }

    public int getWidth() {
    }

    public int hashCode() {
    }

    public void rotate180() {
    }

    public void set(int i2, int i3) {
    }

    public void setRegion(int i2, int i3, int i4, int i5) {
    }

    public void setRow(int i2, BitArray bitArray) {
    }

    public String toString() {
    }

    public void unset(int i2, int i3) {
    }

    public void xor(BitMatrix bitMatrix) {
    }

    public BitMatrix(int i2, int i3) {
    }

    public BitMatrix clone() {
    }

    public String toString(String str, String str2) {
    }

    @Deprecated
    public String toString(String str, String str2, String str3) {
    }

    public static BitMatrix parse(String str, String str2, String str3) {
    }

    private BitMatrix(int i2, int i3, int i4, int[] iArr) {
    }
}
