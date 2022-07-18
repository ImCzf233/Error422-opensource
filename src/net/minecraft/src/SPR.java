package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class SPR
extends NER {
    public String field_c480ca78_bzF = "";
    public int field_21260d_FWm;
    public String field_9e60dbde_Qnq = "";
    public String field_569fcf45_Dne = "";
    public Collection<String> field_fb483cec_Dne = new ArrayList();
    public int field_2092ae_Dne = 0;
    public String field_d9a85c6_FWm = "";

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_569fcf45_Dne = SPR.method_1ce99840_Dne(dataInputStream, 16);
        this.field_2092ae_Dne = dataInputStream.readByte();
        if (this.field_2092ae_Dne == 0 || this.field_2092ae_Dne == 2) {
            this.field_d9a85c6_FWm = SPR.method_1ce99840_Dne(dataInputStream, 32);
            this.field_c480ca78_bzF = SPR.method_1ce99840_Dne(dataInputStream, 16);
            this.field_9e60dbde_Qnq = SPR.method_1ce99840_Dne(dataInputStream, 16);
            this.field_21260d_FWm = dataInputStream.readByte();
        }
        if (this.field_2092ae_Dne == 0 || this.field_2092ae_Dne == 3 || this.field_2092ae_Dne == 4) {
            int n = dataInputStream.readShort();
            for (int i = 0; i < n; ++i) {
                this.field_fb483cec_Dne.add(SPR.method_1ce99840_Dne(dataInputStream, 16));
            }
        }
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        SPR.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        dataOutputStream.writeByte(this.field_2092ae_Dne);
        if (this.field_2092ae_Dne == 0 || this.field_2092ae_Dne == 2) {
            SPR.method_e1033a4c_Dne(this.field_d9a85c6_FWm, dataOutputStream);
            SPR.method_e1033a4c_Dne(this.field_c480ca78_bzF, dataOutputStream);
            SPR.method_e1033a4c_Dne(this.field_9e60dbde_Qnq, dataOutputStream);
            dataOutputStream.writeByte(this.field_21260d_FWm);
        }
        if (this.field_2092ae_Dne == 0 || this.field_2092ae_Dne == 3 || this.field_2092ae_Dne == 4) {
            dataOutputStream.writeShort(this.field_fb483cec_Dne.size());
            for (Object obj : this.field_fb483cec_Dne) {String string = (String) obj;
                SPR.method_e1033a4c_Dne(string, dataOutputStream);
            }
        }
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_85063932_Dne(this);
    }

    public SPR(YGE yGE, int n) {
        this.field_569fcf45_Dne = yGE.method_eecad346_Dne();
        this.field_2092ae_Dne = n;
        if (n == 0 || n == 2) {
            this.field_d9a85c6_FWm = yGE.method_d1f1ed87_FWm();
            this.field_c480ca78_bzF = yGE.method_6859cdb9_bzF();
            this.field_9e60dbde_Qnq = yGE.method_4a7b1d9f_Qnq();
            this.field_21260d_FWm = yGE.method_7a46288d_Dne();
        }
        if (n == 0) {
            this.field_fb483cec_Dne.addAll(yGE.method_be5f586d_Dne());
        }
    }

    public SPR() {
    }

    public SPR(YGE yGE, Collection collection, int n) {
        if (n != 3 && n != 4) {
            throw new IllegalArgumentException("Method must be join or leave for player constructor");
        }
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Players cannot be null/empty");
        }
        this.field_2092ae_Dne = n;
        this.field_569fcf45_Dne = yGE.method_eecad346_Dne();
        this.field_fb483cec_Dne.addAll(collection);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3 + this.field_569fcf45_Dne.length();
    }
}

