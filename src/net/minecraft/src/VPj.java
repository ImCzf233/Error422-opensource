package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class VPj {
    private final String field_569fcf45_Dne;
    private final String field_d9a85c6_FWm;

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public VPj(String string, Object object) {
        this.field_569fcf45_Dne = string;
        if (object == null) {
            this.field_d9a85c6_FWm = "~~NULL~~";
        } else if (object instanceof Throwable) {
            Throwable throwable = (Throwable)object;
            this.field_d9a85c6_FWm = "~~ERROR~~ " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage();
        } else {
            this.field_d9a85c6_FWm = object.toString();
        }
    }

    public String method_d1f1ed87_FWm() {
        return this.field_d9a85c6_FWm;
    }
}

