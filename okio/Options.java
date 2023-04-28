package okio;

import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Options.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0018B!\b\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0011\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00118\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "get", "(I)Lokio/ByteString;", "", "trie", "[I", "getTrie$okio", "()[I", "getSize", "()I", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "byteStrings", "[Lokio/ByteString;", "getByteStrings$okio", "()[Lokio/ByteString;", "<init>", "([Lokio/ByteString;[I)V", "Companion", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Options extends AbstractList<ByteString> implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final ByteString[] byteStrings;
    @NotNull
    private final int[] trie;

    /* compiled from: Options.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J[\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00122\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0011\"\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u0002*\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lokio/Options$Companion;", "", "", "nodeOffset", "Lokio/Buffer;", "node", "", "byteStringOffset", "", "Lokio/ByteString;", "byteStrings", "fromIndex", "toIndex", "indexes", "", "buildTrieRecursive", "(JLokio/Buffer;ILjava/util/List;IILjava/util/List;)V", "", "Lokio/Options;", MapBundleKey.MapObjKey.OBJ_OFFSET, "([Lokio/ByteString;)Lokio/Options;", "getIntCount", "(Lokio/Buffer;)J", "intCount", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Companion {
        private Companion() {
        }

        private final void buildTrieRecursive(long j2, Buffer buffer, int i2, List<? extends ByteString> list, int i3, int i4, List<Integer> list2) {
            int i5;
            int i6;
            int i7;
            int i8;
            Buffer buffer2;
            int i9 = i2;
            if (i3 < i4) {
                for (int i10 = i3; i10 < i4; i10++) {
                    if (!(list.get(i10).size() >= i9)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                ByteString byteString = list.get(i3);
                ByteString byteString2 = list.get(i4 - 1);
                int i11 = -1;
                if (i9 == byteString.size()) {
                    int i12 = i3 + 1;
                    i5 = i12;
                    i6 = list2.get(i3).intValue();
                    byteString = list.get(i12);
                } else {
                    i5 = i3;
                    i6 = -1;
                }
                if (byteString.getByte(i9) != byteString2.getByte(i9)) {
                    int i13 = 1;
                    for (int i14 = i5 + 1; i14 < i4; i14++) {
                        if (list.get(i14 - 1).getByte(i9) != list.get(i14).getByte(i9)) {
                            i13++;
                        }
                    }
                    long intCount = j2 + getIntCount(buffer) + 2 + (i13 * 2);
                    buffer.writeInt(i13);
                    buffer.writeInt(i6);
                    for (int i15 = i5; i15 < i4; i15++) {
                        byte b = list.get(i15).getByte(i9);
                        if (i15 == i5 || b != list.get(i15 - 1).getByte(i9)) {
                            buffer.writeInt(b & 255);
                        }
                    }
                    Buffer buffer3 = new Buffer();
                    while (i5 < i4) {
                        byte b2 = list.get(i5).getByte(i9);
                        int i16 = i5 + 1;
                        int i17 = i16;
                        while (true) {
                            if (i17 >= i4) {
                                i7 = i4;
                                break;
                            } else if (b2 != list.get(i17).getByte(i9)) {
                                i7 = i17;
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (i16 == i7 && i9 + 1 == list.get(i5).size()) {
                            buffer.writeInt(list2.get(i5).intValue());
                            i8 = i7;
                            buffer2 = buffer3;
                        } else {
                            buffer.writeInt(((int) (intCount + getIntCount(buffer3))) * i11);
                            i8 = i7;
                            buffer2 = buffer3;
                            buildTrieRecursive(intCount, buffer3, i9 + 1, list, i5, i7, list2);
                        }
                        buffer3 = buffer2;
                        i5 = i8;
                        i11 = -1;
                    }
                    buffer.writeAll(buffer3);
                    return;
                }
                int min = Math.min(byteString.size(), byteString2.size());
                int i18 = 0;
                for (int i19 = i9; i19 < min && byteString.getByte(i19) == byteString2.getByte(i19); i19++) {
                    i18++;
                }
                long intCount2 = j2 + getIntCount(buffer) + 2 + i18 + 1;
                buffer.writeInt(-i18);
                buffer.writeInt(i6);
                int i20 = i9 + i18;
                while (i9 < i20) {
                    buffer.writeInt(byteString.getByte(i9) & 255);
                    i9++;
                }
                if (i5 + 1 == i4) {
                    if (i20 == list.get(i5).size()) {
                        buffer.writeInt(list2.get(i5).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                Buffer buffer4 = new Buffer();
                buffer.writeInt(((int) (getIntCount(buffer4) + intCount2)) * (-1));
                buildTrieRecursive(intCount2, buffer4, i20, list, i5, i4, list2);
                buffer.writeAll(buffer4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j2, Buffer buffer, int i2, List list, int i3, int i4, List list2, int i5, Object obj) {
            companion.buildTrieRecursive((i5 & 1) != 0 ? 0L : j2, buffer, (i5 & 4) != 0 ? 0 : i2, list, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? list.size() : i4, list2);
        }

        private final long getIntCount(@NotNull Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x00e9, code lost:
            continue;
         */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okio.Options of(@org.jetbrains.annotations.NotNull okio.ByteString... r17) {
            /*
                Method dump skipped, instructions count: 330
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.of(okio.ByteString[]):okio.Options");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    @JvmStatic
    @NotNull
    public static final Options of(@NotNull ByteString... byteStringArr) {
        return Companion.of(byteStringArr);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @NotNull
    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.byteStrings.length;
    }

    @NotNull
    public final int[] getTrie$okio() {
        return this.trie;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Options) byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ByteString get(int i2) {
        return this.byteStrings[i2];
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Options) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Options) byteString);
    }
}
