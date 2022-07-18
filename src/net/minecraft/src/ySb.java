package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ySb
extends ipD {
    private final Nlm field_36ae9fd_Dne = new lCr(this);

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        this.field_36ae9fd_Dne.method_8d4fb917_Dne(wkD);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_36ae9fd_Dne.method_7a46289a_Dne();
        super.method_7a46289a_Dne();
    }

    @Override
    public boolean method_16cca7e_Dne(int n, int n2) {
        return this.field_36ae9fd_Dne.method_ce7f5dad_Dne(n) ? true : super.method_16cca7e_Dne(n, n2);
    }

    @Override
    public NER method_2303e2b0_Dne() {
        WkD wkD = new WkD();
        this.method_66a36cd8_FWm(wkD);
        wkD.method_8f501fe4_Dne("SpawnPotentials");
        return new ipQ(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, 1, wkD);
    }

    public Nlm method_2304785c_Dne() {
        return this.field_36ae9fd_Dne;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.field_36ae9fd_Dne.method_66a36cd8_FWm(wkD);
    }
}

