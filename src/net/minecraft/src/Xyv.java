package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class Xyv {
    private static List field_f27c122c_Dne;
    private static List field_2c197105_Qnq;
    private static List field_7eb83e1f_bzF;
    private static List field_6a0474ed_FWm;
    private static int field_2092ae_Dne;

    public static synchronized int[] method_16c585b_Dne(int n) {
        if (n <= 256) {
            if (field_f27c122c_Dne.isEmpty()) {
                int[] nArray = new int[256];
                field_6a0474ed_FWm.add(nArray);
                return nArray;
            }
            int[] nArray = (int[])field_f27c122c_Dne.remove(field_f27c122c_Dne.size() - 1);
            field_6a0474ed_FWm.add(nArray);
            return nArray;
        }
        if (n > field_2092ae_Dne) {
            field_2092ae_Dne = n;
            field_7eb83e1f_bzF.clear();
            field_2c197105_Qnq.clear();
            int[] nArray = new int[field_2092ae_Dne];
            field_2c197105_Qnq.add(nArray);
            return nArray;
        }
        if (field_7eb83e1f_bzF.isEmpty()) {
            int[] nArray = new int[field_2092ae_Dne];
            field_2c197105_Qnq.add(nArray);
            return nArray;
        }
        int[] nArray = (int[])field_7eb83e1f_bzF.remove(field_7eb83e1f_bzF.size() - 1);
        field_2c197105_Qnq.add(nArray);
        return nArray;
    }

    static {
        field_2092ae_Dne = 256;
        field_f27c122c_Dne = new ArrayList();
        field_6a0474ed_FWm = new ArrayList();
        field_7eb83e1f_bzF = new ArrayList();
        field_2c197105_Qnq = new ArrayList();
    }

    public static synchronized void method_7a46289a_Dne() {
        if (!field_7eb83e1f_bzF.isEmpty()) {
            field_7eb83e1f_bzF.remove(field_7eb83e1f_bzF.size() - 1);
        }
        if (!field_f27c122c_Dne.isEmpty()) {
            field_f27c122c_Dne.remove(field_f27c122c_Dne.size() - 1);
        }
        field_7eb83e1f_bzF.addAll(field_2c197105_Qnq);
        field_f27c122c_Dne.addAll(field_6a0474ed_FWm);
        field_2c197105_Qnq.clear();
        field_6a0474ed_FWm.clear();
    }

    public static synchronized String method_eecad346_Dne() {
        return "cache: " + field_7eb83e1f_bzF.size() + ", tcache: " + field_f27c122c_Dne.size() + ", allocated: " + field_2c197105_Qnq.size() + ", tallocated: " + field_6a0474ed_FWm.size();
    }
}

