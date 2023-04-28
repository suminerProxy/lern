package com.sobot.network.http.utils;

import android.os.StatFs;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.List;
import okhttp3.Response;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class IOUtils {
    public static boolean canRead(String str) {
    }

    public static boolean canWrite(String str) {
    }

    public static void closeQuietly(Closeable closeable) {
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) throws IOException {
    }

    public static boolean contentEqualsIgnoreEOL(Reader reader, Reader reader2) throws IOException {
    }

    public static boolean createFile(String str) {
    }

    public static boolean createFolder(String str) {
    }

    public static boolean createNewFile(String str) {
    }

    public static boolean createNewFolder(String str) {
    }

    public static boolean delFileOrFolder(String str) {
    }

    public static void flushQuietly(Flushable flushable) {
    }

    public static long getDirSize(String str) {
    }

    private static String getHeaderFileName(Response response) {
    }

    public static String getNetFileName(Response response, String str) {
    }

    private static long getStatFsSize(StatFs statFs, String str, String str2) {
    }

    private static String getUrlFileName(String str) {
    }

    public static List<String> readLines(InputStream inputStream, String str) throws IOException {
    }

    public static BufferedInputStream toBufferedInputStream(InputStream inputStream) {
    }

    public static BufferedOutputStream toBufferedOutputStream(OutputStream outputStream) {
    }

    public static BufferedReader toBufferedReader(Reader reader) {
    }

    public static BufferedWriter toBufferedWriter(Writer writer) {
    }

    public static byte[] toByteArray(Object obj) {
    }

    public static char[] toCharArray(CharSequence charSequence) throws IOException {
    }

    public static InputStream toInputStream(CharSequence charSequence) {
    }

    public static Object toObject(byte[] bArr) {
    }

    public static String toString(InputStream inputStream) throws IOException {
    }

    public static void write(byte[] bArr, OutputStream outputStream) throws IOException {
    }

    public static boolean createNewFolder(File file) {
    }

    public static InputStream toInputStream(CharSequence charSequence, String str) throws UnsupportedEncodingException {
    }

    public static String toString(InputStream inputStream, String str) throws IOException {
    }

    public static void write(byte[] bArr, Writer writer) throws IOException {
    }

    public static boolean delFileOrFolder(File file) {
    }

    public static List<String> readLines(InputStream inputStream) throws IOException {
    }

    public static String toString(Reader reader) throws IOException {
    }

    public static void write(byte[] bArr, Writer writer, String str) throws IOException {
    }

    public static boolean createFile(File file) {
    }

    public static boolean createFolder(File file) {
    }

    public static boolean createNewFile(File file) {
    }

    public static char[] toCharArray(InputStream inputStream) throws IOException {
    }

    public static String toString(Reader reader, String str) throws IOException {
    }

    public static void write(char[] cArr, Writer writer) throws IOException {
    }

    public static List<String> readLines(Reader reader) throws IOException {
    }

    public static String toString(byte[] bArr) {
    }

    public static void write(char[] cArr, OutputStream outputStream) throws IOException {
    }

    public static String toString(byte[] bArr, String str) {
    }

    public static void write(char[] cArr, OutputStream outputStream, String str) throws IOException {
    }

    public static boolean contentEquals(Reader reader, Reader reader2) throws IOException {
    }

    public static char[] toCharArray(InputStream inputStream, String str) throws IOException {
    }

    public static void write(CharSequence charSequence, Writer writer) throws IOException {
    }

    public static void write(CharSequence charSequence, OutputStream outputStream) throws IOException {
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, String str) throws IOException {
    }

    public static char[] toCharArray(Reader reader) throws IOException {
    }

    public static void write(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    public static void write(Reader reader, OutputStream outputStream) throws IOException {
    }

    public static byte[] toByteArray(CharSequence charSequence) {
    }

    public static byte[] toByteArray(CharSequence charSequence, String str) throws UnsupportedEncodingException {
    }

    public static void write(InputStream inputStream, Writer writer) throws IOException {
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
    }

    public static void write(Reader reader, OutputStream outputStream, String str) throws IOException {
    }

    public static byte[] toByteArray(Reader reader) throws IOException {
    }

    public static void write(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
    }

    public static void write(InputStream inputStream, Writer writer, String str) throws IOException {
    }

    public static byte[] toByteArray(Reader reader, String str) throws IOException {
    }

    public static void write(Reader reader, Writer writer) throws IOException {
    }
}
