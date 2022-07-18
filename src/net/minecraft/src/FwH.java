package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class FwH
extends xZE {
    @Override
    public String method_eecad346_Dne() {
        return "scoreboard";
    }

    protected void method_c69efca9_Dne(gnI gnI2, String[] stringArray, int n) {
        String string = stringArray[n++];
        String string2 = stringArray[n++];
        SFA sFA = this.method_23062a3d_Dne();
        PAf pAf = (PAf)PAf.field_83b1c1b0_Dne.get(string2);
        if (pAf == null) {
            Object[] objectArray = PAf.field_83b1c1b0_Dne.keySet().toArray(new String[0]);
            throw new fxw_0("commands.scoreboard.objectives.add.wrongType", FwH.method_f7f6f529_Dne(objectArray));
        }
        if (sFA.method_285fce20_Dne(string) != null) {
            throw new WoB("commands.scoreboard.objectives.add.alreadyExists", string);
        }
        if (string.length() > 16) {
            throw new qwv("commands.scoreboard.objectives.add.tooLong", string, 16);
        }
        vfE vfE2 = sFA.method_46dbd964_Dne(string, pAf);
        if (stringArray.length > n) {
            String string3 = FwH.method_3140bf17_Dne(gnI2, stringArray, n);
            if (string3.length() > 32) {
                throw new qwv("commands.scoreboard.objectives.add.displayTooLong", string3, 32);
            }
            if (string3.length() > 0) {
                vfE2.method_8f501fe4_Dne(string3);
            }
        }
        FwH.method_7424c4e2_Dne(gnI2, "commands.scoreboard.objectives.add.success", string);
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length >= 1) {
            if (stringArray[0].equalsIgnoreCase("objectives")) {
                if (stringArray.length == 1) {
                    throw new fxw_0("commands.scoreboard.objectives.usage", new Object[0]);
                }
                if (stringArray[1].equalsIgnoreCase("list")) {
                    this.method_a8c9cf65_Dne(gnI2);
                } else if (stringArray[1].equalsIgnoreCase("add")) {
                    if (stringArray.length < 4) {
                        throw new fxw_0("commands.scoreboard.objectives.add.usage", new Object[0]);
                    }
                    this.method_c69efca9_Dne(gnI2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("remove")) {
                    if (stringArray.length != 3) {
                        throw new fxw_0("commands.scoreboard.objectives.remove.usage", new Object[0]);
                    }
                    this.method_d491c9ef_Dne(gnI2, stringArray[2]);
                } else {
                    if (!stringArray[1].equalsIgnoreCase("setdisplay")) {
                        throw new fxw_0("commands.scoreboard.objectives.usage", new Object[0]);
                    }
                    if (stringArray.length != 3 && stringArray.length != 4) {
                        throw new fxw_0("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
                    }
                    this.method_7e6b54d5_IjH(gnI2, stringArray, 2);
                }
                return;
            }
            if (stringArray[0].equalsIgnoreCase("players")) {
                if (stringArray.length == 1) {
                    throw new fxw_0("commands.scoreboard.players.usage", new Object[0]);
                }
                if (stringArray[1].equalsIgnoreCase("list")) {
                    if (stringArray.length > 3) {
                        throw new fxw_0("commands.scoreboard.players.list.usage", new Object[0]);
                    }
                    this.method_a6aa100b_mrb(gnI2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("add")) {
                    if (stringArray.length != 5) {
                        throw new fxw_0("commands.scoreboard.players.add.usage", new Object[0]);
                    }
                    this.method_465fd78a_XHL(gnI2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("remove")) {
                    if (stringArray.length != 5) {
                        throw new fxw_0("commands.scoreboard.players.remove.usage", new Object[0]);
                    }
                    this.method_465fd78a_XHL(gnI2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("set")) {
                    if (stringArray.length != 5) {
                        throw new fxw_0("commands.scoreboard.players.set.usage", new Object[0]);
                    }
                    this.method_465fd78a_XHL(gnI2, stringArray, 2);
                } else {
                    if (!stringArray[1].equalsIgnoreCase("reset")) {
                        throw new fxw_0("commands.scoreboard.players.usage", new Object[0]);
                    }
                    if (stringArray.length != 3) {
                        throw new fxw_0("commands.scoreboard.players.reset.usage", new Object[0]);
                    }
                    this.method_39391b81_Zpi(gnI2, stringArray, 2);
                }
                return;
            }
            if (stringArray[0].equalsIgnoreCase("teams")) {
                if (stringArray.length == 1) {
                    throw new fxw_0("commands.scoreboard.teams.usage", new Object[0]);
                }
                if (stringArray[1].equalsIgnoreCase("list")) {
                    if (stringArray.length > 3) {
                        throw new fxw_0("commands.scoreboard.teams.list.usage", new Object[0]);
                    }
                    this.method_439409a3_aFZ(gnI2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("add")) {
                    if (stringArray.length < 3) {
                        throw new fxw_0("commands.scoreboard.teams.add.usage", new Object[0]);
                    }
                    this.method_2b6c45ea_FWm(gnI2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("remove")) {
                    if (stringArray.length != 3) {
                        throw new fxw_0("commands.scoreboard.teams.remove.usage", new Object[0]);
                    }
                    this.method_c62fde02_Qnq(gnI2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("empty")) {
                    if (stringArray.length != 3) {
                        throw new fxw_0("commands.scoreboard.teams.empty.usage", new Object[0]);
                    }
                    this.method_1ea6d73f_div(gnI2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("join")) {
                    if (!(stringArray.length >= 4 || stringArray.length == 3 && gnI2 instanceof FiG)) {
                        throw new fxw_0("commands.scoreboard.teams.join.usage", new Object[0]);
                    }
                    this.method_dbd9e6b1_zGp(gnI2, stringArray, 2);
                } else if (stringArray[1].equalsIgnoreCase("leave")) {
                    if (stringArray.length < 3 && !(gnI2 instanceof FiG)) {
                        throw new fxw_0("commands.scoreboard.teams.leave.usage", new Object[0]);
                    }
                    this.method_f6ad9560_DyG(gnI2, stringArray, 2);
                } else {
                    if (!stringArray[1].equalsIgnoreCase("option")) {
                        throw new fxw_0("commands.scoreboard.teams.usage", new Object[0]);
                    }
                    if (stringArray.length != 4 && stringArray.length != 5) {
                        throw new fxw_0("commands.scoreboard.teams.option.usage", new Object[0]);
                    }
                    this.method_4151d41c_bzF(gnI2, stringArray, 2);
                }
                return;
            }
        }
        throw new fxw_0("commands.scoreboard.usage", new Object[0]);
    }

    protected void method_465fd78a_XHL(gnI gnI2, String[] stringArray, int n) {
        String string = stringArray[n - 1];
        String string2 = FwH.method_17856691_Dne(gnI2, stringArray[n++]);
        vfE vfE2 = this.method_c5a997ac_Dne(stringArray[n++], true);
        int n2 = string.equalsIgnoreCase("set") ? FwH.method_4ef26f63_FWm(gnI2, stringArray[n++]) : FwH.method_bda7e6e7_Dne(gnI2, stringArray[n++], 1);
        SFA sFA = this.method_23062a3d_Dne();
        OHz oHz = sFA.method_938dc1b8_Dne(string2, vfE2);
        if (string.equalsIgnoreCase("set")) {
            oHz.method_143f9e1c_bzF(n2);
        } else if (string.equalsIgnoreCase("add")) {
            oHz.method_ce7f5da9_Dne(n2);
        } else {
            oHz.method_117d19ea_FWm(n2);
        }
        FwH.method_7424c4e2_Dne(gnI2, "commands.scoreboard.players.set.success", vfE2.method_eecad346_Dne(), string2, oHz.method_7a46288d_Dne());
    }

    protected void method_7e6b54d5_IjH(gnI gnI2, String[] stringArray, int n) {
        SFA sFA = this.method_23062a3d_Dne();
        String string = stringArray[n++];
        int n2 = SFA.method_8f501fd7_Dne(string);
        vfE vfE2 = null;
        if (stringArray.length == 4) {
            vfE2 = this.method_c5a997ac_Dne(stringArray[n++], false);
        }
        if (n2 < 0) {
            throw new WoB("commands.scoreboard.objectives.setdisplay.invalidSlot", string);
        }
        sFA.method_b3c88f83_Dne(n2, vfE2);
        if (vfE2 != null) {
            FwH.method_7424c4e2_Dne(gnI2, "commands.scoreboard.objectives.setdisplay.successSet", SFA.method_2c0e7e17_Dne(n2), vfE2.method_eecad346_Dne());
        } else {
            FwH.method_7424c4e2_Dne(gnI2, "commands.scoreboard.objectives.setdisplay.successCleared", SFA.method_2c0e7e17_Dne(n2));
        }
    }

    protected void method_f6ad9560_DyG(gnI gnI2, String[] stringArray, int n) {
        SFA sFA = this.method_23062a3d_Dne();
        HashSet<String> hashSet = new HashSet<String>();
        HashSet<String> hashSet2 = new HashSet<String>();
        if (gnI2 instanceof FiG && n == stringArray.length) {
            String string = FwH.method_8672275f_Dne(gnI2).method_eecad346_Dne();
            if (sFA.method_8f501fe8_Dne(string)) {
                hashSet.add(string);
            } else {
                hashSet2.add(string);
            }
        } else {
            while (n < stringArray.length) {
                String string;
                if (sFA.method_8f501fe8_Dne(string = FwH.method_17856691_Dne(gnI2, stringArray[n++]))) {
                    hashSet.add(string);
                    continue;
                }
                hashSet2.add(string);
            }
        }
        if (!hashSet.isEmpty()) {
            FwH.method_7424c4e2_Dne(gnI2, "commands.scoreboard.teams.leave.success", hashSet.size(), FwH.method_f7f6f529_Dne(hashSet.toArray(new String[0])));
        }
        if (!hashSet2.isEmpty()) {
            throw new WoB("commands.scoreboard.teams.leave.failure", hashSet2.size(), FwH.method_f7f6f529_Dne(hashSet2.toArray(new String[0])));
        }
    }

    protected void method_c62fde02_Qnq(gnI gnI2, String[] stringArray, int n) {
        SFA sFA = this.method_23062a3d_Dne();
        YGE yGE = this.method_28522afe_Dne(stringArray[n++]);
        sFA.method_8ebe9090_Dne(yGE);
        FwH.method_7424c4e2_Dne(gnI2, "commands.scoreboard.teams.remove.success", yGE.method_eecad346_Dne());
    }

    @Override
    public boolean method_cb1fa962_Dne(String[] stringArray, int n) {
        return stringArray[0].equalsIgnoreCase("players") ? n == 2 : (!stringArray[0].equalsIgnoreCase("teams") ? false : n == 2 || n == 3);
    }

    protected void method_a6aa100b_mrb(gnI gnI2, String[] stringArray, int n) {
        SFA sFA = this.method_23062a3d_Dne();
        if (stringArray.length > n) {
            String string;
            Map<Object, OHz> map;
            if ((map = sFA.method_924a9319_Dne(string = FwH.method_17856691_Dne(gnI2, stringArray[n++]))).size() <= 0) {
                throw new WoB("commands.scoreboard.players.list.player.empty", string);
            }
            gnI2.method_8f501fe4_Dne((Object)((Object)Dne.field_75ae32be_bzF) + gnI2.method_98148f73_Dne("commands.scoreboard.players.list.player.count", map.size(), string));
            for (OHz oHz : map.values()) {
                gnI2.method_8f501fe4_Dne(gnI2.method_98148f73_Dne("commands.scoreboard.players.list.player.entry", oHz.method_7a46288d_Dne(), oHz.method_23168bd6_Dne().method_d1f1ed87_FWm(), oHz.method_23168bd6_Dne().method_eecad346_Dne()));
            }
        } else {
            Collection collection = sFA.method_27fd6a2e_FWm();
            if (collection.size() <= 0) {
                throw new WoB("commands.scoreboard.players.list.empty", new Object[0]);
            }
            gnI2.method_8f501fe4_Dne((Object)((Object)Dne.field_75ae32be_bzF) + gnI2.method_98148f73_Dne("commands.scoreboard.players.list.count", collection.size()));
            gnI2.method_8f501fe4_Dne(FwH.method_f7f6f529_Dne(collection.toArray()));
        }
    }

    protected YGE method_28522afe_Dne(String string) {
        SFA sFA = this.method_23062a3d_Dne();
        YGE yGE = sFA.method_28522afe_Dne(string);
        if (yGE == null) {
            throw new WoB("commands.scoreboard.teamNotFound", string);
        }
        return yGE;
    }

    protected SFA method_23062a3d_Dne() {
        return jwh_0.method_2302cf90_Dne().method_9e6fba3b_Dne(0).method_23062a3d_Dne();
    }

    protected List method_b8bc518d_Dne(boolean bl) {
        Collection<vfE> collection = this.method_23062a3d_Dne().method_be5f586d_Dne();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (vfE vfE2 : collection) {
            if (bl && vfE2.method_2304bed6_Dne().method_7a46289e_Dne()) continue;
            arrayList.add(vfE2.method_eecad346_Dne());
        }
        return arrayList;
    }

    protected void method_439409a3_aFZ(gnI gnI2, String[] stringArray, int n) {
        SFA sFA = this.method_23062a3d_Dne();
        if (stringArray.length > n) {
            YGE yGE;
            Collection collection;
            if ((collection = (yGE = this.method_28522afe_Dne(stringArray[n++])).method_be5f586d_Dne()).size() <= 0) {
                throw new WoB("commands.scoreboard.teams.list.player.empty", yGE.method_eecad346_Dne());
            }
            gnI2.method_8f501fe4_Dne((Object)((Object)Dne.field_75ae32be_bzF) + gnI2.method_98148f73_Dne("commands.scoreboard.teams.list.player.count", collection.size(), yGE.method_eecad346_Dne()));
            gnI2.method_8f501fe4_Dne(FwH.method_f7f6f529_Dne(collection.toArray()));
        } else {
            Collection<YGE> collection = sFA.method_4485f267_aFZ();
            if (collection.size() <= 0) {
                throw new WoB("commands.scoreboard.teams.list.empty", new Object[0]);
            }
            gnI2.method_8f501fe4_Dne((Object)((Object)Dne.field_75ae32be_bzF) + gnI2.method_98148f73_Dne("commands.scoreboard.teams.list.count", collection.size()));
            for (YGE yGE : collection) {
                gnI2.method_8f501fe4_Dne(gnI2.method_98148f73_Dne("commands.scoreboard.teams.list.entry", yGE.method_eecad346_Dne(), yGE.method_d1f1ed87_FWm(), yGE.method_be5f586d_Dne().size()));
            }
        }
    }

    protected vfE method_c5a997ac_Dne(String string, boolean bl) {
        SFA sFA = this.method_23062a3d_Dne();
        vfE vfE2 = sFA.method_285fce20_Dne(string);
        if (vfE2 == null) {
            throw new WoB("commands.scoreboard.objectiveNotFound", string);
        }
        if (bl && vfE2.method_2304bed6_Dne().method_7a46289e_Dne()) {
            throw new WoB("commands.scoreboard.objectiveReadOnly", string);
        }
        return vfE2;
    }

    protected void method_39391b81_Zpi(gnI gnI2, String[] stringArray, int n) {
        SFA sFA = this.method_23062a3d_Dne();
        String string = FwH.method_17856691_Dne(gnI2, stringArray[n++]);
        sFA.method_8f501fe4_Dne(string);
        FwH.method_7424c4e2_Dne(gnI2, "commands.scoreboard.players.reset.success", string);
    }

    protected void method_4151d41c_bzF(gnI gnI2, String[] stringArray, int n) {
        String string;
        YGE yGE = this.method_28522afe_Dne(stringArray[n++]);
        if (!((string = stringArray[n++].toLowerCase()).equalsIgnoreCase("color") || string.equalsIgnoreCase("friendlyfire") || string.equalsIgnoreCase("seeFriendlyInvisibles"))) {
            throw new fxw_0("commands.scoreboard.teams.option.usage", new Object[0]);
        }
        if (stringArray.length == 4) {
            if (string.equalsIgnoreCase("color")) {
                throw new fxw_0("commands.scoreboard.teams.option.noValue", string, FwH.method_64bfdd35_Dne(Dne.method_9daa3c6d_Dne(true, false)));
            }
            if (!string.equalsIgnoreCase("friendlyfire") && !string.equalsIgnoreCase("seeFriendlyInvisibles")) {
                throw new fxw_0("commands.scoreboard.teams.option.usage", new Object[0]);
            }
            throw new fxw_0("commands.scoreboard.teams.option.noValue", string, FwH.method_64bfdd35_Dne(Arrays.asList("true", "false")));
        }
        String string2 = stringArray[n++];
        if (string.equalsIgnoreCase("color")) {
            Dne dne = Dne.method_2849357a_Dne(string2);
            if (string2 == null) {
                throw new fxw_0("commands.scoreboard.teams.option.noValue", string, FwH.method_64bfdd35_Dne(Dne.method_9daa3c6d_Dne(true, false)));
            }
            yGE.method_110c4dc3_FWm(dne.toString());
            yGE.method_47a073d1_bzF(Dne.field_d3fa959_FfS.toString());
        } else if (string.equalsIgnoreCase("friendlyfire")) {
            if (!string2.equalsIgnoreCase("true") && !string2.equalsIgnoreCase("false")) {
                throw new fxw_0("commands.scoreboard.teams.option.noValue", string, FwH.method_64bfdd35_Dne(Arrays.asList("true", "false")));
            }
            yGE.method_ce7f9d7a_Dne(string2.equalsIgnoreCase("true"));
        } else if (string.equalsIgnoreCase("seeFriendlyInvisibles")) {
            if (!string2.equalsIgnoreCase("true") && !string2.equalsIgnoreCase("false")) {
                throw new fxw_0("commands.scoreboard.teams.option.noValue", string, FwH.method_64bfdd35_Dne(Arrays.asList("true", "false")));
            }
            yGE.method_117d59bb_FWm(string2.equalsIgnoreCase("true"));
        }
        FwH.method_7424c4e2_Dne(gnI2, "commands.scoreboard.teams.option.success", string, yGE.method_eecad346_Dne(), string2);
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length == 1) {
            return FwH.method_80180c4d_Dne(stringArray, "objectives", "players", "teams");
        }
        if (stringArray[0].equalsIgnoreCase("objectives")) {
            if (stringArray.length == 2) {
                return FwH.method_80180c4d_Dne(stringArray, "list", "add", "remove", "setdisplay");
            }
            if (stringArray[1].equalsIgnoreCase("add")) {
                if (stringArray.length == 4) {
                    return FwH.method_2db2e1b9_Dne(stringArray, PAf.field_83b1c1b0_Dne.keySet());
                }
            } else if (stringArray[1].equalsIgnoreCase("remove")) {
                if (stringArray.length == 3) {
                    return FwH.method_2db2e1b9_Dne(stringArray, this.method_b8bc518d_Dne(false));
                }
            } else if (stringArray[1].equalsIgnoreCase("setdisplay")) {
                if (stringArray.length == 3) {
                    return FwH.method_80180c4d_Dne(stringArray, "list", "sidebar", "belowName");
                }
                if (stringArray.length == 4) {
                    return FwH.method_2db2e1b9_Dne(stringArray, this.method_b8bc518d_Dne(false));
                }
            }
        } else if (stringArray[0].equalsIgnoreCase("players")) {
            if (stringArray.length == 2) {
                return FwH.method_80180c4d_Dne(stringArray, "set", "add", "remove", "reset", "list");
            }
            if (!(stringArray[1].equalsIgnoreCase("set") || stringArray[1].equalsIgnoreCase("add") || stringArray[1].equalsIgnoreCase("remove"))) {
                if ((stringArray[1].equalsIgnoreCase("reset") || stringArray[1].equalsIgnoreCase("list")) && stringArray.length == 3) {
                    return FwH.method_2db2e1b9_Dne(stringArray, this.method_23062a3d_Dne().method_27fd6a2e_FWm());
                }
            } else {
                if (stringArray.length == 3) {
                    return FwH.method_80180c4d_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne());
                }
                if (stringArray.length == 4) {
                    return FwH.method_2db2e1b9_Dne(stringArray, this.method_b8bc518d_Dne(true));
                }
            }
        } else if (stringArray[0].equalsIgnoreCase("teams")) {
            if (stringArray.length == 2) {
                return FwH.method_80180c4d_Dne(stringArray, "add", "remove", "join", "leave", "empty", "list", "option");
            }
            if (stringArray[1].equalsIgnoreCase("join")) {
                if (stringArray.length == 3) {
                    return FwH.method_2db2e1b9_Dne(stringArray, this.method_23062a3d_Dne().method_d9c0ce46_Qnq());
                }
                if (stringArray.length >= 4) {
                    return FwH.method_80180c4d_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne());
                }
            } else {
                if (stringArray[1].equalsIgnoreCase("leave")) {
                    return FwH.method_80180c4d_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne());
                }
                if (!(stringArray[1].equalsIgnoreCase("empty") || stringArray[1].equalsIgnoreCase("list") || stringArray[1].equalsIgnoreCase("remove"))) {
                    if (stringArray[1].equalsIgnoreCase("option")) {
                        if (stringArray.length == 3) {
                            return FwH.method_2db2e1b9_Dne(stringArray, this.method_23062a3d_Dne().method_d9c0ce46_Qnq());
                        }
                        if (stringArray.length == 4) {
                            return FwH.method_80180c4d_Dne(stringArray, "color", "friendlyfire", "seeFriendlyInvisibles");
                        }
                        if (stringArray.length == 5) {
                            if (stringArray[3].equalsIgnoreCase("color")) {
                                return FwH.method_2db2e1b9_Dne(stringArray, Dne.method_9daa3c6d_Dne(true, false));
                            }
                            if (stringArray[3].equalsIgnoreCase("friendlyfire") || stringArray[3].equalsIgnoreCase("seeFriendlyInvisibles")) {
                                return FwH.method_80180c4d_Dne(stringArray, "true", "false");
                            }
                        }
                    }
                } else if (stringArray.length == 3) {
                    return FwH.method_2db2e1b9_Dne(stringArray, this.method_23062a3d_Dne().method_d9c0ce46_Qnq());
                }
            }
        }
        return null;
    }

    protected void method_1ea6d73f_div(gnI gnI2, String[] stringArray, int n) {
        YGE yGE;
        ArrayList arrayList;
        SFA sFA = this.method_23062a3d_Dne();
        if ((arrayList = new ArrayList((yGE = this.method_28522afe_Dne(stringArray[n++])).method_be5f586d_Dne())).isEmpty()) {
            throw new WoB("commands.scoreboard.teams.empty.alreadyEmpty", yGE.method_eecad346_Dne());
        }
        for (Object obj : arrayList) {String string = (String) obj;
            sFA.method_acfe3d07_FWm(string, yGE);
        }
        FwH.method_7424c4e2_Dne(gnI2, "commands.scoreboard.teams.empty.success", arrayList.size(), yGE.method_eecad346_Dne());
    }

    protected void method_a8c9cf65_Dne(gnI gnI2) {
        SFA sFA = this.method_23062a3d_Dne();
        Collection<vfE> collection = sFA.method_be5f586d_Dne();
        if (collection.size() <= 0) {
            throw new WoB("commands.scoreboard.objectives.list.empty", new Object[0]);
        }
        gnI2.method_8f501fe4_Dne((Object)((Object)Dne.field_75ae32be_bzF) + gnI2.method_98148f73_Dne("commands.scoreboard.objectives.list.count", collection.size()));
        for (vfE vfE2 : collection) {
            gnI2.method_8f501fe4_Dne(gnI2.method_98148f73_Dne("commands.scoreboard.objectives.list.entry", vfE2.method_eecad346_Dne(), vfE2.method_d1f1ed87_FWm(), vfE2.method_2304bed6_Dne().method_eecad346_Dne()));
        }
    }

    protected void method_dbd9e6b1_zGp(gnI gnI2, String[] stringArray, int n) {
        SFA sFA = this.method_23062a3d_Dne();
        YGE yGE = sFA.method_28522afe_Dne(stringArray[n++]);
        HashSet<String> hashSet = new HashSet<String>();
        if (gnI2 instanceof FiG && n == stringArray.length) {
            String string = FwH.method_8672275f_Dne(gnI2).method_eecad346_Dne();
            sFA.method_329d9786_Dne(string, yGE);
            hashSet.add(string);
        } else {
            while (n < stringArray.length) {
                String string = FwH.method_17856691_Dne(gnI2, stringArray[n++]);
                sFA.method_329d9786_Dne(string, yGE);
                hashSet.add(string);
            }
        }
        if (!hashSet.isEmpty()) {
            FwH.method_7424c4e2_Dne(gnI2, "commands.scoreboard.teams.join.success", hashSet.size(), yGE.method_eecad346_Dne(), FwH.method_f7f6f529_Dne(hashSet.toArray(new String[0])));
        }
    }

    protected void method_2b6c45ea_FWm(gnI gnI2, String[] stringArray, int n) {
        String string = stringArray[n++];
        SFA sFA = this.method_23062a3d_Dne();
        if (sFA.method_28522afe_Dne(string) != null) {
            throw new WoB("commands.scoreboard.teams.add.alreadyExists", string);
        }
        if (string.length() > 16) {
            throw new qwv("commands.scoreboard.teams.add.tooLong", string, 16);
        }
        YGE yGE = sFA.method_f276515d_FWm(string);
        if (stringArray.length > n) {
            String string2 = FwH.method_3140bf17_Dne(gnI2, stringArray, n);
            if (string2.length() > 32) {
                throw new qwv("commands.scoreboard.teams.add.displayTooLong", string2, 32);
            }
            if (string2.length() > 0) {
                yGE.method_8f501fe4_Dne(string2);
            }
        }
        FwH.method_7424c4e2_Dne(gnI2, "commands.scoreboard.teams.add.success", string);
    }

    protected void method_d491c9ef_Dne(gnI gnI2, String string) {
        SFA sFA = this.method_23062a3d_Dne();
        vfE vfE2 = this.method_c5a997ac_Dne(string, false);
        sFA.method_c1eff332_Dne(vfE2);
        FwH.method_7424c4e2_Dne(gnI2, "commands.scoreboard.objectives.remove.success", string);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }
}

