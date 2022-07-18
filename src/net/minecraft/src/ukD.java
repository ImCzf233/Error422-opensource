package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ukD {
    private vwN field_37d3e5f_Dne;
    private List field_f27c122c_Dne;
    private Timer field_6aaa0ca7_Dne = new Timer();
    private boolean field_21261e_FWm = false;
    private volatile boolean field_2092bf_Dne = false;
    private LwS field_36a2764_Dne;

    public synchronized void method_7c6f6039_FWm() {
        this.field_2092bf_Dne = true;
        this.field_36a2764_Dne.cancel();
        this.field_6aaa0ca7_Dne.cancel();
    }

    public synchronized boolean method_7a46289e_Dne() {
        return this.field_21261e_FWm;
    }

    static void method_7e9b16aa_Dne(ukD ukD2, List list) {
        ukD2.method_ea14418b_Dne(list);
    }

    static boolean method_c0811bbd_Dne(ukD ukD2) {
        return ukD2.field_2092bf_Dne;
    }

    public synchronized List method_adea226d_Dne() {
        return Collections.unmodifiableList(this.field_f27c122c_Dne);
    }

    private synchronized void method_ea14418b_Dne(List list) {
        if (!list.equals(this.field_f27c122c_Dne)) {
            this.field_f27c122c_Dne = list;
            this.field_21261e_FWm = true;
        }
    }

    static vwN method_1e55185d_Dne(ukD ukD2) {
        return ukD2.field_37d3e5f_Dne;
    }

    public synchronized void method_7a46289a_Dne() {
        this.field_21261e_FWm = false;
    }

    public ukD(vwN vwN2) {
        this.field_f27c122c_Dne = new ArrayList();
        this.field_37d3e5f_Dne = vwN2;
        this.field_36a2764_Dne = new LwS(this, null);
        this.field_6aaa0ca7_Dne.schedule((TimerTask)this.field_36a2764_Dne, 0L, 10000L);
    }
}

