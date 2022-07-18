package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bqd
implements RXf {
    private final dLs field_37472c1_Dne;
    private boolean field_21261e_FWm = false;
    private boolean field_2092bf_Dne = false;
    private static final SocketAddress field_28085168_Dne = new InetSocketAddress("127.0.0.1", 0);
    private final List field_f27c122c_Dne = Collections.synchronizedList(new ArrayList());
    private bqd field_3741317_Dne;
    private Object[] field_322705c_Dne;
    private String field_569fcf45_Dne = "";
    private pPV field_379f2b6_Dne;

    @Override
    public void method_907a9d21_Qnq() {
        this.field_3741317_Dne = null;
        this.field_379f2b6_Dne = null;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 0;
    }

    public void method_a07820d2_Dne(bqd bqd2) {
        this.field_3741317_Dne = bqd2;
        bqd2.field_3741317_Dne = this;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_21261e_FWm;
    }

    public boolean method_7a46289e_Dne() {
        return !this.field_2092bf_Dne && this.field_3741317_Dne != null;
    }

    @Override
    public void method_feb678cd_Dne(String string, Object ... objectArray) {
        this.field_2092bf_Dne = true;
        this.field_569fcf45_Dne = string;
        this.field_322705c_Dne = objectArray;
    }

    public void method_5536af4d_FWm(NER nER) {
        if (nER.method_7a46289e_Dne() && this.field_379f2b6_Dne.method_7a46289e_Dne()) {
            nER.method_b68494b1_Dne(this.field_379f2b6_Dne);
        } else {
            this.field_f27c122c_Dne.add(nER);
        }
    }

    @Override
    public void method_7c6f6039_FWm() {
        int n = 2500;
        while (n-- >= 0 && !this.field_f27c122c_Dne.isEmpty()) {
            NER nER = (NER)this.field_f27c122c_Dne.remove(0);
            nER.method_b68494b1_Dne(this.field_379f2b6_Dne);
        }
        if (this.field_f27c122c_Dne.size() > n) {
            this.field_37472c1_Dne.method_110c4dc3_FWm("Memory connection overburdened; after processing 2500 packets, we still have " + this.field_f27c122c_Dne.size() + " to go!");
        }
        if (this.field_2092bf_Dne && this.field_f27c122c_Dne.isEmpty()) {
            this.field_379f2b6_Dne.method_feb678cd_Dne(this.field_569fcf45_Dne, this.field_322705c_Dne);
        }
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_21261e_FWm = bl;
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_2092bf_Dne = true;
    }

    @Override
    public void method_7a46289a_Dne() {
    }

    public bqd method_230da176_Dne() {
        return this.field_3741317_Dne;
    }

    @Override
    public void method_7be2fb8c_Dne(NER nER) {
        if (!this.field_2092bf_Dne) {
            this.field_3741317_Dne.method_5536af4d_FWm(nER);
        }
    }

    @Override
    public SocketAddress method_81c690a9_Dne() {
        return field_28085168_Dne;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        this.field_379f2b6_Dne = pPV2;
    }

    public bqd(dLs dLs2, pPV pPV2) {
        this.field_379f2b6_Dne = pPV2;
        this.field_37472c1_Dne = dLs2;
    }
}

