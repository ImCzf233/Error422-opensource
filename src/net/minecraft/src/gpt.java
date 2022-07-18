package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class gpt
extends sAy {
    private List field_f27c122c_Dne = new ArrayList();

    @Override
    protected JhS method_90454696_Dne(int n, int n2) {
        return new mfU(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n, n2);
    }

    public List method_adea226d_Dne() {
        return this.field_f27c122c_Dne;
    }

    public gpt() {
        this.field_f27c122c_Dne.add(new oIf(hlo.class, 10, 2, 3));
        this.field_f27c122c_Dne.add(new oIf(eBi.class, 5, 4, 4));
        this.field_f27c122c_Dne.add(new oIf(yxx_0.class, 10, 4, 4));
        this.field_f27c122c_Dne.add(new oIf(WDT.class, 3, 4, 4));
    }

    @Override
    protected boolean method_16cca7e_Dne(int n, int n2) {
        int n3 = n >> 4;
        int n4 = n2 >> 4;
        this.field_7331eae7_Dne.setSeed((long)(n3 ^ n4 << 4) ^ this.field_36c4f18_Dne.method_7a46288e_Dne());
        this.field_7331eae7_Dne.nextInt();
        return this.field_7331eae7_Dne.nextInt(3) != 0 ? false : (n != (n3 << 4) + 4 + this.field_7331eae7_Dne.nextInt(8) ? false : n2 == (n4 << 4) + 4 + this.field_7331eae7_Dne.nextInt(8));
    }
}

