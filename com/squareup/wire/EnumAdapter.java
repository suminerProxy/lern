package com.squareup.wire;

import com.squareup.wire.WireEnum;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    public EnumAdapter(Class<E> cls) {
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ Object decode(ProtoReader protoReader) throws IOException {
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) throws IOException {
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
    }

    public abstract E fromValue(int i2);

    @Override // com.squareup.wire.ProtoAdapter
    public final E decode(ProtoReader protoReader) throws IOException {
    }

    public final void encode(ProtoWriter protoWriter, E e2) throws IOException {
    }

    public final int encodedSize(E e2) {
    }
}
