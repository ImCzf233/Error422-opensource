package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;

class CZC
extends ByteArrayOutputStream {
    final inq_0 field_376bc00_Dne;
    private int field_2092ae_Dne;
    private int field_21260d_FWm;

    @Override
    public void close() {
        this.field_376bc00_Dne.method_d5d70262_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.buf, this.count);
    }

    public CZC(inq_0 inq_02, int n, int n2) {
        super(8096);
        this.field_376bc00_Dne = inq_02;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
    }
}

