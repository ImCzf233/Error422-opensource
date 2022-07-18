package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class JCd
extends RsG {
    public uCl field_37c0a6e_Dne;

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        String string = wkD.method_39193c_Dne("Motive");
        for (uCl uCl2 : uCl.values()) {
            if (!uCl2.field_569fcf45_Dne.equals(string)) continue;
            this.field_37c0a6e_Dne = uCl2;
        }
        if (this.field_37c0a6e_Dne == null) {
            this.field_37c0a6e_Dne = uCl.field_37c0a6e_Dne;
        }
        super.method_66a36cd8_FWm(wkD);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        wkD.method_abaa98ae_Dne("Motive", this.field_37c0a6e_Dne.field_569fcf45_Dne);
        super.method_8d4fb917_Dne(wkD);
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.method_2cda29ee_Dne(new NMq(dEr.field_ce0badb_ICU), 0.0f);
    }

    public JCd(Qnq qnq, int n, int n2, int n3, int n4) {
        super(qnq, n, n2, n3, n4);
        ArrayList<uCl> arrayList = new ArrayList<uCl>();
        uCl[] uClArray = uCl.values();
        int n5 = uClArray.length;
        for (int i = 0; i < n5; ++i) {
            uCl uCl2;
            this.field_37c0a6e_Dne = uCl2 = uClArray[i];
            this.method_ce7f5da9_Dne(n4);
            if (!this.method_907a9d25_Qnq()) continue;
            arrayList.add(uCl2);
        }
        if (!arrayList.isEmpty()) {
            this.field_37c0a6e_Dne = (uCl)((Object)arrayList.get(this.field_7331eae7_Dne.nextInt(arrayList.size())));
        }
        this.method_ce7f5da9_Dne(n4);
    }

    public JCd(Qnq qnq) {
        super(qnq);
    }

    @Override
    public int method_ae128dba_bzF() {
        return this.field_37c0a6e_Dne.field_2e5f1b_bzF;
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_37c0a6e_Dne.field_21260d_FWm;
    }

    public JCd(Qnq qnq, int n, int n2, int n3, int n4, String string) {
        this(qnq, n, n2, n3, n4);
        for (uCl uCl2 : uCl.values()) {
            if (!uCl2.field_569fcf45_Dne.equals(string)) continue;
            this.field_37c0a6e_Dne = uCl2;
            break;
        }
        this.method_ce7f5da9_Dne(n4);
    }
}

