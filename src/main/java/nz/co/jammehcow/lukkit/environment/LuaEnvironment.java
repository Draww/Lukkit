package nz.co.jammehcow.lukkit.environment;

import org.luaj.vm2.Globals;
import org.luaj.vm2.lib.jse.JsePlatform;

/**
 * @author jammehcow
 */

public class LuaEnvironment {
    public static Globals globals;
    private static LukkitPluginLoader loader = new LukkitPluginLoader();

    public static void init(boolean isDebug) {
        globals = (isDebug) ? JsePlatform.debugGlobals() : JsePlatform.standardGlobals();

        loader.loadAllPlugins();
        //Main.instance.getServer() TODO: register plugin loader.
    }

    public static void shutdown() {
        // Stub
        loader.disableAll();
    }
}