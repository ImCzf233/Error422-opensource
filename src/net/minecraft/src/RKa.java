package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RKa
extends qVZ {
    private final fZI field_3758af7_Dne;
    private String field_569fcf45_Dne;
    private final List field_7eb83e1f_bzF;
    private final qVZ field_37a7e17_Dne;
    private pee_0 field_36bb77c_Dne;
    private Agm field_364ee65_Dne;
    private String[] field_f5e54dca_Dne;
    private final List field_6a0474ed_FWm = new ArrayList();

    public RKa(qVZ qVZ2, fZI fZI2) {
        this.field_7eb83e1f_bzF = new ArrayList();
        this.field_37a7e17_Dne = qVZ2;
        this.field_3758af7_Dne = fZI2;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 2) {
                this.field_3758af7_Dne.method_7c6f6039_FWm();
                this.field_3758af7_Dne.method_7c6f6039_FWm();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            }
            if (pee_02.field_2d29f4_aFZ == 1) {
                this.field_3758af7_Dne.method_461f0d68_Dne(ONk.field_d2abbf2f_oIf, 1);
                this.field_36bb77c_Dne.field_569fcf45_Dne = this.field_3758af7_Dne.method_95e92505_Dne(ONk.field_d2abbf2f_oIf);
            }
        }
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.field_364ee65_Dne.method_2c2cec86_Dne(n, n2, f);
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, 8, 0xFFFFFF);
        int n3 = 22;
        for (Object obj : this.field_f5e54dca_Dne) {String string = (String) obj;
            this.method_32faf66d_Dne(this.field_3791671_Dne, string, this.field_21260d_FWm / 2, n3, 0x808080);
            n3 += this.field_3791671_Dne.field_2092ae_Dne;
        }
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_569fcf45_Dne = KGL.method_39193c_Dne("options.snooper.title");
        String string = KGL.method_39193c_Dne("options.snooper.desc");
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Object obj : this.field_3791671_Dne.method_c46270c8_Dne(string, this.field_21260d_FWm - 30)) {String string2 = (String) obj;
            arrayList.add(string2);
        }
        this.field_f5e54dca_Dne = arrayList.toArray(new String[0]);
        this.field_6a0474ed_FWm.clear();
        this.field_7eb83e1f_bzF.clear();
        this.field_36bb77c_Dne = new pee_0(1, this.field_21260d_FWm / 2 - 152, this.field_2e5f1b_bzF - 30, 150, 20, this.field_3758af7_Dne.method_95e92505_Dne(ONk.field_d2abbf2f_oIf));
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        this.field_f27c122c_Dne.add(new pee_0(2, this.field_21260d_FWm / 2 + 2, this.field_2e5f1b_bzF - 30, 150, 20, KGL.method_39193c_Dne("gui.done")));
        boolean bl = this.field_493682ed_Dne.method_2317ec95_Dne() != null && this.field_493682ed_Dne.method_2317ec95_Dne().method_230f1196_Dne() != null;
        for (Object obj : new TreeMap(this.field_493682ed_Dne.method_230f1196_Dne().method_d410254f_Dne()).entrySet()) { Map.Entry entry = (Map.Entry) obj;
            this.field_6a0474ed_FWm.add((bl ? "C " : "") + (String)entry.getKey());
            this.field_7eb83e1f_bzF.add(this.field_3791671_Dne.method_4868f6e1_Dne((String)entry.getValue(), this.field_21260d_FWm - 220));
        }
        if (bl) {
            for (Object obj : new TreeMap(this.field_493682ed_Dne.method_2317ec95_Dne().method_230f1196_Dne().method_d410254f_Dne()).entrySet()) { Map.Entry entry = (Map.Entry) obj;
                this.field_6a0474ed_FWm.add("S " + (String)entry.getKey());
                this.field_7eb83e1f_bzF.add(this.field_3791671_Dne.method_4868f6e1_Dne((String)entry.getValue(), this.field_21260d_FWm - 220));
            }
        }
        this.field_364ee65_Dne = new Agm(this);
    }

    static List method_51dd63c8_Dne(RKa rKa) {
        return rKa.field_6a0474ed_FWm;
    }

    static List method_554595e7_FWm(RKa rKa) {
        return rKa.field_7eb83e1f_bzF;
    }
}

