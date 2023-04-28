package com.tencent.qcloud.tuikit.tuichat.component.face;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.tencent.qcloud.tuicore.util.ThreadHelper;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.util.TUIChatLog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FaceManager {
    private static final int EMOJI_COLUMN_COUNT = 8;
    public static final int EMOJI_GROUP_ID = 0;
    private static final int EMOJI_ROW_COUNT = 3;
    private static final int EMOJI_SIZE = 20;
    private static final String TAG = "FaceManager";
    private final Context context;
    private final String[] emojiKeys;
    private final Map<String, Emoji> emojiMap;
    private final String[] emojiNames;
    private final Map<Integer, FaceGroup> faceGroupMap;
    private boolean needLoad;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class EmojiData {
        private String emojiText;
        private int end;
        private int start;

        private EmojiData() {
        }

        public String getEmojiText() {
        }

        public int getEnd() {
        }

        public int getStart() {
        }

        public void setEmojiText(String str) {
        }

        public void setEnd(int i2) {
        }

        public void setStart(int i2) {
        }

        public /* synthetic */ EmojiData(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class FaceManagerHolder {
        @SuppressLint({"StaticFieldLeak"})
        private static final FaceManager instance = null;

        private FaceManagerHolder() {
        }

        public static /* synthetic */ FaceManager access$100() {
        }
    }

    public static void addFaceGroup(int i2, FaceGroup faceGroup) {
        faceGroup.setGroupID(i2);
        getInstance().faceGroupMap.put(Integer.valueOf(i2), faceGroup);
    }

    public static String emojiJudge(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] emojiKey = getEmojiKey();
        if (emojiKey == null || emojiKey.length == 0) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Matcher matcher = Pattern.compile("\\[(\\S+?)\\]").matcher(str);
        ArrayList arrayList = new ArrayList();
        int i2 = -1;
        while (matcher.find()) {
            String group = matcher.group();
            if (i2 != -1) {
                indexOf = str.indexOf(group, i2);
            } else {
                indexOf = str.indexOf(group);
            }
            int length = group.length() + indexOf;
            int findEmoji = findEmoji(group);
            String[] emojiNames = getEmojiNames();
            if (findEmoji != -1 && emojiNames != null && emojiNames.length >= findEmoji) {
                group = emojiNames[findEmoji];
            }
            EmojiData emojiData = new EmojiData(null);
            emojiData.setStart(indexOf);
            emojiData.setEnd(length);
            emojiData.setEmojiText(group);
            arrayList.add(emojiData);
            i2 = length;
        }
        if (arrayList.isEmpty()) {
            return str;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            EmojiData emojiData2 = (EmojiData) arrayList.get(size);
            String emojiText = emojiData2.getEmojiText();
            int start = emojiData2.getStart();
            int end = emojiData2.getEnd();
            if (!TextUtils.isEmpty(emojiText) && start != -1 && end != -1) {
                spannableStringBuilder.replace(start, end, (CharSequence) emojiText);
            }
        }
        return spannableStringBuilder.toString();
    }

    private static int findEmoji(String str) {
        String[] emojiKey;
        if (TextUtils.isEmpty(str) || (emojiKey = getEmojiKey()) == null || emojiKey.length == 0) {
            return -1;
        }
        for (int i2 = 0; i2 < emojiKey.length; i2++) {
            if (str.equals(emojiKey[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public static Bitmap getEmoji(String str) {
        Emoji emoji = getEmojiMap().get(str);
        if (emoji != null) {
            return emoji.getIcon();
        }
        return null;
    }

    public static String[] getEmojiKey() {
        return getInstance().emojiKeys;
    }

    public static ArrayList<Emoji> getEmojiList() {
        return new ArrayList<>(getInstance().emojiMap.values());
    }

    public static Map<String, Emoji> getEmojiMap() {
        return getInstance().emojiMap;
    }

    public static String[] getEmojiNames() {
        return getInstance().emojiNames;
    }

    public static List<FaceGroup> getFaceGroupList() {
        return new ArrayList(getInstance().faceGroupMap.values());
    }

    public static FaceManager getInstance() {
        return FaceManagerHolder.access$100();
    }

    public static boolean handlerEmojiText(TextView textView, CharSequence charSequence, boolean z) {
        Editable spannableStringBuilder;
        Bitmap icon;
        if (charSequence == null) {
            textView.setText((CharSequence) null);
            return false;
        }
        boolean z2 = textView instanceof EditText;
        if (z2 && (charSequence instanceof Editable)) {
            spannableStringBuilder = (Editable) charSequence;
            for (Object obj : (ImageSpan[]) spannableStringBuilder.getSpans(0, charSequence.length(), ImageSpan.class)) {
                spannableStringBuilder.removeSpan(obj);
            }
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        Matcher matcher = Pattern.compile("\\[(\\S+?)\\]").matcher(charSequence);
        boolean z3 = false;
        while (matcher.find()) {
            Emoji emoji = getEmojiMap().get(matcher.group());
            if (emoji != null && (icon = emoji.getIcon()) != null) {
                spannableStringBuilder.setSpan(new ImageSpan(getInstance().context, icon), matcher.start(), matcher.end(), 17);
                z3 = true;
            }
        }
        if (z3 || !z) {
            int selectionStart = textView.getSelectionStart();
            if (!z2) {
                textView.setText(spannableStringBuilder);
            }
            if (z2) {
                ((EditText) textView).setSelection(selectionStart);
            }
            return true;
        }
        return false;
    }

    private synchronized void internalLoadEmojis() {
        if (this.needLoad) {
            this.needLoad = false;
            TUIChatLog.i(TAG, "start load emojis");
            Thread thread = new Thread(this) { // from class: com.tencent.qcloud.tuikit.tuichat.component.face.FaceManager.1
                public final /* synthetic */ FaceManager this$0;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                }
            };
            thread.setName("TUIChatLoadEmojiThread");
            ThreadHelper.INST.execute(thread);
        }
    }

    private void internalLoadFace(ChatFace chatFace, ImageView imageView, boolean z) {
        ChatFace face;
        if (imageView == null || chatFace == null) {
            return;
        }
        if (chatFace instanceof Emoji) {
            Glide.with(imageView.getContext()).y(((Emoji) chatFace).getIcon()).centerInside().k(new RequestOptions().error(17301579)).B(imageView);
            return;
        }
        FaceGroup faceGroup = chatFace.getFaceGroup();
        String faceUrl = (faceGroup == null || (face = faceGroup.getFace(chatFace.getFaceKey())) == null) ? "" : face.getFaceUrl();
        if (z) {
            Glide.with(imageView.getContext()).m().K(faceUrl).centerInside().k(new RequestOptions().error(17301579)).B(imageView);
        } else {
            Glide.with(imageView.getContext()).E(faceUrl).centerInside().k(new RequestOptions().error(17301579)).B(imageView);
        }
    }

    public static boolean isFaceChar(String str) {
        return getEmojiMap().get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Emoji loadAssetEmoji(String str, String str2) {
        int dip2px = ScreenUtil.dip2px(20.0f);
        Bitmap loadBitmap = loadBitmap("file:///android_asset/" + str2, dip2px, dip2px);
        if (loadBitmap == null) {
            return null;
        }
        Emoji emoji = new Emoji();
        emoji.setIcon(loadBitmap);
        emoji.setFaceKey(str);
        return emoji;
    }

    private Bitmap loadBitmap(String str, int i2, int i3) {
        try {
            return Glide.with(this.context).m().K(str).k(new RequestOptions().error(17301579)).S(i2, i3).get();
        } catch (InterruptedException | ExecutionException e2) {
            TUIChatLog.e(TAG, "load bitmap failed : " + e2.getMessage());
            return null;
        }
    }

    public static void loadEmojis() {
        getInstance().internalLoadEmojis();
    }

    public static void loadFace(ChatFace chatFace, ImageView imageView) {
        getInstance().internalLoadFace(chatFace, imageView, true);
    }

    private FaceManager() {
        this.emojiMap = new LinkedHashMap();
        this.faceGroupMap = new ConcurrentHashMap();
        this.needLoad = true;
        Context appContext = ServiceInitializer.getAppContext();
        this.context = appContext;
        this.emojiKeys = appContext.getResources().getStringArray(R.array.emoji_key);
        this.emojiNames = appContext.getResources().getStringArray(R.array.emoji_name);
    }

    public static void loadFace(int i2, String str, ImageView imageView) {
        getInstance().internalLoadFace(i2, str, imageView);
    }

    private void internalLoadFace(int i2, String str, ImageView imageView) {
        ChatFace face;
        if (imageView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Glide.with(imageView.getContext()).C(17301579).centerInside().B(imageView);
            return;
        }
        FaceGroup faceGroup = this.faceGroupMap.get(Integer.valueOf(i2));
        Glide.with(imageView.getContext()).E((faceGroup == null || (face = faceGroup.getFace(str)) == null) ? "" : face.getFaceUrl()).centerInside().k(new RequestOptions().error(17301579)).B(imageView);
    }
}
