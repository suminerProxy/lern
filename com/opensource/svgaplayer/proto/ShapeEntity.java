package com.opensource.svgaplayer.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ShapeEntity extends Message<ShapeEntity, Builder> {
    public static final ProtoAdapter<ShapeEntity> ADAPTER = null;
    public static final ShapeType DEFAULT_TYPE = null;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$EllipseArgs#ADAPTER", tag = 4)
    public final EllipseArgs ellipse;
    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$RectArgs#ADAPTER", tag = 3)
    public final RectArgs rect;
    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeArgs#ADAPTER", tag = 2)
    public final ShapeArgs shape;
    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle#ADAPTER", tag = 10)
    public final ShapeStyle styles;
    @WireField(adapter = "com.opensource.svgaplayer.proto.Transform#ADAPTER", tag = 11)
    public final Transform transform;
    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeType#ADAPTER", tag = 1)
    public final ShapeType type;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder extends Message.Builder<ShapeEntity, Builder> {
        public EllipseArgs ellipse;
        public RectArgs rect;
        public ShapeArgs shape;
        public ShapeStyle styles;
        public Transform transform;
        public ShapeType type;

        @Override // com.squareup.wire.Message.Builder
        public /* bridge */ /* synthetic */ ShapeEntity build() {
        }

        public Builder ellipse(EllipseArgs ellipseArgs) {
        }

        public Builder rect(RectArgs rectArgs) {
        }

        public Builder shape(ShapeArgs shapeArgs) {
        }

        public Builder styles(ShapeStyle shapeStyle) {
        }

        public Builder transform(Transform transform) {
        }

        public Builder type(ShapeType shapeType) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.Message.Builder
        public ShapeEntity build() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EllipseArgs extends Message<EllipseArgs, Builder> {
        public static final ProtoAdapter<EllipseArgs> ADAPTER = null;
        public static final Float DEFAULT_RADIUSX = null;
        public static final Float DEFAULT_RADIUSY = null;
        public static final Float DEFAULT_X = null;
        public static final Float DEFAULT_Y = null;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
        public final Float radiusX;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
        public final Float radiusY;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
        public final Float x;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
        public final Float y;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Builder extends Message.Builder<EllipseArgs, Builder> {
            public Float radiusX;
            public Float radiusY;
            public Float x;
            public Float y;

            @Override // com.squareup.wire.Message.Builder
            public /* bridge */ /* synthetic */ EllipseArgs build() {
            }

            public Builder radiusX(Float f2) {
            }

            public Builder radiusY(Float f2) {
            }

            public Builder x(Float f2) {
            }

            public Builder y(Float f2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.Message.Builder
            public EllipseArgs build() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class ProtoAdapter_EllipseArgs extends ProtoAdapter<EllipseArgs> {
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ EllipseArgs decode(ProtoReader protoReader) throws IOException {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, EllipseArgs ellipseArgs) throws IOException {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(EllipseArgs ellipseArgs) {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ EllipseArgs redact(EllipseArgs ellipseArgs) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EllipseArgs decode(ProtoReader protoReader) throws IOException {
            }

            /* renamed from: encode  reason: avoid collision after fix types in other method */
            public void encode2(ProtoWriter protoWriter, EllipseArgs ellipseArgs) throws IOException {
            }

            /* renamed from: encodedSize  reason: avoid collision after fix types in other method */
            public int encodedSize2(EllipseArgs ellipseArgs) {
            }

            /* renamed from: redact  reason: avoid collision after fix types in other method */
            public EllipseArgs redact2(EllipseArgs ellipseArgs) {
            }
        }

        public EllipseArgs(Float f2, Float f3, Float f4, Float f5) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.squareup.wire.Message
        /* renamed from: newBuilder  reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ Message.Builder<EllipseArgs, Builder> newBuilder2() {
        }

        @Override // com.squareup.wire.Message
        public String toString() {
        }

        public EllipseArgs(Float f2, Float f3, Float f4, Float f5, ByteString byteString) {
        }

        @Override // com.squareup.wire.Message
        public Message.Builder<EllipseArgs, Builder> newBuilder() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ProtoAdapter_ShapeEntity extends ProtoAdapter<ShapeEntity> {
        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ ShapeEntity decode(ProtoReader protoReader) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, ShapeEntity shapeEntity) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(ShapeEntity shapeEntity) {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ ShapeEntity redact(ShapeEntity shapeEntity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ShapeEntity decode(ProtoReader protoReader) throws IOException {
        }

        /* renamed from: encode  reason: avoid collision after fix types in other method */
        public void encode2(ProtoWriter protoWriter, ShapeEntity shapeEntity) throws IOException {
        }

        /* renamed from: encodedSize  reason: avoid collision after fix types in other method */
        public int encodedSize2(ShapeEntity shapeEntity) {
        }

        /* renamed from: redact  reason: avoid collision after fix types in other method */
        public ShapeEntity redact2(ShapeEntity shapeEntity) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RectArgs extends Message<RectArgs, Builder> {
        public static final ProtoAdapter<RectArgs> ADAPTER = null;
        public static final Float DEFAULT_CORNERRADIUS = null;
        public static final Float DEFAULT_HEIGHT = null;
        public static final Float DEFAULT_WIDTH = null;
        public static final Float DEFAULT_X = null;
        public static final Float DEFAULT_Y = null;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 5)
        public final Float cornerRadius;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
        public final Float height;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
        public final Float width;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
        public final Float x;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
        public final Float y;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Builder extends Message.Builder<RectArgs, Builder> {
            public Float cornerRadius;
            public Float height;
            public Float width;
            public Float x;
            public Float y;

            @Override // com.squareup.wire.Message.Builder
            public /* bridge */ /* synthetic */ RectArgs build() {
            }

            public Builder cornerRadius(Float f2) {
            }

            public Builder height(Float f2) {
            }

            public Builder width(Float f2) {
            }

            public Builder x(Float f2) {
            }

            public Builder y(Float f2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.Message.Builder
            public RectArgs build() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class ProtoAdapter_RectArgs extends ProtoAdapter<RectArgs> {
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ RectArgs decode(ProtoReader protoReader) throws IOException {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, RectArgs rectArgs) throws IOException {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(RectArgs rectArgs) {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ RectArgs redact(RectArgs rectArgs) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RectArgs decode(ProtoReader protoReader) throws IOException {
            }

            /* renamed from: encode  reason: avoid collision after fix types in other method */
            public void encode2(ProtoWriter protoWriter, RectArgs rectArgs) throws IOException {
            }

            /* renamed from: encodedSize  reason: avoid collision after fix types in other method */
            public int encodedSize2(RectArgs rectArgs) {
            }

            /* renamed from: redact  reason: avoid collision after fix types in other method */
            public RectArgs redact2(RectArgs rectArgs) {
            }
        }

        public RectArgs(Float f2, Float f3, Float f4, Float f5, Float f6) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.squareup.wire.Message
        /* renamed from: newBuilder  reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ Message.Builder<RectArgs, Builder> newBuilder2() {
        }

        @Override // com.squareup.wire.Message
        public String toString() {
        }

        public RectArgs(Float f2, Float f3, Float f4, Float f5, Float f6, ByteString byteString) {
        }

        @Override // com.squareup.wire.Message
        public Message.Builder<RectArgs, Builder> newBuilder() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ShapeArgs extends Message<ShapeArgs, Builder> {
        public static final ProtoAdapter<ShapeArgs> ADAPTER = null;
        public static final String DEFAULT_D = "";
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)

        /* renamed from: d  reason: collision with root package name */
        public final String f5237d;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Builder extends Message.Builder<ShapeArgs, Builder> {

            /* renamed from: d  reason: collision with root package name */
            public String f5238d;

            @Override // com.squareup.wire.Message.Builder
            public /* bridge */ /* synthetic */ ShapeArgs build() {
            }

            public Builder d(String str) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.Message.Builder
            public ShapeArgs build() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class ProtoAdapter_ShapeArgs extends ProtoAdapter<ShapeArgs> {
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ ShapeArgs decode(ProtoReader protoReader) throws IOException {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, ShapeArgs shapeArgs) throws IOException {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(ShapeArgs shapeArgs) {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ ShapeArgs redact(ShapeArgs shapeArgs) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ShapeArgs decode(ProtoReader protoReader) throws IOException {
            }

            /* renamed from: encode  reason: avoid collision after fix types in other method */
            public void encode2(ProtoWriter protoWriter, ShapeArgs shapeArgs) throws IOException {
            }

            /* renamed from: encodedSize  reason: avoid collision after fix types in other method */
            public int encodedSize2(ShapeArgs shapeArgs) {
            }

            /* renamed from: redact  reason: avoid collision after fix types in other method */
            public ShapeArgs redact2(ShapeArgs shapeArgs) {
            }
        }

        public ShapeArgs(String str) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.squareup.wire.Message
        /* renamed from: newBuilder  reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ Message.Builder<ShapeArgs, Builder> newBuilder2() {
        }

        @Override // com.squareup.wire.Message
        public String toString() {
        }

        public ShapeArgs(String str, ByteString byteString) {
        }

        @Override // com.squareup.wire.Message
        public Message.Builder<ShapeArgs, Builder> newBuilder() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ShapeStyle extends Message<ShapeStyle, Builder> {
        public static final ProtoAdapter<ShapeStyle> ADAPTER = null;
        public static final LineCap DEFAULT_LINECAP = null;
        public static final Float DEFAULT_LINEDASHI = null;
        public static final Float DEFAULT_LINEDASHII = null;
        public static final Float DEFAULT_LINEDASHIII = null;
        public static final LineJoin DEFAULT_LINEJOIN = null;
        public static final Float DEFAULT_MITERLIMIT = null;
        public static final Float DEFAULT_STROKEWIDTH = null;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle$RGBAColor#ADAPTER", tag = 1)
        public final RGBAColor fill;
        @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle$LineCap#ADAPTER", tag = 4)
        public final LineCap lineCap;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 7)
        public final Float lineDashI;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 8)
        public final Float lineDashII;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 9)
        public final Float lineDashIII;
        @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle$LineJoin#ADAPTER", tag = 5)
        public final LineJoin lineJoin;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 6)
        public final Float miterLimit;
        @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle$RGBAColor#ADAPTER", tag = 2)
        public final RGBAColor stroke;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
        public final Float strokeWidth;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Builder extends Message.Builder<ShapeStyle, Builder> {
            public RGBAColor fill;
            public LineCap lineCap;
            public Float lineDashI;
            public Float lineDashII;
            public Float lineDashIII;
            public LineJoin lineJoin;
            public Float miterLimit;
            public RGBAColor stroke;
            public Float strokeWidth;

            @Override // com.squareup.wire.Message.Builder
            public /* bridge */ /* synthetic */ ShapeStyle build() {
            }

            public Builder fill(RGBAColor rGBAColor) {
            }

            public Builder lineCap(LineCap lineCap) {
            }

            public Builder lineDashI(Float f2) {
            }

            public Builder lineDashII(Float f2) {
            }

            public Builder lineDashIII(Float f2) {
            }

            public Builder lineJoin(LineJoin lineJoin) {
            }

            public Builder miterLimit(Float f2) {
            }

            public Builder stroke(RGBAColor rGBAColor) {
            }

            public Builder strokeWidth(Float f2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.Message.Builder
            public ShapeStyle build() {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class LineCap implements WireEnum {
            private static final /* synthetic */ LineCap[] $VALUES = null;
            public static final ProtoAdapter<LineCap> ADAPTER = null;
            public static final LineCap LineCap_BUTT = null;
            public static final LineCap LineCap_ROUND = null;
            public static final LineCap LineCap_SQUARE = null;
            private final int value;

            private LineCap(String str, int i2, int i3) {
            }

            public static LineCap fromValue(int i2) {
            }

            public static LineCap valueOf(String str) {
            }

            public static LineCap[] values() {
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class LineJoin implements WireEnum {
            private static final /* synthetic */ LineJoin[] $VALUES = null;
            public static final ProtoAdapter<LineJoin> ADAPTER = null;
            public static final LineJoin LineJoin_BEVEL = null;
            public static final LineJoin LineJoin_MITER = null;
            public static final LineJoin LineJoin_ROUND = null;
            private final int value;

            private LineJoin(String str, int i2, int i3) {
            }

            public static LineJoin fromValue(int i2) {
            }

            public static LineJoin valueOf(String str) {
            }

            public static LineJoin[] values() {
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class ProtoAdapter_ShapeStyle extends ProtoAdapter<ShapeStyle> {
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ ShapeStyle decode(ProtoReader protoReader) throws IOException {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, ShapeStyle shapeStyle) throws IOException {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(ShapeStyle shapeStyle) {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ ShapeStyle redact(ShapeStyle shapeStyle) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ShapeStyle decode(ProtoReader protoReader) throws IOException {
            }

            /* renamed from: encode  reason: avoid collision after fix types in other method */
            public void encode2(ProtoWriter protoWriter, ShapeStyle shapeStyle) throws IOException {
            }

            /* renamed from: encodedSize  reason: avoid collision after fix types in other method */
            public int encodedSize2(ShapeStyle shapeStyle) {
            }

            /* renamed from: redact  reason: avoid collision after fix types in other method */
            public ShapeStyle redact2(ShapeStyle shapeStyle) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class RGBAColor extends Message<RGBAColor, Builder> {
            public static final ProtoAdapter<RGBAColor> ADAPTER = null;
            public static final Float DEFAULT_A = null;
            public static final Float DEFAULT_B = null;
            public static final Float DEFAULT_G = null;
            public static final Float DEFAULT_R = null;
            private static final long serialVersionUID = 0;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)

            /* renamed from: a  reason: collision with root package name */
            public final Float f5239a;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
            public final Float b;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)

            /* renamed from: g  reason: collision with root package name */
            public final Float f5240g;
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
            public final Float r;

            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public static final class Builder extends Message.Builder<RGBAColor, Builder> {

                /* renamed from: a  reason: collision with root package name */
                public Float f5241a;
                public Float b;

                /* renamed from: g  reason: collision with root package name */
                public Float f5242g;
                public Float r;

                public Builder a(Float f2) {
                }

                public Builder b(Float f2) {
                }

                @Override // com.squareup.wire.Message.Builder
                public /* bridge */ /* synthetic */ RGBAColor build() {
                }

                public Builder g(Float f2) {
                }

                public Builder r(Float f2) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.Message.Builder
                public RGBAColor build() {
                }
            }

            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public static final class ProtoAdapter_RGBAColor extends ProtoAdapter<RGBAColor> {
                @Override // com.squareup.wire.ProtoAdapter
                public /* bridge */ /* synthetic */ RGBAColor decode(ProtoReader protoReader) throws IOException {
                }

                @Override // com.squareup.wire.ProtoAdapter
                public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, RGBAColor rGBAColor) throws IOException {
                }

                @Override // com.squareup.wire.ProtoAdapter
                public /* bridge */ /* synthetic */ int encodedSize(RGBAColor rGBAColor) {
                }

                @Override // com.squareup.wire.ProtoAdapter
                public /* bridge */ /* synthetic */ RGBAColor redact(RGBAColor rGBAColor) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public RGBAColor decode(ProtoReader protoReader) throws IOException {
                }

                /* renamed from: encode  reason: avoid collision after fix types in other method */
                public void encode2(ProtoWriter protoWriter, RGBAColor rGBAColor) throws IOException {
                }

                /* renamed from: encodedSize  reason: avoid collision after fix types in other method */
                public int encodedSize2(RGBAColor rGBAColor) {
                }

                /* renamed from: redact  reason: avoid collision after fix types in other method */
                public RGBAColor redact2(RGBAColor rGBAColor) {
                }
            }

            public RGBAColor(Float f2, Float f3, Float f4, Float f5) {
            }

            public boolean equals(Object obj) {
            }

            public int hashCode() {
            }

            @Override // com.squareup.wire.Message
            /* renamed from: newBuilder  reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ Message.Builder<RGBAColor, Builder> newBuilder2() {
            }

            @Override // com.squareup.wire.Message
            public String toString() {
            }

            public RGBAColor(Float f2, Float f3, Float f4, Float f5, ByteString byteString) {
            }

            @Override // com.squareup.wire.Message
            public Message.Builder<RGBAColor, Builder> newBuilder() {
            }
        }

        public ShapeStyle(RGBAColor rGBAColor, RGBAColor rGBAColor2, Float f2, LineCap lineCap, LineJoin lineJoin, Float f3, Float f4, Float f5, Float f6) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.squareup.wire.Message
        /* renamed from: newBuilder  reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ Message.Builder<ShapeStyle, Builder> newBuilder2() {
        }

        @Override // com.squareup.wire.Message
        public String toString() {
        }

        public ShapeStyle(RGBAColor rGBAColor, RGBAColor rGBAColor2, Float f2, LineCap lineCap, LineJoin lineJoin, Float f3, Float f4, Float f5, Float f6, ByteString byteString) {
        }

        @Override // com.squareup.wire.Message
        public Message.Builder<ShapeStyle, Builder> newBuilder() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ShapeType implements WireEnum {
        private static final /* synthetic */ ShapeType[] $VALUES = null;
        public static final ProtoAdapter<ShapeType> ADAPTER = null;
        public static final ShapeType ELLIPSE = null;
        public static final ShapeType KEEP = null;
        public static final ShapeType RECT = null;
        public static final ShapeType SHAPE = null;
        private final int value;

        private ShapeType(String str, int i2, int i3) {
        }

        public static ShapeType fromValue(int i2) {
        }

        public static ShapeType valueOf(String str) {
        }

        public static ShapeType[] values() {
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
        }
    }

    public ShapeEntity(ShapeType shapeType, ShapeStyle shapeStyle, Transform transform, ShapeArgs shapeArgs, RectArgs rectArgs, EllipseArgs ellipseArgs) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<ShapeEntity, Builder> newBuilder2() {
    }

    @Override // com.squareup.wire.Message
    public String toString() {
    }

    public ShapeEntity(ShapeType shapeType, ShapeStyle shapeStyle, Transform transform, ShapeArgs shapeArgs, RectArgs rectArgs, EllipseArgs ellipseArgs, ByteString byteString) {
    }

    @Override // com.squareup.wire.Message
    public Message.Builder<ShapeEntity, Builder> newBuilder() {
    }
}
