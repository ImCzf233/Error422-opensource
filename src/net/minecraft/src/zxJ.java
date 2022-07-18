package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class zxJ {
    public static final int[] field_6d92991_zGp;
    public static final int[] field_4a92422_Qnq;
    public static final int[] field_5781703_aFZ;
    public static final int[][] field_7a46ee0e_Dne;
    public static final int[] field_3f1c589_Dne;
    public static final int[] field_3f65500_DyG;
    public static final int[] field_59d86bc_bzF;
    public static final int[] field_4039e0a_FWm;
    public static final String[] field_f5e54dca_Dne;

    public static int method_16a71cd_Dne(double d, double d2) {
        return geR.method_7ed96eaf_Qnq((float)d) > geR.method_7ed96eaf_Qnq((float)d2) ? (d > 0.0 ? 1 : 3) : (d2 > 0.0 ? 2 : 0);
    }

    static {
        field_3f1c589_Dne = new int[]{0, -1, 0, 1};
        field_4039e0a_FWm = new int[]{1, 0, -1, 0};
        field_f5e54dca_Dne = new String[]{"SOUTH", "WEST", "NORTH", "EAST"};
        field_59d86bc_bzF = new int[]{3, 4, 2, 5};
        field_4a92422_Qnq = new int[]{-1, -1, 2, 0, 1, 3};
        field_5781703_aFZ = new int[]{2, 3, 0, 1};
        field_6d92991_zGp = new int[]{1, 2, 3, 0};
        field_3f65500_DyG = new int[]{3, 0, 1, 2};
        field_7a46ee0e_Dne = new int[][]{{1, 0, 3, 2, 5, 4}, {1, 0, 5, 4, 2, 3}, {1, 0, 2, 3, 4, 5}, {1, 0, 4, 5, 3, 2}};
    }
}

