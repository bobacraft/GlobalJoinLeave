package best.boba.GlobalJoinLeave;

import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

public record Config(ProxyServer server, Logger logger) {
}
