package cn.suxiaolin.subuildingpacking.progress;

import cn.suxiaolin.subuildingpacking.suBuildingPacking;
import cn.suxiaolin.sucore.message.msg;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class ProgressStart {
    private static Map<Player, Integer> progressMap = new HashMap<>();

    public static void addProgress(Player player) {
        progressMap.put(player, 0);
        msg.pcommonmsg(suBuildingPacking.getpluginname() , player.getDisplayName(), "开始选取位置");
    }

    public static boolean getHaveProgress(Player player) {
        return progressMap.containsKey(player);
    }
    public static int getProgressSteps(Player player) {
        return progressMap.get(player);
    }
    public static void setProgressSteps(Player player, int steps) {
        progressMap.replace(player, steps);
    }
    public static void removeProgress(Player player) {
        progressMap.remove(player);
    }
}
