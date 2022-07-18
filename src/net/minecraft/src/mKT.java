package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.codecs.CodecWav;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class mKT {
    private ikJ field_3772804_Dne = new ikJ();
    public static SoundSystem field_a378b605_Dne;
    private Set field_83b48b6a_Dne;
    private ikJ field_75bef5f1_bzF;
    private ikJ field_2030f3e3_FWm = new ikJ();
    private fZI field_3758af7_Dne;
    private static boolean field_2092bf_Dne;
    private List field_f27c122c_Dne;
    private int field_21260d_FWm;
    private int field_2092ae_Dne = 0;
    private Random field_7331eae7_Dne;

    public void method_c3169827_Dne(String string, float f, float f2, float f3, float f4, float f5, int n) {
        this.field_f27c122c_Dne.add(new IUq(string, f, f2, f3, f4, f5, n));
    }

    public void method_7a1f7bfe_Dne(String string, sMa sMa2, float f, float f2, boolean bl) {
        if (sMa2 != null && field_2092bf_Dne && (this.field_3758af7_Dne.field_21260a_FWm != 0.0f || string == null)) {
            String string2 = "entity_" + sMa2.field_2d29f4_aFZ;
            if (this.field_83b48b6a_Dne.contains(string2)) {
                this.method_bb7dd820_Dne(sMa2);
            } else {
                if (field_a378b605_Dne.playing(string2)) {
                    field_a378b605_Dne.stop(string2);
                }
                if (string == null) {
                    return;
                }
                OfD ofD = this.field_3772804_Dne.method_284e1388_Dne(string);
                if (ofD != null && f > 0.0f) {
                    float f3 = 16.0f;
                    if (f > 1.0f) {
                        f3 *= f;
                    }
                    field_a378b605_Dne.newSource(bl, string2, ofD.field_3bdb143a_Dne, ofD.field_569fcf45_Dne, false, (float)sMa2.field_2f0dd3_div, (float)sMa2.field_22c5fd_IjH, (float)sMa2.field_334487_mrb, 2, f3);
                    field_a378b605_Dne.setLooping(string2, true);
                    field_a378b605_Dne.setPitch(string2, f2);
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    field_a378b605_Dne.setVolume(string2, f * this.field_3758af7_Dne.field_21260a_FWm);
                    field_a378b605_Dne.setVelocity(string2, (float)sMa2.field_291868_XHL, (float)sMa2.field_2a9ad1_Zpi, (float)sMa2.field_31b811_kGO);
                    field_a378b605_Dne.play(string2);
                    this.field_83b48b6a_Dne.add(string2);
                }
            }
        }
    }

    public mKT() {
        this.field_75bef5f1_bzF = new ikJ();
        this.field_83b48b6a_Dne = new HashSet();
        this.field_f27c122c_Dne = new ArrayList();
        this.field_7331eae7_Dne = new Random();
        this.field_21260d_FWm = this.field_7331eae7_Dne.nextInt(12000);
    }

    public void method_d4bea65c_Dne(String string, float f, float f2, float f3, float f4, float f5) {
        OfD ofD;
        if (field_2092bf_Dne && this.field_3758af7_Dne.field_21260a_FWm != 0.0f && (ofD = this.field_3772804_Dne.method_284e1388_Dne(string)) != null && f4 > 0.0f) {
            this.field_2092ae_Dne = (this.field_2092ae_Dne + 1) % 256;
            String string2 = "sound_" + this.field_2092ae_Dne;
            float f6 = 16.0f;
            if (f4 > 1.0f) {
                f6 *= f4;
            }
            field_a378b605_Dne.newSource(f4 > 1.0f, string2, ofD.field_3bdb143a_Dne, ofD.field_569fcf45_Dne, false, f, f2, f3, 2, f6);
            field_a378b605_Dne.setPitch(string2, f5);
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            field_a378b605_Dne.setVolume(string2, f4 * this.field_3758af7_Dne.field_21260a_FWm);
            if (eCD.method_ce7f5d9c_Dne(100) == 0) {
                if (eCD.method_ce7f5d9c_Dne(2) == 0) {
                    field_a378b605_Dne.setPitch(string2, 0.0f);
                } else {
                    field_a378b605_Dne.setPitch(string2, 2.0f);
                }
                if (sRv.field_2092bf_Dne) {
                    qxi_0.field_493682ed_Dne.field_369f6b6_Dne.method_47a073d1_bzF("Sound was played with random pitch.");
                }
            }
            field_a378b605_Dne.play(string2);
        }
    }

    public void method_bb7dd820_Dne(sMa sMa2) {
        this.method_2964ec5a_Dne(sMa2, sMa2);
    }

    public boolean method_bb7dd824_Dne(sMa sMa2) {
        if (sMa2 != null && field_2092bf_Dne) {
            String string = "entity_" + sMa2.field_2d29f4_aFZ;
            return field_a378b605_Dne.playing(string);
        }
        return false;
    }

    public void method_a98a0660_aFZ() {
        for (Object obj : this.field_83b48b6a_Dne) {String string = (String) obj;
            field_a378b605_Dne.pause(string);
        }
    }

    public void method_fbd4aee4_Dne(String string, float f, float f2) {
        OfD ofD;
        if (field_2092bf_Dne && this.field_3758af7_Dne.field_21260a_FWm != 0.0f && (ofD = this.field_3772804_Dne.method_284e1388_Dne(string)) != null) {
            this.field_2092ae_Dne = (this.field_2092ae_Dne + 1) % 256;
            String string2 = "sound_" + this.field_2092ae_Dne;
            field_a378b605_Dne.newSource(false, string2, ofD.field_3bdb143a_Dne, ofD.field_569fcf45_Dne, false, 0.0f, 0.0f, 0.0f, 0, 0.0f);
            if (f > 1.0f) {
                f = 1.0f;
            }
            field_a378b605_Dne.setPitch(string2, f2);
            field_a378b605_Dne.setVolume(string2, (f *= 0.25f) * this.field_3758af7_Dne.field_21260a_FWm);
            field_a378b605_Dne.play(string2);
        }
    }

    static {
        field_2092bf_Dne = false;
    }

    public void method_7ec1955c_Dne(String string, float f, float f2, float f3) {
        if (field_2092bf_Dne && (this.field_3758af7_Dne.field_21260a_FWm != 0.0f || string == null)) {
            OfD ofD;
            String string2 = "streaming";
            if (field_a378b605_Dne.playing(string2)) {
                field_a378b605_Dne.stop(string2);
            }
            if (string != null && (ofD = this.field_2030f3e3_FWm.method_284e1388_Dne(string)) != null) {
                if (field_a378b605_Dne.playing("BgMusic")) {
                    field_a378b605_Dne.stop("BgMusic");
                }
                float f4 = 16.0f;
                field_a378b605_Dne.newStreamingSource(true, string2, ofD.field_3bdb143a_Dne, ofD.field_569fcf45_Dne, false, f, f2, f3, 2, f4 * 4.0f);
                field_a378b605_Dne.setVolume(string2, 0.5f * this.field_3758af7_Dne.field_21260a_FWm);
                field_a378b605_Dne.play(string2);
            }
        }
    }

    public void method_56057ff_FWm(sMa sMa2, float f) {
        String string;
        if (sMa2 != null && field_2092bf_Dne && field_2092bf_Dne && this.field_3758af7_Dne.field_21260a_FWm != 0.0f && field_a378b605_Dne.playing(string = "entity_" + sMa2.field_2d29f4_aFZ)) {
            field_a378b605_Dne.setPitch(string, f);
        }
    }

    public void method_94d18be1_FWm(sMa sMa2) {
        String string;
        if (sMa2 != null && field_2092bf_Dne && this.field_83b48b6a_Dne.contains(string = "entity_" + sMa2.field_2d29f4_aFZ)) {
            if (field_a378b605_Dne.playing(string)) {
                field_a378b605_Dne.stop(string);
            }
            this.field_83b48b6a_Dne.remove(string);
        }
    }

    public void method_b43d93a0_Dne(sMa sMa2, float f) {
        String string;
        if (sMa2 != null && field_2092bf_Dne && field_2092bf_Dne && this.field_3758af7_Dne.field_21260a_FWm != 0.0f && field_a378b605_Dne.playing(string = "entity_" + sMa2.field_2d29f4_aFZ)) {
            field_a378b605_Dne.setVolume(string, f * this.field_3758af7_Dne.field_21260a_FWm);
        }
    }

    public void method_7ccd8a5b_Dne(String string, File file) {
        this.field_3772804_Dne.method_eb936a7f_Dne(string, file);
    }

    public void method_ae128dc7_bzF() {
    }

    private void method_b0a28144_div() {
        try {
            float f = this.field_3758af7_Dne.field_21260a_FWm;
            float f2 = this.field_3758af7_Dne.field_2092ab_Dne;
            this.field_3758af7_Dne.field_21260a_FWm = 0.0f;
            this.field_3758af7_Dne.field_2092ab_Dne = 0.0f;
            this.field_3758af7_Dne.method_7c6f6039_FWm();
            SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
            SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
            SoundSystemConfig.setCodec("mus", Lrh.class);
            SoundSystemConfig.setCodec("wav", CodecWav.class);
            field_a378b605_Dne = new SoundSystem();
            wlK wlK2 = new wlK();
            wlK2.method_7a46289a_Dne();
            this.field_3758af7_Dne.field_21260a_FWm = f;
            this.field_3758af7_Dne.field_2092ab_Dne = f2;
            this.field_3758af7_Dne.method_7c6f6039_FWm();
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            System.err.println("error linking with the LibraryJavaSound plug-in");
        }
        field_2092bf_Dne = true;
    }

    public void method_7ad38803_DyG() {
        if (!this.field_f27c122c_Dne.isEmpty()) {
            Iterator iterator = this.field_f27c122c_Dne.iterator();
            while (iterator.hasNext()) {
                IUq iUq = (IUq)iterator.next();
                --iUq.field_2092ae_Dne;
                if (iUq.field_2092ae_Dne > 0) continue;
                this.method_d4bea65c_Dne(iUq.field_569fcf45_Dne, iUq.field_2092ab_Dne, iUq.field_21260a_FWm, iUq.field_2e5f18_bzF, iUq.field_267cf2_Qnq, iUq.field_2d29f1_aFZ);
                iterator.remove();
            }
        }
    }

    public void method_7a46289a_Dne() {
        if (!(field_2092bf_Dne || this.field_3758af7_Dne.field_21260a_FWm == 0.0f && this.field_3758af7_Dne.field_2092ab_Dne == 0.0f)) {
            this.method_b0a28144_div();
        }
        if (field_2092bf_Dne) {
            if (this.field_3758af7_Dne.field_2092ab_Dne == 0.0f) {
                field_a378b605_Dne.stop("BgMusic");
                field_a378b605_Dne.stop("streaming");
            } else {
                field_a378b605_Dne.setVolume("BgMusic", this.field_3758af7_Dne.field_2092ab_Dne);
                field_a378b605_Dne.setVolume("streaming", this.field_3758af7_Dne.field_2092ab_Dne);
            }
        }
    }

    public void method_bcb1fb88_bzF(String string, File file) {
    }

    public void method_a5fb20b2_Dne(fZI fZI2) {
        this.field_2030f3e3_FWm.field_2092bf_Dne = false;
        this.field_3758af7_Dne = fZI2;
        if (!(field_2092bf_Dne || fZI2 != null && fZI2.field_21260a_FWm == 0.0f && fZI2.field_2092ab_Dne == 0.0f)) {
            this.method_b0a28144_div();
        }
    }

    public void method_d44b4592_zGp() {
        for (Object obj : this.field_83b48b6a_Dne) {String string = (String) obj;
            field_a378b605_Dne.play(string);
        }
    }

    public void method_740ba292_Dne(FUH fUH, float f) {
        if (field_2092bf_Dne && this.field_3758af7_Dne.field_21260a_FWm != 0.0f && fUH != null) {
            float f2 = fUH.field_31b813_kGO + (fUH.field_29186a_XHL - fUH.field_31b813_kGO) * f;
            float f3 = fUH.field_2a9ad3_Zpi + (fUH.field_334489_mrb - fUH.field_2a9ad3_Zpi) * f;
            double d = fUH.field_2d29ef_aFZ + (fUH.field_2f0dd3_div - fUH.field_2d29ef_aFZ) * (double)f;
            double d2 = fUH.field_388da1_zGp + (fUH.field_22c5fd_IjH - fUH.field_388da1_zGp) * (double)f;
            double d3 = fUH.field_20b852_DyG + (fUH.field_334487_mrb - fUH.field_20b852_DyG) * (double)f;
            float f4 = geR.method_117d0e97_FWm(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
            float f5 = geR.method_ce7f5256_Dne(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
            float f6 = -f5;
            float f7 = -geR.method_ce7f5256_Dne(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
            float f8 = -f4;
            float f9 = 0.0f;
            float f10 = 1.0f;
            float f11 = 0.0f;
            field_a378b605_Dne.setListenerPosition((float)d, (float)d2, (float)d3);
            field_a378b605_Dne.setListenerOrientation(f6, f7, f8, f9, f10, f11);
        }
    }

    public void method_2964ec5a_Dne(sMa sMa2, sMa sMa3) {
        String string = "entity_" + sMa2.field_2d29f4_aFZ;
        if (this.field_83b48b6a_Dne.contains(string)) {
            if (field_a378b605_Dne.playing(string)) {
                field_a378b605_Dne.setPosition(string, (float)sMa3.field_2f0dd3_div, (float)sMa3.field_22c5fd_IjH, (float)sMa3.field_334487_mrb);
                field_a378b605_Dne.setVelocity(string, (float)sMa3.field_291868_XHL, (float)sMa3.field_2a9ad1_Zpi, (float)sMa3.field_31b811_kGO);
            } else {
                this.field_83b48b6a_Dne.remove(string);
            }
        }
    }

    public void method_1d5885fa_FWm(String string, File file) {
        this.field_2030f3e3_FWm.method_eb936a7f_Dne(string, file);
    }

    public void method_7c6f6039_FWm() {
        if (field_2092bf_Dne) {
            field_a378b605_Dne.cleanup();
        }
    }

    public void method_907a9d21_Qnq() {
        for (Object obj : this.field_83b48b6a_Dne) {String string = (String) obj;
            field_a378b605_Dne.stop(string);
        }
        this.field_83b48b6a_Dne.clear();
    }
}

