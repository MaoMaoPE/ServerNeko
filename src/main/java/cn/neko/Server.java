package cn.neko;

import cn.neko.network.protocol.ProtocolInfo;

public class Server {
    public String getName() {
        return "ServerNeko";
    }

    /*public boolean isRunning() {
    *    return isRunning;
    }*/

    public String getNekoVersion() {
        return Neko.VERSION;
    }

    public String getCodename() {
        return Neko.CODENAME;
    }

    public String getVersion() {
        return ProtocolInfo.MINECRAFT_VERSION;
    }

    public String getApiversion() {
        return Neko.API_VERSION;
    }
}
