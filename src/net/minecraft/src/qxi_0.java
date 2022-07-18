package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Arrays;
import net.minecraft.client.FWm;
import net.minecraft.client.Minecraft;

/*
 * Renamed from QXI
 */
public class qxi_0 {
    public static ArrayList field_dc9cb15_Dne;
    public static char[] field_3f1c583_Dne;
    public static Minecraft field_493682ed_Dne;
    public static char[] field_4039e04_FWm;
    public static float field_2092ab_Dne;
    public static RAN field_36c164d_Dne;
    public static boolean field_2092bf_Dne;
    public static FWm field_9144b3de_Dne;
    public static String[] field_f5e54dca_Dne;
    public static ArrayList<zKP> field_8f85f8f4_FWm;
    public static NMq field_202441f9_FWm;
    public static PJQ field_36b4fb5_Dne;
    public static Frame field_9eb08ffb_Dne;
    public static ArrayList field_c61a1f02_bzF;
    public static String field_569fcf45_Dne;
    public static hdK field_376997d_Dne;
    public static NMq field_36a761a_Dne;
    public static float field_21260a_FWm;

    public static void method_7c6f6039_FWm() {
        field_9144b3de_Dne.setSize(qxi_0.field_493682ed_Dne.field_2092ae_Dne + 25, qxi_0.field_493682ed_Dne.field_21260d_FWm);
        qxi_0.field_493682ed_Dne.field_2092bf_Dne = true;
        qxi_0.field_493682ed_Dne.field_2e5f2c_bzF = true;
        field_9144b3de_Dne.removeAll();
        field_9144b3de_Dne.setLayout(new BorderLayout());
        field_9144b3de_Dne.add((Component)new cbQ(), "Center");
        field_9144b3de_Dne.validate();
    }

    public static NMq method_23040479_Dne() {
        NMq nMq;
        if (field_202441f9_FWm == null) {
            Object e = field_dc9cb15_Dne.get(eCD.method_ce7f5d9c_Dne(field_dc9cb15_Dne.size()));
            nMq = field_202441f9_FWm = e instanceof zKP ? new NMq((zKP)e, 1) : new NMq((dEr)e, 1);
        } else {
            nMq = field_202441f9_FWm;
            field_202441f9_FWm = null;
        }
        return nMq;
    }

    public static zKP method_2317f94c_Dne() {
        zKP zKP2 = (zKP)field_8f85f8f4_FWm.get(eCD.method_ce7f5d9c_Dne(field_8f85f8f4_FWm.size()));
        return zKP2;
    }

    public static void method_7a46289a_Dne() {
        for (RAN rAN : jwh_0.method_2302cf90_Dne().field_836263a8_Dne) {
            if (rAN.field_2c197105_Qnq.size() <= 0) continue;
            field_36c164d_Dne = rAN;
            for (Object e : rAN.field_2c197105_Qnq) {
                field_36b4fb5_Dne = (PJQ)e;
            }
        }
    }

    static {
        field_493682ed_Dne = Minecraft.method_81a5f12e_Dne();
        field_3f1c583_Dne = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~\u2302\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1".toCharArray();
        field_4039e04_FWm = "0123456789".toCharArray();
        field_f5e54dca_Dne = "tile.sapling tile.tallgrass tile.null tile.flower tile.rose tile.mushroom tile.crops tile.ladder tile.button tile.reeds tile.litpumpkin tile.trapdoor tile.vine tile.waterlily tile.tripWireSource tile.tripWire".split(" ");
        field_569fcf45_Dne = String.format("1.%s.%s", Character.valueOf(field_4039e04_FWm[eCD.method_ce7f5d9c_Dne(field_4039e04_FWm.length)]), Character.valueOf(field_4039e04_FWm[eCD.method_ce7f5d9c_Dne(field_4039e04_FWm.length)]));
        field_dc9cb15_Dne = new ArrayList();
        field_8f85f8f4_FWm = new ArrayList();
        field_c61a1f02_bzF = new ArrayList();
        field_36a761a_Dne = new NMq(zKP.field_f0b029e5_zGp, 1);
        for (SXd object : SXd.field_83633108_Dne) {
            if (object == null) continue;
            field_c61a1f02_bzF.add(object);
        }
        for (zKP zKP2 : zKP.field_8374b848_Dne) {
            if (zKP2 != null && !Arrays.asList(field_f5e54dca_Dne).contains(zKP2.method_6859cdb9_bzF())) {
                field_8f85f8f4_FWm.add(zKP2);
                field_dc9cb15_Dne.add(zKP2);
                continue;
            }
            if (zKP2 == null) continue;
            field_dc9cb15_Dne.add(zKP2);
        }
        for (dEr dEr2 : dEr.field_836aa5b6_Dne) {
            if (dEr2 == null) continue;
            field_dc9cb15_Dne.add(dEr2);
        }
    }
}

