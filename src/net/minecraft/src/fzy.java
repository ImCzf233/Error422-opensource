package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.SecretKey;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class fzy
extends pPV {
    private Map field_83b1c1b0_Dne;
    public LLx field_3698a74_Dne = new LLx(null);
    public int field_2092ae_Dne = 20;
    Random field_7331eae7_Dne;
    private Minecraft field_493682ed_Dne;
    private RXf field_36c6f8c_Dne;
    private VzZ field_36ebf36_Dne;
    private boolean field_21261e_FWm = false;
    public String field_569fcf45_Dne;
    public List field_f27c122c_Dne;
    private qVZ field_37a7e17_Dne = null;
    private boolean field_2092bf_Dne = false;

    private static String method_39193c_Dne(String string) throws UnsupportedEncodingException {
        return URLEncoder.encode(string, "UTF-8");
    }

    private String method_f1ef10a8_Dne(String string, String string2, String string3) {
        try {
            URL uRL = new URL("http://session.minecraft.net/game/joinserver.jsp?user=" + fzy.method_39193c_Dne(string) + "&sessionId=" + fzy.method_39193c_Dne(string2) + "&serverId=" + fzy.method_39193c_Dne(string3));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRL.openStream()));
            String string4 = bufferedReader.readLine();
            bufferedReader.close();
            return string4;
        }
        catch (IOException iOException) {
            return iOException.toString();
        }
    }

    @Override
    public void method_7ccfd0e3_Dne(NVL nVL) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(nVL.field_2092ae_Dne);
        if (sMa2 != null) {
            sMa2.field_2a9ad6_Zpi = nVL.field_21260d_FWm;
            sMa2.field_31b816_kGO = nVL.field_2e5f1b_bzF;
            sMa2.field_36b0a9_udO = nVL.field_267cf5_Qnq;
            double d = (double)sMa2.field_2a9ad6_Zpi / 32.0;
            double d2 = (double)sMa2.field_31b816_kGO / 32.0 + 0.015625;
            double d3 = (double)sMa2.field_36b0a9_udO / 32.0;
            float f = (float)(nVL.field_2092a7_Dne * 360) / 256.0f;
            float f2 = (float)(nVL.field_212606_FWm * 360) / 256.0f;
            sMa2.method_ae1c3edf_Dne(d, d2, d3, f, f2, 3);
        }
    }

    public fzy(Minecraft minecraft, zHD zHD2) throws IOException {
        this.field_83b1c1b0_Dne = new HashMap();
        this.field_f27c122c_Dne = new ArrayList();
        this.field_7331eae7_Dne = new Random();
        this.field_493682ed_Dne = minecraft;
        this.field_36c6f8c_Dne = new bqd(minecraft.method_230e0120_Dne(), this);
        zHD2.method_23120b06_Dne().method_f7397a1c_Dne((bqd)this.field_36c6f8c_Dne, minecraft.field_37d3e5f_Dne.field_569fcf45_Dne);
    }

    @Override
    public void method_85063932_Dne(SPR sPR) {
        SFA sFA = this.field_36ebf36_Dne.method_23062a3d_Dne();
        YGE yGE = sPR.field_2092ae_Dne == 0 ? sFA.method_f276515d_FWm(sPR.field_569fcf45_Dne) : sFA.method_28522afe_Dne(sPR.field_569fcf45_Dne);
        if (sPR.field_2092ae_Dne == 0 || sPR.field_2092ae_Dne == 2) {
            yGE.method_8f501fe4_Dne(sPR.field_d9a85c6_FWm);
            yGE.method_110c4dc3_FWm(sPR.field_c480ca78_bzF);
            yGE.method_47a073d1_bzF(sPR.field_9e60dbde_Qnq);
            yGE.method_ce7f5da9_Dne(sPR.field_21260d_FWm);
        }
        if (sPR.field_2092ae_Dne == 0 || sPR.field_2092ae_Dne == 3) {
            for (Object obj : sPR.field_fb483cec_Dne) {String string = (String) obj;
                sFA.method_329d9786_Dne(string, yGE);
            }
        }
        if (sPR.field_2092ae_Dne == 4) {
            for (Object obj : sPR.field_fb483cec_Dne) {String string = (String) obj;
                sFA.method_acfe3d07_FWm(string, yGE);
            }
        }
        if (sPR.field_2092ae_Dne == 1) {
            sFA.method_8ebe9090_Dne(yGE);
        }
    }

    @Override
    public void method_6fbf82c0_Dne(FaB faB) {
        if ("MC|TPack".equals(faB.field_569fcf45_Dne)) {
            String[] stringArray = new String(faB.field_3f1c582_Dne).split("\u0000");
            String string = stringArray[0];
            if (stringArray[1].equals("16")) {
                if (this.field_493682ed_Dne.field_373a352_Dne.method_ae128dcb_bzF()) {
                    this.field_493682ed_Dne.field_373a352_Dne.method_8f501fe4_Dne(string);
                } else if (this.field_493682ed_Dne.field_373a352_Dne.method_7c6f603d_FWm()) {
                    this.field_493682ed_Dne.method_b88fcbd2_Dne(new sHC(new rtF(this, string), irb.method_2310d392_Dne().method_39193c_Dne("multiplayer.texturePrompt.line1"), irb.method_2310d392_Dne().method_39193c_Dne("multiplayer.texturePrompt.line2"), 0));
                }
            }
        } else if ("MC|TrList".equals(faB.field_569fcf45_Dne)) {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(faB.field_3f1c582_Dne));
            try {
                int n = dataInputStream.readInt();
                qVZ qVZ2 = this.field_493682ed_Dne.field_37a7e17_Dne;
                if (qVZ2 != null && qVZ2 instanceof VFk && n == this.field_493682ed_Dne.field_369f6b6_Dne.field_20257f3d_FWm.field_2092ae_Dne) {
                    YzO yzO = ((VFk)qVZ2).method_2309a95d_Dne();
                    ybO ybO2 = ybO.method_69e4010e_Dne(dataInputStream);
                    yzO.method_c6daaac1_Dne(ybO2);
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    @Override
    public void method_88cbbd66_Dne(UVb uVb) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(uVb.field_2092ae_Dne);
        if (sMa2 != null) {
            if (uVb.field_21260d_FWm == 1) {
                FUH fUH = (FUH)sMa2;
                fUH.method_ae128dc7_bzF();
            } else if (uVb.field_21260d_FWm == 2) {
                sMa2.method_b5f30bf3_gnI();
            } else if (uVb.field_21260d_FWm == 3) {
                FiG fiG = (FiG)sMa2;
                fiG.method_2d24817a_Dne(false, false, false);
            } else if (uVb.field_21260d_FWm != 4) {
                if (uVb.field_21260d_FWm == 6) {
                    this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(new zUL(this.field_493682ed_Dne.field_36ebf36_Dne, sMa2));
                } else if (uVb.field_21260d_FWm == 7) {
                    zUL zUL2 = new zUL(this.field_493682ed_Dne.field_36ebf36_Dne, sMa2, "magicCrit");
                    this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(zUL2);
                } else if (uVb.field_21260d_FWm != 5 || sMa2 instanceof hIH) {
                    // empty if block
                }
            }
        }
    }

    @Override
    public void method_b7d325d1_Dne(qHm qHm2) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(qHm2.field_2092ae_Dne);
        if (sMa2 != null) {
            sMa2.method_19b4c3a3_a_(qHm2.field_21260d_FWm, qHm2.method_23040479_Dne());
        }
    }

    @Override
    public void method_83db9163_Dne(RZL rZL) {
        MJs mJs = this.field_493682ed_Dne.field_369f6b6_Dne;
        if (rZL.field_2092ae_Dne == -1) {
            mJs.field_36a059b_Dne.method_7c61cf15_Dne(rZL.field_36a761a_Dne);
        } else {
            Object object;
            boolean bl = false;
            if (this.field_493682ed_Dne.field_37a7e17_Dne instanceof VXB) {
                object = (VXB)this.field_493682ed_Dne.field_37a7e17_Dne;
                boolean bl2 = bl = ((VXB)object).method_7a46288d_Dne() != JcN.field_6162a71f_Zpi.method_7a46288d_Dne();
            }
            if (rZL.field_2092ae_Dne == 0 && rZL.field_21260d_FWm >= 36 && rZL.field_21260d_FWm < 45) {
                object = mJs.field_36bb35e_Dne.method_9e7d935f_Dne(rZL.field_21260d_FWm).method_23040479_Dne();
                if (rZL.field_36a761a_Dne != null && (object == null || ((NMq)object).field_2092ae_Dne < rZL.field_36a761a_Dne.field_2092ae_Dne)) {
                    rZL.field_36a761a_Dne.field_21260d_FWm = 5;
                }
                mJs.field_36bb35e_Dne.method_6e3a6b66_Dne(rZL.field_21260d_FWm, rZL.field_36a761a_Dne);
            } else if (!(rZL.field_2092ae_Dne != mJs.field_20257f3d_FWm.field_2092ae_Dne || rZL.field_2092ae_Dne == 0 && bl)) {
                mJs.field_20257f3d_FWm.method_6e3a6b66_Dne(rZL.field_21260d_FWm, rZL.field_36a761a_Dne);
            }
        }
    }

    @Override
    public void method_a32e437b_Dne(eFM eFM2) {
        ipD ipD2;
        boolean bl = false;
        if (this.field_493682ed_Dne.field_36ebf36_Dne.method_2dee780_bzF(eFM2.field_2092ae_Dne, eFM2.field_21260d_FWm, eFM2.field_2e5f1b_bzF) && (ipD2 = this.field_493682ed_Dne.field_36ebf36_Dne.method_d98e681d_Dne(eFM2.field_2092ae_Dne, eFM2.field_21260d_FWm, eFM2.field_2e5f1b_bzF)) instanceof AjG) {
            AjG ajG = (AjG)ipD2;
            if (ajG.method_7a46289e_Dne()) {
                for (int i = 0; i < 4; ++i) {
                    ajG.field_f5e54dca_Dne[i] = eFM2.field_f5e54dca_Dne[i];
                }
                ajG.method_582b297_a_();
            }
            bl = true;
        }
        if (!bl && this.field_493682ed_Dne.field_369f6b6_Dne != null) {
            this.field_493682ed_Dne.field_369f6b6_Dne.method_8f501fe4_Dne("Unable to locate sign at " + eFM2.field_2092ae_Dne + ", " + eFM2.field_21260d_FWm + ", " + eFM2.field_2e5f1b_bzF);
        }
    }

    public fzy(Minecraft minecraft, String string, int n) throws UnknownHostException, IOException {
        this.field_83b1c1b0_Dne = new HashMap();
        this.field_f27c122c_Dne = new ArrayList();
        this.field_7331eae7_Dne = new Random();
        this.field_493682ed_Dne = minecraft;
        Socket socket = new Socket(InetAddress.getByName(string), n);
        this.field_36c6f8c_Dne = new Qyp(minecraft.method_230e0120_Dne(), socket, "Client", this);
    }

    public RXf method_2305fdeb_Dne() {
        return this.field_36c6f8c_Dne;
    }

    @Override
    public void method_84e495bc_Dne(Rle rle) {
        double d = (double)rle.field_21260d_FWm / 32.0;
        double d2 = (double)rle.field_2e5f1b_bzF / 32.0;
        double d3 = (double)rle.field_267cf5_Qnq / 32.0;
        xIh xIh2 = null;
        if (rle.field_2d29f4_aFZ == 1) {
            xIh2 = new xIh(this.field_36ebf36_Dne, d, d2, d3);
        }
        if (xIh2 != null) {
            xIh2.field_2a9ad6_Zpi = rle.field_21260d_FWm;
            xIh2.field_31b816_kGO = rle.field_2e5f1b_bzF;
            xIh2.field_36b0a9_udO = rle.field_267cf5_Qnq;
            xIh2.field_334489_mrb = 0.0f;
            xIh2.field_29186a_XHL = 0.0f;
            xIh2.field_2d29f4_aFZ = rle.field_2092ae_Dne;
            this.field_36ebf36_Dne.method_bb7dd824_Dne(xIh2);
        }
    }

    @Override
    public void method_b5121a40_Dne(nsl nsl2) {
        this.method_5536af4d_FWm(new Gle(0));
    }

    @Override
    public void method_886e8d53_Dne(Tnn tnn) {
        MJs mJs = this.field_493682ed_Dne.field_369f6b6_Dne;
        int n = tnn.field_2092ae_Dne;
        int n2 = tnn.field_21260d_FWm;
        if (n >= 0 && n < Tnn.field_f5e54dca_Dne.length && Tnn.field_f5e54dca_Dne[n] != null) {
            mJs.method_47a073d1_bzF(Tnn.field_f5e54dca_Dne[n]);
        }
        if (n == 1) {
            this.field_36ebf36_Dne.method_231798c9_Dne().method_117d59bb_FWm(true);
            this.field_36ebf36_Dne.method_ce7f5266_Dne(0.0f);
        } else if (n == 2) {
            this.field_36ebf36_Dne.method_231798c9_Dne().method_117d59bb_FWm(false);
            this.field_36ebf36_Dne.method_ce7f5266_Dne(1.0f);
        } else if (n == 3) {
            this.field_493682ed_Dne.field_36c390e_Dne.method_8d1afe0b_Dne(XHL.method_9e728e7e_Dne(n2));
        } else if (n == 4) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new gvM());
        } else if (n == 5) {
            fZI fZI2 = this.field_493682ed_Dne.field_3758af7_Dne;
            if (n2 == 0) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new yZI());
            } else if (n2 == 101) {
                this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_feb678cd_Dne("demo.help.movement", Keyboard.getKeyName(fZI2.field_37c9f9e_Dne.field_2092ae_Dne), Keyboard.getKeyName(fZI2.field_20366b7d_FWm.field_2092ae_Dne), Keyboard.getKeyName(fZI2.field_75c46d8b_bzF.field_2092ae_Dne), Keyboard.getKeyName(fZI2.field_5e660e65_Qnq.field_2092ae_Dne));
            } else if (n2 == 102) {
                this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_feb678cd_Dne("demo.help.jump", Keyboard.getKeyName(fZI2.field_714023e4_aFZ.field_2092ae_Dne));
            } else if (n2 == 103) {
                this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_feb678cd_Dne("demo.help.inventory", Keyboard.getKeyName(fZI2.field_f0ae5e96_zGp.field_2092ae_Dne));
            }
        } else if (n == 6) {
            this.field_36ebf36_Dne.method_62d7c9a6_Dne(mJs.field_2f0dd3_div, mJs.field_22c5fd_IjH + (double)mJs.method_59ee189_c_(), mJs.field_334487_mrb, "random.successful_hit", 0.18f, 0.45f, false);
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return this.field_493682ed_Dne != null && this.field_493682ed_Dne.field_36ebf36_Dne != null && this.field_493682ed_Dne.field_369f6b6_Dne != null && this.field_36ebf36_Dne != null;
    }

    @Override
    public void method_9e53e948_Dne(aig aig2) {
        if (aig2.field_2092ae_Dne >= 0 && aig2.field_2092ae_Dne < MOS.method_7a46288d_Dne()) {
            this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.field_2092ae_Dne = aig2.field_2092ae_Dne;
        }
    }

    @Override
    public void method_c496a13d_Dne(wwJ wwJ2) {
        if (wwJ2.method_ae128dcb_bzF()) {
            this.field_493682ed_Dne.field_36ebf36_Dne.method_c6d158dc_bzF(wwJ2.field_2092ae_Dne, wwJ2.field_2e5f1b_bzF, wwJ2.field_267cf5_Qnq, wwJ2.field_2d29f4_aFZ, wwJ2.field_21260d_FWm);
        } else {
            this.field_493682ed_Dne.field_36ebf36_Dne.method_57aed1c2_Qnq(wwJ2.field_2092ae_Dne, wwJ2.field_2e5f1b_bzF, wwJ2.field_267cf5_Qnq, wwJ2.field_2d29f4_aFZ, wwJ2.field_21260d_FWm);
        }
    }

    public void method_7c6f6039_FWm() {
        if (!this.field_2092bf_Dne && this.field_36c6f8c_Dne != null) {
            this.field_36c6f8c_Dne.method_7c6f6039_FWm();
        }
        if (this.field_36c6f8c_Dne != null) {
            this.field_36c6f8c_Dne.method_7a46289a_Dne();
        }
    }

    @Override
    public void method_bf9617de_Dne(uYm uYm2) {
        this.field_493682ed_Dne.field_36ebf36_Dne.method_ce7f616a_Dne(uYm2.field_388da7_zGp);
        this.field_493682ed_Dne.field_36ebf36_Dne.method_117d1dab_FWm(uYm2.field_20b858_DyG);
    }

    @Override
    public void method_7536b0fa_Dne(JGj jGj) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(jGj.field_2092ae_Dne);
        if (sMa2 != null) {
            sMa2.method_ce7f4362_Dne(jGj.field_2092a7_Dne);
        }
    }

    @Override
    public void method_8c438625_Dne(WXC wXC) {
        this.field_493682ed_Dne.field_369f6b6_Dne.method_2c02b146_Dne(wXC.field_2092ab_Dne, wXC.field_2092ae_Dne, wXC.field_21260d_FWm);
    }

    @Override
    public void method_bdc3b320_Dne(tXK tXK2) {
        for (int i = 0; i < tXK2.field_3f1c589_Dne.length; ++i) {
            this.field_36ebf36_Dne.method_77d29d94_FWm(tXK2.field_3f1c589_Dne[i]);
        }
    }

    @Override
    public void method_c1f3962a_Dne(wFl wFl2) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(wFl2.field_2092ae_Dne);
        if (sMa2 != null) {
            sMa2.method_76912e1e_aFZ((double)wFl2.field_21260d_FWm / 8000.0, (double)wFl2.field_2e5f1b_bzF / 8000.0, (double)wFl2.field_267cf5_Qnq / 8000.0);
        }
    }

    @Override
    public void method_8153cc94_Dne(QKM qKM) {
        MJs mJs = this.field_493682ed_Dne.field_369f6b6_Dne;
        this.method_6dd7ca7f_bzF(qKM);
        if (mJs.field_20257f3d_FWm != null && mJs.field_20257f3d_FWm.field_2092ae_Dne == qKM.field_2092ae_Dne) {
            mJs.field_20257f3d_FWm.method_16cca7a_Dne(qKM.field_21260d_FWm, qKM.field_2e5f1b_bzF);
        }
    }

    @Override
    public void method_a7033c4d_Dne(fmA fmA2) {
        if (fmA2.field_2092ae_Dne != this.field_493682ed_Dne.field_369f6b6_Dne.field_348572_qLR) {
            this.field_21261e_FWm = false;
            SFA sFA = this.field_36ebf36_Dne.method_23062a3d_Dne();
            this.field_36ebf36_Dne = new VzZ(this, new mrb(0L, fmA2.field_36eea90_Dne, false, this.field_493682ed_Dne.field_36ebf36_Dne.method_231798c9_Dne().method_907a9d25_Qnq(), fmA2.field_3778a39_Dne), fmA2.field_2092ae_Dne, fmA2.field_21260d_FWm, this.field_493682ed_Dne.field_365731d_Dne, this.field_493682ed_Dne.method_230e0120_Dne());
            this.field_36ebf36_Dne.method_847193d9_Dne(sFA);
            this.field_36ebf36_Dne.field_2d2a05_aFZ = true;
            this.field_493682ed_Dne.method_8c784131_Dne(this.field_36ebf36_Dne);
            this.field_493682ed_Dne.field_369f6b6_Dne.field_348572_qLR = fmA2.field_2092ae_Dne;
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new bcj(this));
        }
        this.field_493682ed_Dne.method_ce7f5da9_Dne(fmA2.field_2092ae_Dne);
        this.field_493682ed_Dne.field_36c390e_Dne.method_8d1afe0b_Dne(fmA2.field_36eea90_Dne);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_86ab9d33_Dne(SnO snO) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(snO.field_2092ae_Dne);
        if (sMa2 != null && snO.method_adea226d_Dne() != null) {
            sMa2.method_23123967_Dne().method_ea14418b_Dne(snO.method_adea226d_Dne());
        }
    }

    @Override
    public void method_c8f310a5_Dne(ziQ ziQ2) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(ziQ2.field_2092ae_Dne);
        if (sMa2 instanceof FUH) {
            NAx nAx = new NAx(ziQ2.field_2092a7_Dne, ziQ2.field_2092b8_Dne, ziQ2.field_212606_FWm);
            nAx.method_117d59bb_FWm(ziQ2.method_ae128dcb_bzF());
            ((FUH)sMa2).method_fe8e2b7b_Qnq(nAx);
        }
    }

    @Override
    public void method_665ee701_Dne(AQV aQV) {
        this.field_493682ed_Dne.field_36ebf36_Dne.method_62d7c9a6_Dne(aQV.method_7a462888_Dne(), aQV.method_7c6f6027_FWm(), aQV.method_ae128db5_bzF(), aQV.method_eecad346_Dne(), aQV.method_7a46288a_Dne(), aQV.method_7c6f6029_FWm(), false);
    }

    @Override
    public void method_7a823b94_Dne(LjQ ljQ) {
        SFA sFA = this.field_36ebf36_Dne.method_23062a3d_Dne();
        if (ljQ.field_569fcf45_Dne.length() == 0) {
            sFA.method_b3c88f83_Dne(ljQ.field_2092ae_Dne, null);
        } else {
            vfE vfE2 = sFA.method_285fce20_Dne(ljQ.field_569fcf45_Dne);
            sFA.method_b3c88f83_Dne(ljQ.field_2092ae_Dne, vfE2);
        }
    }

    @Override
    public void method_7ce8d14c_Dne(MwE mwE) {
        double d = (double)mwE.field_21260d_FWm / 32.0;
        double d2 = (double)mwE.field_2e5f1b_bzF / 32.0;
        double d3 = (double)mwE.field_267cf5_Qnq / 32.0;
        float f = (float)(mwE.field_2092a7_Dne * 360) / 256.0f;
        float f2 = (float)(mwE.field_212606_FWm * 360) / 256.0f;
        hIH hIH2 = new hIH(this.field_493682ed_Dne.field_36ebf36_Dne, mwE.field_569fcf45_Dne);
        hIH2.field_2a9ad6_Zpi = mwE.field_21260d_FWm;
        hIH2.field_2d29ef_aFZ = hIH2.field_36b0a4_udO = (double)hIH2.field_2a9ad6_Zpi;
        hIH2.field_31b816_kGO = mwE.field_2e5f1b_bzF;
        hIH2.field_388da1_zGp = hIH2.field_34225f_ooe = (double)hIH2.field_31b816_kGO;
        hIH2.field_36b0a9_udO = mwE.field_267cf5_Qnq;
        hIH2.field_20b852_DyG = hIH2.field_36714f_trS = (double)hIH2.field_36b0a9_udO;
        int n = mwE.field_2d29f4_aFZ;
        hIH2.field_36a059b_Dne.field_8360c375_Dne[hIH2.field_36a059b_Dne.field_2092ae_Dne] = n == 0 ? null : new NMq(n, 1, 0);
        hIH2.method_c38d48a4_Dne(d, d2, d3, f, f2);
        this.field_36ebf36_Dne.method_ad567471_Dne(mwE.field_2092ae_Dne, hIH2);
        List list = mwE.method_adea226d_Dne();
        if (list != null) {
            hIH2.method_23123967_Dne().method_ea14418b_Dne(list);
        }
    }

    @Override
    public void method_c2ec3d27_Dne(wXa wXa2) {
        sMa[] sMaArray;
        double d = (double)wXa2.field_21260d_FWm / 32.0;
        double d2 = (double)wXa2.field_2e5f1b_bzF / 32.0;
        double d3 = (double)wXa2.field_267cf5_Qnq / 32.0;
        sMa sMa2 = null;
        if (wXa2.field_33448c_mrb == 10) {
            sMa2 = Ebp.method_bde99596_Dne(this.field_36ebf36_Dne, d, d2, d3, wXa2.field_29186d_XHL);
        } else if (wXa2.field_33448c_mrb == 90) {
        	sMa sMa = this.method_9e7ee9d3_Dne(wXa2.field_29186d_XHL);
            if (sMa instanceof FiG) {
                sMa2 = new cQz(this.field_36ebf36_Dne, d, d2, d3, (FiG)sMa);
            }
            wXa2.field_29186d_XHL = 0;
        } else if (wXa2.field_33448c_mrb == 60) {
            sMa2 = new hhc(this.field_36ebf36_Dne, d, d2, d3);
        } else if (wXa2.field_33448c_mrb == 61) {
            sMa2 = new kxx_0(this.field_36ebf36_Dne, d, d2, d3);
        } else if (wXa2.field_33448c_mrb == 71) {
            sMa2 = new BPY(this.field_36ebf36_Dne, (int)d, (int)d2, (int)d3, wXa2.field_29186d_XHL);
            wXa2.field_29186d_XHL = 0;
        } else if (wXa2.field_33448c_mrb == 65) {
            sMa2 = new Hhj(this.field_36ebf36_Dne, d, d2, d3);
        } else if (wXa2.field_33448c_mrb == 72) {
            sMa2 = new UMP(this.field_36ebf36_Dne, d, d2, d3);
        } else if (wXa2.field_33448c_mrb == 76) {
            sMa2 = new zMx(this.field_36ebf36_Dne, d, d2, d3, null);
        } else if (wXa2.field_33448c_mrb == 63) {
            sMa2 = new iis(this.field_36ebf36_Dne, d, d2, d3, (double)wXa2.field_2d29f4_aFZ / 8000.0, (double)wXa2.field_388da6_zGp / 8000.0, (double)wXa2.field_20b857_DyG / 8000.0);
            wXa2.field_29186d_XHL = 0;
        } else if (wXa2.field_33448c_mrb == 64) {
            sMa2 = new Xzh(this.field_36ebf36_Dne, d, d2, d3, (double)wXa2.field_2d29f4_aFZ / 8000.0, (double)wXa2.field_388da6_zGp / 8000.0, (double)wXa2.field_20b857_DyG / 8000.0);
            wXa2.field_29186d_XHL = 0;
        } else if (wXa2.field_33448c_mrb == 66) {
            sMa2 = new YCH(this.field_36ebf36_Dne, d, d2, d3, (double)wXa2.field_2d29f4_aFZ / 8000.0, (double)wXa2.field_388da6_zGp / 8000.0, (double)wXa2.field_20b857_DyG / 8000.0);
            wXa2.field_29186d_XHL = 0;
        } else if (wXa2.field_33448c_mrb == 62) {
            sMa2 = new TCA(this.field_36ebf36_Dne, d, d2, d3);
        } else if (wXa2.field_33448c_mrb == 73) {
            sMa2 = new YgL((Qnq)this.field_36ebf36_Dne, d, d2, d3, wXa2.field_29186d_XHL);
            wXa2.field_29186d_XHL = 0;
        } else if (wXa2.field_33448c_mrb == 75) {
            sMa2 = new AEw(this.field_36ebf36_Dne, d, d2, d3);
            wXa2.field_29186d_XHL = 0;
        } else if (wXa2.field_33448c_mrb == 1) {
            sMa2 = new iMX(this.field_36ebf36_Dne, d, d2, d3);
        } else if (wXa2.field_33448c_mrb == 50) {
            sMa2 = new gqg(this.field_36ebf36_Dne, d, d2, d3, null);
        } else if (wXa2.field_33448c_mrb == 51) {
            sMa2 = new Ndk(this.field_36ebf36_Dne, d, d2, d3);
        } else if (wXa2.field_33448c_mrb == 2) {
            sMa2 = new JiM(this.field_36ebf36_Dne, d, d2, d3);
        } else if (wXa2.field_33448c_mrb == 70) {
            sMa2 = new CiF(this.field_36ebf36_Dne, d, d2, d3, wXa2.field_29186d_XHL & 0xFFFF, wXa2.field_29186d_XHL >> 16);
            wXa2.field_29186d_XHL = 0;
        }
        if (sMa2 != null) {
            ((sMa)sMa2).field_2a9ad6_Zpi = wXa2.field_21260d_FWm;
            ((sMa)sMa2).field_31b816_kGO = wXa2.field_2e5f1b_bzF;
            ((sMa)sMa2).field_36b0a9_udO = wXa2.field_267cf5_Qnq;
            ((sMa)sMa2).field_29186a_XHL = (float)(wXa2.field_2f0dd8_div * 360) / 256.0f;
            ((sMa)sMa2).field_334489_mrb = (float)(wXa2.field_22c602_IjH * 360) / 256.0f;
            sMaArray = ((sMa)sMa2).method_5709d0c1_Dne();
            if (sMaArray != null) {
                int n = wXa2.field_2092ae_Dne - ((sMa)sMa2).field_2d29f4_aFZ;
                for (int i = 0; i < sMaArray.length; ++i) {
                    sMaArray[i].field_2d29f4_aFZ += n;
                }
            }
            ((sMa)sMa2).field_2d29f4_aFZ = wXa2.field_2092ae_Dne;
            this.field_36ebf36_Dne.method_ad567471_Dne(wXa2.field_2092ae_Dne, sMa2);
            if (wXa2.field_29186d_XHL > 0) {
                sMa sMa3;
                if (wXa2.field_33448c_mrb == 60 && (sMa3 = this.method_9e7ee9d3_Dne(wXa2.field_29186d_XHL)) instanceof FUH) {
                    hhc hhc2 = (hhc)sMa2;
                    hhc2.field_75c313d2_bzF = sMa3;
                }
                ((sMa)sMa2).method_76912e1e_aFZ((double)wXa2.field_2d29f4_aFZ / 8000.0, (double)wXa2.field_388da6_zGp / 8000.0, (double)wXa2.field_20b857_DyG / 8000.0);
            }
        }
    }

    @Override
    public void method_a3adffc2_Dne(eNn eNn2) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(eNn2.field_2092ae_Dne);
        if (sMa2 != null) {
            float f = (float)(eNn2.field_2092a7_Dne * 360) / 256.0f;
            sMa2.method_117d0ea7_FWm(f);
        }
    }

    @Override
    public void method_a9825e0f_Dne(gzk gzk2) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(gzk2.field_2092ae_Dne);
        if (sMa2 instanceof FUH) {
            ((FUH)sMa2).method_4e07f70b_mrb(gzk2.field_2092a7_Dne);
        }
    }

    @Override
    public void method_b48a2f4b_Dne(niw niw2) {
        SFA sFA = this.field_36ebf36_Dne.method_23062a3d_Dne();
        vfE vfE2 = sFA.method_285fce20_Dne(niw2.field_d9a85c6_FWm);
        if (niw2.field_21260d_FWm == 0) {
            OHz oHz = sFA.method_938dc1b8_Dne(niw2.field_569fcf45_Dne, vfE2);
            oHz.method_143f9e1c_bzF(niw2.field_2092ae_Dne);
        } else if (niw2.field_21260d_FWm == 1) {
            sFA.method_8f501fe4_Dne(niw2.field_569fcf45_Dne);
        }
    }

    @Override
    public void method_b3124066_Dne(nPC nPC2) {
        for (int i = 0; i < nPC2.method_7c6f602c_FWm(); ++i) {
            int n = nPC2.method_ce7f5d9c_Dne(i);
            int n2 = nPC2.method_117d19dd_FWm(i);
            this.field_36ebf36_Dne.method_2c2d379a_Dne(n, n2, true);
            this.field_36ebf36_Dne.method_e2f11780_aFZ(n << 4, 0, n2 << 4, (n << 4) + 15, 256, (n2 << 4) + 15);
            qMV qMV2 = this.field_36ebf36_Dne.method_e1796070_FWm(n, n2);
            if (qMV2 == null) {
                this.field_36ebf36_Dne.method_2c2d379a_Dne(n, n2, true);
                qMV2 = this.field_36ebf36_Dne.method_e1796070_FWm(n, n2);
            }
            if (qMV2 == null) continue;
            qMV2.method_811b07f3_Dne(nPC2.method_16c5854_Dne(i), nPC2.field_3f1c589_Dne[i], nPC2.field_4039e0a_FWm[i], true);
            this.field_36ebf36_Dne.method_c6b5263a_Dne(n << 4, 0, n2 << 4, (n << 4) + 15, 256, (n2 << 4) + 15);
            if (this.field_36ebf36_Dne.field_3690d00_Dne instanceof lMz) continue;
            qMV2.method_7ad38803_DyG();
        }
    }

    public void method_7a46289a_Dne() {
        if (this.field_36c6f8c_Dne != null) {
            this.field_36c6f8c_Dne.method_7a46289a_Dne();
        }
        this.field_36c6f8c_Dne = null;
        this.field_36ebf36_Dne = null;
    }

    @Override
    public void method_7034561f_Dne(GJK gJK) {
        String string;
        String string2;
        String string3 = gJK.method_eecad346_Dne().trim();
        PublicKey publicKey = gJK.method_9fe3f37_Dne();
        SecretKey secretKey = Mjb.method_e6eb9cf1_Dne();
        if (!"-".equals(string3) && !"ok".equalsIgnoreCase(string2 = this.method_f1ef10a8_Dne(this.field_493682ed_Dne.field_37d3e5f_Dne.field_569fcf45_Dne, this.field_493682ed_Dne.field_37d3e5f_Dne.field_d9a85c6_FWm, string = new BigInteger(Mjb.method_685dbf5f_Dne(string3, publicKey, secretKey)).toString(16)))) {
            this.field_36c6f8c_Dne.method_feb678cd_Dne("disconnect.loginFailedInfo", string2);
            return;
        }
        this.method_5536af4d_FWm(new nsl(secretKey, publicKey, gJK.method_ce7eeb83_Dne()));
    }

    @Override
    public void method_b16cdc65_Dne(mPe mPe2) {
        alg alg2 = new alg(this.field_36ebf36_Dne, mPe2.field_21260d_FWm, mPe2.field_2e5f1b_bzF, mPe2.field_267cf5_Qnq, mPe2.field_2d29f4_aFZ);
        alg2.field_2a9ad6_Zpi = mPe2.field_21260d_FWm;
        alg2.field_31b816_kGO = mPe2.field_2e5f1b_bzF;
        alg2.field_36b0a9_udO = mPe2.field_267cf5_Qnq;
        alg2.field_334489_mrb = 0.0f;
        alg2.field_29186a_XHL = 0.0f;
        alg2.field_2d29f4_aFZ = mPe2.field_2092ae_Dne;
        this.field_36ebf36_Dne.method_ad567471_Dne(mPe2.field_2092ae_Dne, alg2);
    }

    @Override
    public void method_b109c37f_Dne(liE liE2) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(liE2.field_2092ae_Dne);
        FUH fUH = (FUH)this.method_9e7ee9d3_Dne(liE2.field_21260d_FWm);
        if (fUH == null) {
            fUH = this.field_493682ed_Dne.field_369f6b6_Dne;
        }
        if (sMa2 != null) {
            if (sMa2 instanceof alg) {
                this.field_36ebf36_Dne.method_a36f5f6a_Dne(sMa2, "random.orb", 0.2f, ((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            } else {
                this.field_36ebf36_Dne.method_a36f5f6a_Dne(sMa2, "random.pop", 0.2f, ((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            }
            this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(new qnx_0((Qnq)this.field_493682ed_Dne.field_36ebf36_Dne, sMa2, fUH, -0.5f));
            this.field_36ebf36_Dne.method_77d29d94_FWm(liE2.field_2092ae_Dne);
        }
    }

    @Override
    public void method_8447c1b5_Dne(Raa raa) {
        this.field_493682ed_Dne.field_369f6b6_Dne.method_30572624_FWm(trP.method_9e6fe231_Dne(raa.field_2092ae_Dne), raa.field_21260d_FWm);
    }

    @Override
    public void method_feb678cd_Dne(String string, Object[] objectArray) {
        if (!this.field_2092bf_Dne) {
            this.field_2092bf_Dne = true;
            this.field_493682ed_Dne.method_8c784131_Dne(null);
            if (this.field_37a7e17_Dne != null) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new rNz(this.field_37a7e17_Dne, "disconnect.lost", string, objectArray));
            } else {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new fZp(new KDD(new MKS()), "disconnect.lost", string, objectArray));
            }
        }
    }

    @Override
    public void method_ba6e7695_Dne(rXx rXx2) {
        this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_8f501fe4_Dne(rXx2.field_569fcf45_Dne);
    }

    @Override
    public void method_83541acd_Dne(ROw rOw) {
        this.field_493682ed_Dne.field_369f6b6_Dne.method_addf466b_Dne(new iSh(rOw.field_2092ae_Dne, rOw.field_21260d_FWm, rOw.field_2e5f1b_bzF), true);
        this.field_493682ed_Dne.field_36ebf36_Dne.method_231798c9_Dne().method_2c2cf7c9_Dne(rOw.field_2092ae_Dne, rOw.field_21260d_FWm, rOw.field_2e5f1b_bzF);
    }

    public void method_7be2fb8c_Dne(NER nER) {
        if (!this.field_2092bf_Dne) {
            this.field_36c6f8c_Dne.method_7be2fb8c_Dne(nER);
            this.field_36c6f8c_Dne.method_ae128dc7_bzF();
        }
    }

    @Override
    public void method_b02dbfe3_Dne(kwp kwp2) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(kwp2.field_2092ae_Dne);
        if (sMa2 != null && kwp2.field_2d29f4_aFZ == 0) {
            FiG fiG = (FiG)sMa2;
            fiG.method_d981b6ed_Dne(kwp2.field_21260d_FWm, kwp2.field_2e5f1b_bzF, kwp2.field_267cf5_Qnq);
        }
    }

    @Override
    public void method_822972fe_Dne(QZR qZR) {
        double d = (double)qZR.field_2e5f1b_bzF / 32.0;
        double d2 = (double)qZR.field_267cf5_Qnq / 32.0;
        double d3 = (double)qZR.field_2d29f4_aFZ / 32.0;
        float f = (float)(qZR.field_2092a7_Dne * 360) / 256.0f;
        float f2 = (float)(qZR.field_212606_FWm * 360) / 256.0f;
        FUH fUH = (FUH)Klb.method_a401738e_Dne(qZR.field_21260d_FWm, this.field_493682ed_Dne.field_36ebf36_Dne);
        fUH.field_2a9ad6_Zpi = qZR.field_2e5f1b_bzF;
        fUH.field_31b816_kGO = qZR.field_267cf5_Qnq;
        fUH.field_36b0a9_udO = qZR.field_2d29f4_aFZ;
        fUH.field_36e4d7_vSL = (float)(qZR.field_2e5f14_bzF * 360) / 256.0f;
        sMa[] sMaArray = fUH.method_5709d0c1_Dne();
        if (sMaArray != null) {
            int n = qZR.field_2092ae_Dne - fUH.field_2d29f4_aFZ;
            for (int i = 0; i < sMaArray.length; ++i) {
                sMaArray[i].field_2d29f4_aFZ += n;
            }
        }
        fUH.field_2d29f4_aFZ = qZR.field_2092ae_Dne;
        fUH.method_c38d48a4_Dne(d, d2, d3, f, f2);
        fUH.field_291868_XHL = (float)qZR.field_388da6_zGp / 8000.0f;
        fUH.field_2a9ad1_Zpi = (float)qZR.field_20b857_DyG / 8000.0f;
        fUH.field_31b811_kGO = (float)qZR.field_2f0dd8_div / 8000.0f;
        this.field_36ebf36_Dne.method_ad567471_Dne(qZR.field_2092ae_Dne, fUH);
        List list = qZR.method_adea226d_Dne();
        if (list != null) {
            fUH.method_23123967_Dne().method_ea14418b_Dne(list);
        }
    }

    @Override
    public void method_b6383659_Dne(pKI pKI2) {
        if (pKI2.field_2092bf_Dne) {
            if (pKI2.field_2e5f1b_bzF == 0) {
                this.field_36ebf36_Dne.method_2c2d379a_Dne(pKI2.field_2092ae_Dne, pKI2.field_21260d_FWm, false);
                return;
            }
            this.field_36ebf36_Dne.method_2c2d379a_Dne(pKI2.field_2092ae_Dne, pKI2.field_21260d_FWm, true);
        }
        this.field_36ebf36_Dne.method_e2f11780_aFZ(pKI2.field_2092ae_Dne << 4, 0, pKI2.field_21260d_FWm << 4, (pKI2.field_2092ae_Dne << 4) + 15, 256, (pKI2.field_21260d_FWm << 4) + 15);
        qMV qMV2 = this.field_36ebf36_Dne.method_e1796070_FWm(pKI2.field_2092ae_Dne, pKI2.field_21260d_FWm);
        if (pKI2.field_2092bf_Dne && qMV2 == null) {
            this.field_36ebf36_Dne.method_2c2d379a_Dne(pKI2.field_2092ae_Dne, pKI2.field_21260d_FWm, true);
            qMV2 = this.field_36ebf36_Dne.method_e1796070_FWm(pKI2.field_2092ae_Dne, pKI2.field_21260d_FWm);
        }
        if (qMV2 != null) {
            qMV2.method_811b07f3_Dne(pKI2.method_ce7eeb83_Dne(), pKI2.field_2e5f1b_bzF, pKI2.field_267cf5_Qnq, pKI2.field_2092bf_Dne);
            this.field_36ebf36_Dne.method_c6b5263a_Dne(pKI2.field_2092ae_Dne << 4, 0, pKI2.field_21260d_FWm << 4, (pKI2.field_2092ae_Dne << 4) + 15, 256, (pKI2.field_21260d_FWm << 4) + 15);
            if (!pKI2.field_2092bf_Dne || !(this.field_36ebf36_Dne.field_3690d00_Dne instanceof lMz)) {
                qMV2.method_7ad38803_DyG();
            }
        }
    }

    public void method_5536af4d_FWm(NER nER) {
        if (!this.field_2092bf_Dne) {
            this.field_36c6f8c_Dne.method_7be2fb8c_Dne(nER);
        }
    }

    @Override
    public void method_8faa08ca_Dne(YVz yVz) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(yVz.field_2092ae_Dne);
        sMa sMa3 = this.method_9e7ee9d3_Dne(yVz.field_21260d_FWm);
        if (yVz.field_2092ae_Dne == this.field_493682ed_Dne.field_369f6b6_Dne.field_2d29f4_aFZ) {
            sMa2 = this.field_493682ed_Dne.field_369f6b6_Dne;
            if (sMa3 instanceof iMX) {
                ((iMX)sMa3).method_117d59bb_FWm(false);
            }
        } else if (sMa3 instanceof iMX) {
            ((iMX)sMa3).method_117d59bb_FWm(true);
        }
        if (sMa2 != null) {
            sMa2.method_ad72a713_bzF(sMa3);
        }
    }

    @Override
    public void method_6ee1ada8_Dne(FQJ fQJ) {
        MJs mJs = this.field_493682ed_Dne.field_369f6b6_Dne;
        double d = mJs.field_2f0dd3_div;
        double d2 = mJs.field_22c5fd_IjH;
        double d3 = mJs.field_334487_mrb;
        float f = mJs.field_334489_mrb;
        float f2 = mJs.field_29186a_XHL;
        if (fQJ.field_21261e_FWm) {
            d = fQJ.field_2092a9_Dne;
            d2 = fQJ.field_212608_FWm;
            d3 = fQJ.field_2e5f16_bzF;
        }
        if (fQJ.field_2e5f2c_bzF) {
            f = fQJ.field_2092ab_Dne;
            f2 = fQJ.field_21260a_FWm;
        }
        mJs.field_212c18_EyB = 0.0f;
        mJs.field_31b811_kGO = 0.0;
        mJs.field_2a9ad1_Zpi = 0.0;
        mJs.field_291868_XHL = 0.0;
        mJs.method_c38d48a4_Dne(d, d2, d3, f, f2);
        fQJ.field_2092a9_Dne = mJs.field_2f0dd3_div;
        fQJ.field_212608_FWm = mJs.field_373a3ed_Dne.field_212608_FWm;
        fQJ.field_2e5f16_bzF = mJs.field_334487_mrb;
        fQJ.field_267cf0_Qnq = mJs.field_22c5fd_IjH;
        this.field_36c6f8c_Dne.method_7be2fb8c_Dne(fQJ);
        if (!this.field_21261e_FWm) {
            this.field_493682ed_Dne.field_369f6b6_Dne.field_2d29ef_aFZ = this.field_493682ed_Dne.field_369f6b6_Dne.field_2f0dd3_div;
            this.field_493682ed_Dne.field_369f6b6_Dne.field_388da1_zGp = this.field_493682ed_Dne.field_369f6b6_Dne.field_22c5fd_IjH;
            this.field_493682ed_Dne.field_369f6b6_Dne.field_20b852_DyG = this.field_493682ed_Dne.field_369f6b6_Dne.field_334487_mrb;
            this.field_21261e_FWm = true;
            this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
        }
    }

    @Override
    public void method_794d1f3c_Dne(Krr krr) {
        this.field_493682ed_Dne.field_369f6b6_Dne.method_5c9281c_f_();
    }

    private sMa method_9e7ee9d3_Dne(int n) {
        return n == this.field_493682ed_Dne.field_369f6b6_Dne.field_2d29f4_aFZ ? this.field_493682ed_Dne.field_369f6b6_Dne : this.field_36ebf36_Dne.method_9e7ee9d3_Dne(n);
    }

    @Override
    public void method_9e0ed0e0_Dne(bEj bEj2) {
        this.field_493682ed_Dne.field_36ebf36_Dne.method_285a57e3_aFZ(bEj2.method_7c6f602c_FWm(), bEj2.method_ae128dba_bzF(), bEj2.method_907a9d14_Qnq(), bEj2.method_d44b4585_zGp(), bEj2.method_7ad387f6_DyG());
    }

    public void method_ae128dc7_bzF() {
        this.field_2092bf_Dne = true;
        this.field_36c6f8c_Dne.method_7a46289a_Dne();
        this.field_36c6f8c_Dne.method_feb678cd_Dne("disconnect.closed", new Object[0]);
    }

    @Override
    public void method_a50279b5_Dne(efs efs2) {
        String[] stringArray = efs2.method_eecad346_Dne().split("\u0000");
        if (this.field_493682ed_Dne.field_37a7e17_Dne instanceof SlE) {
            SlE slE = (SlE)this.field_493682ed_Dne.field_37a7e17_Dne;
            slE.method_dd431245_Dne(stringArray);
        }
    }

    @Override
    public void method_8f754dbe_Dne(XsD xsD) {
        if (xsD.field_2092b8_Dne == dEr.field_3792594_Dne.field_267cf5_Qnq) {
            mva.method_f0df4743_Dne(xsD.field_212617_FWm, this.field_493682ed_Dne.field_36ebf36_Dne).method_174dee1_Dne(xsD.field_3f1c582_Dne);
        } else {
            this.field_493682ed_Dne.method_230e0120_Dne().method_110c4dc3_FWm("Unknown itemid: " + xsD.field_212617_FWm);
        }
    }

    @Override
    public void method_c96529ca_Dne(zqT zqT2) {
        this.field_493682ed_Dne.field_369f6b6_Dne.method_aad4134c_a_(zqT2.field_2092ae_Dne);
        this.field_493682ed_Dne.field_369f6b6_Dne.method_230621e2_Dne().method_ce7f5da9_Dne(zqT2.field_21260d_FWm);
        this.field_493682ed_Dne.field_369f6b6_Dne.method_230621e2_Dne().method_117d0ea7_FWm(zqT2.field_2092ab_Dne);
    }

    @Override
    public void method_821b5b7d_Dne(Pwq pwq) {
        MJs mJs = this.field_493682ed_Dne.field_369f6b6_Dne;
        if (pwq.field_2092ae_Dne == 0) {
            mJs.field_36bb35e_Dne.method_bc0f9314_Dne(pwq.field_8360c375_Dne);
        } else if (pwq.field_2092ae_Dne == mJs.field_20257f3d_FWm.field_2092ae_Dne) {
            mJs.field_20257f3d_FWm.method_bc0f9314_Dne(pwq.field_8360c375_Dne);
        }
    }

    @Override
    public void method_a57e1ea5_Dne(fPl fPl2) {
        aCn aCn2 = (aCn)this.field_83b1c1b0_Dne.get(fPl2.field_569fcf45_Dne);
        if (aCn2 == null && fPl2.field_2092bf_Dne) {
            aCn2 = new aCn(fPl2.field_569fcf45_Dne);
            this.field_83b1c1b0_Dne.put(fPl2.field_569fcf45_Dne, aCn2);
            this.field_f27c122c_Dne.add(aCn2);
        }
        if (aCn2 != null && !fPl2.field_2092bf_Dne) {
            this.field_83b1c1b0_Dne.remove(fPl2.field_569fcf45_Dne);
            this.field_f27c122c_Dne.remove(aCn2);
        }
        if (fPl2.field_2092bf_Dne && aCn2 != null) {
            aCn2.field_2092ae_Dne = fPl2.field_2092ae_Dne;
        }
    }

    @Override
    public void method_ac53529d_Dne(ipQ ipQ2) {
        ipD ipD2;
        if (this.field_493682ed_Dne.field_36ebf36_Dne.method_2dee780_bzF(ipQ2.field_2092ae_Dne, ipQ2.field_21260d_FWm, ipQ2.field_2e5f1b_bzF) && (ipD2 = this.field_493682ed_Dne.field_36ebf36_Dne.method_d98e681d_Dne(ipQ2.field_2092ae_Dne, ipQ2.field_21260d_FWm, ipQ2.field_2e5f1b_bzF)) != null) {
            if (ipQ2.field_267cf5_Qnq == 1 && ipD2 instanceof ySb) {
                ipD2.method_8d4fb917_Dne(ipQ2.field_36ef89c_Dne);
            } else if (ipQ2.field_267cf5_Qnq == 2 && ipD2 instanceof FgE) {
                ipD2.method_8d4fb917_Dne(ipQ2.field_36ef89c_Dne);
            } else if (ipQ2.field_267cf5_Qnq == 3 && ipD2 instanceof TpA) {
                ipD2.method_8d4fb917_Dne(ipQ2.field_36ef89c_Dne);
            } else if (ipQ2.field_267cf5_Qnq == 4 && ipD2 instanceof CUf) {
                ipD2.method_8d4fb917_Dne(ipQ2.field_36ef89c_Dne);
            }
        }
    }

    @Override
    public void method_89dcf06d_Dne(vjn_0 vjn_02) {
        this.field_493682ed_Dne.field_36ebf36_Dne.method_9e2bd981_Qnq(vjn_02.field_2092ae_Dne, vjn_02.field_21260d_FWm, vjn_02.field_2e5f1b_bzF, vjn_02.field_388da6_zGp, vjn_02.field_267cf5_Qnq, vjn_02.field_2d29f4_aFZ);
    }

    @Override
    public void method_a9f6bd0f_Dne(iET iET2) {
        sMa sMa2 = this.method_9e7ee9d3_Dne(iET2.field_2092ae_Dne);
        if (sMa2 != null) {
            sMa2.field_2a9ad6_Zpi += iET2.field_2092a7_Dne;
            sMa2.field_31b816_kGO += iET2.field_212606_FWm;
            sMa2.field_36b0a9_udO += iET2.field_2e5f14_bzF;
            double d = (double)sMa2.field_2a9ad6_Zpi / 32.0;
            double d2 = (double)sMa2.field_31b816_kGO / 32.0;
            double d3 = (double)sMa2.field_36b0a9_udO / 32.0;
            float f = iET2.field_2092bf_Dne ? (float)(iET2.field_267cee_Qnq * 360) / 256.0f : sMa2.field_334489_mrb;
            float f2 = iET2.field_2092bf_Dne ? (float)(iET2.field_2d29ed_aFZ * 360) / 256.0f : sMa2.field_29186a_XHL;
            sMa2.method_ae1c3edf_Dne(d, d2, d3, f, f2, 3);
        }
    }

    public fzy(Minecraft minecraft, String string, int n, qVZ qVZ2) throws IOException {
        this.field_83b1c1b0_Dne = new HashMap();
        this.field_f27c122c_Dne = new ArrayList();
        this.field_7331eae7_Dne = new Random();
        this.field_493682ed_Dne = minecraft;
        this.field_37a7e17_Dne = qVZ2;
        Socket socket = new Socket(InetAddress.getByName(string), n);
        this.field_36c6f8c_Dne = new Qyp(minecraft.method_230e0120_Dne(), socket, "Client", this);
    }

    @Override
    public void method_8d1db845_Dne(XGq xGq) {
        MJs mJs = this.field_493682ed_Dne.field_369f6b6_Dne;
        switch (xGq.field_21260d_FWm) {
            case 0: {
                mJs.method_7c9aa178_Dne(new pam(xGq.field_569fcf45_Dne, xGq.field_2092bf_Dne, xGq.field_2e5f1b_bzF));
                mJs.field_20257f3d_FWm.field_2092ae_Dne = xGq.field_2092ae_Dne;
                break;
            }
            case 1: {
                mJs.method_2c2cf7c9_Dne(geR.method_117d0718_FWm(mJs.field_2f0dd3_div), geR.method_117d0718_FWm(mJs.field_22c5fd_IjH), geR.method_117d0718_FWm(mJs.field_334487_mrb));
                mJs.field_20257f3d_FWm.field_2092ae_Dne = xGq.field_2092ae_Dne;
                break;
            }
            case 2: {
                lqs lqs2 = new lqs();
                if (xGq.field_2092bf_Dne) {
                    lqs2.method_8f501fe4_Dne(xGq.field_569fcf45_Dne);
                }
                mJs.method_b18f6899_Dne(lqs2);
                mJs.field_20257f3d_FWm.field_2092ae_Dne = xGq.field_2092ae_Dne;
                break;
            }
            case 3: {
                UTs uTs = new UTs();
                if (xGq.field_2092bf_Dne) {
                    uTs.method_8f501fe4_Dne(xGq.field_569fcf45_Dne);
                }
                mJs.method_88b748b3_Dne(uTs);
                mJs.field_20257f3d_FWm.field_2092ae_Dne = xGq.field_2092ae_Dne;
                break;
            }
            case 4: {
                mJs.method_5b092153_Dne(geR.method_117d0718_FWm(mJs.field_2f0dd3_div), geR.method_117d0718_FWm(mJs.field_22c5fd_IjH), geR.method_117d0718_FWm(mJs.field_334487_mrb), xGq.field_2092bf_Dne ? xGq.field_569fcf45_Dne : null);
                mJs.field_20257f3d_FWm.field_2092ae_Dne = xGq.field_2092ae_Dne;
                break;
            }
            case 5: {
                zio zio2 = new zio();
                if (xGq.field_2092bf_Dne) {
                    zio2.method_8f501fe4_Dne(xGq.field_569fcf45_Dne);
                }
                mJs.method_c900b3c7_Dne(zio2);
                mJs.field_20257f3d_FWm.field_2092ae_Dne = xGq.field_2092ae_Dne;
                break;
            }
            case 6: {
                mJs.method_adf18883_Dne(new AXe(mJs), xGq.field_2092bf_Dne ? xGq.field_569fcf45_Dne : null);
                mJs.field_20257f3d_FWm.field_2092ae_Dne = xGq.field_2092ae_Dne;
                break;
            }
            case 7: {
                TpA tpA = new TpA();
                mJs.method_887647a2_Dne(tpA);
                if (xGq.field_2092bf_Dne) {
                    tpA.method_8f501fe4_Dne(xGq.field_569fcf45_Dne);
                }
                mJs.field_20257f3d_FWm.field_2092ae_Dne = xGq.field_2092ae_Dne;
                break;
            }
            case 8: {
                mJs.method_a6aca7ca_FWm(geR.method_117d0718_FWm(mJs.field_2f0dd3_div), geR.method_117d0718_FWm(mJs.field_22c5fd_IjH), geR.method_117d0718_FWm(mJs.field_334487_mrb));
                mJs.field_20257f3d_FWm.field_2092ae_Dne = xGq.field_2092ae_Dne;
                break;
            }
            case 9: {
                Aem aem = new Aem();
                if (xGq.field_2092bf_Dne) {
                    aem.method_8f501fe4_Dne(xGq.field_569fcf45_Dne);
                }
                mJs.method_6783319e_Dne(aem);
                mJs.field_20257f3d_FWm.field_2092ae_Dne = xGq.field_2092ae_Dne;
                break;
            }
            case 10: {
                BDA bDA = new BDA();
                if (xGq.field_2092bf_Dne) {
                    bDA.method_8f501fe4_Dne(xGq.field_569fcf45_Dne);
                }
                mJs.method_88b748b3_Dne(bDA);
                mJs.field_20257f3d_FWm.field_2092ae_Dne = xGq.field_2092ae_Dne;
            }
        }
    }

    @Override
    public void method_814a40c9_Dne(Phv phv) {
        this.method_5536af4d_FWm(new Phv(phv.field_2092ae_Dne));
    }

    @Override
    public void method_a00607ad_Dne(bia bia2) {
        JCd jCd = new JCd(this.field_36ebf36_Dne, bia2.field_21260d_FWm, bia2.field_2e5f1b_bzF, bia2.field_267cf5_Qnq, bia2.field_2d29f4_aFZ, bia2.field_569fcf45_Dne);
        this.field_36ebf36_Dne.method_ad567471_Dne(bia2.field_2092ae_Dne, jCd);
    }

    @Override
    public void method_a08d09e4_Dne(cSs cSs2) {
        this.field_36ebf36_Dne.method_ae303dae_FWm(cSs2.field_2092ae_Dne, cSs2.field_21260d_FWm, cSs2.field_2e5f1b_bzF, cSs2.field_267cf5_Qnq, cSs2.field_2d29f4_aFZ);
    }

    @Override
    public void method_aaa71d0b_Dne(iQd iQd2) {
        SFA sFA = this.field_36ebf36_Dne.method_23062a3d_Dne();
        if (iQd2.field_2092ae_Dne == 0) {
            vfE vfE2 = sFA.method_46dbd964_Dne(iQd2.field_569fcf45_Dne, PAf.field_36b3077_Dne);
            vfE2.method_8f501fe4_Dne(iQd2.field_d9a85c6_FWm);
        } else {
            vfE vfE3 = sFA.method_285fce20_Dne(iQd2.field_569fcf45_Dne);
            if (iQd2.field_2092ae_Dne == 1) {
                sFA.method_c1eff332_Dne(vfE3);
            } else if (iQd2.field_2092ae_Dne == 2) {
                vfE3.method_8f501fe4_Dne(iQd2.field_d9a85c6_FWm);
            }
        }
    }

    @Override
    public void method_8a3594ca_Dne(VPw vPw) {
        this.field_493682ed_Dne.field_36c390e_Dne = new RJV(this.field_493682ed_Dne, this);
        this.field_493682ed_Dne.field_3673fc1_Dne.method_df3461c5_Dne(trP.field_5e55ad0a_Qnq, 1);
        this.field_36ebf36_Dne = new VzZ(this, new mrb(0L, vPw.field_36eea90_Dne, false, vPw.field_2092bf_Dne, vPw.field_3778a39_Dne), vPw.field_21260d_FWm, vPw.field_2092a7_Dne, this.field_493682ed_Dne.field_365731d_Dne, this.field_493682ed_Dne.method_230e0120_Dne());
        this.field_36ebf36_Dne.field_2d2a05_aFZ = true;
        this.field_493682ed_Dne.method_8c784131_Dne(this.field_36ebf36_Dne);
        this.field_493682ed_Dne.field_369f6b6_Dne.field_348572_qLR = vPw.field_21260d_FWm;
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new bcj(this));
        this.field_493682ed_Dne.field_369f6b6_Dne.field_2d29f4_aFZ = vPw.field_2092ae_Dne;
        this.field_2092ae_Dne = vPw.field_2e5f14_bzF;
        this.field_493682ed_Dne.field_36c390e_Dne.method_8d1afe0b_Dne(vPw.field_36eea90_Dne);
        this.field_493682ed_Dne.field_3758af7_Dne.method_ae128dc7_bzF();
    }

    @Override
    public void method_c66d1d52_Dne(yZV yZV2) {
        this.field_36c6f8c_Dne.method_feb678cd_Dne("disconnect.kicked", new Object[0]);
        this.field_2092bf_Dne = true;
        this.field_493682ed_Dne.method_8c784131_Dne(null);
        if (this.field_37a7e17_Dne != null) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new rNz(this.field_37a7e17_Dne, "disconnect.disconnected", "disconnect.genericReason", yZV2.field_569fcf45_Dne));
        } else {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new fZp(new KDD(new MKS()), "disconnect.disconnected", "disconnect.genericReason", yZV2.field_569fcf45_Dne));
        }
    }

    @Override
    public void method_8f0834ae_Dne(YLL yLL) {
        for (int i = 0; i < yLL.method_7c6f602c_FWm(); ++i) {
            double d = this.field_7331eae7_Dne.nextGaussian() * (double)yLL.method_7a46288a_Dne();
            double d2 = this.field_7331eae7_Dne.nextGaussian() * (double)yLL.method_7c6f6029_FWm();
            double d3 = this.field_7331eae7_Dne.nextGaussian() * (double)yLL.method_ae128db7_bzF();
            double d4 = this.field_7331eae7_Dne.nextGaussian() * (double)yLL.method_907a9d11_Qnq();
            double d5 = this.field_7331eae7_Dne.nextGaussian() * (double)yLL.method_907a9d11_Qnq();
            double d6 = this.field_7331eae7_Dne.nextGaussian() * (double)yLL.method_907a9d11_Qnq();
            this.field_36ebf36_Dne.method_8600ec24_Dne(yLL.method_eecad346_Dne(), yLL.method_7a462888_Dne() + d, yLL.method_7c6f6027_FWm() + d2, yLL.method_ae128db5_bzF() + d3, d4, d5, d6);
        }
    }

    @Override
    public void method_b6b5acc5_Dne(pSe pSe2) {
        MJs mJs = this.field_493682ed_Dne.field_369f6b6_Dne;
        mJs.field_37cb681_Dne.field_21261e_FWm = pSe2.method_907a9d25_Qnq();
        mJs.field_37cb681_Dne.field_267d06_Qnq = pSe2.method_d44b4596_zGp();
        mJs.field_37cb681_Dne.field_2092bf_Dne = pSe2.method_ae128dcb_bzF();
        mJs.field_37cb681_Dne.field_2e5f2c_bzF = pSe2.method_a98a0664_aFZ();
        mJs.field_37cb681_Dne.method_ce7f5266_Dne(pSe2.method_7a46288a_Dne());
        mJs.field_37cb681_Dne.method_117d0ea7_FWm(pSe2.method_7c6f6029_FWm());
    }

    @Override
    public void method_89820635_Dne(UdA udA) {
        yTR yTR2 = new yTR(this.field_493682ed_Dne.field_36ebf36_Dne, null, udA.field_2092a9_Dne, udA.field_212608_FWm, udA.field_2e5f16_bzF, udA.field_2092ab_Dne);
        yTR2.field_f27c122c_Dne = udA.field_f27c122c_Dne;
        yTR2.method_ce7f9d7a_Dne(true);
        this.field_493682ed_Dne.field_369f6b6_Dne.field_291868_XHL += (double)udA.method_7a46288a_Dne();
        this.field_493682ed_Dne.field_369f6b6_Dne.field_2a9ad1_Zpi += (double)udA.method_7c6f6029_FWm();
        this.field_493682ed_Dne.field_369f6b6_Dne.field_31b811_kGO += (double)udA.method_ae128db7_bzF();
    }

    @Override
    public void method_90d6f674_Dne(Ylf ylf) {
        int n = ylf.field_2092ae_Dne * 16;
        int n2 = ylf.field_21260d_FWm * 16;
        if (ylf.field_3f1c582_Dne != null) {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(ylf.field_3f1c582_Dne));
            try {
                for (int i = 0; i < ylf.field_2e5f1b_bzF; ++i) {
                    short s = dataInputStream.readShort();
                    short s2 = dataInputStream.readShort();
                    int n3 = s2 >> 4 & 0xFFF;
                    int n4 = s2 & 0xF;
                    int n5 = s >> 12 & 0xF;
                    int n6 = s >> 8 & 0xF;
                    int n7 = s & 0xFF;
                    this.field_36ebf36_Dne.method_ae303dae_FWm(n5 + n, n7, n6 + n2, n3, n4);
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    @Override
    public void method_b5dd4c21_Dne(pDZ pDZ2) {
        Pdb pdb = null;
        MJs mJs = this.field_493682ed_Dne.field_369f6b6_Dne;
        if (pDZ2.field_2092ae_Dne == 0) {
            pdb = mJs.field_36bb35e_Dne;
        } else if (pDZ2.field_2092ae_Dne == mJs.field_20257f3d_FWm.field_2092ae_Dne) {
            pdb = mJs.field_20257f3d_FWm;
        }
        if (pdb != null && !pDZ2.field_2092bf_Dne) {
            this.method_5536af4d_FWm(new pDZ(pDZ2.field_2092ae_Dne, pDZ2.field_2092b8_Dne, true));
        }
    }
}

