package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class Onb
implements PAf {
    private final String field_569fcf45_Dne;

    public Onb(String string) {
        this.field_569fcf45_Dne = string;
        PAf.field_83b1c1b0_Dne.put(string, this);
    }

    @Override
    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public int method_ea14417e_Dne(List list) {
        return 0;
    }
}

