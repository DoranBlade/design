package share;

import java.util.HashMap;
import java.util.Map;

public class SiteFactory {

    private static Map<String, Site> container;

    static {
        container = new HashMap<>();
    }

    public static Site get(String type) {
        if (!container.containsKey(type)) {
            container.put(type, new Site(type));
        }
        return container.get(type);
    }
}
