package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class rBY
implements gnI {
    private StringBuffer field_4f166b65_Dne = new StringBuffer();
    public static final rBY field_37aa743_Dne = new rBY();

    public void method_7a46289a_Dne() {
        this.field_4f166b65_Dne.setLength(0);
    }

    @Override
    public String method_98148f73_Dne(String string, Object ... objectArray) {
        return irb.method_2310d392_Dne().method_98148f73_Dne(string, objectArray);
    }

    @Override
    public String method_193de2e9_a_() {
        return "Rcon";
    }

    public String method_d1f1ed87_FWm() {
        return this.field_4f166b65_Dne.toString();
    }

    @Override
    public iSh method_23105fed_Dne() {
        return new iSh(0, 0, 0);
    }

    @Override
    public void method_8f501fe4_Dne(String string) {
        this.field_4f166b65_Dne.append(string);
    }

    @Override
    public boolean method_fa81cf37_Dne(int n, String string) {
        return true;
    }
}

