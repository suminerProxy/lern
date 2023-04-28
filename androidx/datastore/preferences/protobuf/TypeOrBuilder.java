package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface TypeOrBuilder extends MessageLiteOrBuilder {
    Field getFields(int i2);

    int getFieldsCount();

    List<Field> getFieldsList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int i2);

    ByteString getOneofsBytes(int i2);

    int getOneofsCount();

    List<String> getOneofsList();

    Option getOptions(int i2);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
