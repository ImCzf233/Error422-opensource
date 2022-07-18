package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Suj {
    protected Random field_7331eae7_Dne = new Random();
    protected Qnq field_36c4f18_Dne;
    protected int field_2092ae_Dne = 8;

    public void method_8e161084_Dne(ZfC zfC, Qnq qnq, int n, int n2, byte[] byArray) {
        int n3 = this.field_2092ae_Dne;
        this.field_36c4f18_Dne = qnq;
        this.field_7331eae7_Dne.setSeed(qnq.method_7a46288e_Dne());
        long l = this.field_7331eae7_Dne.nextLong();
        long l2 = this.field_7331eae7_Dne.nextLong();
        for (int i = n - n3; i <= n + n3; ++i) {
            for (int j = n2 - n3; j <= n2 + n3; ++j) {
                long l3 = (long)i * l;
                long l4 = (long)j * l2;
                this.field_7331eae7_Dne.setSeed(l3 ^ l4 ^ qnq.method_7a46288e_Dne());
                this.method_8632d3da_Dne(qnq, i, j, n, n2, byArray);
            }
        }
    }

    protected void method_8632d3da_Dne(Qnq qnq, int n, int n2, int n3, int n4, byte[] byArray) {
    }
}

