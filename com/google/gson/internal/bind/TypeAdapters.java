package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TypeAdapters {
    public static final TypeAdapter<AtomicBoolean> ATOMIC_BOOLEAN = null;
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY = null;
    public static final TypeAdapter<AtomicInteger> ATOMIC_INTEGER = null;
    public static final TypeAdapter<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY = null;
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY = null;
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY = null;
    public static final TypeAdapter<BigDecimal> BIG_DECIMAL = null;
    public static final TypeAdapter<BigInteger> BIG_INTEGER = null;
    public static final TypeAdapter<BitSet> BIT_SET = null;
    public static final TypeAdapterFactory BIT_SET_FACTORY = null;
    public static final TypeAdapter<Boolean> BOOLEAN = null;
    public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING = null;
    public static final TypeAdapterFactory BOOLEAN_FACTORY = null;
    public static final TypeAdapter<Number> BYTE = null;
    public static final TypeAdapterFactory BYTE_FACTORY = null;
    public static final TypeAdapter<Calendar> CALENDAR = null;
    public static final TypeAdapterFactory CALENDAR_FACTORY = null;
    public static final TypeAdapter<Character> CHARACTER = null;
    public static final TypeAdapterFactory CHARACTER_FACTORY = null;
    public static final TypeAdapter<Class> CLASS = null;
    public static final TypeAdapterFactory CLASS_FACTORY = null;
    public static final TypeAdapter<Currency> CURRENCY = null;
    public static final TypeAdapterFactory CURRENCY_FACTORY = null;
    public static final TypeAdapter<Number> DOUBLE = null;
    public static final TypeAdapterFactory ENUM_FACTORY = null;
    public static final TypeAdapter<Number> FLOAT = null;
    public static final TypeAdapter<InetAddress> INET_ADDRESS = null;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY = null;
    public static final TypeAdapter<Number> INTEGER = null;
    public static final TypeAdapterFactory INTEGER_FACTORY = null;
    public static final TypeAdapter<JsonElement> JSON_ELEMENT = null;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY = null;
    public static final TypeAdapter<Locale> LOCALE = null;
    public static final TypeAdapterFactory LOCALE_FACTORY = null;
    public static final TypeAdapter<Number> LONG = null;
    public static final TypeAdapter<Number> NUMBER = null;
    public static final TypeAdapterFactory NUMBER_FACTORY = null;
    public static final TypeAdapter<Number> SHORT = null;
    public static final TypeAdapterFactory SHORT_FACTORY = null;
    public static final TypeAdapter<String> STRING = null;
    public static final TypeAdapter<StringBuffer> STRING_BUFFER = null;
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY = null;
    public static final TypeAdapter<StringBuilder> STRING_BUILDER = null;
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY = null;
    public static final TypeAdapterFactory STRING_FACTORY = null;
    public static final TypeAdapterFactory TIMESTAMP_FACTORY = null;
    public static final TypeAdapter<URI> URI = null;
    public static final TypeAdapterFactory URI_FACTORY = null;
    public static final TypeAdapter<URL> URL = null;
    public static final TypeAdapterFactory URL_FACTORY = null;
    public static final TypeAdapter<UUID> UUID = null;
    public static final TypeAdapterFactory UUID_FACTORY = null;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends TypeAdapter<Class> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Class read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Class cls) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Class read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Class cls) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass10 extends TypeAdapter<AtomicIntegerArray> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public AtomicIntegerArray read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass11 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Number read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Number number) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass12 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Number read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Number number) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass13 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Number read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Number number) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass14 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Number read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Number number) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass15 extends TypeAdapter<Character> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Character read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Character ch) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Character read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Character ch) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass16 extends TypeAdapter<String> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ String read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, String str) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public String read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, String str) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass17 extends TypeAdapter<BigDecimal> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ BigDecimal read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public BigDecimal read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass18 extends TypeAdapter<BigInteger> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ BigInteger read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public BigInteger read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass19 extends TypeAdapter<StringBuilder> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ StringBuilder read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public StringBuilder read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends TypeAdapter<BitSet> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ BitSet read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public BitSet read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass20 extends TypeAdapter<StringBuffer> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ StringBuffer read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public StringBuffer read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass21 extends TypeAdapter<URL> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ URL read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, URL url) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public URL read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, URL url) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass22 extends TypeAdapter<URI> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ URI read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, URI uri) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public URI read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, URI uri) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass23 extends TypeAdapter<InetAddress> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ InetAddress read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public InetAddress read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass24 extends TypeAdapter<UUID> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ UUID read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public UUID read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, UUID uuid) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass25 extends TypeAdapter<Currency> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Currency read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Currency currency) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public Currency read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Currency currency) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass26 implements TypeAdapterFactory {

        /* renamed from: com.google.gson.internal.bind.TypeAdapters$26$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends TypeAdapter<Timestamp> {
            public final /* synthetic */ AnonymousClass26 this$0;
            public final /* synthetic */ TypeAdapter val$dateTypeAdapter;

            public AnonymousClass1(AnonymousClass26 anonymousClass26, TypeAdapter typeAdapter) {
            }

            @Override // com.google.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Timestamp read(JsonReader jsonReader) throws IOException {
            }

            @Override // com.google.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: read  reason: avoid collision after fix types in other method */
            public Timestamp read2(JsonReader jsonReader) throws IOException {
            }

            /* renamed from: write  reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
            }
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$27  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass27 extends TypeAdapter<Calendar> {
        private static final String DAY_OF_MONTH = "dayOfMonth";
        private static final String HOUR_OF_DAY = "hourOfDay";
        private static final String MINUTE = "minute";
        private static final String MONTH = "month";
        private static final String SECOND = "second";
        private static final String YEAR = "year";

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Calendar read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public Calendar read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Calendar calendar) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$28  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass28 extends TypeAdapter<Locale> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Locale read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Locale locale) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public Locale read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Locale locale) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$29  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass29 extends TypeAdapter<JsonElement> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ JsonElement read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public JsonElement read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends TypeAdapter<Boolean> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Boolean read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Boolean read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Boolean bool) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$30  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass30 implements TypeAdapterFactory {
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass31 implements TypeAdapterFactory {
        public final /* synthetic */ TypeToken val$type;
        public final /* synthetic */ TypeAdapter val$typeAdapter;

        public AnonymousClass31(TypeToken typeToken, TypeAdapter typeAdapter) {
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$32  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass32 implements TypeAdapterFactory {
        public final /* synthetic */ Class val$type;
        public final /* synthetic */ TypeAdapter val$typeAdapter;

        public AnonymousClass32(Class cls, TypeAdapter typeAdapter) {
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        }

        public String toString() {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$33  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass33 implements TypeAdapterFactory {
        public final /* synthetic */ Class val$boxed;
        public final /* synthetic */ TypeAdapter val$typeAdapter;
        public final /* synthetic */ Class val$unboxed;

        public AnonymousClass33(Class cls, Class cls2, TypeAdapter typeAdapter) {
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        }

        public String toString() {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$34  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass34 implements TypeAdapterFactory {
        public final /* synthetic */ Class val$base;
        public final /* synthetic */ Class val$sub;
        public final /* synthetic */ TypeAdapter val$typeAdapter;

        public AnonymousClass34(Class cls, Class cls2, TypeAdapter typeAdapter) {
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        }

        public String toString() {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$35  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass35 implements TypeAdapterFactory {
        public final /* synthetic */ Class val$clazz;
        public final /* synthetic */ TypeAdapter val$typeAdapter;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        /* renamed from: com.google.gson.internal.bind.TypeAdapters$35$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1<T1> extends TypeAdapter<T1> {
            public final /* synthetic */ AnonymousClass35 this$0;
            public final /* synthetic */ Class val$requestedType;

            public AnonymousClass1(AnonymousClass35 anonymousClass35, Class cls) {
            }

            @Override // com.google.gson.TypeAdapter
            public T1 read(JsonReader jsonReader) throws IOException {
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T1 t1) throws IOException {
            }
        }

        public AnonymousClass35(Class cls, TypeAdapter typeAdapter) {
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
        }

        public String toString() {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$36  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass36 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends TypeAdapter<Boolean> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Boolean read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Boolean read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Boolean bool) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Number read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Number number) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Number read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Number number) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Number read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Number number) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass8 extends TypeAdapter<AtomicInteger> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ AtomicInteger read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public AtomicInteger read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass9 extends TypeAdapter<AtomicBoolean> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ AtomicBoolean read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public AtomicBoolean read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write  reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
        private final Map<T, String> constantToName;
        private final Map<String, T> nameToConstant;

        public EnumTypeAdapter(Class<T> cls) {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
        }

        public void write(JsonWriter jsonWriter, T t) throws IOException {
        }
    }

    private TypeAdapters() {
    }

    public static <TT> TypeAdapterFactory newFactory(TypeToken<TT> typeToken, TypeAdapter<TT> typeAdapter) {
    }

    public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(Class<TT> cls, Class<? extends TT> cls2, TypeAdapter<? super TT> typeAdapter) {
    }

    public static <T1> TypeAdapterFactory newTypeHierarchyFactory(Class<T1> cls, TypeAdapter<T1> typeAdapter) {
    }

    public static <TT> TypeAdapterFactory newFactory(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
    }

    public static <TT> TypeAdapterFactory newFactory(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
    }
}
