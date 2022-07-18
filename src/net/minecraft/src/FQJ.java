package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class FQJ
extends NER {
    public boolean field_21261e_FWm;
    public double field_2e5f16_bzF;
    public float field_21260a_FWm;
    public double field_2092a9_Dne;
    public boolean field_2092bf_Dne;
    public double field_267cf0_Qnq;
    public float field_2092ab_Dne;
    public double field_212608_FWm;
    public boolean field_2e5f2c_bzF;

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092bf_Dne = dataInputStream.read() != 0;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_6ee1ada8_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.field_2092bf_Dne ? 1 : 0);
    }

    public FQJ() {
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        return true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 1;
    }

    public FQJ(boolean bl) {
        this.field_2092bf_Dne = bl;
    }
}

