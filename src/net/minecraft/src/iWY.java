package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

final class iWY
implements Lkt {
    private final Stack field_698ab9c4_Dne = new Stack();
    private Xix field_36f6bc5_Dne;

    @Override
    public void method_8f501fe4_Dne(String string) {
        hta hta2 = hta.method_23106696_Dne().method_633120fc_Dne(tsF.method_284a9a95_Dne(string));
        ((Yxt)this.field_698ab9c4_Dne.peek()).method_aade1df2_Dne(hta2);
        this.field_698ab9c4_Dne.push(new nMv(this, hta2));
    }

    @Override
    public void method_7c6f6039_FWm() {
    }

    bab method_230d6528_Dne() {
        return (bab)this.field_36f6bc5_Dne.method_23030725_Dne();
    }

    @Override
    public void method_b0a28144_div() {
        this.method_6853b9c1_FWm(tsF.method_f87f4a43_FWm());
    }

    @Override
    public void method_a98a0660_aFZ() {
        EWS eWS = tsF.method_23000f0a_Dne();
        this.method_8f000600_Dne(eWS);
        this.field_698ab9c4_Dne.push(new eSM(this, eWS));
    }

    iWY() {
    }

    private void method_6853b9c1_FWm(Xix xix) {
        ((Yxt)this.field_698ab9c4_Dne.peek()).method_8f000600_Dne(xix);
    }

    @Override
    public void method_7ad38803_DyG() {
        this.field_698ab9c4_Dne.pop();
    }

    @Override
    public void method_d44b4592_zGp() {
        this.field_698ab9c4_Dne.pop();
    }

    @Override
    public void method_ae128dc7_bzF() {
        JHZ jHZ = tsF.method_23021d6f_Dne();
        this.method_8f000600_Dne(jHZ);
        this.field_698ab9c4_Dne.push(new vbd(this, jHZ));
    }

    @Override
    public void method_7a46289a_Dne() {
    }

    @Override
    public void method_907a9d21_Qnq() {
        this.field_698ab9c4_Dne.pop();
    }

    @Override
    public void method_8288d6ee_IjH() {
        this.method_6853b9c1_FWm(tsF.method_229500d1_bzF());
    }

    private void method_8f000600_Dne(Xix xix) {
        if (this.field_36f6bc5_Dne == null) {
            this.field_36f6bc5_Dne = xix;
        } else {
            this.method_6853b9c1_FWm(xix);
        }
    }

    @Override
    public void method_47a073d1_bzF(String string) {
        this.method_6853b9c1_FWm(tsF.method_284a9a95_Dne(string));
    }

    @Override
    public void method_110c4dc3_FWm(String string) {
        this.method_6853b9c1_FWm(tsF.method_28523c6e_Dne(string));
    }

    @Override
    public void method_c073daf8_mrb() {
        this.method_6853b9c1_FWm(tsF.method_2308fa24_Dne());
    }
}

