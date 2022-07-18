package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class VPw
extends NER {
    public int field_2092ae_Dne = 0;
    public byte field_212606_FWm;
    public kGO field_3778a39_Dne;
    public XHL field_36eea90_Dne;
    public byte field_2092a7_Dne;
    public int field_21260d_FWm;
    public boolean field_2092bf_Dne;
    public byte field_2e5f14_bzF;

    public VPw() {
    }

    @Override
    public int method_7a46288d_Dne() {
        int n = 0;
        if (this.field_3778a39_Dne != null) {
            n = this.field_3778a39_Dne.method_eecad346_Dne().length();
        }
        return 6 + 2 * n + 4 + 4 + 1 + 1 + 1;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        byte by;
        this.field_2092ae_Dne = dataInputStream.readInt();
        String string = VPw.method_1ce99840_Dne(dataInputStream, 16);
        this.field_3778a39_Dne = kGO.method_285a5ae2_Dne(string);
        if (this.field_3778a39_Dne == null) {
            this.field_3778a39_Dne = kGO.field_3778a39_Dne;
        }
        this.field_2092bf_Dne = ((by = dataInputStream.readByte()) & 8) == 8;
        int n = by & 0xFFFFFFF7;
        this.field_36eea90_Dne = XHL.method_9e728e7e_Dne(n);
        this.field_21260d_FWm = dataInputStream.readByte();
        this.field_2092a7_Dne = dataInputStream.readByte();
        this.field_212606_FWm = dataInputStream.readByte();
        this.field_2e5f14_bzF = dataInputStream.readByte();
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_8a3594ca_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        VPw.method_e1033a4c_Dne(this.field_3778a39_Dne == null ? "" : this.field_3778a39_Dne.method_eecad346_Dne(), dataOutputStream);
        int n = this.field_36eea90_Dne.method_7a46288d_Dne();
        if (this.field_2092bf_Dne) {
            n |= 8;
        }
        dataOutputStream.writeByte(n);
        dataOutputStream.writeByte(this.field_21260d_FWm);
        dataOutputStream.writeByte(this.field_2092a7_Dne);
        dataOutputStream.writeByte(this.field_212606_FWm);
        dataOutputStream.writeByte(this.field_2e5f14_bzF);
    }

    public VPw(int n, kGO kGO2, XHL xHL, boolean bl, int n2, int n3, int n4, int n5) {
        this.field_2092ae_Dne = n;
        this.field_3778a39_Dne = kGO2;
        this.field_21260d_FWm = n2;
        this.field_2092a7_Dne = (byte)n3;
        this.field_36eea90_Dne = xHL;
        this.field_212606_FWm = (byte)n4;
        this.field_2e5f14_bzF = (byte)n5;
        this.field_2092bf_Dne = bl;
    }
}

