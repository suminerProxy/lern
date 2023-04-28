package com.sobot.chat.widget.zxing.util;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Intents {
    public static final int FLAG_NEW_DOC = 524288;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class Encode {
        public static final String ACTION = "com.sobot.chat.widget.zxing.client.android.ENCODE";
        public static final String DATA = "ENCODE_DATA";
        public static final String FORMAT = "ENCODE_FORMAT";
        public static final String SHOW_CONTENTS = "ENCODE_SHOW_CONTENTS";
        public static final String TYPE = "ENCODE_TYPE";

        private Encode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class History {
        public static final String ITEM_NUMBER = "ITEM_NUMBER";

        private History() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class Scan {
        public static final String ACTION = "com.sobot.chat.widget.zxing.client.android.SCAN";
        public static final String AZTEC_MODE = "AZTEC_MODE";
        public static final String CAMERA_ID = "SCAN_CAMERA_ID";
        public static final String CHARACTER_SET = "CHARACTER_SET";
        public static final String DATA_MATRIX_MODE = "DATA_MATRIX_MODE";
        public static final String FORMATS = "SCAN_FORMATS";
        public static final String HEIGHT = "SCAN_HEIGHT";
        public static final String MODE = "SCAN_MODE";
        public static final String ONE_D_MODE = "ONE_D_MODE";
        public static final String PDF417_MODE = "PDF417_MODE";
        public static final String PRODUCT_MODE = "PRODUCT_MODE";
        public static final String PROMPT_MESSAGE = "PROMPT_MESSAGE";
        public static final String QR_CODE_MODE = "QR_CODE_MODE";
        public static final String RESULT = "SCAN_RESULT";
        public static final String RESULT_BYTES = "SCAN_RESULT_BYTES";
        public static final String RESULT_BYTE_SEGMENTS_PREFIX = "SCAN_RESULT_BYTE_SEGMENTS_";
        public static final String RESULT_DISPLAY_DURATION_MS = "RESULT_DISPLAY_DURATION_MS";
        public static final String RESULT_ERROR_CORRECTION_LEVEL = "SCAN_RESULT_ERROR_CORRECTION_LEVEL";
        public static final String RESULT_FORMAT = "SCAN_RESULT_FORMAT";
        public static final String RESULT_ORIENTATION = "SCAN_RESULT_ORIENTATION";
        public static final String RESULT_UPC_EAN_EXTENSION = "SCAN_RESULT_UPC_EAN_EXTENSION";
        public static final String SAVE_HISTORY = "SAVE_HISTORY";
        public static final String WIDTH = "SCAN_WIDTH";

        private Scan() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class SearchBookContents {
        public static final String ACTION = "com.sobot.chat.widget.zxing.client.android.SEARCH_BOOK_CONTENTS";
        public static final String ISBN = "ISBN";
        public static final String QUERY = "QUERY";

        private SearchBookContents() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class Share {
        public static final String ACTION = "com.sobot.chat.widget.zxing.client.android.SHARE";

        private Share() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class WifiConnect {
        public static final String ACTION = "com.sobot.chat.widget.zxing.client.android.WIFI_CONNECT";
        public static final String PASSWORD = "PASSWORD";
        public static final String SSID = "SSID";
        public static final String TYPE = "TYPE";

        private WifiConnect() {
        }
    }

    private Intents() {
    }
}