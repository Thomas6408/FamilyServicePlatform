package com.mashibing.returnjson;

import java.util.List;

/**
 * @author Thomas_LittleTrain
 * @date 2020/7/13
 */
public class Permissions {
    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Permissions{" +
                "permissions=" + permissions +
                '}';
    }
}
