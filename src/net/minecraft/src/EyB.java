package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class EyB {
    public final int field_2e5f1b_bzF;
    public final int field_21260d_FWm;
    public final int field_2092ae_Dne;

    public boolean equals(Object object) {
        if (!(object instanceof EyB)) {
            return false;
        }
        EyB eyB = (EyB)object;
        return eyB.field_2092ae_Dne == this.field_2092ae_Dne && eyB.field_21260d_FWm == this.field_21260d_FWm && eyB.field_2e5f1b_bzF == this.field_2e5f1b_bzF;
    }

    public EyB(chN chN2) {
        this(geR.method_117d0718_FWm(chN2.field_2092a9_Dne), geR.method_117d0718_FWm(chN2.field_212608_FWm), geR.method_117d0718_FWm(chN2.field_2e5f16_bzF));
    }

    public EyB(int n, int n2, int n3) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
    }

    public int hashCode() {
        return this.field_2092ae_Dne * 8976890 + this.field_21260d_FWm * 981131 + this.field_2e5f1b_bzF;
    }
}

