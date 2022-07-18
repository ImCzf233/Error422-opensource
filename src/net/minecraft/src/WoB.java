package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class WoB
extends RuntimeException {
    private Object[] field_322705c_Dne;

    public WoB(String string, Object ... objectArray) {
        super(string);
        this.field_322705c_Dne = objectArray;
    }

    public Object[] method_7057ec7b_Dne() {
        return this.field_322705c_Dne;
    }
}

