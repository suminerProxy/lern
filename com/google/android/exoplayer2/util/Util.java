package com.google.android.exoplayer2.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.SparseLongArray;
import android.view.Display;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Util {
    private static final int[] CRC32_BYTES_MSBF = null;
    private static final int[] CRC8_BYTES_MSBF = null;
    public static final String DEVICE = null;
    public static final String DEVICE_DEBUG_INFO = null;
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    private static final Pattern ESCAPED_CHARACTER_PATTERN = null;
    private static final String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final Pattern ISM_URL_PATTERN = null;
    public static final String MANUFACTURER = null;
    public static final String MODEL = null;
    public static final int SDK_INT = 0;
    private static final String TAG = "Util";
    private static final Pattern XS_DATE_TIME_PATTERN = null;
    private static final Pattern XS_DURATION_PATTERN = null;
    private static final String[] additionalIsoLanguageReplacements = null;
    private static final String[] isoLegacyTagReplacements = null;
    @Nullable
    private static HashMap<String, String> languageTagReplacementMap;

    private Util() {
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
    }

    public static long addWithOverflowDefault(long x, long y, long overflowResult) {
    }

    public static boolean areEqual(@Nullable Object o1, @Nullable Object o2) {
    }

    public static int binarySearchCeil(int[] array, int value, boolean inclusive, boolean stayInBounds) {
    }

    public static int binarySearchFloor(int[] array, int value, boolean inclusive, boolean stayInBounds) {
    }

    @EnsuresNonNull({"#1"})
    public static <T> T castNonNull(@Nullable T value) {
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] castNonNullTypeArray(T[] value) {
    }

    public static int ceilDivide(int numerator, int denominator) {
    }

    public static boolean checkCleartextTrafficPermitted(MediaItem... mediaItems) {
    }

    public static void closeQuietly(@Nullable DataSource dataSource) {
    }

    public static int compareLong(long left, long right) {
    }

    public static int constrainValue(int value, int min, int max) {
    }

    public static boolean contains(Object[] items, @Nullable Object item) {
    }

    public static int crc32(byte[] bytes, int start, int end, int initialValue) {
    }

    public static int crc8(byte[] bytes, int start, int end, int initialValue) {
    }

    public static Handler createHandler(Looper looper, @Nullable Handler.Callback callback) {
    }

    public static Handler createHandlerForCurrentLooper() {
    }

    public static Handler createHandlerForCurrentOrMainLooper() {
    }

    private static HashMap<String, String> createIsoLanguageReplacementMap() {
    }

    public static File createTempDirectory(Context context, String prefix) throws IOException {
    }

    public static File createTempFile(Context context, String prefix) throws IOException {
    }

    public static String escapeFileName(String fileName) {
    }

    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
    }

    public static String formatInvariant(String format, Object... args) {
    }

    public static String fromUtf8Bytes(byte[] bytes) {
    }

    @Nullable
    public static String getAdaptiveMimeTypeForContentType(int contentType) {
    }

    public static int getAudioContentTypeForStreamType(int streamType) {
    }

    public static int getAudioTrackChannelConfig(int channelCount) {
    }

    public static int getAudioUsageForStreamType(int streamType) {
    }

    public static int getBigEndianInt(ByteBuffer buffer, int index) {
    }

    public static byte[] getBytesFromHexString(String hexString) {
    }

    public static int getCodecCountOfType(@Nullable String codecs, int trackType) {
    }

    @Nullable
    public static String getCodecsOfType(@Nullable String codecs, int trackType) {
    }

    public static String getCommaDelimitedSimpleClassNames(Object[] objects) {
    }

    public static String getCountryCode(@Nullable Context context) {
    }

    public static Point getCurrentDisplayModeSize(Context context) {
    }

    public static Looper getCurrentOrMainLooper() {
    }

    public static Uri getDataUriForString(String mimeType, String data) {
    }

    private static void getDisplaySizeV16(Display display, Point outSize) {
    }

    @RequiresApi(17)
    private static void getDisplaySizeV17(Display display, Point outSize) {
    }

    @RequiresApi(23)
    private static void getDisplaySizeV23(Display display, Point outSize) {
    }

    @Nullable
    public static UUID getDrmUuid(String drmScheme) {
    }

    public static int getErrorCodeFromPlatformDiagnosticsInfo(@Nullable String diagnosticsInfo) {
    }

    public static int getIntegerCodeForString(String string) {
    }

    public static String getLocaleLanguageTag(Locale locale) {
    }

    @RequiresApi(21)
    private static String getLocaleLanguageTagV21(Locale locale) {
    }

    public static long getMediaDurationForPlayoutDuration(long playoutDuration, float speed) {
    }

    public static long getNowUnixTimeMs(long elapsedRealtimeEpochOffsetMs) {
    }

    public static int getPcmEncoding(int bitDepth) {
    }

    public static Format getPcmFormat(int pcmEncoding, int channels, int sampleRate) {
    }

    public static int getPcmFrameSize(int pcmEncoding, int channelCount) {
    }

    public static long getPlayoutDurationForMediaDuration(long mediaDuration, float speed) {
    }

    public static int getStreamTypeForAudioUsage(int usage) {
    }

    public static String getStringForTime(StringBuilder builder, Formatter formatter, long timeMs) {
    }

    public static String[] getSystemLanguageCodes() {
    }

    private static String[] getSystemLocales() {
    }

    @RequiresApi(24)
    private static String[] getSystemLocalesV24(Configuration config) {
    }

    @Nullable
    private static String getSystemProperty(String name) {
    }

    public static String getTrackTypeString(int trackType) {
    }

    public static String getUserAgent(Context context, String applicationName) {
    }

    public static byte[] getUtf8Bytes(String value) {
    }

    public static byte[] gzip(byte[] input) {
    }

    public static int inferContentType(Uri uri, @Nullable String overrideExtension) {
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, @Nullable String mimeType) {
    }

    public static boolean inflate(ParsableByteArray input, ParsableByteArray output, @Nullable Inflater inflater) {
    }

    public static boolean isEncodingHighResolutionPcm(int encoding) {
    }

    public static boolean isEncodingLinearPcm(int encoding) {
    }

    public static boolean isLinebreak(int c) {
    }

    public static boolean isLocalFileUri(Uri uri) {
    }

    @RequiresApi(api = 24)
    private static boolean isTrafficRestricted(Uri uri) {
    }

    public static boolean isTv(Context context) {
    }

    public static int linearSearch(int[] array, int value) {
    }

    private static String maybeReplaceLegacyLanguageTags(String languageTag) {
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uris) {
    }

    @RequiresApi(18)
    public static long minValue(SparseLongArray sparseLongArray) {
    }

    public static <T> void moveItems(List<T> items, int fromIndex, int toIndex, int newFromIndex) {
    }

    public static ExecutorService newSingleThreadExecutor(String threadName) {
    }

    public static String normalizeLanguageCode(String language) {
    }

    public static <T> T[] nullSafeArrayAppend(T[] original, T newElement) {
    }

    public static <T> T[] nullSafeArrayConcatenation(T[] first, T[] second) {
    }

    public static <T> T[] nullSafeArrayCopy(T[] input, int length) {
    }

    public static <T> T[] nullSafeArrayCopyOfRange(T[] input, int from, int to) {
    }

    public static <T> void nullSafeListToArray(List<T> list, T[] array) {
    }

    public static long parseXsDateTime(String value) throws ParserException {
    }

    public static long parseXsDuration(String value) {
    }

    public static boolean postOrRun(Handler handler, Runnable runnable) {
    }

    public static boolean readBoolean(Parcel parcel) {
    }

    public static byte[] readExactly(DataSource dataSource, int length) throws IOException {
    }

    public static byte[] readToEnd(DataSource dataSource) throws IOException {
    }

    public static void recursiveDelete(File fileOrDirectory) {
    }

    public static <T> void removeRange(List<T> list, int fromIndex, int toIndex) {
    }

    @RequiresApi(api = 23)
    private static boolean requestExternalStoragePermission(Activity activity) {
    }

    public static long scaleLargeTimestamp(long timestamp, long multiplier, long divisor) {
    }

    public static long[] scaleLargeTimestamps(List<Long> timestamps, long multiplier, long divisor) {
    }

    public static void scaleLargeTimestampsInPlace(long[] timestamps, long multiplier, long divisor) {
    }

    private static boolean shouldEscapeCharacter(char c) {
    }

    public static void sneakyThrow(Throwable t) {
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable t) throws Throwable {
    }

    public static String[] split(String value, String regex) {
    }

    public static String[] splitAtFirst(String value, String regex) {
    }

    public static String[] splitCodecs(@Nullable String codecs) {
    }

    @Nullable
    public static ComponentName startForegroundService(Context context, Intent intent) {
    }

    public static long subtractWithOverflowDefault(long x, long y, long overflowResult) {
    }

    public static boolean tableExists(SQLiteDatabase database, String tableName) {
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
    }

    public static String toHexString(byte[] bytes) {
    }

    public static long toLong(int mostSignificantBits, int leastSignificantBits) {
    }

    public static long toUnsignedLong(int x) {
    }

    public static CharSequence truncateAscii(CharSequence sequence, int maxLength) {
    }

    @Nullable
    public static String unescapeFileName(String fileName) {
    }

    public static void writeBoolean(Parcel parcel, boolean value) {
    }

    public static long ceilDivide(long numerator, long denominator) {
    }

    public static void closeQuietly(@Nullable Closeable closeable) {
    }

    public static long constrainValue(long value, long min, long max) {
    }

    public static Handler createHandlerForCurrentLooper(@Nullable Handler.Callback callback) {
    }

    public static Handler createHandlerForCurrentOrMainLooper(@Nullable Handler.Callback callback) {
    }

    public static String fromUtf8Bytes(byte[] bytes, int offset, int length) {
    }

    public static float constrainValue(float value, float min, float max) {
    }

    public static int linearSearch(long[] array, long value) {
    }

    public static int binarySearchCeil(long[] array, long value, boolean inclusive, boolean stayInBounds) {
    }

    public static int binarySearchFloor(long[] array, long value, boolean inclusive, boolean stayInBounds) {
    }

    public static int inferContentType(Uri uri) {
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, MediaItem... mediaItems) {
    }

    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T value, boolean inclusive, boolean stayInBounds) {
    }

    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T value, boolean inclusive, boolean stayInBounds) {
    }

    public static Point getCurrentDisplayModeSize(Context context, Display display) {
    }

    public static int inferContentType(String fileName) {
    }

    public static int binarySearchFloor(LongArray longArray, long value, boolean inclusive, boolean stayInBounds) {
    }
}
