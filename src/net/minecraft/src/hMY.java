package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class hMY
implements ZfC {
    private Tfm field_36d8db1_Dne = new Tfm();
    private Qnq field_36c4f18_Dne;
    private qMV field_37a5bd2_Dne;
    private List field_f27c122c_Dne = new ArrayList();

    @Override
    public EyB method_2849cfe9_Dne(Qnq qnq, String string, int n, int n2, int n3) {
        return null;
    }

    @Override
    public void method_7a46289a_Dne() {
    }

    @Override
    public String method_eecad346_Dne() {
        return "MultiplayerChunkCache: " + this.field_36d8db1_Dne.method_7a46288d_Dne();
    }

    @Override
    public qMV method_90569c11_Dne(int n, int n2) {
        qMV qMV2 = (qMV)this.field_36d8db1_Dne.method_20ed7708_Dne(Sxs.method_16cca6e_Dne(n, n2));
        return qMV2 == null ? this.field_37a5bd2_Dne : qMV2;
    }

    @Override
    public boolean method_5f7a671f_Dne(boolean bl, TaY taY) {
        return true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_f27c122c_Dne.size();
    }

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
    }

    @Override
    public boolean method_16cca7e_Dne(int n, int n2) {
        return true;
    }

    @Override
    public void method_a5c3b570_Dne(ZfC zfC, int n, int n2) {
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    public hMY(Qnq qnq) {
        this.field_37a5bd2_Dne = new BJH(qnq, 0, 0);
        this.field_36c4f18_Dne = qnq;
    }

    public void method_1e269659_FWm(int n, int n2) {
        qMV qMV2 = this.method_90569c11_Dne(n, n2);
        if (!qMV2.method_7a46289e_Dne()) {
            qMV2.method_907a9d21_Qnq();
        }
        this.field_36d8db1_Dne.method_a2a9a4e7_FWm(Sxs.method_16cca6e_Dne(n, n2));
        this.field_f27c122c_Dne.remove(qMV2);
    }

    @Override
    public List method_c5f979a2_Dne(Icc icc, int n, int n2, int n3) {
        return null;
    }

    @Override
    public qMV method_e1796070_FWm(int n, int n2) {
        qMV qMV2 = new qMV(this.field_36c4f18_Dne, n, n2);
        this.field_36d8db1_Dne.method_b9998ac6_Dne(Sxs.method_16cca6e_Dne(n, n2), qMV2);
        qMV2.field_21261e_FWm = true;
        return qMV2;
    }
}

