package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class JhS {
    protected CLK field_3656daa_Dne;
    protected LinkedList<bvz> field_3dc2cc53_Dne = new LinkedList();

    public LinkedList<bvz> method_d9e7d4_Dne() {
        return this.field_3dc2cc53_Dne;
    }

    public CLK method_22fefc09_Dne() {
        return this.field_3656daa_Dne;
    }

    public void method_f28ef3a0_Dne(Qnq qnq, Random random, CLK cLK) {
        Iterator iterator = this.field_3dc2cc53_Dne.iterator();
        while (iterator.hasNext()) {
            bvz bvz2 = (bvz)iterator.next();
            if (!bvz2.method_22fefc09_Dne().method_697d22a9_Dne(cLK) || bvz2.method_f28ef3a4_Dne(qnq, random, cLK)) continue;
            iterator.remove();
        }
    }

    protected void method_7a46289a_Dne() {
        this.field_3656daa_Dne = CLK.method_22fefc09_Dne();
        for (bvz bvz2 : this.field_3dc2cc53_Dne) {
            this.field_3656daa_Dne.method_697d22a5_Dne(bvz2.method_22fefc09_Dne());
        }
    }

    protected void method_37de135f_Dne(Qnq qnq, Random random, int n, int n2) {
        int n3 = n2 - n + 1 - this.field_3656daa_Dne.method_7c6f602c_FWm();
        boolean bl = true;
        int n4 = n3 > 1 ? n + random.nextInt(n3) : n;
        int n5 = n4 - this.field_3656daa_Dne.field_21260d_FWm;
        this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, n5, 0);
        for (bvz bvz2 : this.field_3dc2cc53_Dne) {
            bvz2.method_22fefc09_Dne().method_2c2cf7c9_Dne(0, n5, 0);
        }
    }

    public boolean method_7a46289e_Dne() {
        return true;
    }

    protected void method_c7fee424_Dne(Qnq qnq, Random random, int n) {
        int n2 = 63 - n;
        int n3 = this.field_3656daa_Dne.method_7c6f602c_FWm() + 1;
        if (n3 < n2) {
            n3 += random.nextInt(n2 - n3);
        }
        int n4 = n3 - this.field_3656daa_Dne.field_2d29f4_aFZ;
        this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, n4, 0);
        for (bvz bvz2 : this.field_3dc2cc53_Dne) {
            bvz2.method_22fefc09_Dne().method_2c2cf7c9_Dne(0, n4, 0);
        }
    }
}

