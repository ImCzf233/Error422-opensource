package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class nwv
extends Thread {
    final wWl field_37d3e40_Dne;

    @Override
    public void run() {
        mNp mNp2 = new mNp(wWl.method_62e18fed_Dne((wWl)this.field_37d3e40_Dne).field_37d3e5f_Dne);
        try {
            wWl.method_9982049b_Dne(this.field_37d3e40_Dne, mNp2.method_7a46288d_Dne());
        }
        catch (Exception exception) {
            wWl.method_9982049b_Dne(this.field_37d3e40_Dne, 0);
        }
    }

    nwv(wWl wWl2) {
        this.field_37d3e40_Dne = wWl2;
    }
}

