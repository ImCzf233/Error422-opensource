package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class vAP
extends zKP {
    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_4976bda6_TKg.field_267cf5_Qnq;
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 3;
    }

    public vAP(int n) {
        super(n, KFd.field_5e526bea_Qnq);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n != 1 && n != 0 ? super.method_9051f17a_Dne(n, n2) : zKP.field_5e67d9b4_Qnq.method_77cd08ea_FWm(n);
    }
}

