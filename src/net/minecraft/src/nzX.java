package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

public class nzX
extends BasicPermission {
    private final int field_2092ae_Dne;
    private final String field_569fcf45_Dne;

    public nzX(String string) {
        super(string);
        this.field_569fcf45_Dne = "all";
        this.field_2092ae_Dne = 15;
    }

    public nzX(String string, String string2) {
        super(string, string2);
        this.field_569fcf45_Dne = string2;
        this.field_2092ae_Dne = this.method_8f501fd7_Dne(string2);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof nzX)) {
            return false;
        }
        nzX nzX2 = (nzX)object;
        return this.field_2092ae_Dne == nzX2.field_2092ae_Dne && this.getName().equals(nzX2.getName());
    }

    @Override
    public boolean implies(Permission permission) {
        if (!(permission instanceof nzX)) {
            return false;
        }
        if (!this.getName().equals(permission.getName())) {
            return false;
        }
        nzX nzX2 = (nzX)permission;
        return (this.field_2092ae_Dne & nzX2.field_2092ae_Dne) == nzX2.field_2092ae_Dne;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + this.field_2092ae_Dne;
    }

    @Override
    public String getActions() {
        return this.field_569fcf45_Dne;
    }

    private int method_8f501fd7_Dne(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(wdv.method_39193c_Dne(string), " ,");
        int n = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String string2 = stringTokenizer.nextToken();
            if (string2.equals("threadlocalecimplicitlyca")) {
                n |= 1;
                continue;
            }
            if (string2.equals("ecimplicitlyca")) {
                n |= 2;
                continue;
            }
            if (string2.equals("threadlocaldhdefaultparams")) {
                n |= 4;
                continue;
            }
            if (string2.equals("dhdefaultparams")) {
                n |= 8;
                continue;
            }
            if (!string2.equals("all")) continue;
            n |= 0xF;
        }
        if (n == 0) {
            throw new IllegalArgumentException("unknown permissions passed to mask");
        }
        return n;
    }
}

