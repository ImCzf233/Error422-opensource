package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class eFM
extends NER {
    public int field_2092ae_Dne;
    public int field_21260d_FWm;
    public String[] field_f5e54dca_Dne;
    public int field_2e5f1b_bzF;

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeShort(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        for (int i = 0; i < 4; ++i) {
            eFM.method_e1033a4c_Dne(this.field_f5e54dca_Dne[i], dataOutputStream);
        }
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readShort();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_f5e54dca_Dne = new String[4];
        for (int i = 0; i < 4; ++i) {
            this.field_f5e54dca_Dne[i] = eFM.method_1ce99840_Dne(dataInputStream, 15);
        }
    }

    public eFM(int n, int n2, int n3, String[] stringArray) {
        this.field_267d06_Qnq = true;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_f5e54dca_Dne = new String[]{stringArray[0], stringArray[1], stringArray[2], stringArray[3]};
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_a32e437b_Dne(this);
    }

    public eFM() {
        this.field_267d06_Qnq = true;
    }

    @Override
    public int method_7a46288d_Dne() {
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            n += this.field_f5e54dca_Dne[i].length();
        }
        return n;
    }
}

