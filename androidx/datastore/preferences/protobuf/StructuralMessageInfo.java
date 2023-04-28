package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class StructuralMessageInfo implements MessageInfo {
    private final int[] checkInitialized;
    private final MessageLite defaultInstance;
    private final FieldInfo[] fields;
    private final boolean messageSetWireFormat;
    private final ProtoSyntax syntax;

    public StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
    }

    public static Builder newBuilder() {
    }

    public int[] getCheckInitialized() {
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
    }

    public FieldInfo[] getFields() {
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
    }

    public static Builder newBuilder(int i2) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder {
        private int[] checkInitialized;
        private Object defaultInstance;
        private final List<FieldInfo> fields;
        private boolean messageSetWireFormat;
        private ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
        }

        public StructuralMessageInfo build() {
        }

        public void withCheckInitialized(int[] iArr) {
        }

        public void withDefaultInstance(Object obj) {
        }

        public void withField(FieldInfo fieldInfo) {
        }

        public void withMessageSetWireFormat(boolean z) {
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
        }

        public Builder(int i2) {
        }
    }
}
