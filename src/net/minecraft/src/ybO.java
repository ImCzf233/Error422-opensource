package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ybO
extends ArrayList {
    public static ybO method_69e4010e_Dne(DataInputStream dataInputStream) throws IOException {
        ybO ybO2 = new ybO();
        int n = dataInputStream.readByte() & 0xFF;
        for (int i = 0; i < n; ++i) {
            NMq nMq = NER.method_69d02a62_Dne(dataInputStream);
            NMq nMq2 = NER.method_69d02a62_Dne(dataInputStream);
            NMq nMq3 = null;
            if (dataInputStream.readBoolean()) {
                nMq3 = NER.method_69d02a62_Dne(dataInputStream);
            }
            boolean bl = dataInputStream.readBoolean();
            Vnr vnr = new Vnr(nMq, nMq3, nMq2);
            if (bl) {
                vnr.method_7c6f6039_FWm();
            }
            ybO2.add(vnr);
        }
        return ybO2;
    }

    public ybO() {
    }

    public WkD method_230886fb_Dne() {
        WkD wkD = new WkD();
        mbZ mbZ2 = new mbZ("Recipes");
        for (int i = 0; i < this.size(); ++i) {
            Vnr vnr = (Vnr)this.get(i);
            mbZ2.method_b4ba5ea1_Dne(vnr.method_230886fb_Dne());
        }
        wkD.method_58996597_Dne("Recipes", mbZ2);
        return wkD;
    }

    public void method_8d4fb917_Dne(WkD wkD) {
        mbZ mbZ2 = wkD.method_285baa50_Dne("Recipes");
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD2 = (WkD)mbZ2.method_77d0d055_FWm(i);
            this.add(new Vnr(wkD2));
        }
    }

    public ybO(WkD wkD) {
        this.method_8d4fb917_Dne(wkD);
    }

    public Vnr method_fdb87020_Dne(NMq nMq, NMq nMq2, int n) {
        if (n > 0 && n < this.size()) {
            Vnr vnr = (Vnr)this.get(n);
            return nMq.field_2e5f1b_bzF == vnr.method_23040479_Dne().field_2e5f1b_bzF && (nMq2 == null && !vnr.method_7a46289e_Dne() || vnr.method_7a46289e_Dne() && nMq2 != null && vnr.method_f87a5498_FWm().field_2e5f1b_bzF == nMq2.field_2e5f1b_bzF) && nMq.field_2092ae_Dne >= vnr.method_23040479_Dne().field_2092ae_Dne && (!vnr.method_7a46289e_Dne() || nMq2.field_2092ae_Dne >= vnr.method_f87a5498_FWm().field_2092ae_Dne) ? vnr : null;
        }
        for (int i = 0; i < this.size(); ++i) {
            Vnr vnr = (Vnr)this.get(i);
            if (nMq.field_2e5f1b_bzF != vnr.method_23040479_Dne().field_2e5f1b_bzF || nMq.field_2092ae_Dne < vnr.method_23040479_Dne().field_2092ae_Dne || (vnr.method_7a46289e_Dne() || nMq2 != null) && (!vnr.method_7a46289e_Dne() || nMq2 == null || vnr.method_f87a5498_FWm().field_2e5f1b_bzF != nMq2.field_2e5f1b_bzF || nMq2.field_2092ae_Dne < vnr.method_f87a5498_FWm().field_2092ae_Dne)) continue;
            return vnr;
        }
        return null;
    }

    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte((byte)(this.size() & 0xFF));
        for (int i = 0; i < this.size(); ++i) {
            Vnr vnr = (Vnr)this.get(i);
            NER.method_dcc5e3d_Dne(vnr.method_23040479_Dne(), dataOutputStream);
            NER.method_dcc5e3d_Dne(vnr.method_22900b26_bzF(), dataOutputStream);
            NMq nMq = vnr.method_f87a5498_FWm();
            dataOutputStream.writeBoolean(nMq != null);
            if (nMq != null) {
                NER.method_dcc5e3d_Dne(nMq, dataOutputStream);
            }
            dataOutputStream.writeBoolean(vnr.method_7c6f603d_FWm());
        }
    }

    public void method_8bda100d_Dne(Vnr vnr) {
        for (int i = 0; i < this.size(); ++i) {
            Vnr vnr2 = (Vnr)this.get(i);
            if (!vnr.method_8bda1011_Dne(vnr2)) continue;
            if (vnr.method_652dc3d2_FWm(vnr2)) {
                this.set(i, vnr);
            }
            return;
        }
        this.add(vnr);
    }
}

