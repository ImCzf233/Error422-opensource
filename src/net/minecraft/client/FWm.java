/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Component;
import net.minecraft.client.Minecraft;
import net.minecraft.src.*;

public class FWm
extends Applet {
    private Canvas field_7c679bf6_Dne;
    private Minecraft field_493682ed_Dne;
    private Thread field_7709e06c_Dne = null;

    @Override
    public void stop() {
        if (this.field_493682ed_Dne != null) {
            this.field_493682ed_Dne.field_2e5f2c_bzF = true;
        }
    }

    @Override
    public void start() {
        if (this.field_493682ed_Dne != null) {
            this.field_493682ed_Dne.field_2e5f2c_bzF = false;
        }
    }

    @Override
    public void destroy() {
        this.method_7c6f6039_FWm();
    }

    @Override
    public void init() {
        this.field_7c679bf6_Dne = new ulX(this);
        boolean bl = "true".equalsIgnoreCase(this.getParameter("fullscreen"));
        this.field_493682ed_Dne = new KNk(this, this.field_7c679bf6_Dne, this, this.getWidth(), this.getHeight(), bl);
        this.field_493682ed_Dne.field_569fcf45_Dne = this.getDocumentBase().getHost();
        if (this.getDocumentBase().getPort() > 0) {
            this.field_493682ed_Dne.field_569fcf45_Dne = this.field_493682ed_Dne.field_569fcf45_Dne + ":" + this.getDocumentBase().getPort();
        }
        if (this.getParameter("username") != null && this.getParameter("sessionid") != null) {
            this.field_493682ed_Dne.field_37d3e5f_Dne = new vwN(this.getParameter("username"), this.getParameter("sessionid"));
            this.field_493682ed_Dne.method_230e0120_Dne().method_8f501fe4_Dne("Setting user: " + this.field_493682ed_Dne.field_37d3e5f_Dne.field_569fcf45_Dne);
            System.out.println("(Session ID is " + this.field_493682ed_Dne.field_37d3e5f_Dne.field_d9a85c6_FWm + ")");
        } else {
            this.field_493682ed_Dne.field_37d3e5f_Dne = new vwN("Player", "");
        }
        this.field_493682ed_Dne.method_ce7f9d7a_Dne("true".equals(this.getParameter("demo")));
        if (this.getParameter("server") != null && this.getParameter("port") != null) {
            this.field_493682ed_Dne.method_5ab44f9f_Dne(this.getParameter("server"), Integer.parseInt(this.getParameter("port")));
        }
        this.field_493682ed_Dne.field_21261e_FWm = !"true".equals(this.getParameter("stand-alone"));
        this.setLayout(new BorderLayout());
        this.add((Component)this.field_7c679bf6_Dne, "Center");
        this.field_7c679bf6_Dne.setFocusable(true);
        this.field_7c679bf6_Dne.setFocusTraversalKeysEnabled(false);
        this.validate();
    }

    public void method_7c6f6039_FWm() {
        if (this.field_7709e06c_Dne != null) {
            this.field_493682ed_Dne.method_907a9d21_Qnq();
            try {
                this.field_7709e06c_Dne.join(10000L);
            }
            catch (InterruptedException interruptedException) {
                try {
                    this.field_493682ed_Dne.method_7c6f6039_FWm();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            this.field_7709e06c_Dne = null;
        }
    }

    public void method_7a46289a_Dne() {
        if (this.field_7709e06c_Dne == null) {
            this.field_7709e06c_Dne = new Thread((Runnable)this.field_493682ed_Dne, "Minecraft main thread");
            this.field_7709e06c_Dne.start();
        }
    }
}

