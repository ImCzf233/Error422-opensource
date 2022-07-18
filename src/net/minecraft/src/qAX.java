package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class qAX
extends ZgW {
    public qAX(int n) {
        super(n);
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        if (n2 > 3) {
            n2 = 3;
        }
        return random.nextInt(10 - n2 * 3) == 0 ? dEr.field_cb97e05f_haP.field_267cf5_Qnq : this.field_21260d_FWm;
    }
}

