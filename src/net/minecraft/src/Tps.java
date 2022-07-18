package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tps
extends jsv {
    public List field_f27c122c_Dne = new ArrayList();
    public List field_6a0474ed_FWm;
    public ZLf field_36fe578_Dne;
    public ArrayList field_dc9cb15_Dne = new ArrayList();

    public Tps(Random random, int n, int n2) {
        super(random, n, n2);
        for (ZLf zLf : etZ.method_56fe7054_Dne()) {
            zLf.field_21260d_FWm = 0;
            this.field_f27c122c_Dne.add(zLf);
        }
        this.field_6a0474ed_FWm = new ArrayList();
        for (ZLf zLf : etZ.method_30522415_FWm()) {
            zLf.field_21260d_FWm = 0;
            this.field_6a0474ed_FWm.add(zLf);
        }
    }
}

