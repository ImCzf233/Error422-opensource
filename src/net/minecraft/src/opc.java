package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Random;

public class opc
extends dSy {
    public final int field_2092ae_Dne;
    public final boolean field_2092bf_Dne;
    public ArrayList field_c61a1f02_bzF;
    public final tgc field_37c1c1c_Dne;
    public ArrayList<pok> field_dc9cb15_Dne;
    public pok field_37a69a0_Dne;
    public ArrayList field_8f85f8f4_FWm = new ArrayList();

    public opc(tgc tgc2, int n, Random random, int n2, int n3, ArrayList arrayList, int n4) {
        super(null, 0, random, n2, n3);
        this.field_c61a1f02_bzF = new ArrayList();
        this.field_37c1c1c_Dne = tgc2;
        this.field_dc9cb15_Dne = arrayList;
        this.field_2092ae_Dne = n4;
        OdI odI = tgc2.method_90477c37_Dne(n2, n3);
        this.field_2092bf_Dne = odI == OdI.field_75b309e5_bzF || odI == OdI.field_35ca9ce1_ATE;
        this.field_379f80a_Dne = this;
    }

    public tgc method_2315aa7b_Dne() {
        return this.field_37c1c1c_Dne;
    }
}

