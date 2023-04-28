package com.sobot.chat.utils;

import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MediaFileUtils {
    public static final int FILE_TYPE_3GPP = 23;
    public static final int FILE_TYPE_3GPP2 = 24;
    public static final int FILE_TYPE_AMR = 4;
    public static final int FILE_TYPE_AWB = 5;
    public static final int FILE_TYPE_BMP = 34;
    public static final int FILE_TYPE_GIF = 32;
    public static final int FILE_TYPE_IMY = 13;
    public static final int FILE_TYPE_JPEG = 31;
    public static final int FILE_TYPE_M3U = 41;
    public static final int FILE_TYPE_M4A = 2;
    public static final int FILE_TYPE_M4V = 22;
    public static final int FILE_TYPE_MID = 11;
    public static final int FILE_TYPE_MP3 = 1;
    public static final int FILE_TYPE_MP4 = 21;
    public static final int FILE_TYPE_OGG = 7;
    public static final int FILE_TYPE_PLS = 42;
    public static final int FILE_TYPE_PNG = 33;
    public static final int FILE_TYPE_SMF = 12;
    public static final int FILE_TYPE_WAV = 3;
    public static final int FILE_TYPE_WBMP = 35;
    public static final int FILE_TYPE_WMA = 6;
    public static final int FILE_TYPE_WMV = 25;
    public static final int FILE_TYPE_WPL = 43;
    private static final int FIRST_AUDIO_FILE_TYPE = 1;
    private static final int FIRST_IMAGE_FILE_TYPE = 31;
    private static final int FIRST_MIDI_FILE_TYPE = 11;
    private static final int FIRST_PLAYLIST_FILE_TYPE = 41;
    private static final int FIRST_VIDEO_FILE_TYPE = 21;
    private static final int LAST_AUDIO_FILE_TYPE = 7;
    private static final int LAST_IMAGE_FILE_TYPE = 35;
    private static final int LAST_MIDI_FILE_TYPE = 13;
    private static final int LAST_PLAYLIST_FILE_TYPE = 43;
    private static final int LAST_VIDEO_FILE_TYPE = 25;
    public static final String UNKNOWN_STRING = "<unknown>";
    public static String sFileExtensions;
    private static HashMap<String, MediaFileType> sFileTypeMap;
    private static HashMap<String, Integer> sMimeTypeMap;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class MediaFileType {
        public int fileType;
        public String mimeType;

        public MediaFileType(int i2, String str) {
        }
    }

    public static void addFileType(String str, int i2, String str2) {
    }

    public static MediaFileType getFileType(String str) {
    }

    public static int getFileTypeForMimeType(String str) {
    }

    public static boolean isAudioFileType(int i2) {
    }

    public static boolean isAudioFileType(String str) {
    }

    public static boolean isImageFileType(int i2) {
    }

    public static boolean isImageFileType(String str) {
    }

    public static boolean isPlayListFileType(int i2) {
    }

    public static boolean isVideoFileType(int i2) {
    }

    public static boolean isVideoFileType(String str) {
    }
}
