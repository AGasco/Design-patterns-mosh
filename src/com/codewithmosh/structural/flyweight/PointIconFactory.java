package com.codewithmosh.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType, PointIcon> pointIcons = new HashMap<>();

    public PointIcon getPointIcon(PointType type){
        if (pointIcons.containsKey(type))
            return pointIcons.get(type);
        else {
            var newPointIcon = new PointIcon(type, null);
            pointIcons.put(newPointIcon.getType(), newPointIcon);
            return newPointIcon;
        }
    }
}
