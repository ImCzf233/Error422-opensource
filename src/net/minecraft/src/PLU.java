package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class PLU
extends sHZ {
    private static gUw[][] field_23f9d83_Dne = new gUw[255][];
    String field_569fcf45_Dne;

    @Override
    boolean method_bb343406_Dne(sHZ sHZ2) {
        return !(sHZ2 instanceof PLU) ? false : this.field_569fcf45_Dne.equals(((PLU)sHZ2).field_569fcf45_Dne);
    }

    public String toString() {
        return this.method_eecad346_Dne();
    }

    public PLU(String string) {
        if (!PLU.method_8f501fe8_Dne(string)) {
            throw new IllegalArgumentException("string " + string + " not an OID");
        }
        this.field_569fcf45_Dne = string;
    }

    private static boolean method_8f501fe8_Dne(String string) {
        if (string.length() >= 3 && string.charAt(1) == '.') {
            char c = string.charAt(0);
            if (c >= '0' && c <= '2') {
                boolean bl = false;
                for (int i = string.length() - 1; i >= 2; --i) {
                    char c2 = string.charAt(i);
                    if ('0' <= c2 && c2 <= '9') {
                        bl = true;
                        continue;
                    }
                    if (c2 != '.') {
                        return false;
                    }
                    if (!bl) {
                        return false;
                    }
                    bl = false;
                }
                return bl;
            }
            return false;
        }
        return false;
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    @Override
    public int hashCode() {
        return this.field_569fcf45_Dne.hashCode();
    }
}

