package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.TreeMap;

class GBu
extends LSv {
    final Utr field_36e3739_Dne;
    private TreeMap field_36ba99ee_Dne;
    private ArrayList field_dc9cb15_Dne;

    @Override
    protected int method_7a46288d_Dne() {
        return this.field_dc9cb15_Dne.size();
    }

    public GBu(Utr utr) {
        super(utr.field_493682ed_Dne, utr.field_21260d_FWm, utr.field_2e5f1b_bzF, 32, utr.field_2e5f1b_bzF - 65 + 4, 18);
        this.field_36e3739_Dne = utr;
        this.field_36ba99ee_Dne = irb.method_2310d392_Dne().method_a3f0160d_Dne();
        this.field_dc9cb15_Dne = new ArrayList();
        for (Object obj : this.field_36ba99ee_Dne.keySet()) {String string = (String) obj;
            this.field_dc9cb15_Dne.add(string);
        }
    }

    @Override
    protected void method_16d0a4b_Dne(int n, boolean bl) {
        irb.method_2310d392_Dne().method_5ab48f70_Dne((String)this.field_dc9cb15_Dne.get(n), false);
        this.field_36e3739_Dne.field_493682ed_Dne.field_3791671_Dne.method_ce7f9d7a_Dne(irb.method_2310d392_Dne().method_7a46289e_Dne());
        Utr.method_75fd3830_Dne((Utr)this.field_36e3739_Dne).field_c480ca78_bzF = (String)this.field_dc9cb15_Dne.get(n);
        this.field_36e3739_Dne.field_3791671_Dne.method_117d59bb_FWm(irb.method_110c4dc7_FWm(Utr.method_75fd3830_Dne((Utr)this.field_36e3739_Dne).field_c480ca78_bzF));
        Utr.method_75eda75b_Dne((Utr)this.field_36e3739_Dne).field_569fcf45_Dne = irb.method_2310d392_Dne().method_39193c_Dne("gui.done");
        Utr.method_75fd3830_Dne(this.field_36e3739_Dne).method_7c6f6039_FWm();
    }

    @Override
    protected void method_7a46289a_Dne() {
        this.field_36e3739_Dne.method_a98a0660_aFZ();
    }

    @Override
    protected void method_8a73475f_Dne(int n, int n2, int n3, int n4, WAR wAR) {
        this.field_36e3739_Dne.field_3791671_Dne.method_117d59bb_FWm(true);
        this.field_36e3739_Dne.method_32faf66d_Dne(this.field_36e3739_Dne.field_3791671_Dne, (String)this.field_36ba99ee_Dne.get(this.field_dc9cb15_Dne.get(n)), this.field_36e3739_Dne.field_21260d_FWm / 2, n3 + 1, 0xFFFFFF);
        this.field_36e3739_Dne.field_3791671_Dne.method_117d59bb_FWm(irb.method_110c4dc7_FWm(Utr.method_75fd3830_Dne((Utr)this.field_36e3739_Dne).field_c480ca78_bzF));
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return ((String)this.field_dc9cb15_Dne.get(n)).equals(irb.method_2310d392_Dne().method_eecad346_Dne());
    }

    @Override
    protected int method_ae128dba_bzF() {
        return this.method_7a46288d_Dne() * 18;
    }
}

