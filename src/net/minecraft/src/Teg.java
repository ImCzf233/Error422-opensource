package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.security.Permission;

class Teg
implements OcS {
    private static Permission field_80a404c_bzF;
    private ThreadLocal field_a322c2de_FWm;
    private ThreadLocal field_9fba90bf_Dne = new ThreadLocal();
    private static Permission field_d7b22819_Dne;
    private static Permission field_5212cd9a_FWm;
    private static Permission field_a08d8bb2_Qnq;

    static {
        field_d7b22819_Dne = new nzX(pvQ.field_569fcf45_Dne, "threadLocalEcImplicitlyCa");
        field_5212cd9a_FWm = new nzX(pvQ.field_569fcf45_Dne, "ecImplicitlyCa");
        field_80a404c_bzF = new nzX(pvQ.field_569fcf45_Dne, "threadLocalDhDefaultParams");
        field_a08d8bb2_Qnq = new nzX(pvQ.field_569fcf45_Dne, "DhDefaultParams");
    }

    Teg() {
        this.field_a322c2de_FWm = new ThreadLocal();
    }
}

