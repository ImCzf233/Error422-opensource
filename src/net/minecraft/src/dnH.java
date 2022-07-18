package net.minecraft.src;
import java.io.IOException;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.net.Socket;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.crypto.SecretKey;

public class dnH
extends pPV {
    private int field_2092ae_Dne = 0;
    private boolean field_2e5f2c_bzF = false;
    private String field_d9a85c6_FWm = "";
    private static Random field_7331eae7_Dne = new Random();
    private final jwh_0 field_3694131_Dne;
    private SecretKey field_8d2d5db0_Dne = null;
    private volatile boolean field_21261e_FWm = false;
    private String field_569fcf45_Dne = null;
    public final Qyp field_36c7844_Dne;
    private byte[] field_3f1c582_Dne;
    public boolean field_2092bf_Dne = false;

    @Override
    public void method_8a3594ca_Dne(VPw vPw) {
    }

    @Override
    public void method_feb678cd_Dne(String string, Object[] objectArray) {
        this.field_3694131_Dne.method_230e0120_Dne().method_8f501fe4_Dne(this.method_eecad346_Dne() + " lost connection");
        this.field_2092bf_Dne = true;
    }

    static jwh_0 method_41b2989f_Dne(dnH dnH2) {
        return dnH2.field_3694131_Dne;
    }

    @Override
    public void method_b5121a40_Dne(nsl nsl2) {
        PrivateKey privateKey = this.field_3694131_Dne.method_7af00974_Dne().getPrivate();
        this.field_8d2d5db0_Dne = nsl2.method_645503e0_Dne(privateKey);
        if (!Arrays.equals(this.field_3f1c582_Dne, nsl2.method_b8d82fb2_Dne(privateKey))) {
            this.method_8f501fe4_Dne("Invalid client reply");
        }
        this.field_36c7844_Dne.method_7be2fb8c_Dne(new nsl());
    }

    @Override
    public void method_721f46e7_Dne(Gle gle) {
        if (gle.field_2092ae_Dne == 0) {
            if (this.field_2e5f2c_bzF) {
                this.method_8f501fe4_Dne("Duplicate login");
                return;
            }
            this.field_2e5f2c_bzF = true;
            if (this.field_3694131_Dne.method_cd4cb3d9_udO()) {
                new VkM(this).start();
            } else {
                this.field_21261e_FWm = true;
            }
        }
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne != null ? this.field_569fcf45_Dne + " [" + this.field_36c7844_Dne.method_81c690a9_Dne().toString() + "]" : this.field_36c7844_Dne.method_81c690a9_Dne().toString();
    }

    static SecretKey method_37a8c382_Dne(dnH dnH2) {
        return dnH2.field_8d2d5db0_Dne;
    }

    @Override
    public void method_6dd7ca7f_bzF(NER nER) {
        this.method_8f501fe4_Dne("Protocol error");
    }

    public void method_8f501fe4_Dne(String string) {
        try {
            this.field_3694131_Dne.method_230e0120_Dne().method_8f501fe4_Dne("Disconnecting " + this.method_eecad346_Dne() + ": " + string);
            this.field_36c7844_Dne.method_7be2fb8c_Dne(new yZV(string));
            this.field_36c7844_Dne.method_ae128dc7_bzF();
            this.field_2092bf_Dne = true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void method_7c6f6039_FWm() {
        String string = this.field_3694131_Dne.method_230ea953_Dne().method_9e765aef_Dne(this.field_36c7844_Dne.method_81c690a9_Dne(), this.field_569fcf45_Dne);
        if (string != null) {
            this.method_8f501fe4_Dne(string);
        } else {
            PJQ pJQ = this.field_3694131_Dne.method_230ea953_Dne().method_284e205e_Dne(this.field_569fcf45_Dne);
            if (pJQ != null) {
                this.field_3694131_Dne.method_230ea953_Dne().method_207cbea3_Dne(this.field_36c7844_Dne, pJQ);
            }
        }
        this.field_2092bf_Dne = true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    static String method_8deca0f6_FWm(dnH dnH2) {
        return dnH2.field_569fcf45_Dne;
    }

    public void method_7a46289a_Dne() {
        if (this.field_21261e_FWm) {
            this.method_7c6f6039_FWm();
        }
        if (this.field_2092ae_Dne++ == 600) {
            this.method_8f501fe4_Dne("Took too long to log in");
        } else {
            this.field_36c7844_Dne.method_7c6f6039_FWm();
        }
    }

    public dnH(jwh_0 jwh_02, Socket socket, String string) throws IOException {
        this.field_3694131_Dne = jwh_02;
        this.field_36c7844_Dne = new Qyp(jwh_02.method_230e0120_Dne(), socket, string, this, jwh_02.method_7af00974_Dne().getPrivate());
        this.field_36c7844_Dne.field_2092ae_Dne = 0;
    }

    @Override
    public void method_b85e3f5f_Dne(prJ prJ2) {
        try {
            Object object;
            dzN dzN2 = this.field_3694131_Dne.method_230ea953_Dne();
            String string = null;
            if (prJ2.field_2092ae_Dne == 1) {
                object = Arrays.asList(1, 61, this.field_3694131_Dne.method_4a7b1d9f_Qnq(), this.field_3694131_Dne.method_a8d4a4de_kGO(), dzN2.method_7c6f602c_FWm(), dzN2.method_ae128dba_bzF());
                Iterator iterator = ((List<Object>) object).iterator();
                while (iterator.hasNext()) {
                    Object e = iterator.next();
                    string = string == null ? "\u00a7" : string + "\u0000";
                    string = string + e.toString().replaceAll("\u0000", "");
                }
            } else {
                string = this.field_3694131_Dne.method_a8d4a4de_kGO() + "\u00a7" + dzN2.method_7c6f602c_FWm() + "\u00a7" + dzN2.method_ae128dba_bzF();
            }
            object = null;
            if (this.field_36c7844_Dne.method_f6d64cb9_Dne() != null) {
                object = this.field_36c7844_Dne.method_f6d64cb9_Dne().getInetAddress();
            }
            this.field_36c7844_Dne.method_7be2fb8c_Dne(new yZV(string));
            this.field_36c7844_Dne.method_ae128dc7_bzF();
            if (object != null && this.field_3694131_Dne.method_230496c1_Dne() instanceof ysI) {
                ((ysI)this.field_3694131_Dne.method_230496c1_Dne()).method_fc8367a8_Dne((InetAddress)object);
            }
            this.field_2092bf_Dne = true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void method_ac15f484_Dne(ike ike2) {
        this.field_569fcf45_Dne = ike2.method_eecad346_Dne();
        if (!this.field_569fcf45_Dne.equals(vCA.method_39193c_Dne(this.field_569fcf45_Dne))) {
            this.method_8f501fe4_Dne("Invalid username!");
        } else {
            PublicKey publicKey = this.field_3694131_Dne.method_7af00974_Dne().getPublic();
            if (ike2.method_7c6f602c_FWm() != 61) {
                if (ike2.method_7c6f602c_FWm() > 61) {
                    this.method_8f501fe4_Dne("Outdated server!");
                } else {
                    this.method_8f501fe4_Dne("Outdated client!");
                }
            } else {
                this.field_d9a85c6_FWm = this.field_3694131_Dne.method_cd4cb3d9_udO() ? Long.toString(field_7331eae7_Dne.nextLong(), 16) : "-";
                this.field_3f1c582_Dne = new byte[4];
                field_7331eae7_Dne.nextBytes(this.field_3f1c582_Dne);
                this.field_36c7844_Dne.method_7be2fb8c_Dne(new GJK(this.field_d9a85c6_FWm, publicKey, this.field_3f1c582_Dne));
            }
        }
    }

    static String method_c3c87a97_Dne(dnH dnH2) {
        return dnH2.field_d9a85c6_FWm;
    }

    static boolean method_d1b006cf_Dne(dnH dnH2, boolean bl) {
        dnH2.field_21261e_FWm = bl;
        return dnH2.field_21261e_FWm;
    }
}

