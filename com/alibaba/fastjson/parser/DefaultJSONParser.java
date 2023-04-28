package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import java.io.Closeable;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DefaultJSONParser implements Closeable {
    public static final int NONE = 0;
    public static final int NeedToResolve = 1;
    public static final int TypeNameRedirect = 2;
    public ParserConfig config;
    public ParseContext contex;
    private ParseContext[] contextArray;
    private int contextArrayIndex;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    public List<ExtraProcessor> extraProcessors;
    public List<ExtraTypeProvider> extraTypeProviders;
    public FieldTypeResolver fieldTypeResolver;
    public final JSONLexer lexer;
    public int resolveStatus;
    private List<ResolveTask> resolveTaskList;
    public final SymbolTable symbolTable;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ResolveTask {
        private final ParseContext context;
        public FieldDeserializer fieldDeserializer;
        public ParseContext ownerContext;
        private final String referenceValue;

        public ResolveTask(ParseContext parseContext, String str) {
        }

        public static /* synthetic */ String access$000(ResolveTask resolveTask) {
        }

        public static /* synthetic */ ParseContext access$100(ResolveTask resolveTask) {
        }
    }

    public DefaultJSONParser(String str) {
    }

    public final void accept(int i2) {
    }

    public void addResolveTask(ResolveTask resolveTask) {
    }

    public void checkListResolve(Collection collection) {
    }

    public void checkMapResolve(Map map, Object obj) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void config(Feature feature, boolean z) {
    }

    public String getDateFomartPattern() {
    }

    public DateFormat getDateFormat() {
    }

    public List<ExtraProcessor> getExtraProcessors() {
    }

    public List<ExtraTypeProvider> getExtraTypeProviders() {
    }

    public ResolveTask getLastResolveTask() {
    }

    public void handleResovleTask(Object obj) {
    }

    public Object parse() {
    }

    public <T> List<T> parseArray(Class<T> cls) {
    }

    public Object parseArrayWithType(Type type) {
    }

    public final Object parseObject(Map map, Object obj) {
    }

    public String parseString() {
    }

    public void popContext() {
    }

    public void setContext(ParseContext parseContext) {
    }

    public void setDateFomrat(DateFormat dateFormat) {
    }

    public void setDateFormat(String str) {
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig) {
    }

    public Object parse(Object obj) {
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig, int i2) {
    }

    public void parseArray(Class<?> cls, Collection collection) {
    }

    public ParseContext setContext(ParseContext parseContext, Object obj, Object obj2) {
    }

    public DefaultJSONParser(char[] cArr, int i2, ParserConfig parserConfig, int i3) {
    }

    public void parseArray(Type type, Collection collection) {
    }

    public DefaultJSONParser(JSONLexer jSONLexer) {
    }

    public void parseArray(Type type, Collection collection, Object obj) {
    }

    public DefaultJSONParser(JSONLexer jSONLexer, ParserConfig parserConfig) {
    }

    public Object[] parseArray(Type[] typeArr) {
    }

    public final void parseArray(Collection collection) {
    }

    public final void parseArray(Collection collection, Object obj) {
    }

    public <T> T parseObject(Class<T> cls) {
    }

    public <T> T parseObject(Type type) {
    }

    public <T> T parseObject(Type type, Object obj) {
    }

    public void parseObject(Object obj) {
    }

    public Object parseObject(Map map) {
    }

    public JSONObject parseObject() {
    }
}
